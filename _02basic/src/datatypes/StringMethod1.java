package datatypes;

public class StringMethod1 {
    public static void main(String[] args) {
    //2. Length & Properties
        String name = "Prince Singh";
        int length = name.length(); //10
        boolean isEmpty = name.isEmpty(); //false
        boolean isContains = name.contains("Singh"); //true

    //3. String Manipulation
        String userName = "     user0147      ";
        String fullName = "User Singh";
        String together =  userName.concat(fullName); //user0147User Singh
        String u_to_E =  fullName.replace('U','E').toUpperCase();
       // System.out.println(u_to_E);//Eser Singh
        int lengthof = userName.length();
        //System.out.println(lengthof);
        String newUserName = userName.trim();
        // System.out.println(newUserName.length());
        String newStr = fullName.substring(2); //er Singh
        //System.out.println(fullName.substring(2,8)); //er Sin
       // System.out.println(newUserName.subSequence(2,7));

// 4. Case Conversion
        //System.out.println(userName.toUpperCase()); //USER0147
        //System.out.println(userName.toLowerCase()); //user0147

//5. Searching & Indexing
        String newstring = "abcdefgg";
        //System.out.println(newstring.lastIndexOf('g')); //return last matched index
        //System.out.println(newstring.indexOf('g'));
        //System.out.println(newstring.startsWith("ab")); //true
        //System.out.println(newstring.endsWith("fo")); //false

//6. String Conversion
        long num = 42484848515158178L;
        String numberStr = String.valueOf(num);
        //System.out.println(numberStr);
//video
        String useriId = "PrinceSingh";
        String useriID = "PrinceSIngh";
        System.out.println(useriId.charAt(5)); //e
        System.out.println(useriId.equals(useriID)); //false
        System.out.println(useriId.equalsIgnoreCase(useriID)); //true ignore case
        int a = useriId.compareTo(useriID); //32 asci value compare karta hai
        int b= useriID.compareToIgnoreCase(useriId); //0
        System.out.println(b);
        System.out.println(a);

        String formated = String.format("My name is %s, my age is %d","Prince",23);
        System.out.println(formated);



    }

}
