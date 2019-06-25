package com.example.demo.ceshi;
import java.io.File;

import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
/**
 * @file:传入需要删除文件夹的路径
 * @author zcc
 * @
 */
@Slf4j
public class Delete {

	public void deleteFile(File file) {
		//将该路径中的文件和文件夹返回到File[]数组中
		File[] f = file.listFiles();
		if (null != f) {
			for (File file2 : f) {
				if(file2.isFile()){
					log.info("删除文件: {}", file2.getPath());
					//删除文件
					file2.delete();
				}else{
					//递归调用
					deleteFile(file2);
				}
			}
		}

		log.info("删除文件夹: {}", file.getPath());
		//删除文件夹
		file.delete();
	}

	/* *
	 * description: 删除文件
	 * @author zcc
	 * @date 2019/5/18
	 * @param  * @param file
	 * @return void
	 */

	public void deleteFiles(File file) {
		//将该路径中的文件和文件夹返回到File[]数组中
		File[] f = file.listFiles();
		for (File file2 : f) {
			log.info("删除文件: {}", file2.getPath());
			//删除文件
			file2.delete();
		}

		if (file.listFiles().length != 0) {
			deleteFiles(file);
		}
		//删除文件夹
		file.delete();
	}

	@Ignore
	@Test
	public void test_deleteFile() {
		File file = new File("");
		deleteFile(file);
	}

	@Ignore
	@Test
	public void test_deleteFiles() {
		File file = new File("");
		deleteFiles(file);
	}
}


