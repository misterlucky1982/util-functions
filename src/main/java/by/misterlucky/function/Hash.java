package by.misterlucky.function;


public class Hash {

	
	public static int hash(String line){
		if(line == null)return -1;
		if(line.length()==0)return 0;
		int sum = 0;
		char[]chars = line.toCharArray();
		switch(line.length()%3){
		case 0:for(char ch:chars){
			sum+=hashCase1(ch);
		}
			break;
		case 1:for(char ch:chars){
			sum+=hashCase2(ch);
		}
			break;
		case 2:for(char ch:chars){
			sum+=hashCase3(ch);
		}
			break;
		}
		sum+=firstCharactersCase(line);
		for(char ch:chars){
			sum+=(((int)ch)%7);
			sum+=alfabetOrNumeric(ch);
		}
		sum+=numbers(chars);
		sum+=special(chars);
		sum+=punctuationSymbols(chars);
		sum+=onlyAlfabetic(chars);
		sum+=mathSymbols(chars);
		return sum;
	}
	
	private static int hashCase1(char ch){
		switch(ch){
		case 'D':
		case 'u':
		case 'X':return 1000;
		case '9':
		case '-':
		case 'n':return 200;
		case '7':
		case 'L':
		case '.':return 30;
		case 'a':
		case 'f':
		case '2':return 4000;
		case 'K':
		case 'N':
		case 'd':return 500;
		case '/':
		case 'J':
		case 'v':return 60;
		case 'B':
		case 'i':
		case '+':return 7000;
		case 'I':
		case 'Y':
		case 'G':return 800;
		case '4':
		case '?':
		case 'r':return 90;
		case 'm':
		case '>':
		case '1':return 10000;
		case '@':
		case 'b':
		case 'l':return 1100;
		case 'H':
		case '<':
		case 'E':return 120;
		case '#':
		case 'e':
		case 'o':return 13000;
		case 'y':
		case 'h':
		case 'M':return 1400;
		case '8':
		case 'U':
		case 's':return 150;
		case 'q':
		case 'Z':
		case 'O':return 16000;
		case 't':
		case '6':
		case '0':return 1700;
		case 'A':
		case 'P':
		case 'C':return 180;
		case 'c':
		case 'Q':
		case 'T':return 19000;
		case 'V':
		case '%':
		case 'R':return 2000;
		case 'S':
		case 'w':
		case ',':return 210;
		case '!':
		case 'z':
		case 'x':return 22000;
		case '5':
		case 'k':
		case '$':return 2300;
		case 'F':
		case 'j':
		case 'W':return 240;
		case 'p':
		case 'g':
		case '3':return 25000;
		default: return -1111;
		}
	}
	
	private static int hashCase2(char ch){
		switch(ch){
		case '$':
		case '9':
		case '3':return 100;
		case 'v':
		case '8':
		case 'q':return 20;
		case 'E':
		case '-':
		case ',':return 3000;
		case 'x':
		case '@':
		case 'L':return 400;
		case 'g':
		case 'o':
		case 'w':return 50;
		case '5':
		case 'B':
		case 'i':return 6000;
		case '<':
		case 'N':
		case 'K':return 700;
		case '+':
		case 'D':
		case 'j':return 80;
		case 'Q':
		case 'p':
		case 'n':return 9000;
		case 'd':
		case 'G':
		case 'C':return 1000;
		case 'k':
		case 'A':
		case 'f':return 110;
		case '/':
		case '2':
		case 's':return 12000;
		case 'e':
		case 'Y':
		case 'M':return 1300;
		case '0':
		case 'u':
		case '#':return 140;
		case 'c':
		case 'S':
		case 'P':return 15000;
		case 'h':
		case 'O':
		case 'F':return 1600;
		case 'z':
		case '7':
		case '4':return 170;
		case 'a':
		case '?':
		case '>':return 18000;
		case 'X':
		case 'J':
		case '!':return 1900;
		case 'W':
		case 'U':
		case 'I':return 200;
		case 'r':
		case '6':
		case 'H':return 21000;
		case '1':
		case 'T':
		case 'b':return 2200;
		case 'Z':
		case 'm':
		case 'y':return 230;
		case 'l':
		case 'R':
		case 't':return 24000;
		case '.':
		case 'V':
		case '%':return 2500;
		default: return -2222;
		}
	}
	
