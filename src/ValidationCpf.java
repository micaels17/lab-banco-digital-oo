public class ValidationCpf{

    public boolean isCPF(String cpf){

        String number = removeCaracteresEspeciais(cpf);

        if (number.equals("00000000000") || number.equals("11111111111") || 
        number.equals("22222222222") || number.equals("33333333333") || number.equals("44444444444") || 
        number.equals("55555555555") || number.equals("66666666666") || number.equals("77777777777") || 
        number.equals("88888888888") || number.equals("99999999999") || (number.length() != 11)){
            return false;        
        }
        int d1, d2;
        int sum;

        sum = 0;
        for (int n = 0; n < 9; n++) {
            sum = sum + Integer.parseInt(number.substring(n, n + 1)) * (10 - n);
        }

        d1 = 11 -  (sum % 11);
        if ((d1 == 0) || (d1 == 1)) {
            d1 = 0;
        } else {
            d1 = 11 - d1;
        }

        sum = 0;
        for (int n = 0; n < 10; n++) {
          sum = sum + Integer.parseInt(number.substring(n, n + 1)) * (11 - n);
        }

        d2 = 11 - (sum % 11);

        if ((d2 == 0) || (d2 == 1)) {
            d2 = 0;
        } else {
            d2 = 11 - d2;
        }

        String digit1 = number.substring(9, 10);
        String digit2 = number.substring(10, 11);

        return (Integer.parseInt(digit1) == d1) && (Integer.parseInt(digit2) == d2);
    }
   

    private String removeCaracteresEspeciais(String doc) {
		if (doc.contains(".")) {
			doc = doc.replace(".", "");
		}
		if (doc.contains("-")) {
			doc = doc.replace("-", "");
		}
		if (doc.contains("/")) {
			doc = doc.replace("/", "");
		}
		return doc;
	}
}

