package hspacksim;

import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Ankit
 */
public class HearthstoneSim extends javax.swing.JFrame {

    public HearthstoneSim() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Simulate = new javax.swing.JButton();
        Heading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CardArea = new javax.swing.JTextArea();
        GDataClassic = new javax.swing.JToggleButton();
        GDataBlackrock = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Simulate.setText("Simulate");
        Simulate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Simulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimulateActionPerformed(evt);
            }
        });

        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("Hearthstone Pack Simulator");

        CardArea.setColumns(20);
        CardArea.setRows(5);
        jScrollPane1.setViewportView(CardArea);

        GDataClassic.setText("Classic");
        GDataClassic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GDataClassicActionPerformed(evt);
            }
        });

        GDataBlackrock.setText("Blackrock");
        GDataBlackrock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GDataBlackrockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(Heading))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Simulate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GDataClassic)
                        .addGap(18, 18, 18)
                        .addComponent(GDataBlackrock)))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Heading)
                .addGap(40, 40, 40)
                .addComponent(Simulate)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GDataClassic)
                    .addComponent(GDataBlackrock))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    ArrayList<String> common = new ArrayList<>();
    ArrayList<String> rare = new ArrayList<>();
    ArrayList<String> epic = new ArrayList<>();
    ArrayList<String> legendary = new ArrayList<>();
            
    Random rand = new Random();
    public int card1, card2, card3, card4, card5;
    public int ClassicStatus = 0;
    public int BlackrockStatus = 0;
    public String firstcard = null;
    public String secondcard = null;
    public String thirdcard = null;
    public String fourthcard = null;
    public String fifthcard = null;
    
    
    private void SimulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimulateActionPerformed
        card1 = rand.nextInt(99) + 1;
        card2 = rand.nextInt(99) + 1;
        card3 = rand.nextInt(99) + 1;
        card4 = rand.nextInt(99) + 1;
        card5 = rand.nextInt(99) + 1;
        

        // Identifying whether card1 is a common, rare, epic, or legenadry card
        // Legendary Card
        if(card1 == 1)
        {
            firstcard = legendary.get(new Random().nextInt(legendary.size()));
        }
        
        // Epic Card
        else if (card1 >= 2 && card1 <= 6)
        {
            firstcard = epic.get(new Random().nextInt(epic.size()));
        }
        
        // Rare Card
        else if (card1 >= 7 && card1 <= 30)
        {
            firstcard = rare.get(new Random().nextInt(rare.size()));
        }
        
        // Common Card
        else
        {
            firstcard = common.get(new Random().nextInt(common.size()));
        }
        
        // Identifying  whether card2 is a common, rare, epic, or legenadry card
        // Legendary Card
        if(card2 == 1)
        {
            secondcard = legendary.get(new Random().nextInt(legendary.size()));
        }
        
        // Epic Card
        else if (card2 >= 2 && card2 <= 6)
        {
            secondcard = epic.get(new Random().nextInt(epic.size()));
        }
        
        // Rare Card
        else if (card2 >= 7 && card2 <= 30)
        {
            secondcard = rare.get(new Random().nextInt(rare.size()));
        }
        
        // Common Card
        else
        {
            secondcard = common.get(new Random().nextInt(common.size()));
        }
        
        // Identifying  whether card3 is a common, rare, epic, or legenadry card
        // Legendary Card
        if(card3 == 1)
        {
            thirdcard = legendary.get(new Random().nextInt(legendary.size()));
        }
        
        // Epic Card
        else if (card3 >= 2 && card3 <= 6)
        {
            thirdcard = epic.get(new Random().nextInt(epic.size()));
        }
        
        // Rare Card
        else if (card3 >= 7 && card3 <= 30)
        {
            thirdcard = rare.get(new Random().nextInt(rare.size()));
        }
        
        // Common Card
        else
        {
            thirdcard = common.get(new Random().nextInt(common.size()));
        }
        
        // Identifying  whether card4 is a common, rare, epic, or legenadry card
        // Legendary Card
        if(card4 == 1)
        {
            fourthcard = legendary.get(new Random().nextInt(legendary.size()));
        }
        
        // Epic Card
        else if (card4 >= 2 && card4 <= 6)
        {
            fourthcard = epic.get(new Random().nextInt(epic.size()));
        }
        
        // Rare Card
        else if (card4 >= 7 && card4 <= 30)
        {
            fourthcard = rare.get(new Random().nextInt(rare.size()));
        }
        
        // Common Card
        else
        {
            fourthcard = common.get(new Random().nextInt(common.size()));
        }
        
        // Identifying  whether card5 is a common, rare, epic, or legenadry card
        // Legendary Card
        if(card5 == 1)
        {
            fifthcard = legendary.get(new Random().nextInt(legendary.size()));
        }
        
        // Epic Card
        else if (card5 >= 2 && card5 <= 6)
        {
            fifthcard = epic.get(new Random().nextInt(epic.size()));
        }
        
        // Rare Card
        else if (card5 >= 7 && card5 <= 30)
        {
            fifthcard = rare.get(new Random().nextInt(rare.size()));
        }
        
        // Common Card
        else
        {
            fifthcard = common.get(new Random().nextInt(common.size()));
        }
        
        CardArea.setText (firstcard + "\n" + secondcard + "\n" + thirdcard + "\n" + fourthcard + "\n" + fifthcard);
       
    }//GEN-LAST:event_SimulateActionPerformed

    private void GDataClassicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GDataClassicActionPerformed
        
        if(ClassicStatus == 0)
            {
                 // Adds all Classic Common Cards to the Common ArrayList
                common.addAll(Arrays.asList("Circle of Healing", "Inner Rage", "Shadowstep", "Silence", "Wisp", "Abusive Sergeant", "Argent Squire", "Blessing of Wisdom",
                "Blood Imp", "Cold Blood", "Conceal", "Dust Devil", "Earth Shock", "Eye for an Eye", "Flame Imp","Forked Lightning", "Ice Lance", "Inner Fire", "Leper Gnome", 
                "Lightning Bolt", "Mana Wyrm", "Noble Sacrifice", "Power Overwhelming", "Redemption", "Repentance", "Shieldbearer", "Southsea Deckhand", "Worgen Infiltrator", 
                "Young Dragonhawk", "Amani Berserker", "Argent Protector", "Battle Rage", "Betrayal", "Bloodsail Raider", "Cruel Taskmaster", "Defias Ringleader", "Demonfire", 
                "Dire Wolf Alpha", "Eviscerate", "Explosive Trap", "Faerie Dragon", "Freezing Trap", "Ironbeak Owl", "Loot Hoarder", "Mad Bomber", "Naturalize", "Rampage", 
                "Scavenging Hyena", "Slam", "Snipe", "Sorcerer's Apprentice", "Stormforged Axe", "Power of the Wild", "Youthful Brewmaster", "Acolyte of Pain", "Deadly Shot", 
                "Earthen Ring Farseer", "Flesheating Ghoul", "Harvest Golem", "Ice Barrier", "Jungle Panther", "Wrath", "Mirror Entity", "Raging Worgen", "Scarlet Crusader", 
                "Sense Demons", "Tauren Warrior", "Thoughtsteal", "Thrallmar Farseer", "Unbound Elemental", "Unleash the Hounds", "Ancient Brewmaster", "Arathi Weaponsmith", 
                "Cone of Cold", "Cult Master", "Dark Iron Dwarf", "Dread Corsair", "Lightspawn", "Mogu'shan Warden", "Silvermoon Guardian", "Mark of Nature", "Spellbreaker",
                "Summoning Portal", "Soul of the Forest", "Fen Creeper", "Silver Hand Knight", "Spiteful Smith", "Stranglethorn Tiger", "Venture Co. Mercenary", "Frost Elemental", 
                "Priestess of Elune", "Temple Enforcer", "Windfury Harpy", "Druid of the Claw"));
                
                // Adds all Classic Rare Cards to the Rare ArrayList
                rare.addAll(Arrays.asList("Savagery", "Bite", "Keeper of the Grove", "Nourish", "Starfall", "Flare", "Misdirection", "Eaglehorn Bow", "Explosive Shot", "Savannah Highmane", 
                        "Counterspell", "Kirin Tor Mage", "Vaporize", "Ethereal Arcanist", "Blizzard", "Angry Chicken", "Bloodsail Corsair", "Lightwarden", "Murloc Tidecaller", "Secretkeeper", 
                        "Young Priestess", "Ancient Watcher", "Crazed Alchemist", "Knife Juggler", "Mana Addict", "Mana Wraith", "Master Swordsmith", "Pint-Sized Summoner", "Sunfury Protector",
                        "Wild Pyromancer", "Alarm-o-Bot", "Arcane Golem", "Coldlight Oracle", "Coldlight Seer", "Demolisher", "Emperor Cobra", "Imp Master", "Injured Blademaster", "Mind Control Tech", 
                        "Questing Adventurer", "Ancient Mage", "Defender of Argus", "Twilight Drake", "Violet Teacher", "Abomination", "Azure Drake", "Stampeding Kodo", "Argent Commander", "Gadgetzan Auctioneer", 
                        "Sunwalker", "Ravenholdt Assassin", "Equality", "Aldor Peacekeeper", "Divine Favor", "Blessed Champion", "Holy Wrath", "Lightwell", "Auchenai Soulpriest", "Mass Dispel", "Shadow Madness", 
                        "Holy Fire", "Blade Flurry", "Headcrack", "Perdition's Blade", "SI:7 Agent", "Master of Disguise", "Ancestral Spirit", "Feral Spirit", "Lava Burst", "Lightning Storm", "Mana Tide Totem", 
                        "Felguard", "Void Terror", "Shadowflame", "Doomguard", "Siphon Soul", "Upgrade!", "Armorsmith", "Commanding Shout", "Frothing Berserker", "Mortal Strike"));
                
                // Adds all Classic Rare Cards to the Epic ArrayList
                epic.addAll(Arrays.asList("Force of Nature", "Ancient of Lore", "Ancient of War", "Preparation", "Bestial Wrath", "Hungry Crab", "Shield Slam", "Captain's Parrot", "Doomsayer", "Patient Assassin", 
                        "Snake Trap", "Big Game Hunter", "Blood Knight", "Far Sight", "Ice Block", "Murloc Warleader", "Shadowform", "Southsea Captain", "Spellbender", "Sword of Justice", "Mindgames", "Pit Lord", 
                        "Bane of Doom", "Brawl", "Doomhammer", "Earth Elemental", "Faceless Manipulator", "Avenging Wrath", "Cabal Shadow Priest", "Kidnapper", "Gladiator's Longbow", "Gorehowl", "Lay on Hands", 
                        "Twisting Nether", "Pyroblast", "Sea Giant", "Mountain Giant", "Molten Giant"));
                
                // Adds all Classic Legendary Cards to the Legendary ArrayList
                legendary.addAll(Arrays.asList("Cenarius", "Bloodmage Thalnos", "Lorewalker Cho", "Millhouse Manastorm", "Nat Pagle", "Edwin VanCleef", "King Mukla", "Tinkmaster Overspark", "Old Murk-Eye", 
                        "Captain Greenskin", "Harrison Jones", "Leeroy Jenkins", "Cairne Bloodhoof", "Hogger", "Illidan Stormrage", "Sylvanas Windrunner", "The Beast", "The Black Knight", "Archmage Antonidas", 
                        "Baron Geddon", "Prophet Velen", "Al'Akir the Windlord", "Grommash Hellscream", "Gruul", "Ragnaros the Firelord", "Tirion Fordring", "Alexstrasza", "King Krush", "Lord Jaraxxus", "Malygos", 
                        "Nozdormu", "Onyxia", "Ysera", "Deathwing"));
                
                ClassicStatus++;
            }
        
        else
            {
                // Removes all Classic Common Cards from the Common ArrayList
                common.removeAll(Arrays.asList("Circle of Healing", "Inner Rage", "Shadowstep", "Silence", "Wisp", "Abusive Sergeant", "Argent Squire", "Blessing of Wisdom",
                "Blood Imp", "Cold Blood", "Conceal", "Dust Devil", "Earth Shock", "Eye for an Eye", "Flame Imp","Forked Lightning", "Ice Lance", "Inner Fire", "Leper Gnome", 
                "Lightning Bolt", "Mana Wyrm", "Noble Sacrifice", "Power Overwhelming", "Redemption", "Repentance", "Shieldbearer", "Southsea Deckhand", "Worgen Infiltrator", 
                "Young Dragonhawk", "Amani Berserker", "Argent Protector", "Battle Rage", "Betrayal", "Bloodsail Raider", "Cruel Taskmaster", "Defias Ringleader", "Demonfire", 
                "Dire Wolf Alpha", "Eviscerate", "Explosive Trap", "Faerie Dragon", "Freezing Trap", "Ironbeak Owl", "Loot Hoarder", "Mad Bomber", "Naturalize", "Rampage", 
                "Scavenging Hyena", "Slam", "Snipe", "Sorcerer's Apprentice", "Stormforged Axe", "Power of the Wild", "Youthful Brewmaster", "Acolyte of Pain", "Deadly Shot", 
                "Earthen Ring Farseer", "Flesheating Ghoul", "Harvest Golem", "Ice Barrier", "Jungle Panther", "Wrath", "Mirror Entity", "Raging Worgen", "Scarlet Crusader", 
                "Sense Demons", "Tauren Warrior", "Thoughtsteal", "Thrallmar Farseer", "Unbound Elemental", "Unleash the Hounds", "Ancient Brewmaster", "Arathi Weaponsmith", 
                "Cone of Cold", "Cult Master", "Dark Iron Dwarf", "Dread Corsair", "Lightspawn", "Mogu'shan Warden", "Silvermoon Guardian", "Mark of Nature", "Spellbreaker",
                "Summoning Portal", "Soul of the Forest", "Fen Creeper", "Silver Hand Knight", "Spiteful Smith", "Stranglethorn Tiger", "Venture Co. Mercenary", "Frost Elemental", 
                "Priestess of Elune", "Temple Enforcer", "Windfury Harpy", "Druid of the Claw"));
                
                // Removes all Classic Rare Cards from the Rare ArrayList
                rare.removeAll(Arrays.asList("Savagery", "Bite", "Keeper of the Grove", "Nourish", "Starfall", "Flare", "Misdirection", "Eaglehorn Bow", "Explosive Shot", "Savannah Highmane", 
                        "Counterspell", "Kirin Tor Mage", "Vaporize", "Ethereal Arcanist", "Blizzard", "Angry Chicken", "Bloodsail Corsair", "Lightwarden", "Murloc Tidecaller", "Secretkeeper", 
                        "Young Priestess", "Ancient Watcher", "Crazed Alchemist", "Knife Juggler", "Mana Addict", "Mana Wraith", "Master Swordsmith", "Pint-Sized Summoner", "Sunfury Protector",
                        "Wild Pyromancer", "Alarm-o-Bot", "Arcane Golem", "Coldlight Oracle", "Coldlight Seer", "Demolisher", "Emperor Cobra", "Imp Master", "Injured Blademaster", "Mind Control Tech", 
                        "Questing Adventurer", "Ancient Mage", "Defender of Argus", "Twilight Drake", "Violet Teacher", "Abomination", "Azure Drake", "Stampeding Kodo", "Argent Commander", "Gadgetzan Auctioneer", 
                        "Sunwalker", "Ravenholdt Assassin", "Equality", "Aldor Peacekeeper", "Divine Favor", "Blessed Champion", "Holy Wrath", "Lightwell", "Auchenai Soulpriest", "Mass Dispel", "Shadow Madness", 
                        "Holy Fire", "Blade Flurry", "Headcrack", "Perdition's Blade", "SI:7 Agent", "Master of Disguise", "Ancestral Spirit", "Feral Spirit", "Lava Burst", "Lightning Storm", "Mana Tide Totem", 
                        "Felguard", "Void Terror", "Shadowflame", "Doomguard", "Siphon Soul", "Upgrade!", "Armorsmith", "Commanding Shout", "Frothing Berserker", "Mortal Strike"));
                
                // Removes all Classic Epic Cards from the Epic ArrayList
                epic.removeAll(Arrays.asList("Force of Nature", "Ancient of Lore", "Ancient of War", "Preparation", "Bestial Wrath", "Hungry Crab", "Shield Slam", "Captain's Parrot", "Doomsayer", "Patient Assassin", 
                        "Snake Trap", "Big Game Hunter", "Blood Knight", "Far Sight", "Ice Block", "Murloc Warleader", "Shadowform", "Southsea Captain", "Spellbender", "Sword of Justice", "Mindgames", "Pit Lord", 
                        "Bane of Doom", "Brawl", "Doomhammer", "Earth Elemental", "Faceless Manipulator", "Avenging Wrath", "Cabal Shadow Priest", "Kidnapper", "Gladiator's Longbow", "Gorehowl", "Lay on Hands", 
                        "Twisting Nether", "Pyroblast", "Sea Giant", "Mountain Giant", "Molten Giant"));
                
                // Removes all Classic Legendary Cards from the Legendary ArrayList
                legendary.removeAll(Arrays.asList("Cenarius", "Bloodmage Thalnos", "Lorewalker Cho", "Millhouse Manastorm", "Nat Pagle", "Edwin VanCleef", "King Mukla", "Tinkmaster Overspark", "Old Murk-Eye", 
                        "Captain Greenskin", "Harrison Jones", "Leeroy Jenkins", "Cairne Bloodhoof", "Hogger", "Illidan Stormrage", "Sylvanas Windrunner", "The Beast", "The Black Knight", "Archmage Antonidas", 
                        "Baron Geddon", "Prophet Velen", "Al'Akir the Windlord", "Grommash Hellscream", "Gruul", "Ragnaros the Firelord", "Tirion Fordring", "Alexstrasza", "King Krush", "Lord Jaraxxus", "Malygos", 
                        "Nozdormu", "Onyxia", "Ysera", "Deathwing"));
                
                ClassicStatus--;
            }
                
    }//GEN-LAST:event_GDataClassicActionPerformed

    private void GDataBlackrockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GDataBlackrockActionPerformed
        if(BlackrockStatus == 0)
            {
                // Adds all Blackrock Common Cards to the ArrayList Common
                common.addAll(Arrays.asList("Druid of the Flame", "Twilight Whelp", "Gang Up", "Quick Shot", "Blackwing Technician", "Img Gang Boss", "Axe Flinger",
                    "Dragonkin Sorcerer", "Fireguard Destroyer", "Hungry Dragon", "Blackwing Corruptor", "Dragon's Breath", "Solemn Vigil", "Drakonid Crusher",
                    "Volcanic Drake"));
                
                // Adds all Blackrock Rare Cards to the ArrayList Rare
                rare.addAll(Arrays.asList("Volcanic Lumberer", "Dragon Egg", "Lava Shock", "Resurrect", "Revenge", "Demonwrath", "Flamewaker", "Core Rager", "Dark Iron Skulker", 
                    "Dragon Consort", "Grim Patron"));
                
                // NOTE: THERE ARE NO BLACKROCK EPIC CARDS
                
                // Adds all Blackrock Legendary Cards tot he ArrayList Legendary
                legendary.addAll(Arrays.asList("Emperor Thaurissan", "Rend Blackhand", "Chromaggus", "Majordomo Executus" , "Nefarian"));
                
                BlackrockStatus++;
              
            }
        
        else
        {
                // Removes all Blackrock Common Cards from the ArrayList Common
                common.removeAll(Arrays.asList("Druid of the Flame", "Twilight Whelp", "Gang Up", "Quick Shot", "Blackwing Technician", "Img Gang Boss", "Axe Flinger",
                    "Dragonkin Sorcerer", "Fireguard Destroyer", "Hungry Dragon", "Blackwing Corruptor", "Dragon's Breath", "Solemn Vigil", "Drakonid Crusher",
                    "Volcanic Drake"));
                
                // Removes all Blackrock Rare Cards from the ArrayList Rare
                rare.removeAll(Arrays.asList("Volcanic Lumberer", "Dragon Egg", "Lava Shock", "Resurrect", "Revenge", "Demonwrath", "Flamewaker", "Core Rager", "Dark Iron Skulker", 
                    "Dragon Consort", "Grim Patron"));
                
                // NOTE: THERE ARE NO BLACKROCK EPIC CARDS
                
                // Removes all Blackrock Legendary Cards from the ArrayList Legendary
                legendary.removeAll(Arrays.asList("Emperor Thaurissan", "Rend Blackhand", "Chromaggus", "Majordomo Executus" , "Nefarian"));
                
                BlackrockStatus--;
        }
    }//GEN-LAST:event_GDataBlackrockActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HearthstoneSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HearthstoneSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HearthstoneSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HearthstoneSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HearthstoneSim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CardArea;
    private javax.swing.JToggleButton GDataBlackrock;
    private javax.swing.JToggleButton GDataClassic;
    private javax.swing.JLabel Heading;
    private javax.swing.JButton Simulate;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
