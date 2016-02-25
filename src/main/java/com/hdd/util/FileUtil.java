package com.hdd.util;

import java.io.*;

/**
 *
 * @author Administrator
 *
 */
public class FileUtil {

	/**
	 * read file contents by the assigned filepath
	 * @param filePath
	 * @return
	 */
	public static String readFile(String filePath){
/*		filePath = Thread.currentThread().getContextClassLoader().getResource("") + filePath ;*/
		System.out.println("路径:"+filePath);

		BufferedReader br = null;
		String result = "";
		StringBuffer total = new StringBuffer();
		try {
			//create bufferreader to read datastream
			File file = new File(filePath);
			if(file.exists()) System.out.println("存在");

			InputStream is = PropertiesReadUtil.class.getClassLoader().getResourceAsStream(filePath);
			br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			//read lines, and return a string which splited with ":" to connect lines
			String line = null;
			while((line = br.readLine()) != null){
				System.out.println("line:"+line);
				total.append(":");
				total.append(line);
			}
			if(total.length() > 0) result = total.toString().substring(1);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally{
			//close the open datastream
			try {
				if(br !=null) br.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		return result;
	}

	/**
	 * write string to assigned file
	 * @param filePath
	 * @param content
	 */
	public static void writeFile(String filePath, String content){
		OutputStreamWriter  writer = null;
		try {
			writer = new OutputStreamWriter(new FileOutputStream(filePath), "UTF-8");
			writer.write(content);
			writer.flush();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally{
			//close the open datastream
			try {
				if(writer != null) writer.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