	private static int hashCase3(char ch){
		switch(ch){
		case 'u':
		case 'b':
		case '4':return 10;
		case 'W':
		case 'M':
		case '5':return 2000;
		case '9':
		case 'O':
		case '8':return 300;
		case 'B':
		case 'g':
		case '7':return 40;
		case 'U':
		case 'x':
		case 'V':return 5000;
		case 'G':
		case '%':
		case 'q':return 600;
		case 'k':
		case 'c':
		case 'J':return 70;
		case 'd':
		case 't':
		case 'y':return 8000;
		case '#':
		case '2':
		case 'N':return 900;
		case 'K':
		case 'Q':
		case '6':return 100;
		case 'L':
		case '1':
		case 'P':return 11000;
		case '+':
		case 'Y':
		case '3':return 1200;
		case 'X':
		case 'v':
		case '$':return 130;
		case 'r':
		case 'z':
		case 'a':return 14000;
		case '.':
		case '>':
		case 's':return 1500;
		case 'o':
		case 'p':
		case '0':return 160;
		case 'l':
		case 'w':
		case ',':return 17000;
		case 'f':
		case 'h':
		case 'A':return 1800;
		case '@':
		case 'H':
		case 'n':return 190;
		case 'D':
		case 'e':
		case 'F':return 20000;
		case '-':
		case 'I':
		case 'm':return 2100;
		case 'R':
		case '?':
		case 'C':return 220;
		case 'i':
		case '!':
		case 'Z':return 23000;
		case '<':
		case 'j':
		case '/':return 2400;
		case 'E':
		case 'S':
		case 'T':return 250;
		default: return -3333;
		}
	}
	
	private static int firstCharactersCase(String line){
		if(line == null||line.length()<2)return 0;
		if(Character.isAlphabetic(line.charAt(0))){
			if(Character.isUpperCase(line.charAt(0))){
				if(Character.isAlphabetic(line.charAt(1))){
					return Character.isUpperCase(line.charAt(1))?1500+line.length():2500-line.length();
				}else return 2000+line.length();
			}
		}else if(Character.isAlphabetic(line.charAt(1))){
			return Character.isUpperCase(line.charAt(1))?3000-line.length():4000+line.length();
		}else return 1000+line.length();
		return 500-line.length();
	}
	
	private static int alfabetOrNumeric(char ch){
		if(Character.isDigit(ch)){
			return (int)ch;
		}else{
			if(Character.isAlphabetic(ch)){
				return Character.isUpperCase(ch)?((int)ch)*10:((int)ch)*100;
			}else return 0;
		}
	}
	
	private static int numbers(char[]chars){
		int number = 0;
		for(char ch:chars)if(Character.isDigit(ch))number++;
		if(number>0&&number<chars.length)return 7777+number-chars.length;
		if(number==0)return -3333;
		return 3333;
	}
	
	private static int special(char[] chars){
		int special = 0;
		for(char ch:chars){
			if(ch=='#'||ch=='$'||ch=='@'||ch=='&'||ch=='['||ch==']'||ch=='`')special++;
		}
		if(special==0)return -1111;
		if(special>0&&special<chars.length)return chars.length*55-special*33;
		return chars.length*77;
	}
	
	private static int punctuationSymbols(char[]chars){
		int punct = 0;
		for(char ch:chars){
			if(ch==','||ch=='.'||ch=='?'||ch=='!'||ch==':'||ch==';')punct++;
		}
		if(punct==0)return -2222;
		if(punct>0&&punct<chars.length)return 9999-chars.length-punct*33;
		return chars.length*11;
	}

	private static int onlyAlfabetic(char[]chars){
		int alf = 0;
		int up = 0;
		int lw = 0;
		for(char ch:chars)if(Character.isAlphabetic(ch)){
			alf++;
			if(Character.isUpperCase(ch)){
				up++;
			}else lw++;
		}
		if(alf==chars.length){
			if(up==alf){
				return 22222;
			}else{
				if(lw==alf)return -5000;
				return up>lw?1000:-9000;
			}
		}else{
			if(alf==0){
				return -333;
			}else return lw>up?8888:88;
		}
	}
	
	private static int mathSymbols(char[]chars){
		int math = 0;
		for(char ch:chars){
			if(ch=='='||ch=='/'||ch=='*'||ch=='-'||ch=='*'||ch=='/'||ch=='+'||ch=='<'||ch=='>'||ch=='('||ch==')'){
				math++;
			}
		}
		if(math==chars.length)return -6666;
		if(math>0&&math<chars.length)return (chars.length%math)*1111+math*33;
		return -1111;
	}
}
