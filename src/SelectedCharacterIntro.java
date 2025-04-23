

public class SelectedCharacterIntro {
    private GameStartIntro.PlayableCharacters selectedCharacter;

    public SelectedCharacterIntro (GameStartIntro.PlayableCharacters selectedCharacter) {
        this.selectedCharacter = selectedCharacter;
    }

    public GameStartIntro.PlayableCharacters getSelectedCharacter() {
        return selectedCharacter;
    } 
}
