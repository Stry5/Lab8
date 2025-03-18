public class Demonstrator {
    public Demonstrator(){
        Rule rule1 = new Rule("Protocol 1: Link to Pilot.");
        Rule rule2 = new Rule("Protocol 2: Uphold the mission.");
        Rule rule3 = new Rule("Protocol 3: Protect the Pilot.");

        Rule[] defaultRules = {rule1,rule2,rule3};

        Rule thRule1 = new Rule("Player with the best hand made of 5 cards wins");
        Rule thRule2 = new Rule("The dealer must burn the top card of the deck prior to dealing or playing a card");
        Rule thRule3 = new Rule("Each player is dealt a total of 2 cards");
        Rule thRule4 = new Rule("There must be a designated big blind and small blind every round," +
                "who are required to bet some money into the pot prior to seeing the first 3 cards");
        Rule thRule5 = new Rule("If a player that wins with a 7 and a 2 any suit in their had, all players must" +
                "give the winning player one dollar");

        Rule[] texasHoldemRules = {thRule1,thRule2,thRule3,thRule4,thRule5};
        Game g = new Game("EX game",defaultRules);
        TableTopGame ttg = new TableTopGame("EX tabletopgame",defaultRules);
        Sport s = new Sport("EX sport",defaultRules);
        MotorizedSport ms = new MotorizedSport("Rallycross Driving",defaultRules);

        // this is my game that I put more though into the rules
        CardGame cg = new CardGame("Texas Holdem'",texasHoldemRules);

        System.out.println(g.toString() + System.lineSeparator());
        System.out.println(ttg.toString() + System.lineSeparator());
        System.out.println(s.toString() + System.lineSeparator());
        System.out.println(ms.toString() + System.lineSeparator());
        System.out.println(cg.toString() + System.lineSeparator());




    }

}
