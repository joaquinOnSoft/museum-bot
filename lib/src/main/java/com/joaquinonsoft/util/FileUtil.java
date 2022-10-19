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
package com.joaquinonsoft.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author Joaquín Garzón
 * @since 20.2 
 */
public class FileUtil {
	
	protected static final Logger log = LogManager.getLogger(FileUtil.class);
	
	/**
	 * Get file from classpath, resources folder
	 * SEE: Java Read a file from resources folder
	 * https://www.mkyong.com/java/java-read-a-file-from-resources-folder/
	 * @param fileName
	 * @return
	 */
	public static File getFileFromResources(String fileName) {
		log.debug("Working Directory = " + System.getProperty("user.dir"));

        URL resource = FileUtil.class.getClassLoader().getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }

    }	
	
	public static InputStream getStreamFromResources(String fileName) {
        InputStream resource = FileUtil.class.getClassLoader().getResourceAsStream(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return resource;
        }

    }		
	
	public static boolean isFile(String path) {
		boolean isFile = false;
		
		File f = new File(path);
		if(f.exists() && !f.isDirectory()) { 
		    isFile = true;
		}
		
		return isFile;
	}
	
	public static boolean deleteFile(String path) {
		boolean deleted = false;
		
		File f = new File(path);
		if(f.exists()) { 
		    deleted = f.delete();
		}
		
		return deleted;
	
	}
	
	public static Properties loadProperties(String propFileName) {
		Properties prop = null;
		
		log.debug("Properties file name: " + propFileName);
		InputStream propFile = FileUtil.getStreamFromResources(propFileName); 

		try {
			prop = new Properties();
			log.debug("Loading");
			prop.load(propFile);
			log.debug("Loaded");
		} 
		catch (FileNotFoundException e) {
			System.err.println("Properties file not found");
			e.getSuppressed();
		}
		catch (IOException e) {
			System.err.println("Properties file: " + e.getMessage());
		}
		
		return prop;
	}
	
	public static String getRandomFileName(String extension) {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");  
		String strDate = dateFormat.format(GregorianCalendar.getInstance().getTime());
		
		int random = new Random().nextInt(10000);  // [0...10000]
		String strRandom = String.format("%05d", random);
		
		String name = strDate + strRandom;
		name += extension.startsWith(".") ? extension :  "." + extension;
		
		return name;
	}
	
	public static File[] filterFilesByExtension(String path, String extension) {
		File dir = new File(path);
		File[] files = dir.listFiles(new FilenameFilter() {
		    public boolean accept(File dir, String name) {
		        return name.toLowerCase().endsWith(extension);
		    }
		});		
		
		return files;
	}
}