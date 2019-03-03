package ui;

import java.util.*;

import tainiothiki.moviemanager;

public class tainiothiki {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int answer = -1;
		boolean load_ok = false;
		boolean loaduser_ok = false;
		boolean exit = false;
		String exit_answer;
		String movie_path;
		String actor_path;
		String country_path;
		String genre_path;
		String location_path;
		String dir_path;
		String tagdef_path;
		String rating_path;
		String tag_path;
		String movietag_path;
		String path_file = "########################################";
		int form = -1;
		String file_name="";
		String movie_name;	
		String genre_name;
		String director_name;
		String actor_name;
		String country_name;
		
		moviemanager manager=new moviemanager();
				
		while(exit == false) {
			
			System.out.println("\n\n\t\t\t\t~~~~~~~~~~~~~~~");
			System.out.println("\t\t\t\t~~~MAIN MENU~~~");
			System.out.println("\t\t\t\t~~~~~~~~~~~~~~~\n");
			
			while(answer!=0 && answer!=1 && answer!=2 && answer!=3 && answer!=4 && answer!=5 && answer!=6 && answer!=7 && answer!=8 && answer!=9) {
				if(load_ok == false) {
					System.out.println("\t-> gia na fortosete tin pliriforie gia tis tenies pliktrologiste to <1>\n\tPROSOXI : auto einai proapetoumeno gia oles tis ipolipes energies!!!\n");
				}
				if(loaduser_ok == false) {
					System.out.println("\t-> gia na fortosete tin plitoforia gia ta tags kai ta ratings pliktrologiste to <2>\n");
				}
				System.out.println("\t-> gia anazitisi mias tenias me vasi ton titlo tis i to ID pliktrologiste <3>\n");
				System.out.println("\t-> gia anazitisi mias tenias me vasi ton titlo tis i to ID (+tags) pliktrologiste <4>\n");
				System.out.println("\t-> gia anazitisi mias tenias me vasi ton titlo tis i to ID (+ratings) pliktrologiste <5>\n");
				System.out.println("\t-> gia anazitisi ton tenion me vasi to idos tous pliktrologiste <6>\n");
				System.out.println("\t-> gia anazitisi ton tenion me vasi kapoiou skinotheti pliktrologiste <7>\n");
				System.out.println("\t-> gia anazitiri ton tenion me vasi enos ithopiou pliktrologiste <8>\n");
				System.out.println("\t-> gia anazitisi ton tenion me vasi tin xota proelefsis <9>\n");
				System.out.println("\t-> gia termatismo tou programatos teniothiki pliktrologiste <0>\n");
				
				answer = input.nextInt();
			}
			
			if(answer == 0) {
				System.out.println("\teiste sigouros pos thelete na apoxorisete apo to progtama ? <Y/N>\n");
				exit_answer = input.next();
				if(exit_answer.equals("Y") || exit_answer.equals("y") || exit_answer.equals("YES") || exit_answer.equals("yes") || exit_answer.equals("Yes")) {
					exit = true;
					
					System.out.println("\t\t\t\t         @@@");
					System.out.println("\t\t\t\t       @@@@@@@");
					System.out.println("\t\t\t\t     @@@@@@@@@@@");
					System.out.println("\t\t\t\t   @@@@@@@@@@@@@@@");
					System.out.println("\t\t\t\t @@@@@@@@@@@@@@@@@@@");
					System.out.println("\t\t\t\t@@@@~~~BYE BYE~~~@@@@");
					System.out.println("\t\t\t\t @@@@@@@@@@@@@@@@@@@");
					System.out.println("\t\t\t\t   @@@@@@@@@@@@@@@");
					System.out.println("\t\t\t\t     @@@@@@@@@@@");
					System.out.println("\t\t\t\t       @@@@@@@");
					System.out.println("\t\t\t\t         @@@");
				}
				/*switch (exit_answer) {
				case "Y":
				case "y":
				case "yes":
				case "YES":
				case "Yes":
					exit = true;
					//break exit_program;
				}*/
				
			}else if(answer == 1) {
				if(load_ok == true) {
					System.out.println("\tta arxia exoun idi fortothei\n");
				}else{
					System.out.println("\tisagete to path ton movie_files\n");
					movie_path = input.next();
					System.out.println("\tisagete to path ton actor_files\n");
					actor_path = input.next();
					System.out.println("\tisagete to path ton country_files\n");
					country_path = input.next();
					System.out.println("\tisagete to path ton genre_files\n");
					genre_path = input.next();
					System.out.println("\tisagete to path ton location_files\n");
					location_path = input.next();
					System.out.println("\tisagete to path ton director_files\n");
					dir_path = input.next();
					System.out.println("\tisagete to path ton tagdef_files\n");
					tagdef_path = input.next();
					
					
					load_ok = manager.load(movie_path, actor_path, country_path, genre_path, location_path, dir_path, tagdef_path);
				}
				
			}else if(answer == 2) {
				if(loaduser_ok == true) {
					System.out.println("\tta arxia gia ta tags & ratings exoun idi fortothei\n");
				}else {
					System.out.println("\tisagete to path ton UserRating_files");
					rating_path = input.next();
					System.out.println("\tisagete to path ton UserTag_files");
					tag_path = input.next();
					System.out.println("\tisagete to path ton movietags_files\n");
					movietag_path = input.next();
					
					loaduser_ok = manager.loaduser(rating_path, tag_path);
					manager.loadmovietags(movietag_path);
				}
				
			}else if(answer == 3) {
				if(load_ok == false) {
					System.out.println("\terror : den exoun fortothei ta arxia\n");
				}else{
							
					System.out.println("\tPia tenia tha thelate na anazitisete ?\n\tpliktrologiste ton titlo i to ID autis :\n");
					movie_name = input.next();
					while(form != 1 && form != 2 && form != 3 && form != 4 ) {
						System.out.println("\tepilejte tin morfi tin opia tha thelate na exei to kimeno sas:\n\t\t<1> for HTML\n\t\t<2> for txt\n\t\t<3> for markdown\n\t\t<4> for pdf\n");
						form = input.nextInt();
					}
					System.out.println("\tpliktrologiste to onoma to opio epithimite na exei to arxio pou epilejate;\n");
					path_file = input.next();
					manager.searchmovieName(movie_name,path_file,file_name,form,0);
					form = -1;
				}
				
			}else if(answer == 4) {
				if(load_ok == false) {
					System.out.println("\terror : den exoun fortothei ta arxia\n");
				}else if(loaduser_ok == false) {
					System.out.println("\terror : den exoun fortothei ta arxia gia ta tags & ratings\n");
				}else {
					System.out.println("\tPia tenia tha thelate na anazitisete ?\n\tpliktrologiste ton titlo i to ID autis :\n");
					movie_name = input.next();
					while(form != 1 && form != 2 && form != 3 && form != 4 ) {
						System.out.println("\tepilejte tin morfi tin opia tha thelate na exei to kimeno sas:\n\t\t<1> for HTML\n\t\t<2> for txt\n\t\t<3> for markdown\n\t\t<4> for pdf\n");
						form = input.nextInt();
					}
					System.out.println("\tpliktrologiste to onoma to opio epithimite na exei to arxio pou epilejate;\n");
					path_file = input.next();
					manager.searchmovieName(movie_name,path_file,file_name,form,1);
					form = -1;
				}
				
			}else if(answer == 5) {
				if(load_ok == false) {
					System.out.println("\terror : den exoun fortothei ta arxia\n");
				}else if(loaduser_ok == false) {
					System.out.println("\terror : den exoun fortothei ta arxia gia ta tags & ratings\n");
				}else {
					System.out.println("\tPia tenia tha thelate na anazitisete ?\n\tpliktrologiste ton titlo i to ID autis :\n");
					movie_name = input.next();
					while(form != 1 && form != 2 && form != 3 && form != 4 ) {
						System.out.println("\tepilejte tin morfi tin opia tha thelate na exei to kimeno sas:\n\t\t<1> for HTML\n\t\t<2> for txt\n\t\t<3> for markdown\n\t\t<4> for pdf\n");
						form = input.nextInt();
					}
					System.out.println("\tpliktrologiste to onoma to opio epithimite na exei to arxio pou epilejate;\n");
					path_file = input.next();
					manager.searchmovieName(movie_name,path_file,file_name,form,2);
					form = -1;
				}
				
			}else if(answer == 6) {
				if(load_ok == false) {
					System.out.println("\terror : den exoun fortothei ta arxia\n");
				}else {
					System.out.println("\tpliktrologiste to idos ton tenion pou thelete na anazitisete:\n");
					genre_name = input.next();
					while(form != 1 && form != 2 && form != 3 && form != 4 ) {
						System.out.println("\tepilejte tin morfi tin opia tha thelate na exei to kimeno sas:\n\t\t<1> for HTML\n\t\t<2> for txt\n\t\t<3> for markdown\n\t\t<4> for pdf\n");
						form = input.nextInt();
					}
					System.out.println("\tpliktrologiste to onoma to opio epithimite na exei to arxio pou epilejate;\n");
					path_file = input.next();
					manager.searchgenre(genre_name,path_file,file_name,form);
					form = -1;
				}
				
			}else if(answer == 7) {
				if(load_ok == false) {
					System.out.println("\terror : den exoun fortothei ta arxia\n");
				}else {
					System.out.println("\tpliktrologiste to onoma tou skinotheti tou opiou tis tenies thelete na anazitisete:\n");
					director_name = input.nextLine();
					while(form != 1 && form != 2 && form != 3 && form != 4 ) {
						System.out.println("\tepilejte tin morfi tin opia tha thelate na exei to kimeno sas:\n\t\t<1> for HTML\n\t\t<2> for txt\n\t\t<3> for markdown\n\t\t<4> for pdf\n");
						form = input.nextInt();
					}
					System.out.println("\tpliktrologiste to onoma to opio epithimite na exei to arxio pou epilejate;\n");
					path_file = input.next();
					manager.searchdirector(director_name,path_file,file_name,form);
					form = -1;
				}
				
			}else if(answer == 8) {
				if(load_ok == false) {
					System.out.println("\terror : den exoun fortothei ta arxia\n");
				}else {
					System.out.println("\tpliktrologiste to onoma tou ithopiou :\n");
					actor_name = input.nextLine();
					while(form != 1 && form != 2 && form != 3 && form != 4 ) {
						System.out.println("\tepilejte tin morfi tin opia tha thelate na exei to kimeno sas:\n\t\t<1> for HTML\n\t\t<2> for txt\n\t\t<3> for markdown\n\t\t<4> for pdf\n");
						form = input.nextInt();
					}
					System.out.println("\tpliktrologiste to onoma to opio epithimite na exei to arxio pou epilejate;\n");
					path_file = input.next();
					manager.searchactor(actor_name,path_file,file_name,form);
					form = -1;
				}
				
			}else if(answer == 9) {
				if(load_ok == false) {
					System.out.println("\terror : den exoun fortothei ta arxia\n");
				}else {
					System.out.println("\tpliktrologiste tin xora proelefsis ton tenion pou thelete na anazitisete:\n");
					country_name = input.next();
					while(form != 1 && form != 2 && form != 3 && form != 4 ) {
						System.out.println("\tepilejte tin morfi tin opia tha thelate na exei to kimeno sas:\n\t\t<1> for HTML\n\t\t<2> for txt\n\t\t<3> for markdown\n\t\t<4> for pdf\n");
						form = input.nextInt();
					}
					System.out.println("\tpliktrologiste to onoma to opio epithimite na exei to arxio pou epilejate;\n");
					path_file = input.next();
					manager.searchcountry(country_name,path_file,file_name,form);
					form = -1;
				}
			}
			answer = -1;
		}
	}
}
