package com.joaquinonsoft.bot.museum.pojo;

public class MuseumAsset {
	private String title;
	private String artistName;
	private String date;
	private String imageLink;

	public MuseumAsset() {		
	}
	
	public MuseumAsset(String title, String artistName, String date, String imageLink) {
		this.title = title;
		this.artistName = artistName;
		this.date = date;
		this.imageLink = imageLink;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("MuseumAsset [")
			.append("title=").append(title).append(", ")
			.append("artistName=").append(artistName).append(", ")
			.append("date=").append(date).append(", ")
			.append("imageLink=").append(imageLink)
			.append("]");
		
		return str.toString();
	}

	
}
