

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.Scanner;
public class language_parser
{
	int lang;
	
	public static void main( String args[] ) throws IOException{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the file name");
	String fileName = input.next();//gets input from the user
	language_parser ob = new language_parser();
	ob.langDetect(fileName);//call to langDetect method
	ob.classDetect(fileName);//call to classDetect method
	ob.methodDetect(fileName);//call to methodDetect method
	
	}

	public int langDetect(String fileName) throws IOException{
		//read the file "fileName"
		BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
		String line;

		while ((line = br.readLine()) != null) {//fetches single line from the file read till eof
			String pattern = "^[<][?][p][h][p]";
			String pattern2 = "^[\\s]*[d][e][f][ ]";
			String pattern3 = "[^/][\\s]+[\\(main\\(String args\\[\\]\\){\\)]";
			//compile pattern
			Pattern r = Pattern.compile(pattern);
			Pattern r2 = Pattern.compile(pattern2);
			Pattern r3 = Pattern.compile(pattern3);
			//matching pattern with the fetched line
			Matcher m = r.matcher(line);
			Matcher m2 = r2.matcher(line);
			Matcher m3 = r3.matcher(line);
			//find() returns a boolean indicating success or failure of the pattern matching
			if (m.find( )) {
				System.out.println("Language is PHP");
				lang = 1;
				br.close();
				return lang;
			}
			if (m2.find()){
		
				System.out.println("Language is RUBY");
				lang = 2;
				br.close();
				return lang;
			}
			if (m3.find()){
				System.out.println("Language is JAVA");
				lang = 3;
				br.close();
				return lang;
			}
		}
		br.close();
		return lang;
	}
	public void classDetect(String fileName) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
		String line;
		System.out.println("Classes are:");

		if(lang==3){

			while ((line = br.readLine()) != null) {
				String pattern = "[\\(public\\)]?[\\(protected\\)]?[\\(private\\)]?[\\s]+[c][l][a][s][s][\\s]*";
				Pattern r = Pattern.compile(pattern);
				Matcher m = r.matcher(line);

					if (m.find( )) {
	
						String[] words = line.split("[p][r][i][v][a][t][e]|[p][r][o][t][e][c][t][e][d]|[p][u][b][l][i][c]|[\\s][c][l][a][s][s]|[{]");

						for(String word : words){
							System.out.print(word+" ");
						}
						System.out.println();
					}
				}
				br.close();
			}
			if(lang==2){

				while ((line = br.readLine()) != null) {
					String pattern = "^[\\s]*[c][l][a][s][s][\\s]*";
					Pattern r = Pattern.compile(pattern);
					Matcher m = r.matcher(line);

					if (m.find( )) {
						String[] words = line.split("[\\s]|[c][l][a][s][s]");

						for(String word : words){
							System.out.print(word+" ");
						}
						System.out.println();
					}
				}
				br.close();
			}
			if(lang==1){

				while ((line = br.readLine()) != null) {
					String pattern = "^[\\s]*[c][l][a][s][s][\\s]*";
					Pattern r = Pattern.compile(pattern);
					Matcher m = r.matcher(line);

					if (m.find( )) {

						String[] words = line.split("[\\s]|[c][l][a][s][s]|[{]|[e][x][t][e][n][d][s][\\s][a-zA-Z]+");

						for(String word : words){
	
							System.out.print(word+" ");
	
	
						}
						System.out.println();
					}
				}
				br.close();
			}
	}
	public void methodDetect(String fileName) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
		String line;
		System.out.println("Methods are:");
		if(lang==1){

			while ((line = br.readLine()) != null) {
				String pattern = "[\\(public\\)]?[\\(protected\\)]?[\\(private\\)]?[\\s]*[f][u][n][c][t][i][o][n][\\s]*";
				Pattern r = Pattern.compile(pattern);
				Matcher m = r.matcher(line);

				if (m.find( )) {

					String[] words = line.split("[\\s]|[f][u][n][c][t][i][o][n][\\s]*|[(][a-zA-Z_$=\\s]*[)]|[{]");

					for(String word : words){

						System.out.print(word+" ");
	
	
					}
					System.out.println();	
				}
			}
			br.close();
		}
		if(lang==2){

			while ((line = br.readLine()) != null) {
				String pattern = "[\\s]*[d][e][f][\\s]*";
				Pattern r = Pattern.compile(pattern);
				Matcher m = r.matcher(line);

				if (m.find( )) {

					String[] words = line.split("[\\s]|[d][e][f][\\s]*|[(][a-zA-Z_$=\\s]*[)]");

					for(String word : words){
	
						System.out.print(word+" ");
	
	
					}
					System.out.println();
				}
			}
			br.close();
		}
		if(lang==3){

			while ((line = br.readLine()) != null) {
				String pattern = "[a-zA-Z_$=\\s]*[(][a-zA-Z_$=\\s]*[)][a-zA-Z_$=\\s]*[{]";
				Pattern r = Pattern.compile(pattern);
				Matcher m = r.matcher(line);

				if (m.find( )) {

					String[] words = line.split("[\\s]|[s][t][a][t][i][c][\\s]+|[v][o][i][d][\\s]+|[S][t][r][i][n][g][\\s]+|[i][n][t][\\s]+|[L][o][n][g][\\s]*|[(][a-zA-Z_$=\\s<>]*[)][\\s]*[a-zA-Z_$=\\s]*|[{]");

					for(String word : words){

						System.out.print(word+" ");
	
	
					}
					System.out.println("");
				}
			}
			br.close();
		}
	}

}
