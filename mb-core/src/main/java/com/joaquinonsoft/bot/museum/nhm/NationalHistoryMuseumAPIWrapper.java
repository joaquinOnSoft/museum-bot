package com.joaquinonsoft.bot.museum.nhm;

import com.joaquinonsoft.bot.museum.IMuseumAPIWrapper;
import com.joaquinonsoft.bot.museum.MuseumAssetTransformer;
import com.joaquinonsoft.bot.museum.nhm.pojo.NHMPackageShow;
import com.joaquinonsoft.bot.museum.nhm.pojo.packagelist.NHMPackageList;
import com.joaquinonsoft.bot.museum.pojo.MuseumAsset;
import com.joaquinonsoft.util.RandomUtil;

public class NationalHistoryMuseumAPIWrapper implements IMuseumAPIWrapper {

	private NationalHistoryMuseumAPI api = null;
	
	public NationalHistoryMuseumAPIWrapper() {
		api = new NationalHistoryMuseumAPI();
	}
	
	/**
	 * Provides a random asset from the National History Museum (NHM) catalog
	 */	
	@Override
	public MuseumAsset getRandomAsset() {
		MuseumAsset asset = null;

		NHMPackageList packages = api.packageList();
		if(packages != null 
				&& packages.getSuccess() == true 
				&& packages.getResult() != null) {
			
			int numPackages = packages.getResult().size();
			int selectedNumPackage = RandomUtil.nextInt(0, numPackages - 1);
			String packageId = packages.getResult().get(selectedNumPackage);
			
			if(packageId != null) {
				NHMPackageShow packageShow = api.packageShow(packageId);
				if(packageShow != null 
						&& packageShow.getSuccess() == true
						&& packageShow.getResult() != null) {

					int selectedResource = RandomUtil.nextInt(0, packageShow.getResult().getNumResources() - 1);
					
					asset = MuseumAssetTransformer.toMusseumAsset(
							packageShow.getResult().getResources().get(selectedResource),
							packageShow.getResult().getAuthor(),
							packageShow.getResult().getDoiDatePublished());
				}
			}
			
		}
		
		return asset;
	}

}
