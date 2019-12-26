package cyber.dojo.pratice;

public class BalancedParenthesis {
	
	public static boolean isParenthesisBalanced(String parenthesis) {

		String[] arrayString = new String[parenthesis.length()];
		
		for(int i=0;i<parenthesis.length();i++) {
			arrayString[i] = String.valueOf(parenthesis.charAt(i));
		}
		
		for(int index=0; index<parenthesis.length();index++) {	
			if(!evaluateSymbol(arrayString[index].charAt(0),index, arrayString)) {
				return false;
			}
		}
		
		return true;
	}
	
	private static boolean evaluateSymbol(char symbol, int index, String[] parenthesis) {
		boolean foundPair = false;
		char[] symbols = {'(','{','['};
		char[] closeSymbols = {')','}',']'};
		
		for(int symbolIndex=0; symbolIndex<3; symbolIndex++) {
			if(symbol == symbols[symbolIndex]) {
				for(int indexComplement=index; indexComplement<parenthesis.length;indexComplement++) {
					if(parenthesis[indexComplement].equals(String.valueOf(closeSymbols[symbolIndex]))) {
						foundPair = true;
						
						if(indexComplement!=0 && !parenthesis[indexComplement-1].equals(" ") && 
								!parenthesis[indexComplement-1].equals(String.valueOf(symbols[symbolIndex]))) {
								String sim = parenthesis[indexComplement-1];
								for(int i=0; i<3; i++) {
									if(symbolIndex != i) {
										if(sim.equals(String.valueOf(symbols[i]))) {
											return false;
										}
									}
								}

						}
						
						parenthesis[indexComplement] = " ";
						break;
					}
				}
				if(foundPair == false) {
					return false;
				} else {
					return true;
				}
			} else {
				if(symbol == closeSymbols[0] || 
					symbol == closeSymbols[1] || 
					symbol == closeSymbols[2]) {
					return false;
				}
			}
		}
		return true;
	}

}
