public class WriteRead {
	public static void main(String[] args) throws IOException {
		File inputfile = new File("inputFile.txt");
		File outputFile = new File("outputFile.txt");
		
		FileReader fileReader = new FileReader(inputfile);
		FileWriter fileWriter = new FileWriter(outputFile);
		
		int ch = 0;
		while((ch=fileReader.read())!= -1) {
			System.out.print((char)ch);
			fileWriter.write(ch);
	
		}
		fileWriter.close();
		fileReader.close();
	}
}
