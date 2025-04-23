import java.util.Scanner;

public class GameStartIntro {
    private Scanner scanner;
    public enum PlayableCharacters {KNIGHT, PRIEST, PEASANT}

    public GameStartIntro() {
        scanner = new Scanner(System.in);
    }

    public void DisplayWelcomeMessage(){
        System.out.println("********");
        System.out.println("Welcome to the world of Livonia!");
        System.out.println("********");
    }

    public void askPlayerToChooseCharacter(){
        System.out.println("Choose your character: \n");

        for(PlayableCharacters character : PlayableCharacters.values()){
            System.out.println(character + " \n");
        }

        while(true) {
            String input = scanner.nextLine();

        try{
            PlayableCharacters selected = PlayableCharacters.valueOf(input.trim().toUpperCase());
            System.out.println("You have selected " + selected);
            SelectedCharacterIntro selectedCharacterIntro = new SelectedCharacterIntro(selected);
            break;
        } catch (IllegalArgumentException e) {
            System.out.println("Please select the available player class!\n");
        }

    }

 }
}