import java.util.Scanner;

// Define Character class with attributes
class Character {
    String name;
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;
    
    // Constructor
    public Character(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }
}

// Define D&D classes and their descriptions
enum DnDClass {
    BARBARIAN("Masters of primal strength, barbarians excel in melee combat. They rage into battle, becoming tougher and dealing more damage as they fight."),
    BARD("Bards are charismatic performers and storytellers who use their music, magic, and wit to inspire allies, manipulate foes, and cast spells."),
    CLERIC("Devoted to a deity or higher power, clerics channel divine magic to heal allies, smite enemies, and protect their companions with spells and divine favor."),
    DRUID("Guardians of nature, druids have a deep connection with the earth and its creatures. They can shape-shift, cast nature spells, and commune with animals."),
    FIGHTER("Masters of combat techniques, fighters are versatile warriors skilled in various weapons and fighting styles. They excel in physical combat and can specialize in different martial paths."),
    MONK("Disciplined and agile, monks are martial artists who harness their ki (inner energy) to perform extraordinary feats. They specialize in unarmed strikes and swift movement."),
    PALADIN("Holy warriors devoted to righteousness and justice, paladins wield divine magic, protect the weak, smite evil, and uphold their oath to a cause or deity."),
    RANGER("Skilled trackers and survivalists, rangers excel in outdoor environments. They are adept at ranged combat, tracking enemies, and forming bonds with animals."),
    ROGUE("Masters of stealth and deception, rogues are agile and cunning adventurers. They excel in sneaking, picking locks, disarming traps, and dealing sneak attacks."),
    SORCERER("Innate spellcasters with magical bloodlines, sorcerers channel raw arcane power to cast spells, manipulate elements, and unleash potent magical effects."),
    WARLOCK("Pact-bound wielders of eldritch power, warlocks form pacts with powerful entities for magical abilities. They cast spells, summon otherworldly beings, and wield eldritch invocations."),
    WIZARD("Scholars of arcane knowledge, wizards study spellbooks to master a wide range of spells. They are masters of magic, able to cast spells from various schools and create magical effects.");

    private final String description;

    DnDClass(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

// Logic for class detection based on questionnaire
class DnDCalculator {
    public DnDClass calculateClass(Character character) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer the following questions with 'yes' or 'no':");

        // Sample questionnaire logic - replace with actual questions and class detection
        System.out.println("Do you prefer brute strength in combat?");
        String answer1 = scanner.nextLine().toLowerCase();
        System.out.println("Are you skilled at casting spells?");
        String answer2 = scanner.nextLine().toLowerCase();

        if (answer1.equals("yes")) {
            return DnDClass.BARBARIAN;
        } else if (answer2.equals("yes")) {
            return DnDClass.WIZARD;
        } else {
            return null; // Default if class cannot be determined
        }
    }
}

// Usage with user input
public class generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the D&D Class Calculator!");
        System.out.print("Enter your character's name: ");
        String name = scanner.nextLine();

        // Get attribute inputs from the user
        System.out.print("Enter your strength (1-20): ");
        int strength = scanner.nextInt();
        // Repeat for other attributes like dexterity, constitution, etc.

        Character player = new Character(name, strength, 0, 0, 0, 0, 0); // Initialize with only strength for example
        DnDCalculator calculator = new DnDCalculator();
        DnDClass dndClass = calculator.calculateClass(player);
        
        if (dndClass != null) {
            System.out.println("Your calculated D&D Class: " + dndClass.name());
            System.out.println("Description: " + dndClass.getDescription());
        } else {
            System.out.println("Sorry, your class could not be determined.");
        }
    }
}
