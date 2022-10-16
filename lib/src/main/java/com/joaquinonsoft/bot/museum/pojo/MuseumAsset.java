/**   
 *  (C) Copyright 2022 joaquinonsoft.com and others.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *   Contributors:
 *     Joaquín Garzón - initial implementation
 *
 */
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
