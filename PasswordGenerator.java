// Password generator
// generators the password randomly
// you can choose the length of the password
// you can also choose how many numbers symbols and letters you want
// if you choose more numbers, symbols or letters than the length it gives error
// makes presets passwords short median and long passwords
import java.util.Scanner;

public class PasswordGenerator {
    public static String randomLetter(int letters, String lower_letter, String upper_Letters){
        String lowerCaseLetters_amount = lowerCaseLetters(lower_letter); // lowercase letters
        String upperCaseLetters_amount = upperCaseLetters(upper_Letters);// uppercase letters
        String upperCase_LowerCaseLetters = lowerCaseLetters_amount + upperCaseLetters_amount; // uppercase and lowercase letters together
        int letters_Amount = number_of_Letters(letters); // the amount of letters to generate 
        String random_Letter = "";
        StringBuilder letters_to_generate = new StringBuilder(letters_Amount);// letters to generate for password
        for(int lettersTo_Generate = 0; lettersTo_Generate < letters_Amount; lettersTo_Generate++){ // does this until the amount of letters meets x amount of letters to generate
            int the_amount_of_letters_to_have = (int)(upperCase_LowerCaseLetters.length() * Math.random()); // goes though all the letter a-z & A-Z randomly
            letters_to_generate.append(upperCase_LowerCaseLetters.charAt(the_amount_of_letters_to_have)); // takes x amount of letters
            random_Letter = letters_to_generate.toString(); // gets all the random letters to the empty string (Random_letter)
        }
        return random_Letter; // the random letters
    }
    public static String randomNumber(int numbers, String numbers_Characters){
        String numbers_Characters_amount = numbers_Characters(numbers_Characters); // number character    
        String random_Number = "";
        int numbers_Amount = number_of_Numbers(numbers); // the amount of numbers to generate
        StringBuilder number_to_generate = new StringBuilder(numbers_Amount); 
        for(int characters_to_generate = 0; characters_to_generate < numbers_Amount; characters_to_generate++ ){ // does this until the amount of numbers meets x amount of number to generate
            int the_amount_of_numbers_to_have = (int)(numbers_Characters_amount.length() * Math.random());// goes thorough all numbers 1-9  randomly
            number_to_generate.append(numbers_Characters_amount.charAt(the_amount_of_numbers_to_have)); // takes x amount of numbers randomly
            random_Number = number_to_generate.toString();// gets all the random numbers to the empty string (random_Number)
        }
        return random_Number; // returns the numbers
    }
    public static String randomSymbols(int symbols,String symbols_Characters){
        int symbols_Amount = symbols;// the amount of symbols to generate
        String symbols_Characters_Amount = symbols_Characters; // symbols characters
        String random_Symbols = "";
        StringBuilder symbols_to_generate = new StringBuilder(symbols_Amount); // the amount of symbols for password
        for(int characters_to_generate = 0; characters_to_generate < symbols_Amount; characters_to_generate++){ // does this until the amount of symbols meets x amount of symbols to generate
            int the_amount_of_symbols_to_have = (int)(symbols_Characters_Amount.length() * Math.random()); // goes through all symbols randomly
            symbols_to_generate.append(symbols_Characters_Amount.charAt(the_amount_of_symbols_to_have)); // takes x amount of symbols randomly
            random_Symbols = symbols_to_generate.toString(); // gets all the random Symbols and add to the empty string (random_Symbols)
        }
        return random_Symbols; // returns the symbols
    }
    public static String generateRandomPassword(int letters, int Numbers, int Symbols,
    String lower_letters, String upper_Letters, String numbers_Characters, String  symbols_Characters){
        int letters_Amount = number_of_Letters(letters); // amount of letters to have
        int numbers_Amount = number_of_Numbers(Numbers); // amount of numbers characters to have
        int symbols_Amount = number_of_Symbols(Symbols); //  amount of symbols to have
        String lowerCase_Letters = lowerCaseLetters(lower_letters); // lowercase letters
        String upperCase_Letters = upperCaseLetters(upper_Letters);// uppercase letters
        String numbersCharacters = numbers_Characters(numbers_Characters); // number characters for password
        String symbolsCharacters = symbols_Characters(symbols_Characters); // symbols for password
        String the_random_Characters = randomLetter(letters_Amount, lowerCase_Letters, upperCase_Letters) + 
        randomNumber(numbers_Amount, numbersCharacters) + randomSymbols(symbols_Amount, symbolsCharacters); // all the random characters been generate example spACXB217*&^! in this order
        char[] Characters = the_random_Characters.toCharArray(); // coverts the string to a char array
        // down below basically shuffles the characters around 
        for(int number_of_characters = 0; number_of_characters < Characters.length; number_of_characters++){ // goes through each character of the array and swap 
        int random_Character_Placement = (int)(Math.random() * Characters.length); // gets a character randomly 
        char random = Characters[number_of_characters]; // whatever the random char is 
        Characters[number_of_characters] = Characters[random_Character_Placement]; // basically swaps positions with the others characters
        Characters[random_Character_Placement] = random; // confirms the position
    }
    String randomPassword = new String(Characters); // re-covert the char array to a String
    return randomPassword; // returns the random Password
}
    static String generatePreSetShortRandomPassword(String lower_letters, String upper_Letters, String numbers_Characters, String  symbols_Characters){ 
        String lowerCase_Letters = lowerCaseLetters(lower_letters); // lowercase letters
        String upperCase_Letters = upperCaseLetters(upper_Letters);// uppercase letters
        String numbersCharacters = numbers_Characters(numbers_Characters); // number characters for password
        String symbolsCharacters = symbols_Characters(symbols_Characters); // symbols for password        
        String all_characters_for_A_RandomPassword = lowerCase_Letters + upperCase_Letters + numbersCharacters + symbolsCharacters; // all characters in one string
        int length_of_short_Password = 6; // length of short password
        String short_password = "";
        StringBuilder pre_set_randomPassword = new StringBuilder(length_of_short_Password); // amount of characters for password
        for(int characters_to_Generate = 0; characters_to_Generate < length_of_short_Password; characters_to_Generate++){ // does this until characters meets the length of the password
            int the_amount_of_characters_to_generate = (int)(all_characters_for_A_RandomPassword.length() * Math.random()); // goes thorough the characters randomly 
            pre_set_randomPassword.append(all_characters_for_A_RandomPassword.charAt(the_amount_of_characters_to_generate)); // takes x amount of characters
            short_password = pre_set_randomPassword.toString(); // gets the random character and add it the empty string(short_password)
        }
        return short_password; // the random short password 
    }
    static String generatePreSetMediumRandomPassword(String lower_letters, String upper_Letters, String numbers_Characters, String  symbols_Characters){
        String lowerCase_Letters = lowerCaseLetters(lower_letters); // lowercase letters
        String upperCase_Letters = upperCaseLetters(upper_Letters);// uppercase letters
        String numbersCharacters = numbers_Characters(numbers_Characters); // number characters for password
        String symbolsCharacters = symbols_Characters(symbols_Characters); // symbols for password        
        String all_characters_for_A_RandomPassword = lowerCase_Letters + upperCase_Letters + numbersCharacters + symbolsCharacters;
        int length_of_medium_Password = 9; // length of password 
        String medium_Password = ""; 
        StringBuilder pre_set_RandomPassword = new StringBuilder(length_of_medium_Password); // amount of characters for password
        for(int characters_to_Generate = 0; characters_to_Generate < length_of_medium_Password; characters_to_Generate++){ // does this until characters meets the length of the password
            int the_amount_of_characters_to_generate = (int)(all_characters_for_A_RandomPassword.length() * Math.random()); // goes thorough the characters randomly
            pre_set_RandomPassword.append(all_characters_for_A_RandomPassword.charAt(the_amount_of_characters_to_generate)); // take x amount of characters
            medium_Password = pre_set_RandomPassword.toString(); // gets the random character and adds it to empty string(medium_Password)
        }
        return medium_Password; // the random medium Password
    }
    static String generatePreSetLongRandomPassword(String lower_letters, String upper_Letters, String numbers_Characters, String  symbols_Characters){
        String lowerCase_Letters = lowerCaseLetters(lower_letters); // lowercase letters
        String upperCase_Letters = upperCaseLetters(upper_Letters);// uppercase letters
        String numbersCharacters = numbers_Characters(numbers_Characters); // number characters for password
        String symbolsCharacters = symbols_Characters(symbols_Characters); // symbols for password        
        String all_characters_for_A_RandomPassword = lowerCase_Letters + upperCase_Letters + numbersCharacters + symbolsCharacters; // all characters in one string
        int length_of_long_Password = 12; // length of password
        String long_Password = "";
        StringBuilder pre_set_RandomPassword = new StringBuilder(length_of_long_Password); // amount of characters for password
        for(int characters_to_Generate = 0; characters_to_Generate < length_of_long_Password; characters_to_Generate++){ // does it until characters meets the length of password
            int the_amount_of_characters_to_generate = (int)(all_characters_for_A_RandomPassword.length()* Math.random()); // goes thorough the characters randomly
            pre_set_RandomPassword.append(all_characters_for_A_RandomPassword.charAt(the_amount_of_characters_to_generate)); // takes x amount of characters
            long_Password = pre_set_RandomPassword.toString(); // gets the random character and adds it to the empty string(long_Password)
        }
        return long_Password;
    }
    public static void ErrorCodes(int Characters, int letters, int Numbers, int Symbols) { // the error code
        int characters_Amount = passwordLength(Characters); // length of password
        int letters_Amount = number_of_Letters(letters); // amount of letters
        int numbers_Amount = number_of_Numbers(Numbers); // amount of numbers
        int Symbols_Amount = number_of_Symbols(Symbols); // amount of symbols
        if (Symbols_Amount >= 0) { // goes after symbols so the error code won't go between 
            if (letters_Amount == 0 && numbers_Amount == 0 && Symbols_Amount == 0) { // if you type 0 for letter numbers and symbols
                System.out.println("You have zero Letters, zero numbers and zero Symbols for your Password");
            }
            if (letters_Amount >= 1 && numbers_Amount == 0 && Symbols_Amount == 0) { // type a number higher than 1 for letters only
                if (characters_Amount < letters_Amount) { // is there more letters than the length of password
                    System.out.println("The amount of letters is higher than the length. Please Try Again ");
                }
            }
            if (letters_Amount == 0 && numbers_Amount >= 1 && Symbols_Amount == 0){
                if(characters_Amount < numbers_Amount){
                    System.out.println("The amount of numbers is higher than the length. Please Try Again");
                }
            }
            if (letters_Amount == 0 && numbers_Amount == 0 && Symbols_Amount >= 1){
                if(characters_Amount < Symbols_Amount){
                    System.out.println("The amount of symbols is higher than the length. Please Try Again");
                }
            }
            if (letters_Amount >= 1 && numbers_Amount >= 1 && Symbols_Amount == 0) { // letters and numbers only greater than 1
                if (characters_Amount < letters_Amount + numbers_Amount) { // is there more numbers and letters than the length
                    System.out.println("The amount of letters and numbers is higher than the length. Please Try Again");
                }
            }
            if (letters_Amount >= 1 && numbers_Amount == 0 && Symbols_Amount >= 1) { // letters and symbols only greater than 1
                if (characters_Amount < letters_Amount + Symbols_Amount) { // is there more letters and symbols than length of password
                    System.out.println("The amount of letters and symbols is higher than the length. Please Try Again");
                }
            }
            if (letters_Amount == 0 && numbers_Amount >= 1 && Symbols_Amount >= 1) {  // numbers and symbols only greater than 1
                if (characters_Amount < numbers_Amount + Symbols_Amount) {// is there more numbers and symbols than the length of password
                    System.out.println("The amount of numbers and symbols is higher than the length. Please Try Again");
                }
            }
            if (letters_Amount >= 1 && numbers_Amount >= 1 && Symbols_Amount >= 1) // all 3 are greater than one
                if (characters_Amount < letters_Amount + numbers_Amount + Symbols_Amount) { // is all 3 greater than the length of password
                    System.out.println("The amount of letters, numbers, and symbols is higher than the length. Please Try Again");
                }
        }
    }


