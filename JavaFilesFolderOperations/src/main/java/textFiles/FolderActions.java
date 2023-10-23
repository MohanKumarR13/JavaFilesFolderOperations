package textFiles;

import java.io.File;

public class FolderActions {
	// Create Folder
	public static void createFolder(String folderPath) {
		File folder = new File(folderPath);
		if (!folder.exists()) {
			folder.mkdir();
			System.out.println("Folder Created : " + folderPath);
		}
	}

	// Check If Folder Exists
	public static boolean checkFolderExists(String folderPath) {
		File folder = new File(folderPath);
		return folder.exists();
	}

	// Rename the Folder
	public static void renameFolder(String oldPath, String newPath) {
		File oldFolder = new File(oldPath);
		File newFolder = new File(newPath);
		if (oldFolder.exists()) {
			oldFolder.renameTo(newFolder);
			System.out.println("Folder Renamed to: " + newPath);
		}

	}

	// Delete the Folder
	public static void deleteFolder(String folderPath) {
		File folder = new File(folderPath);
		if (folder.exists()) {
			for (File file : folder.listFiles()) {
				file.delete();
			}
			folder.delete();
			System.out.println("Folder Deleted :" + folderPath);
		}
	}

	public static void main(String[] args) {
		String folderPath = "C:\\MyFolder";
		createFolder(folderPath);
		boolean folderExists = checkFolderExists(folderPath);
		System.out.println("Folder Exists : " + folderExists);

		String newFolderPath = "C:\\MyFolders";
		renameFolder(folderPath, newFolderPath);
		deleteFolder(newFolderPath);
	}

}
