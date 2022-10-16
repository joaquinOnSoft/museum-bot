/**
 *   (C) Copyright 2021 OpenText and others.
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




import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import org.junit.jupiter.api.Test;


public class FileUtilTest{
	private static final String PROPERTIES_EXAMPLE_FILE_NAME = "smithsonian.properties";

	@Test
	public void testDeleteFile() {
		String fileName = "filename.txt";
		FileWriter myWriter;
		try {
			myWriter = new FileWriter(fileName);
			myWriter.write("Files in Java might be tricky, but it is fun enough!");
			myWriter.close();
		} catch (IOException e) {
			fail(e.getMessage());
		}

		assertTrue(FileUtil.isFile(fileName));
		FileUtil.deleteFile(fileName);
		assertFalse(FileUtil.isFile(fileName));
	}
	
	@Test
	public void testGetFileFromResources() {
		File f = FileUtil.getFileFromResources(PROPERTIES_EXAMPLE_FILE_NAME);
		assertNotNull(f);
		assertTrue(f.exists());
	}
	
	
	@Test
	public void testIsFile() {
		String cwd = null;
		try {
			cwd = (new File( "." )).getCanonicalPath();
		} catch (IOException e) {
			fail(e.getMessage());
		}
		
		assertFalse(FileUtil.isFile(cwd));
	}
	
	@Test
	public void filterFilesByExtension() {
		
		URL resource = getClass().getClassLoader().getResource(PROPERTIES_EXAMPLE_FILE_NAME);
		if(resource != null) {			
			File[] files = FileUtil.filterFilesByExtension(
					resource.getPath().replace(PROPERTIES_EXAMPLE_FILE_NAME, ""), 
					".properties");
			
			assertNotNull(files);
			assertEquals(1, files.length);
			assertEquals(PROPERTIES_EXAMPLE_FILE_NAME, files[0].getName());
		}
		else {
			fail("Resource `smithsonian.properties` not found.");
		}
	}
}