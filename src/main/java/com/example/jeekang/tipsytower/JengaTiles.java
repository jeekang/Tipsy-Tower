package com.example.jeekang.tipsytower;

import java.util.Random;

/**
 * Created by jeekang on 9/4/16.
 */
public class JengaTiles {
        String[] rules;
        int tiles = 53;

        public JengaTiles() {
              String[] strArray = {"Tell 2 truths and 1 lie. Take a drink for every person that guesses the lie.",
                    "In a sentence, use a word no one knows the meaning of or drink.",
                    "Cheers! Everyone drinks.",
                    "Drink for every pet you have every owned.",
                    "Take your next block with your eyes closed.",
                    "Lucky you! Everyone except you must finish their drink.",
                    "The oldest person in the group must drink.",
                    "The youngest person in the group must drink.",
                    "Choose someone to link to. Every time you drink, they must drink as well.",
                    "Give one drink.",
                    "Give one for every cheese you can name in 30 seconds.",
                    "You must finish your drink.",
                    "The person who most recently had sex has to take a drink.",
                    "The shortest person drinks.",
                    "The tallest person drinks.",
                    "Put this piece back where you got it and pull a different one.",
                    "Pick a color. Everyone must drink one for every article of clothing they have on that contains that color.",
                    "Pick 3 people to take a drink.",
                    "Guys take a drink.",
                    "You must use your non-dominant hand for the rest of the game, if you are ambidextrous, you may give one drink",
                    "Girls take a drink.",
                    "Make a rule that must be followed for the rest of the game.",
                    "You must insult the person to your right, then compliment the person to your left.",
                    "Go to the Facebook or Instagram of someone not in the room, and ‘like’ one of their photos that is at least a year old.",
                    "Everyone holds up three fingers. Continue taking turns saying a “Never have I ever…” Every time you have done one of the statements, you put one finger down. First person to lose all three fingers must take a drink.",
                    "Assign every player a nickname. Everyone must use these nicknames for the rest of the game. If they fail, they must take a drink.",
                    "You cannot take a center piece on your next turn.",
                    "Touch your nose. Everyone else must follow and touch their nose as quickly as possible. Last person to touch their nose must take a drink.",
                    "You are the new question master for the game (replace a previous one). Every time someone answers a question you ask them, they must take a drink.",
                    "Take a block from the top and put it back in the tower.",
                    "You are safe the next time you have to drink (even if it entails multiple drinks)",
                    "Send a sexy selfie to someone who is not in the room and is not a significant other.",
                    "Everyone pours a little of their drink into a cup. You must drink the mixture.",
                    "Everyone takes a shot.",
                    "Drink once for every sibling that you have.",
                    "Choose the next person to take a block.",
                    "Remove another block from the tower.",
                    "Pick someone to play with their opposite hand for the rest of the game.",
                    "Take a shot.",
                    "Everyone takes a vote, and the person with the most votes must finish their drink.",
                    "Ask a random trivia question. First one to answer wins. Everyone else takes a drink.",
                    "Take a drink for every year of college education you have completed.",
                    "Pick a Code Word.  If you hear this code word, you must destroy the tower.",
                    "Predict who will knock the tower down.  If you end up being wrong, you must accept the penalty instead of them.",
                    "You must take a tile from within 3 rows of the top for the rest of the game.",
                    "Pick someone.  For the rest of the game, they must drink the first of any drinks given to you.",
                    "Players now take turns in the opposite direction.",
                    "Drink 3 and skip your next turn.",
                    "Next person takes two blocks.",
                    "Skip the next player's turn.",
                    "UNDO a rule. If no rule is in play, give a drink.",
                    "Pick someone.  For the rest of the game, they must drink in your stead any drinks given to you, and vice versa.",
                    "Drink one for every player younger than you.",
                    "Drink one for every player older than you.",
                    "Truth or Dare?"};
            rules = strArray;
        }
        public String  returnRule() {
            if (tiles < 0) {
                return "That's all the tiles! Select 'New Game' to continue";
            }
            if (tiles == 0){
                return rules[tiles--];
            }
            Random rand = new Random();
            String result;
            int randInt = rand.nextInt(tiles);
            result = rules[randInt];
            if(randInt == tiles) {

                rules[tiles--] = "";
            } else {
                rules[randInt] = rules[tiles];
                tiles--;
            }
            return result;
        }
        public void newGame() {
            rules = null;
        }
    }


