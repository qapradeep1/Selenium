package com.Practicejava.org;

import java.util.Scanner;

public class Player {

		public Player() {
		}

		public void setScore(int score) {
		    this.score = score;
		}

		public void setName(String name) {
		    this.name1 = name;
		}

		private String name1;
		private int score;

		public Player(String name, int score) {
		    this.name1 = name;
		    this.score = score;
		}
		 public String getName() { 
		     return name1;
		 }

		Override
		public String toString() {
		    return "Player{" + "name=" + name1 + "score=" + score + '}';
		}

		public int getScore() {
		    return score;
		}
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer,Player> name= new HashMap<Integer,Player>();

		    System.out.printf("Give the number of the players ");
		    int number_of_players = scanner.nextInt();


		    for(int k=1;k<=number_of_players;k++)
		     {


		         System.out.printf("Give the name of player %d: ",k);
		         name_of_players= scanner.nextLine();
		         name1.put(k, new Player(name_of_players,0));

		     } 
		    for(int k=1;k<=number_of_players;k++)
		  {  
		      Player name1 = name1.get(k);
		     System.out.print("Name of player in this round:"+name1.getName());
		    
		    int score=p.getScore();
		    name1.put(k,new Player(name1.getName(),scr));

		    for(int n=1;n<=number_of_players;n++)
		      {

		     System.out.print("The player"+name1.getName()+" has "+name1.getScore()+"points");

		      }


	}