    public static void needCharactersForPassword(int characters) {
        int characters_Amount = passwordLength(characters);
        if(characters_Amount == 0){
            System.out.println("You need to choose a number higher than 0 for your password length");
        }
    }

    public static int number_of_Letters(int letters) { // letters  amount
        return letters;
    }

    public static int number_of_Numbers(int Numbers) { // numbers Amount
        return Numbers;
    }

    public static int number_of_Symbols(int Symbols) { // Symbols amount
        return Symbols;
    }

    public static int passwordLength(int Characters) { // password length
        return Characters;
    }
    public static String lowerCaseLetters(String lower_Letters){ // lowercase Letters
        return lower_Letters;
    }
    public static String upperCaseLetters(String upper_Letters){ // uppercase letters
        return upper_Letters;
    }
    public static String numbers_Characters(String numbers){ // numbers for password
        return numbers;
    }
    public static String symbols_Characters(String symbols){ // the symbols for password
        return symbols;
    }
    public static void main(String[] args) {
    Scanner Password = new Scanner(System.in);
    String lowerCase_Letters = "abcdefghijklmnopqrstuvwxyz";
    String upperCase_Letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String numbers = "1234567890";
    String Symbols = "!@#$%^&*?";
    boolean isCharactersHigherthanZero = false;
    boolean thereIsZeroErrorsInCustomPassword = false;
    String choose_kind_of_password_or_quit = "";
    System.out.println("Welcome to the random password generator!");
    System.out.println("If you don't want A password or another Password say (quit)");
    System.out.print("Would You like A Short, Medium, Long, or Custom Password? ");
    choose_kind_of_password_or_quit = Password.next().toLowerCase();
    while(!choose_kind_of_password_or_quit.equals("quit")){
        if(choose_kind_of_password_or_quit.equals("short")){
            System.out.println(generatePreSetShortRandomPassword(lowerCaseLetters(lowerCase_Letters), upperCaseLetters(upperCaseLetters(upperCase_Letters)),
            numbers_Characters(numbers), symbols_Characters(Symbols)));
            System.out.print("Would You like Another Short, Medium, Long, or Custom Password? ");
            choose_kind_of_password_or_quit = Password.next().toLowerCase();
        }
        if(choose_kind_of_password_or_quit.equals("medium")){
            System.out.println(generatePreSetMediumRandomPassword(lowerCaseLetters(lowerCase_Letters), upperCaseLetters(upperCaseLetters(upperCase_Letters)),
            numbers_Characters(numbers), symbols_Characters(Symbols)));
            System.out.print("Would You like Another Short, Medium, Long, or Custom Password? ");
            choose_kind_of_password_or_quit = Password.next().toLowerCase();
        }
        if(choose_kind_of_password_or_quit.equals("long")){
            System.out.println(generatePreSetLongRandomPassword(lowerCaseLetters(lowerCase_Letters), upperCaseLetters(upperCaseLetters(upperCase_Letters)),
            numbers_Characters(numbers), symbols_Characters(Symbols)));
            System.out.print("Would You like Another Short, Medium, Long, or Custom Password? ");
            choose_kind_of_password_or_quit = Password.next().toLowerCase();
        }
    
    if(choose_kind_of_password_or_quit.equals("custom")){
    while(!isCharactersHigherthanZero){
        System.out.print("How many characters do you want? "); // length of password
        int length = Password.nextInt();
        if(length > 0){
            isCharactersHigherthanZero = true;
            while(!thereIsZeroErrorsInCustomPassword){
            System.out.print("How many letters do want in your password? "); // Amount of letters
            int letters_Amount = Password.nextInt();
            System.out.print("How many numbers do want in your password? "); // Amount of numbers
            int numbers_Amount = Password.nextInt();
            System.out.print("How many symbols do want in your password? "); // Amount of Symbols
            int symbols_Amount = Password.nextInt();
            if(letters_Amount + numbers_Amount + symbols_Amount == length){
                thereIsZeroErrorsInCustomPassword = true;
                System.out.println("Here is Your Password");
            System.out.println(generateRandomPassword(number_of_Letters(letters_Amount), number_of_Numbers(numbers_Amount), number_of_Symbols(symbols_Amount), 
                lowerCaseLetters(lowerCase_Letters), upperCaseLetters(upperCase_Letters), numbers_Characters(numbers), symbols_Characters(Symbols)));
            }
            else{
                ErrorCodes(passwordLength(length), number_of_Letters(letters_Amount),
                number_of_Numbers(numbers_Amount), number_of_Symbols(symbols_Amount));
            }
        }
    }
        else{
            needCharactersForPassword(passwordLength(length));
        }
    }
    System.out.print("Would You like Another Short, Medium, Long, or Custom Password? ");
    choose_kind_of_password_or_quit = Password.next().toLowerCase();
    }
    }
    System.out.println("Hope you like your Random Passwords or Password! Goodbye");
    Password.close();
}

}

