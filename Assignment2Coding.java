package assignment2;

import java.util.Scanner;

public class Assignment2Coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//***********************DATA*****************
		char decision = 'N';
		char decision1 = 'N';
		// SHIP RELATED
		double lengthOfShip;
		double widthOfShip;
		double ship2DApproxSize;
		double distanceToBeAchieved;
		int sprinklerApprox;
		int fireExtinguisherApprox;
		int guestPassengers;
		double insuranceCost;
		double moneyAcquired;
		int employees;
		int totalPassengers;
		int typeOfLifeboat;
		int lifeboats;
		int employeesPerLifeboat;
		double totalRevenueOrLoss;
		int tripsPerOneYear;
		double totalRevenueOrLossAfterSailing;
		
		//EQUIPMENT RELATED
		int totalLifeJackets, totalFoodSupply, totalWaterSupply, totalDrinkingVessel, totalFishingTackle, totalSurvivalManual, totalCompass, totalBuckets, totalHatchets,totalFlares,totalTorch,totalWhistle,totalTinOpeners,totalRescueQuits,totalSART,totalFireExtinguisher, totalJackKnife;
		
		//PRICE RELATED
		double totalSprinklersPrice, totalFireExtinguisherPrice, totalLifeBoatsPrice, totalLifeJacketsPrice, totalFoodPrice, totalWaterPrice, totalDrinkingVesselPrice, totalFishingTacklePrice, totalSurvivalManualPrice, totalCompassPrice, totalBucketsPrice, totalHatchetsPrice, totalFlaresPrice, totalTorchPrice, totalWhistlePrice, totalTinOpenersPrice, totalRescueQuitsPrice, totalSARTPrice, totalJackKnifePrice;
		
		while (decision == 'N') {
			System.out.println("Welcome to the ship safety equipment predictor!");
			System.out.println("This program is meant to predict how many budget to be put in the safety equipment of a cruise liner.");
			System.out.println("We will start by choosing the type of cruising you will do.");
			System.out.println("Please select the type of travelling your liner will do : ");
			System.out.println("	1.International cruising 		2.Domestic cruising  ");
			int typeOfTravel = sc.nextInt();
			while (typeOfTravel != 1 && typeOfTravel != 2) {
				System.out.println("Invalid input, please try again");
				typeOfTravel = sc.nextInt();
			}
			
			//***************************************************
			//	International
			//***************************************************
			
			if (typeOfTravel == 1) {
				System.out.println("You have selected international cruising");
				System.out.println("Please enter the length of your ship : ");
				lengthOfShip = sc.nextInt();
				System.out.println("Please enter the width of your ship : ");
				widthOfShip = sc.nextInt();
				ship2DApproxSize = widthOfShip + lengthOfShip;
				distanceToBeAchieved = (ship2DApproxSize * 2) / 5;
				sprinklerApprox = (int) (17 * ship2DApproxSize);
				fireExtinguisherApprox = (int) ((ship2DApproxSize * 5 ) / 3);
				System.out.println("Please insert the number of guest passengers that will be aboard : ");
				guestPassengers = sc.nextInt();
				System.out.println("Please insert the number of insurance money the guest passengers will be obliged to pay : ");
				insuranceCost = sc.nextDouble();
				moneyAcquired = guestPassengers * insuranceCost;
				System.out.println("Please insert the number of employees that will be aboard the ship : ");
				employees = sc.nextInt();
				totalPassengers = guestPassengers + employees;
				System.out.println("Proceed ?");
				System.out.println("Y/N");
				decision = sc.next().charAt(0);
				while (decision != 'Y' && decision != 'N') {
					System.out.println("Invalid input, please try again");
					decision = sc.next().charAt(0);
				}
				while (decision1 == 'N') {
					if (decision == 'Y') {
						System.out.println("Please insert what type of lifeboats you want to have in your liner : ");
						System.out.println("	1.Huge 			2. Medium		");
						typeOfLifeboat = sc.nextInt();
						
						switch (typeOfLifeboat) {
						//***************************************************
						//	Huge Lifeboat
						//***************************************************
						case 1 :
								lifeboats =(int) (((totalPassengers * 37.5) / 100) / 75) * 2;
								employeesPerLifeboat = employees / lifeboats;
								System.out.println("==========================================================");
								System.out.println("Size and distance details : ");
								System.out.println("Ship's 2D size  			= " + ship2DApproxSize + " meters");
								System.out.println("Ship's safe distance to an island 	= " + distanceToBeAchieved + " meters");
								System.out.println();
								System.out.println("---------------------------------------------------------");
								System.out.println();
								System.out.println("Equipment details : ");
								System.out.println("Life boats that will be on the ship = " + lifeboats);
								System.out.println();
								System.out.println("Per-lifeboat equipment details : ");
								System.out.println("Life Jackets			= 150 ");
								System.out.println("Box of food supply		= 7 ");
								System.out.println("Litres of water			= 750 ");
								System.out.println("Drinking vessels		= 150 ");
								System.out.println("Fishing tackles			= 1 ");
								System.out.println("Survival manual			= 1 ");
								System.out.println("Compass				= 1 ");
								System.out.println("Buckets				= 2 ");
								System.out.println("Hatchets			= 2 ");
								System.out.println("Flare kits			= 1 ");
								System.out.println("Electronic Torches		= 1 ");
								System.out.println("Whistle				= 1 ");
								System.out.println("Tin openers			= 3 ");
								System.out.println("Rescue quits			= 2 ");
								System.out.println("SART				= 1 ");
								System.out.println("Fire extinguisher		= 1 ");
								System.out.println("Jack knife			= 1 ");
								System.out.println("Employees per life boat		= " + employeesPerLifeboat);
								System.out.println("========================================================== ");
								System.out.println("Proceed ?");
								System.out.println("Y/N");
								decision1 = sc.next().charAt(0);
								while (decision1 != 'Y' && decision1 != 'N') {
									System.out.println("Invalid input, please try again");
									decision1 = sc.next().charAt(0);
								}
								if (decision1 == 'Y') {
									totalLifeJackets = 150 * lifeboats;
									totalFoodSupply = 7 * lifeboats;
									totalWaterSupply = (150 * 5) * lifeboats;
									totalDrinkingVessel = 150 * lifeboats;
									totalFishingTackle = lifeboats;
									totalSurvivalManual = lifeboats;
									totalCompass = lifeboats;
									totalBuckets = lifeboats * 2;
									totalHatchets = lifeboats * 2;
									totalFlares = lifeboats;
									totalTorch = lifeboats;
									totalWhistle = lifeboats;
									totalTinOpeners = lifeboats * 3;
									totalRescueQuits = lifeboats * 2;
									totalSART = lifeboats;
									totalFireExtinguisher = lifeboats + fireExtinguisherApprox;
									totalJackKnife = lifeboats;
									System.out.println();
									System.out.println("Receipt of equipment details");
									System.out.println("==========================================================");
									System.out.println("Total equipment details : ");
									System.out.println("Total Life jackets on all lifeboats		: " + totalLifeJackets);
									System.out.println("Total Food supply on all lifeboats		: " + totalFoodSupply);
									System.out.println("Total water supply on all lifeboats		: " + totalWaterSupply);
									System.out.println("Total Drinking vessels on all lifeboats		: " + totalDrinkingVessel);
									System.out.println("Total Fishing tackles on all lifeboats		: " + totalFishingTackle);
									System.out.println("Total Survival manual on all lifeboats		: " + totalSurvivalManual);
									System.out.println("Total Compass on all lifeboats			: " + totalCompass);
									System.out.println("Total Buckets on all lifeboats			: " + totalBuckets);
									System.out.println("Total Hatchets on all lifeboats			: " + totalHatchets);
									System.out.println("Total Flare kits on all lifeboats		: " + totalFlares);
									System.out.println("Total Electronic torches on all lifeboats	: " + totalTorch);
									System.out.println("Total Whistles on all lifeboats			: " + totalWhistle);
									System.out.println("Total Tin openers on all lifeboats		: " + totalTinOpeners);
									System.out.println("Total Rescue quits on all lifeboats		: " + totalRescueQuits);
									System.out.println("Total SART on all lifeboats			: " + totalSART);
									System.out.println("Total Fire extinguisher on all lifeboats	: " + totalFireExtinguisher);
									System.out.println("Total Fire extinguisher on boat and lifeboats	: " + totalFireExtinguisher);
									System.out.println("Total Jack knives on all lifeboats		: " + totalJackKnife);
									System.out.println("==========================================================");
									System.out.println("Proceed ?");
									System.out.println("Y/N");
									decision1 = sc.next().charAt(0);
									while (decision1 != 'Y' && decision1 != 'N') {
										System.out.println("Invalid input, please try again");
										decision1 = sc.next().charAt(0);
									}
									if (decision1 == 'Y') {
										System.out.println("==========================================================");
										System.out.println("Price details : ");
										System.out.println("Price of one sprinkler			=  USD 2.00");
										System.out.println("Price of one fire extinguisher		=  USD 35.00");
										System.out.println("Price of one life boat			=  USD 50000.00");
										System.out.println("Price of one life jacket		=  USD 80.00");
										System.out.println("Price of one food supply		=  USD 121.00");
										System.out.println("Price of one litre of water		=  USD 1.80");
										System.out.println("Price of one drinking vessel		=  USD 7.00");
										System.out.println("Price of one fishing tackle		=  USD 25.00");
										System.out.println("Price of one survival manual		=  USD 5.00");
										System.out.println("Price of one compass			=  USD 120.00");
										System.out.println("Price of one bucket			=  USD 2.00");
										System.out.println("Price of one hatchet			=  USD 200.00");
										System.out.println("Price of one flare kit			=  USD 114.26");
										System.out.println("Price of one electronic torch		=  USD 9.50");
										System.out.println("Price of one whistle			=  USD 5.00");
										System.out.println("Price of one tin opener			=  USD 8.00");
										System.out.println("Price of one rescue quit		=  USD 19.00");
										System.out.println("Price of one SART			=  USD 71.30");
										System.out.println("Price of one jack knife			=  USD 13.00");
										System.out.println("==========================================================");
										System.out.println("Proceed ?");
										System.out.println("Y/N");
										decision1 = sc.next().charAt(0);
										while (decision1 != 'Y' && decision1 != 'N') {
											System.out.println("Invalid input, please try again");
											decision1 = sc.next().charAt(0);
										}
										if (decision1 == 'Y') {
											totalSprinklersPrice = sprinklerApprox * 2;
											totalFireExtinguisherPrice = totalFireExtinguisher * 35;
											totalLifeBoatsPrice = lifeboats * 50000;
											totalLifeJacketsPrice = totalLifeJackets *80;
											totalFoodPrice = totalFoodSupply * 121;
											totalWaterPrice = totalWaterSupply * 1.80;
											totalDrinkingVesselPrice = totalDrinkingVessel * 7;
											totalFishingTacklePrice = totalFishingTackle * 25;
											totalSurvivalManualPrice = totalSurvivalManual * 5;
											totalCompassPrice = totalCompass * 120;
											totalBucketsPrice = totalBuckets * 2;
											totalHatchetsPrice = totalHatchets * 200;
											totalFlaresPrice = totalFlares * 114.26;
											totalTorchPrice = totalTorch * 9.50;
											totalWhistlePrice = totalWhistle * 5;
											totalTinOpenersPrice = totalTinOpeners * 8;
											totalRescueQuitsPrice = totalRescueQuits * 19;
											totalSARTPrice = totalSART * 71.30;
											totalJackKnifePrice = totalJackKnife * 13;
											System.out.println("==========================================================");
											System.out.println("All equipments price details : ");
											System.out.println("Sprinklers		= " + totalSprinklersPrice);
											System.out.println("Fire Extinguishers	= " + totalFireExtinguisherPrice);
											System.out.println("Lifeboats		= " + totalLifeBoatsPrice);
											System.out.println("Life jackets		= " + totalLifeJacketsPrice);
											System.out.println("Emergency food		= " + totalFoodPrice);
											System.out.println("Water in litres		= " + totalWaterPrice);
											System.out.println("Drinking vessels	= " + totalDrinkingVesselPrice);
											System.out.println("Fishing tackles		= " + totalFishingTacklePrice);
											System.out.println("Survival manuals	= " + totalSurvivalManualPrice);
											System.out.println("Compass			= " + totalCompassPrice);
											System.out.println("Buckets			= " + totalBucketsPrice);
											System.out.println("Hatchets		= " + totalHatchetsPrice);
											System.out.println("Flare kits		= " + totalFlaresPrice);
											System.out.println("Electronic torches	= " + totalTorchPrice);
											System.out.println("Whistles		= " + totalWhistlePrice);
											System.out.println("Tin openers		= " + totalTinOpenersPrice);
											System.out.println("Rescue quits		= " + totalRescueQuitsPrice);
											System.out.println("SARTs			= " + totalSARTPrice);
											System.out.println("Jack knives		= " + totalJackKnifePrice);
											System.out.println("==========================================================");
											double totalPrice = totalSprinklersPrice + totalFireExtinguisherPrice + totalLifeBoatsPrice
													+ totalLifeJacketsPrice + totalFoodPrice + totalWaterPrice + totalDrinkingVesselPrice
													+ totalFishingTacklePrice + totalSurvivalManualPrice + totalCompassPrice + totalBucketsPrice
													+ totalHatchetsPrice + totalFlaresPrice + totalTorchPrice + totalWhistlePrice + totalTinOpenersPrice
													+ totalRescueQuitsPrice + totalSARTPrice + totalJackKnifePrice;
											System.out.println();
											System.out.print("Total price of the whole equipment is : USD ");
											System.out.printf("%.2f", totalPrice);
											System.out.println();
											System.out.println("Proceed ?");
											System.out.println("Y/N");
											decision1 = sc.next().charAt(0);
											while (decision1 != 'Y' && decision1 != 'N') {
												System.out.println("Invalid input, please try again");
												decision1 = sc.next().charAt(0);
											}
											if (decision1 == 'Y') {
												totalRevenueOrLoss = moneyAcquired - totalPrice ;
												System.out.print("Total revenue / loss of your budget is : USD ");
												System.out.printf("%.2f", totalRevenueOrLoss);
												System.out.println();
												System.out.print("Please insert how many trips will your ship be doing in one year : ");
												tripsPerOneYear = sc.nextInt();
												totalRevenueOrLossAfterSailing = ((tripsPerOneYear * 5) * moneyAcquired) - totalPrice;
												System.out.print(
														"The total revenue / loss of your budget after 5 years is : USD ");
												System.out.printf("%.2f", totalRevenueOrLossAfterSailing);
												System.out.println();
												System.out.println("Thank you for using our services.");
												sc.close();
												break;
											}
											
										}
									}
									
								} 
						//***************************************************
						//	Medium Lifeboat
						//***************************************************
						case 2 :
							lifeboats =(int) (((totalPassengers * 37.5) / 100) / 50) * 2;
							employeesPerLifeboat = employees / lifeboats;
							System.out.println("==========================================================");
							System.out.println("Size and distance details : ");
							System.out.println("Ship's 2D size  			= " + ship2DApproxSize + " meters");
							System.out.println("Ship's safe distance to an island 	= " + distanceToBeAchieved + " meters");
							System.out.println();
							System.out.println("---------------------------------------------------------");
							System.out.println();
							System.out.println("Equipment details : ");
							System.out.println("Life boats that will be on the ship = " + lifeboats);
							System.out.println();
							System.out.println("Per-lifeboat equipment details : ");
							System.out.println("Life Jackets			= 113 ");
							System.out.println("Box of food supply		= 5 ");
							System.out.println("Litres of water			= 563 ");
							System.out.println("Drinking vessels		= 113 ");
							System.out.println("Fishing tackles			= 1 ");
							System.out.println("Survival manual			= 1 ");
							System.out.println("Compass				= 1 ");
							System.out.println("Buckets				= 1 ");
							System.out.println("Hatchets			= 1 ");
							System.out.println("Flare kits			= 1 ");
							System.out.println("Electronic Torches		= 1 ");
							System.out.println("Whistle				= 1 ");
							System.out.println("Tin openers			= 2 ");
							System.out.println("Rescue quits			= 1 ");
							System.out.println("SART				= 1 ");
							System.out.println("Fire extinguisher		= 1 ");
							System.out.println("Jack knife			= 1 ");
							System.out.println("Employees per life boat		= " + employeesPerLifeboat);
							System.out.println("========================================================== ");
							System.out.println("Proceed ?");
							System.out.println("Y/N");
							decision1 = sc.next().charAt(0);
							while (decision1 != 'Y' && decision1 != 'N') {
								System.out.println("Invalid input, please try again");
								decision1 = sc.next().charAt(0);
							}
							if (decision1 == 'Y') {
								totalLifeJackets = 113 * lifeboats;
								totalFoodSupply = 5 * lifeboats;
								totalWaterSupply = (113 * 5) * lifeboats;
								totalDrinkingVessel = 113 * lifeboats;
								totalFishingTackle = lifeboats;
								totalSurvivalManual = lifeboats;
								totalCompass = lifeboats;
								totalBuckets = lifeboats;
								totalHatchets = lifeboats;
								totalFlares = lifeboats;
								totalTorch = lifeboats;
								totalWhistle = lifeboats;
								totalTinOpeners = lifeboats * 2;
								totalRescueQuits = lifeboats;
								totalSART = lifeboats;
								totalFireExtinguisher = lifeboats + fireExtinguisherApprox;
								totalJackKnife = lifeboats;
								System.out.println();
								System.out.println("Receipt of equipment details");
								System.out.println("==========================================================");
								System.out.println("Total equipment details : ");
								System.out.println("Total Life jackets on all lifeboats		: " + totalLifeJackets);
								System.out.println("Total Food supply on all lifeboats		: " + totalFoodSupply);
								System.out.println("Total water supply on all lifeboats		: " + totalWaterSupply);
								System.out.println("Total Drinking vessels on all lifeboats		: " + totalDrinkingVessel);
								System.out.println("Total Fishing tackles on all lifeboats		: " + totalFishingTackle);
								System.out.println("Total Survival manual on all lifeboats		: " + totalSurvivalManual);
								System.out.println("Total Compass on all lifeboats			: " + totalCompass);
								System.out.println("Total Buckets on all lifeboats			: " + totalBuckets);
								System.out.println("Total Hatchets on all lifeboats			: " + totalHatchets);
								System.out.println("Total Flare kits on all lifeboats		: " + totalFlares);
								System.out.println("Total Electronic torches on all lifeboats	: " + totalTorch);
								System.out.println("Total Whistles on all lifeboats			: " + totalWhistle);
								System.out.println("Total Tin openers on all lifeboats		: " + totalTinOpeners);
								System.out.println("Total Rescue quits on all lifeboats		: " + totalRescueQuits);
								System.out.println("Total SART on all lifeboats			: " + totalSART);
								System.out.println("Total Fire extinguisher on all lifeboats	: " + totalFireExtinguisher);
								System.out.println("Total Fire extinguisher on boat and lifeboats	: " + totalFireExtinguisher);
								System.out.println("Total Jack knives on all lifeboats		: " + totalJackKnife);
								System.out.println("==========================================================");
								System.out.println("Proceed ?");
								System.out.println("Y/N");
								decision1 = sc.next().charAt(0);
								while (decision1 != 'Y' && decision1 != 'N') {
									System.out.println("Invalid input, please try again");
									decision1 = sc.next().charAt(0);
								}
								if (decision1 == 'Y') {
									System.out.println("==========================================================");
									System.out.println("Price details : ");
									System.out.println("Price of one sprinkler			=  USD 2.00");
									System.out.println("Price of one fire extinguisher		=  USD 35.00");
									System.out.println("Price of one life boat			=  USD 38000.00");
									System.out.println("Price of one life jacket		=  USD 80.00");
									System.out.println("Price of one food supply		=  USD 121.00");
									System.out.println("Price of one litre of water		=  USD 1.80");
									System.out.println("Price of one drinking vessel		=  USD 7.00");
									System.out.println("Price of one fishing tackle		=  USD 25.00");
									System.out.println("Price of one survival manual		=  USD 5.00");
									System.out.println("Price of one compass			=  USD 120.00");
									System.out.println("Price of one bucket			=  USD 2.00");
									System.out.println("Price of one hatchet			=  USD 200.00");
									System.out.println("Price of one flare kit			=  USD 114.26");
									System.out.println("Price of one electronic torch		=  USD 9.50");
									System.out.println("Price of one whistle			=  USD 5.00");
									System.out.println("Price of one tin opener			=  USD 8.00");
									System.out.println("Price of one rescue quit		=  USD 19.00");
									System.out.println("Price of one SART			=  USD 71.30");
									System.out.println("Price of one jack knife			=  USD 13.00");
									System.out.println("==========================================================");
									System.out.println("Proceed ?");
									System.out.println("Y/N");
									decision1 = sc.next().charAt(0);
									while (decision1 != 'Y' && decision1 != 'N') {
										System.out.println("Invalid input, please try again");
										decision1 = sc.next().charAt(0);
									}
									if (decision1 == 'Y') {
										totalSprinklersPrice = sprinklerApprox * 2;
										totalFireExtinguisherPrice = totalFireExtinguisher * 35;
										totalLifeBoatsPrice = lifeboats * 38000;
										totalLifeJacketsPrice = totalLifeJackets *80;
										totalFoodPrice = totalFoodSupply * 121;
										totalWaterPrice = totalWaterSupply * 1.80;
										totalDrinkingVesselPrice = totalDrinkingVessel * 7;
										totalFishingTacklePrice = totalFishingTackle * 25;
										totalSurvivalManualPrice = totalSurvivalManual * 5;
										totalCompassPrice = totalCompass * 120;
										totalBucketsPrice = totalBuckets * 2;
										totalHatchetsPrice = totalHatchets * 200;
										totalFlaresPrice = totalFlares * 114.26;
										totalTorchPrice = totalTorch * 9.50;
										totalWhistlePrice = totalWhistle * 5;
										totalTinOpenersPrice = totalTinOpeners * 8;
										totalRescueQuitsPrice = totalRescueQuits * 19;
										totalSARTPrice = totalSART * 71.30;
										totalJackKnifePrice = totalJackKnife * 13;
										System.out.println("==========================================================");
										System.out.println("All equipments price details : ");
										System.out.println("Sprinklers		= " + totalSprinklersPrice);
										System.out.println("Fire Extinguishers	= " + totalFireExtinguisherPrice);
										System.out.println("Lifeboats		= " + totalLifeBoatsPrice);
										System.out.println("Life jackets		= " + totalLifeJacketsPrice);
										System.out.println("Emergency food		= " + totalFoodPrice);
										System.out.println("Water in litres		= " + totalWaterPrice);
										System.out.println("Drinking vessels	= " + totalDrinkingVesselPrice);
										System.out.println("Fishing tackles		= " + totalFishingTacklePrice);
										System.out.println("Survival manuals	= " + totalSurvivalManualPrice);
										System.out.println("Compass			= " + totalCompassPrice);
										System.out.println("Buckets			= " + totalBucketsPrice);
										System.out.println("Hatchets		= " + totalHatchetsPrice);
										System.out.println("Flare kits		= " + totalFlaresPrice);
										System.out.println("Electronic torches	= " + totalTorchPrice);
										System.out.println("Whistles		= " + totalWhistlePrice);
										System.out.println("Tin openers		= " + totalTinOpenersPrice);
										System.out.println("Rescue quits		= " + totalRescueQuitsPrice);
										System.out.println("SARTs			= " + totalSARTPrice);
										System.out.println("Jack knives		= " + totalJackKnifePrice);
										System.out.println("==========================================================");
										double totalPrice = totalSprinklersPrice + totalFireExtinguisherPrice + totalLifeBoatsPrice
												+ totalLifeJacketsPrice + totalFoodPrice + totalWaterPrice + totalDrinkingVesselPrice
												+ totalFishingTacklePrice + totalSurvivalManualPrice + totalCompassPrice + totalBucketsPrice
												+ totalHatchetsPrice + totalFlaresPrice + totalTorchPrice + totalWhistlePrice + totalTinOpenersPrice
												+ totalRescueQuitsPrice + totalSARTPrice + totalJackKnifePrice;
										System.out.println();
										System.out.print("Total price of the whole equipment is : USD ");
										System.out.printf("%.2f", totalPrice);
										System.out.println();
										System.out.println("Proceed ?");
										System.out.println("Y/N");
										decision1 = sc.next().charAt(0);
										while (decision1 != 'Y' && decision1 != 'N') {
											System.out.println("Invalid input, please try again");
											decision1 = sc.next().charAt(0);
										}
										if (decision1 == 'Y') {
											totalRevenueOrLoss = moneyAcquired - totalPrice ;
											System.out.print("Total revenue / loss of your budget is : USD ");
											System.out.printf("%.2f", totalRevenueOrLoss);
											System.out.println();
											System.out.print("Please insert how many trips will your ship be doing in one year : ");
											tripsPerOneYear = sc.nextInt();
											totalRevenueOrLossAfterSailing = ((tripsPerOneYear * 5) * moneyAcquired) - totalPrice;
											System.out.print(
													"The total revenue / loss of your budget after 5 years is : USD ");
											System.out.printf("%.2f", totalRevenueOrLossAfterSailing);
											System.out.println();
											System.out.println("Thank you for using our services.");
											sc.close();
											break;
										}
										
									}
								}
								
							} 
						default:
							System.out.println("Invalid input, please try again");
						} 
				}
				}
			}
			//***************************************************
			//	Domestic
			//***************************************************
			
			if (typeOfTravel == 2) {
				System.out.println("You have selected domestic cruising");
				System.out.println("Please enter the length of your ship : ");
				lengthOfShip = sc.nextInt();
				System.out.println("Please enter the width of your ship : ");
				widthOfShip = sc.nextInt();
				ship2DApproxSize = widthOfShip + lengthOfShip;
				distanceToBeAchieved = (ship2DApproxSize * 2) / 5;
				sprinklerApprox = (int) (17 * ship2DApproxSize);
				fireExtinguisherApprox = (int) ((ship2DApproxSize * 5 ) / 3);
				System.out.println("Please insert the number of guest passengers that will be aboard : ");
				guestPassengers = sc.nextInt();
				System.out.println("Please insert the number of insurance money the guest passengers will be obliged to pay : ");
				insuranceCost = sc.nextDouble();
				moneyAcquired = guestPassengers * insuranceCost;
				System.out.println("Please insert the number of employees that will be aboard the ship : ");
				employees = sc.nextInt();
				totalPassengers = guestPassengers + employees;
				System.out.println("Proceed ?");
				System.out.println("Y/N");
				decision = sc.next().charAt(0);
				while (decision != 'Y' && decision != 'N') {
					System.out.println("Invalid input, please try again");
					decision = sc.next().charAt(0);
				}
				while (decision1 == 'N') {
					if (decision == 'Y') {
						System.out.println("Please insert what type of lifeboats you want to have in your liner : ");
						System.out.println("	1.Huge 			2. Medium		3. Small		4.Liferafts");
						typeOfLifeboat = sc.nextInt();
						
						switch (typeOfLifeboat) {
						//***************************************************
						//	Huge Lifeboat
						//***************************************************
						case 1 :
								lifeboats =(int) (((totalPassengers * 37.5) / 100) / 75) * 2;
								employeesPerLifeboat = employees / lifeboats;
								System.out.println("==========================================================");
								System.out.println("Size and distance details : ");
								System.out.println("Ship's 2D size  			= " + ship2DApproxSize + " meters");
								System.out.println("Ship's safe distance to an island 	= " + distanceToBeAchieved + " meters");
								System.out.println();
								System.out.println("---------------------------------------------------------");
								System.out.println();
								System.out.println("Equipment details : ");
								System.out.println("Life boats that will be on the ship = " + lifeboats);
								System.out.println();
								System.out.println("Per-lifeboat equipment details : ");
								System.out.println("Life Jackets			= 150 ");
								System.out.println("Box of food supply		= 7 ");
								System.out.println("Litres of water			= 750 ");
								System.out.println("Drinking vessels		= 150 ");
								System.out.println("Fishing tackles			= 1 ");
								System.out.println("Survival manual			= 1 ");
								System.out.println("Compass				= 1 ");
								System.out.println("Buckets				= 2 ");
								System.out.println("Hatchets			= 2 ");
								System.out.println("Flare kits			= 1 ");
								System.out.println("Electronic Torches		= 1 ");
								System.out.println("Whistle				= 1 ");
								System.out.println("Tin openers			= 3 ");
								System.out.println("Rescue quits			= 2 ");
								System.out.println("SART				= 1 ");
								System.out.println("Fire extinguisher		= 1 ");
								System.out.println("Jack knife			= 1 ");
								System.out.println("Employees per life boat		= " + employeesPerLifeboat);
								System.out.println("========================================================== ");
								System.out.println("Proceed ?");
								System.out.println("Y/N");
								decision1 = sc.next().charAt(0);
								while (decision1 != 'Y' && decision1 != 'N') {
									System.out.println("Invalid input, please try again");
									decision1 = sc.next().charAt(0);
								}
								if (decision1 == 'Y') {
									totalLifeJackets = 150 * lifeboats;
									totalFoodSupply = 7 * lifeboats;
									totalWaterSupply = (150 * 5) * lifeboats;
									totalDrinkingVessel = 150 * lifeboats;
									totalFishingTackle = lifeboats;
									totalSurvivalManual = lifeboats;
									totalCompass = lifeboats;
									totalBuckets = lifeboats * 2;
									totalHatchets = lifeboats * 2;
									totalFlares = lifeboats;
									totalTorch = lifeboats;
									totalWhistle = lifeboats;
									totalTinOpeners = lifeboats * 3;
									totalRescueQuits = lifeboats * 2;
									totalSART = lifeboats;
									totalFireExtinguisher = lifeboats + fireExtinguisherApprox;
									totalJackKnife = lifeboats;
									System.out.println();
									System.out.println("Receipt of equipment details");
									System.out.println("==========================================================");
									System.out.println("Total equipment details : ");
									System.out.println("Total Life jackets on all lifeboats		: " + totalLifeJackets);
									System.out.println("Total Food supply on all lifeboats		: " + totalFoodSupply);
									System.out.println("Total water supply on all lifeboats		: " + totalWaterSupply);
									System.out.println("Total Drinking vessels on all lifeboats		: " + totalDrinkingVessel);
									System.out.println("Total Fishing tackles on all lifeboats		: " + totalFishingTackle);
									System.out.println("Total Survival manual on all lifeboats		: " + totalSurvivalManual);
									System.out.println("Total Compass on all lifeboats			: " + totalCompass);
									System.out.println("Total Buckets on all lifeboats			: " + totalBuckets);
									System.out.println("Total Hatchets on all lifeboats			: " + totalHatchets);
									System.out.println("Total Flare kits on all lifeboats		: " + totalFlares);
									System.out.println("Total Electronic torches on all lifeboats	: " + totalTorch);
									System.out.println("Total Whistles on all lifeboats			: " + totalWhistle);
									System.out.println("Total Tin openers on all lifeboats		: " + totalTinOpeners);
									System.out.println("Total Rescue quits on all lifeboats		: " + totalRescueQuits);
									System.out.println("Total SART on all lifeboats			: " + totalSART);
									System.out.println("Total Fire extinguisher on all lifeboats	: " + totalFireExtinguisher);
									System.out.println("Total Fire extinguisher on boat and lifeboats	: " + totalFireExtinguisher);
									System.out.println("Total Jack knives on all lifeboats		: " + totalJackKnife);
									System.out.println("==========================================================");
									System.out.println("Proceed ?");
									System.out.println("Y/N");
									decision1 = sc.next().charAt(0);
									while (decision1 != 'Y' && decision1 != 'N') {
										System.out.println("Invalid input, please try again");
										decision1 = sc.next().charAt(0);
									}
									if (decision1 == 'Y') {
										System.out.println("==========================================================");
										System.out.println("Price details : ");
										System.out.println("Price of one sprinkler			=  USD 2.00");
										System.out.println("Price of one fire extinguisher		=  USD 35.00");
										System.out.println("Price of one life boat			=  USD 50000.00");
										System.out.println("Price of one life jacket		=  USD 80.00");
										System.out.println("Price of one food supply		=  USD 121.00");
										System.out.println("Price of one litre of water		=  USD 1.80");
										System.out.println("Price of one drinking vessel		=  USD 7.00");
										System.out.println("Price of one fishing tackle		=  USD 25.00");
										System.out.println("Price of one survival manual		=  USD 5.00");
										System.out.println("Price of one compass			=  USD 120.00");
										System.out.println("Price of one bucket			=  USD 2.00");
										System.out.println("Price of one hatchet			=  USD 200.00");
										System.out.println("Price of one flare kit			=  USD 114.26");
										System.out.println("Price of one electronic torch		=  USD 9.50");
										System.out.println("Price of one whistle			=  USD 5.00");
										System.out.println("Price of one tin opener			=  USD 8.00");
										System.out.println("Price of one rescue quit		=  USD 19.00");
										System.out.println("Price of one SART			=  USD 71.30");
										System.out.println("Price of one jack knife			=  USD 13.00");
										System.out.println("==========================================================");
										System.out.println("Proceed ?");
										System.out.println("Y/N");
										decision1 = sc.next().charAt(0);
										while (decision1 != 'Y' && decision1 != 'N') {
											System.out.println("Invalid input, please try again");
											decision1 = sc.next().charAt(0);
										}
										if (decision1 == 'Y') {
											totalSprinklersPrice = sprinklerApprox * 2;
											totalFireExtinguisherPrice = totalFireExtinguisher * 35;
											totalLifeBoatsPrice = lifeboats * 50000;
											totalLifeJacketsPrice = totalLifeJackets *80;
											totalFoodPrice = totalFoodSupply * 121;
											totalWaterPrice = totalWaterSupply * 1.80;
											totalDrinkingVesselPrice = totalDrinkingVessel * 7;
											totalFishingTacklePrice = totalFishingTackle * 25;
											totalSurvivalManualPrice = totalSurvivalManual * 5;
											totalCompassPrice = totalCompass * 120;
											totalBucketsPrice = totalBuckets * 2;
											totalHatchetsPrice = totalHatchets * 200;
											totalFlaresPrice = totalFlares * 114.26;
											totalTorchPrice = totalTorch * 9.50;
											totalWhistlePrice = totalWhistle * 5;
											totalTinOpenersPrice = totalTinOpeners * 8;
											totalRescueQuitsPrice = totalRescueQuits * 19;
											totalSARTPrice = totalSART * 71.30;
											totalJackKnifePrice = totalJackKnife * 13;
											System.out.println("==========================================================");
											System.out.println("All equipments price details : ");
											System.out.println("Sprinklers		= " + totalSprinklersPrice);
											System.out.println("Fire Extinguishers	= " + totalFireExtinguisherPrice);
											System.out.println("Lifeboats		= " + totalLifeBoatsPrice);
											System.out.println("Life jackets		= " + totalLifeJacketsPrice);
											System.out.println("Emergency food		= " + totalFoodPrice);
											System.out.println("Water in litres		= " + totalWaterPrice);
											System.out.println("Drinking vessels	= " + totalDrinkingVesselPrice);
											System.out.println("Fishing tackles		= " + totalFishingTacklePrice);
											System.out.println("Survival manuals	= " + totalSurvivalManualPrice);
											System.out.println("Compass			= " + totalCompassPrice);
											System.out.println("Buckets			= " + totalBucketsPrice);
											System.out.println("Hatchets		= " + totalHatchetsPrice);
											System.out.println("Flare kits		= " + totalFlaresPrice);
											System.out.println("Electronic torches	= " + totalTorchPrice);
											System.out.println("Whistles		= " + totalWhistlePrice);
											System.out.println("Tin openers		= " + totalTinOpenersPrice);
											System.out.println("Rescue quits		= " + totalRescueQuitsPrice);
											System.out.println("SARTs			= " + totalSARTPrice);
											System.out.println("Jack knives		= " + totalJackKnifePrice);
											System.out.println("==========================================================");
											double totalPrice = totalSprinklersPrice + totalFireExtinguisherPrice + totalLifeBoatsPrice
													+ totalLifeJacketsPrice + totalFoodPrice + totalWaterPrice + totalDrinkingVesselPrice
													+ totalFishingTacklePrice + totalSurvivalManualPrice + totalCompassPrice + totalBucketsPrice
													+ totalHatchetsPrice + totalFlaresPrice + totalTorchPrice + totalWhistlePrice + totalTinOpenersPrice
													+ totalRescueQuitsPrice + totalSARTPrice + totalJackKnifePrice;
											System.out.println();
											System.out.print("Total price of the whole equipment is : USD ");
											System.out.printf("%.2f", totalPrice);
											System.out.println();
											System.out.println("Proceed ?");
											System.out.println("Y/N");
											decision1 = sc.next().charAt(0);
											while (decision1 != 'Y' && decision1 != 'N') {
												System.out.println("Invalid input, please try again");
												decision1 = sc.next().charAt(0);
											}
											if (decision1 == 'Y') {
												totalRevenueOrLoss = moneyAcquired - totalPrice ;
												System.out.print("Total revenue / loss of your budget is : USD ");
												System.out.printf("%.2f", totalRevenueOrLoss);
												System.out.println();
												System.out.print("Please insert how many trips will your ship be doing in one year : ");
												tripsPerOneYear = sc.nextInt();
												totalRevenueOrLossAfterSailing = ((tripsPerOneYear * 5) * moneyAcquired) - totalPrice;
												System.out.print(
														"The total revenue / loss of your budget after 5 years is : USD ");
												System.out.printf("%.2f", totalRevenueOrLossAfterSailing);
												System.out.println();
												System.out.println("Thank you for using our services.");
												sc.close();
												break;
											}
											
										}
									}
									
								} 
						//***************************************************
						//	Medium Lifeboat
						//***************************************************
						case 2 :
							lifeboats =(int) (((totalPassengers * 37.5) / 100) / 50) * 2;
							employeesPerLifeboat = employees / lifeboats;
							System.out.println("==========================================================");
							System.out.println("Size and distance details : ");
							System.out.println("Ship's 2D size  			= " + ship2DApproxSize + " meters");
							System.out.println("Ship's safe distance to an island 	= " + distanceToBeAchieved + " meters");
							System.out.println();
							System.out.println("---------------------------------------------------------");
							System.out.println();
							System.out.println("Equipment details : ");
							System.out.println("Life boats that will be on the ship = " + lifeboats);
							System.out.println();
							System.out.println("Per-lifeboat equipment details : ");
							System.out.println("Life Jackets			= 113 ");
							System.out.println("Box of food supply		= 5 ");
							System.out.println("Litres of water			= 563 ");
							System.out.println("Drinking vessels		= 113 ");
							System.out.println("Fishing tackles			= 1 ");
							System.out.println("Survival manual			= 1 ");
							System.out.println("Compass				= 1 ");
							System.out.println("Buckets				= 1 ");
							System.out.println("Hatchets			= 1 ");
							System.out.println("Flare kits			= 1 ");
							System.out.println("Electronic Torches		= 1 ");
							System.out.println("Whistle				= 1 ");
							System.out.println("Tin openers			= 2 ");
							System.out.println("Rescue quits			= 1 ");
							System.out.println("SART				= 1 ");
							System.out.println("Fire extinguisher		= 1 ");
							System.out.println("Jack knife			= 1 ");
							System.out.println("Employees per life boat		= " + employeesPerLifeboat);
							System.out.println("========================================================== ");
							System.out.println("Proceed ?");
							System.out.println("Y/N");
							decision1 = sc.next().charAt(0);
							while (decision1 != 'Y' && decision1 != 'N') {
								System.out.println("Invalid input, please try again");
								decision1 = sc.next().charAt(0);
							}
							if (decision1 == 'Y') {
								totalLifeJackets = 113 * lifeboats;
								totalFoodSupply = 5 * lifeboats;
								totalWaterSupply = (113 * 5) * lifeboats;
								totalDrinkingVessel = 113 * lifeboats;
								totalFishingTackle = lifeboats;
								totalSurvivalManual = lifeboats;
								totalCompass = lifeboats;
								totalBuckets = lifeboats;
								totalHatchets = lifeboats;
								totalFlares = lifeboats;
								totalTorch = lifeboats;
								totalWhistle = lifeboats;
								totalTinOpeners = lifeboats * 2;
								totalRescueQuits = lifeboats;
								totalSART = lifeboats;
								totalFireExtinguisher = lifeboats + fireExtinguisherApprox;
								totalJackKnife = lifeboats;
								System.out.println();
								System.out.println("Receipt of equipment details");
								System.out.println("==========================================================");
								System.out.println("Total equipment details : ");
								System.out.println("Total Life jackets on all lifeboats		: " + totalLifeJackets);
								System.out.println("Total Food supply on all lifeboats		: " + totalFoodSupply);
								System.out.println("Total water supply on all lifeboats		: " + totalWaterSupply);
								System.out.println("Total Drinking vessels on all lifeboats		: " + totalDrinkingVessel);
								System.out.println("Total Fishing tackles on all lifeboats		: " + totalFishingTackle);
								System.out.println("Total Survival manual on all lifeboats		: " + totalSurvivalManual);
								System.out.println("Total Compass on all lifeboats			: " + totalCompass);
								System.out.println("Total Buckets on all lifeboats			: " + totalBuckets);
								System.out.println("Total Hatchets on all lifeboats			: " + totalHatchets);
								System.out.println("Total Flare kits on all lifeboats		: " + totalFlares);
								System.out.println("Total Electronic torches on all lifeboats	: " + totalTorch);
								System.out.println("Total Whistles on all lifeboats			: " + totalWhistle);
								System.out.println("Total Tin openers on all lifeboats		: " + totalTinOpeners);
								System.out.println("Total Rescue quits on all lifeboats		: " + totalRescueQuits);
								System.out.println("Total SART on all lifeboats			: " + totalSART);
								System.out.println("Total Fire extinguisher on all lifeboats	: " + totalFireExtinguisher);
								System.out.println("Total Fire extinguisher on boat and lifeboats	: " + totalFireExtinguisher);
								System.out.println("Total Jack knives on all lifeboats		: " + totalJackKnife);
								System.out.println("==========================================================");
								System.out.println("Proceed ?");
								System.out.println("Y/N");
								decision1 = sc.next().charAt(0);
								while (decision1 != 'Y' && decision1 != 'N') {
									System.out.println("Invalid input, please try again");
									decision1 = sc.next().charAt(0);
								}
								if (decision1 == 'Y') {
									System.out.println("==========================================================");
									System.out.println("Price details : ");
									System.out.println("Price of one sprinkler			=  USD 2.00");
									System.out.println("Price of one fire extinguisher		=  USD 35.00");
									System.out.println("Price of one life boat			=  USD 38000.00");
									System.out.println("Price of one life jacket		=  USD 80.00");
									System.out.println("Price of one food supply		=  USD 121.00");
									System.out.println("Price of one litre of water		=  USD 1.80");
									System.out.println("Price of one drinking vessel		=  USD 7.00");
									System.out.println("Price of one fishing tackle		=  USD 25.00");
									System.out.println("Price of one survival manual		=  USD 5.00");
									System.out.println("Price of one compass			=  USD 120.00");
									System.out.println("Price of one bucket			=  USD 2.00");
									System.out.println("Price of one hatchet			=  USD 200.00");
									System.out.println("Price of one flare kit			=  USD 114.26");
									System.out.println("Price of one electronic torch		=  USD 9.50");
									System.out.println("Price of one whistle			=  USD 5.00");
									System.out.println("Price of one tin opener			=  USD 8.00");
									System.out.println("Price of one rescue quit		=  USD 19.00");
									System.out.println("Price of one SART			=  USD 71.30");
									System.out.println("Price of one jack knife			=  USD 13.00");
									System.out.println("==========================================================");
									System.out.println("Proceed ?");
									System.out.println("Y/N");
									decision1 = sc.next().charAt(0);
									while (decision1 != 'Y' && decision1 != 'N') {
										System.out.println("Invalid input, please try again");
										decision1 = sc.next().charAt(0);
									}
									if (decision1 == 'Y') {
										totalSprinklersPrice = sprinklerApprox * 2;
										totalFireExtinguisherPrice = totalFireExtinguisher * 35;
										totalLifeBoatsPrice = lifeboats * 38000;
										totalLifeJacketsPrice = totalLifeJackets *80;
										totalFoodPrice = totalFoodSupply * 121;
										totalWaterPrice = totalWaterSupply * 1.80;
										totalDrinkingVesselPrice = totalDrinkingVessel * 7;
										totalFishingTacklePrice = totalFishingTackle * 25;
										totalSurvivalManualPrice = totalSurvivalManual * 5;
										totalCompassPrice = totalCompass * 120;
										totalBucketsPrice = totalBuckets * 2;
										totalHatchetsPrice = totalHatchets * 200;
										totalFlaresPrice = totalFlares * 114.26;
										totalTorchPrice = totalTorch * 9.50;
										totalWhistlePrice = totalWhistle * 5;
										totalTinOpenersPrice = totalTinOpeners * 8;
										totalRescueQuitsPrice = totalRescueQuits * 19;
										totalSARTPrice = totalSART * 71.30;
										totalJackKnifePrice = totalJackKnife * 13;
										System.out.println("==========================================================");
										System.out.println("All equipments price details : ");
										System.out.println("Sprinklers		= " + totalSprinklersPrice);
										System.out.println("Fire Extinguishers	= " + totalFireExtinguisherPrice);
										System.out.println("Lifeboats		= " + totalLifeBoatsPrice);
										System.out.println("Life jackets		= " + totalLifeJacketsPrice);
										System.out.println("Emergency food		= " + totalFoodPrice);
										System.out.println("Water in litres		= " + totalWaterPrice);
										System.out.println("Drinking vessels	= " + totalDrinkingVesselPrice);
										System.out.println("Fishing tackles		= " + totalFishingTacklePrice);
										System.out.println("Survival manuals	= " + totalSurvivalManualPrice);
										System.out.println("Compass			= " + totalCompassPrice);
										System.out.println("Buckets			= " + totalBucketsPrice);
										System.out.println("Hatchets		= " + totalHatchetsPrice);
										System.out.println("Flare kits		= " + totalFlaresPrice);
										System.out.println("Electronic torches	= " + totalTorchPrice);
										System.out.println("Whistles		= " + totalWhistlePrice);
										System.out.println("Tin openers		= " + totalTinOpenersPrice);
										System.out.println("Rescue quits		= " + totalRescueQuitsPrice);
										System.out.println("SARTs			= " + totalSARTPrice);
										System.out.println("Jack knives		= " + totalJackKnifePrice);
										System.out.println("==========================================================");
										double totalPrice = totalSprinklersPrice + totalFireExtinguisherPrice + totalLifeBoatsPrice
												+ totalLifeJacketsPrice + totalFoodPrice + totalWaterPrice + totalDrinkingVesselPrice
												+ totalFishingTacklePrice + totalSurvivalManualPrice + totalCompassPrice + totalBucketsPrice
												+ totalHatchetsPrice + totalFlaresPrice + totalTorchPrice + totalWhistlePrice + totalTinOpenersPrice
												+ totalRescueQuitsPrice + totalSARTPrice + totalJackKnifePrice;
										System.out.println();
										System.out.print("Total price of the whole equipment is : USD ");
										System.out.printf("%.2f", totalPrice);
										System.out.println();
										System.out.println("Proceed ?");
										System.out.println("Y/N");
										decision1 = sc.next().charAt(0);
										while (decision1 != 'Y' && decision1 != 'N') {
											System.out.println("Invalid input, please try again");
											decision1 = sc.next().charAt(0);
										}
										if (decision1 == 'Y') {
											totalRevenueOrLoss = moneyAcquired - totalPrice ;
											System.out.print("Total revenue / loss of your budget is : USD ");
											System.out.printf("%.2f", totalRevenueOrLoss);
											System.out.println();
											System.out.print("Please insert how many trips will your ship be doing in one year : ");
											tripsPerOneYear = sc.nextInt();
											totalRevenueOrLossAfterSailing = ((tripsPerOneYear * 5) * moneyAcquired) - totalPrice;
											System.out.print(
													"The total revenue / loss of your budget after 5 years is : USD ");
											System.out.printf("%.2f", totalRevenueOrLossAfterSailing);
											System.out.println();
											System.out.println("Thank you for using our services.");
											sc.close();
											break;
										}
										
									}
								}
								
							} 
						//***************************************************
						//	Small Lifeboat
						//***************************************************
						case 3 :
							lifeboats =(int) (((totalPassengers * 37.5) / 100) / 32) * 2;
							employeesPerLifeboat = employees / lifeboats;
							System.out.println("==========================================================");
							System.out.println("Size and distance details : ");
							System.out.println("Ship's 2D size  			= " + ship2DApproxSize + " meters");
							System.out.println("Ship's safe distance to an island 	= " + distanceToBeAchieved + " meters");
							System.out.println();
							System.out.println("---------------------------------------------------------");
							System.out.println();
							System.out.println("Equipment details : ");
							System.out.println("Life boats that will be on the ship = " + lifeboats);
							System.out.println();
							System.out.println("Per-lifeboat equipment details : ");
							System.out.println("Life Jackets			= 75 ");
							System.out.println("Box of food supply		= 4 ");
							System.out.println("Litres of water			= 375 ");
							System.out.println("Drinking vessels		= 75 ");
							System.out.println("Fishing tackles			= 1 ");
							System.out.println("Survival manual			= 1 ");
							System.out.println("Compass				= 1 ");
							System.out.println("Buckets				= 1 ");
							System.out.println("Hatchets			= 1 ");
							System.out.println("Flare kits			= 1 ");
							System.out.println("Electronic Torches		= 1 ");
							System.out.println("Whistle				= 1 ");
							System.out.println("Tin openers			= 1 ");
							System.out.println("Rescue quits			= 1 ");
							System.out.println("SART				= 1 ");
							System.out.println("Fire extinguisher		= 1 ");
							System.out.println("Jack knife			= 1 ");
							System.out.println("Employees per life boat		= " + employeesPerLifeboat);
							System.out.println("========================================================== ");
							System.out.println("Proceed ?");
							System.out.println("Y/N");
							decision1 = sc.next().charAt(0);
							while (decision1 != 'Y' && decision1 != 'N') {
								System.out.println("Invalid input, please try again");
								decision1 = sc.next().charAt(0);
							}
							if (decision1 == 'Y') {
								totalLifeJackets = 75 * lifeboats;
								totalFoodSupply = 4 * lifeboats;
								totalWaterSupply = (75 * 5) * lifeboats;
								totalDrinkingVessel = 75 * lifeboats;
								totalFishingTackle = lifeboats;
								totalSurvivalManual = lifeboats;
								totalCompass = lifeboats;
								totalBuckets = lifeboats;
								totalHatchets = lifeboats;
								totalFlares = lifeboats;
								totalTorch = lifeboats;
								totalWhistle = lifeboats;
								totalTinOpeners = lifeboats;
								totalRescueQuits = lifeboats;
								totalSART = lifeboats;
								totalFireExtinguisher = lifeboats + fireExtinguisherApprox;
								totalJackKnife = lifeboats;
								System.out.println();
								System.out.println("Receipt of equipment details");
								System.out.println("==========================================================");
								System.out.println("Total equipment details : ");
								System.out.println("Total Life jackets on all lifeboats		: " + totalLifeJackets);
								System.out.println("Total Food supply on all lifeboats		: " + totalFoodSupply);
								System.out.println("Total water supply on all lifeboats		: " + totalWaterSupply);
								System.out.println("Total Drinking vessels on all lifeboats		: " + totalDrinkingVessel);
								System.out.println("Total Fishing tackles on all lifeboats		: " + totalFishingTackle);
								System.out.println("Total Survival manual on all lifeboats		: " + totalSurvivalManual);
								System.out.println("Total Compass on all lifeboats			: " + totalCompass);
								System.out.println("Total Buckets on all lifeboats			: " + totalBuckets);
								System.out.println("Total Hatchets on all lifeboats			: " + totalHatchets);
								System.out.println("Total Flare kits on all lifeboats		: " + totalFlares);
								System.out.println("Total Electronic torches on all lifeboats	: " + totalTorch);
								System.out.println("Total Whistles on all lifeboats			: " + totalWhistle);
								System.out.println("Total Tin openers on all lifeboats		: " + totalTinOpeners);
								System.out.println("Total Rescue quits on all lifeboats		: " + totalRescueQuits);
								System.out.println("Total SART on all lifeboats			: " + totalSART);
								System.out.println("Total Fire extinguisher on all lifeboats	: " + totalFireExtinguisher);
								System.out.println("Total Fire extinguisher on boat and lifeboats	: " + totalFireExtinguisher);
								System.out.println("Total Jack knives on all lifeboats		: " + totalJackKnife);
								System.out.println("==========================================================");
								System.out.println("Proceed ?");
								System.out.println("Y/N");
								decision1 = sc.next().charAt(0);
								while (decision1 != 'Y' && decision1 != 'N') {
									System.out.println("Invalid input, please try again");
									decision1 = sc.next().charAt(0);
								}
								if (decision1 == 'Y') {
									System.out.println("==========================================================");
									System.out.println("Price details : ");
									System.out.println("Price of one sprinkler			=  USD 2.00");
									System.out.println("Price of one fire extinguisher		=  USD 35.00");
									System.out.println("Price of one life boat			=  USD 27000.00");
									System.out.println("Price of one life jacket		=  USD 80.00");
									System.out.println("Price of one food supply		=  USD 121.00");
									System.out.println("Price of one litre of water		=  USD 1.80");
									System.out.println("Price of one drinking vessel		=  USD 7.00");
									System.out.println("Price of one fishing tackle		=  USD 25.00");
									System.out.println("Price of one survival manual		=  USD 5.00");
									System.out.println("Price of one compass			=  USD 120.00");
									System.out.println("Price of one bucket			=  USD 2.00");
									System.out.println("Price of one hatchet			=  USD 200.00");
									System.out.println("Price of one flare kit			=  USD 114.26");
									System.out.println("Price of one electronic torch		=  USD 9.50");
									System.out.println("Price of one whistle			=  USD 5.00");
									System.out.println("Price of one tin opener			=  USD 8.00");
									System.out.println("Price of one rescue quit		=  USD 19.00");
									System.out.println("Price of one SART			=  USD 71.30");
									System.out.println("Price of one jack knife			=  USD 13.00");
									System.out.println("==========================================================");
									System.out.println("Proceed ?");
									System.out.println("Y/N");
									decision1 = sc.next().charAt(0);
									while (decision1 != 'Y' && decision1 != 'N') {
										System.out.println("Invalid input, please try again");
										decision1 = sc.next().charAt(0);
									}
									if (decision1 == 'Y') {
										totalSprinklersPrice = sprinklerApprox * 2;
										totalFireExtinguisherPrice = totalFireExtinguisher * 35;
										totalLifeBoatsPrice = lifeboats * 27000;
										totalLifeJacketsPrice = totalLifeJackets *80;
										totalFoodPrice = totalFoodSupply * 121;
										totalWaterPrice = totalWaterSupply * 1.80;
										totalDrinkingVesselPrice = totalDrinkingVessel * 7;
										totalFishingTacklePrice = totalFishingTackle * 25;
										totalSurvivalManualPrice = totalSurvivalManual * 5;
										totalCompassPrice = totalCompass * 120;
										totalBucketsPrice = totalBuckets * 2;
										totalHatchetsPrice = totalHatchets * 200;
										totalFlaresPrice = totalFlares * 114.26;
										totalTorchPrice = totalTorch * 9.50;
										totalWhistlePrice = totalWhistle * 5;
										totalTinOpenersPrice = totalTinOpeners * 8;
										totalRescueQuitsPrice = totalRescueQuits * 19;
										totalSARTPrice = totalSART * 71.30;
										totalJackKnifePrice = totalJackKnife * 13;
										System.out.println("==========================================================");
										System.out.println("All equipments price details : ");
										System.out.println("Sprinklers		= " + totalSprinklersPrice);
										System.out.println("Fire Extinguishers	= " + totalFireExtinguisherPrice);
										System.out.println("Lifeboats		= " + totalLifeBoatsPrice);
										System.out.println("Life jackets		= " + totalLifeJacketsPrice);
										System.out.println("Emergency food		= " + totalFoodPrice);
										System.out.println("Water in litres		= " + totalWaterPrice);
										System.out.println("Drinking vessels	= " + totalDrinkingVesselPrice);
										System.out.println("Fishing tackles		= " + totalFishingTacklePrice);
										System.out.println("Survival manuals	= " + totalSurvivalManualPrice);
										System.out.println("Compass			= " + totalCompassPrice);
										System.out.println("Buckets			= " + totalBucketsPrice);
										System.out.println("Hatchets		= " + totalHatchetsPrice);
										System.out.println("Flare kits		= " + totalFlaresPrice);
										System.out.println("Electronic torches	= " + totalTorchPrice);
										System.out.println("Whistles		= " + totalWhistlePrice);
										System.out.println("Tin openers		= " + totalTinOpenersPrice);
										System.out.println("Rescue quits		= " + totalRescueQuitsPrice);
										System.out.println("SARTs			= " + totalSARTPrice);
										System.out.println("Jack knives		= " + totalJackKnifePrice);
										System.out.println("==========================================================");
										double totalPrice = totalSprinklersPrice + totalFireExtinguisherPrice + totalLifeBoatsPrice
												+ totalLifeJacketsPrice + totalFoodPrice + totalWaterPrice + totalDrinkingVesselPrice
												+ totalFishingTacklePrice + totalSurvivalManualPrice + totalCompassPrice + totalBucketsPrice
												+ totalHatchetsPrice + totalFlaresPrice + totalTorchPrice + totalWhistlePrice + totalTinOpenersPrice
												+ totalRescueQuitsPrice + totalSARTPrice + totalJackKnifePrice;
										System.out.println();
										System.out.print("Total price of the whole equipment is : USD ");
										System.out.printf("%.2f", totalPrice);
										System.out.println();
										System.out.println("Proceed ?");
										System.out.println("Y/N");
										decision1 = sc.next().charAt(0);
										while (decision1 != 'Y' && decision1 != 'N') {
											System.out.println("Invalid input, please try again");
											decision1 = sc.next().charAt(0);
										}
										if (decision1 == 'Y') {
											totalRevenueOrLoss = moneyAcquired - totalPrice ;
											System.out.print("Total revenue / loss of your budget is : USD ");
											System.out.printf("%.2f", totalRevenueOrLoss);
											System.out.println();
											System.out.print("Please insert how many trips will your ship be doing in one year : ");
											tripsPerOneYear = sc.nextInt();
											totalRevenueOrLossAfterSailing = ((tripsPerOneYear * 5) * moneyAcquired) - totalPrice;
											System.out.print(
													"The total revenue / loss of your budget after 5 years is : USD ");
											System.out.printf("%.2f", totalRevenueOrLossAfterSailing);
											System.out.println();
											System.out.println("Thank you for using our services.");
											sc.close();
											break;
										}
										
									}
								}
								
							} 
						//***************************************************
						//	Liferafts
						//***************************************************
						case 4 :
							lifeboats =(int) (((totalPassengers * 37.5) / 100) / 15) * 2;
							employeesPerLifeboat = employees / lifeboats;
							System.out.println("==========================================================");
							System.out.println("Size and distance details : ");
							System.out.println("Ship's 2D size  			= " + ship2DApproxSize + " meters");
							System.out.println("Ship's safe distance to an island 	= " + distanceToBeAchieved + " meters");
							System.out.println();
							System.out.println("---------------------------------------------------------");
							System.out.println();
							System.out.println("Equipment details : ");
							System.out.println("Liferafts that will be on the ship = " + lifeboats);
							System.out.println();
							System.out.println("Per-liferaft equipment details : ");
							System.out.println("Life Jackets			= 35 ");
							System.out.println("Box of food supply		= 2 ");
							System.out.println("Litres of water			= 188 ");
							System.out.println("Drinking vessels		= 35 ");
							System.out.println("Fishing tackles			= 1 ");
							System.out.println("Survival manual			= 1 ");
							System.out.println("Compass				= 1 ");
							System.out.println("Buckets				= 1 ");
							//Hatchet
							System.out.println("Flare kits			= 1 ");
							System.out.println("Electronic Torches		= 1 ");
							System.out.println("Whistle				= 1 ");
							System.out.println("Tin openers			= 1 ");
							System.out.println("Rescue quits			= 1 ");
							System.out.println("SART				= 1 ");
							//Fire extinguisher
							System.out.println("Jack knife			= 1 ");
							System.out.println("Employees per life boat		= " + employeesPerLifeboat);
							System.out.println("========================================================== ");
							System.out.println("Proceed ?");
							System.out.println("Y/N");
							decision1 = sc.next().charAt(0);
							while (decision1 != 'Y' && decision1 != 'N') {
								System.out.println("Invalid input, please try again");
								decision1 = sc.next().charAt(0);
							}
							if (decision1 == 'Y') {
								totalLifeJackets = 35 * lifeboats;
								totalFoodSupply = 2 * lifeboats;
								totalWaterSupply = (35 * 5) * lifeboats;
								totalDrinkingVessel = 35 * lifeboats;
								totalFishingTackle = lifeboats;
								totalSurvivalManual = lifeboats;
								totalCompass = lifeboats;
								totalBuckets = lifeboats;
								totalFlares = lifeboats;
								totalTorch = lifeboats;
								totalWhistle = lifeboats;
								totalTinOpeners = lifeboats;
								totalRescueQuits = lifeboats;
								totalSART = lifeboats;
								totalFireExtinguisher = fireExtinguisherApprox;
								totalJackKnife = lifeboats;
								System.out.println();
								System.out.println("Receipt of equipment details");
								System.out.println("==========================================================");
								System.out.println("Total equipment details : ");
								System.out.println("Total Life jackets on all lifeboats		: " + totalLifeJackets);
								System.out.println("Total Food supply on all lifeboats		: " + totalFoodSupply);
								System.out.println("Total water supply on all lifeboats		: " + totalWaterSupply);
								System.out.println("Total Drinking vessels on all lifeboats		: " + totalDrinkingVessel);
								System.out.println("Total Fishing tackles on all lifeboats		: " + totalFishingTackle);
								System.out.println("Total Survival manual on all lifeboats		: " + totalSurvivalManual);
								System.out.println("Total Compass on all lifeboats			: " + totalCompass);
								System.out.println("Total Buckets on all lifeboats			: " + totalBuckets);
								System.out.println("Total Flare kits on all lifeboats		: " + totalFlares);
								System.out.println("Total Electronic torches on all lifeboats	: " + totalTorch);
								System.out.println("Total Whistles on all lifeboats			: " + totalWhistle);
								System.out.println("Total Tin openers on all lifeboats		: " + totalTinOpeners);
								System.out.println("Total Rescue quits on all lifeboats		: " + totalRescueQuits);
								System.out.println("Total SART on all lifeboats			: " + totalSART);
								System.out.println("Total Fire extinguisher on all lifeboats	: " + totalFireExtinguisher);
								System.out.println("Total Fire extinguisher on boat and lifeboats	: " + totalFireExtinguisher);
								System.out.println("Total Jack knives on all lifeboats		: " + totalJackKnife);
								System.out.println("==========================================================");
								System.out.println("Proceed ?");
								System.out.println("Y/N");
								decision1 = sc.next().charAt(0);
								while (decision1 != 'Y' && decision1 != 'N') {
									System.out.println("Invalid input, please try again");
									decision1 = sc.next().charAt(0);
								}
								if (decision1 == 'Y') {
									System.out.println("==========================================================");
									System.out.println("Price details : ");
									System.out.println("Price of one sprinkler			=  USD 2.00");
									System.out.println("Price of one fire extinguisher		=  USD 35.00");
									System.out.println("Price of one life boat			=  USD 27000.00");
									System.out.println("Price of one life jacket		=  USD 80.00");
									System.out.println("Price of one food supply		=  USD 121.00");
									System.out.println("Price of one litre of water		=  USD 1.80");
									System.out.println("Price of one drinking vessel		=  USD 7.00");
									System.out.println("Price of one fishing tackle		=  USD 25.00");
									System.out.println("Price of one survival manual		=  USD 5.00");
									System.out.println("Price of one compass			=  USD 120.00");
									System.out.println("Price of one bucket			=  USD 2.00");
									System.out.println("Price of one flare kit			=  USD 114.26");
									System.out.println("Price of one electronic torch		=  USD 9.50");
									System.out.println("Price of one whistle			=  USD 5.00");
									System.out.println("Price of one tin opener			=  USD 8.00");
									System.out.println("Price of one rescue quit		=  USD 19.00");
									System.out.println("Price of one SART			=  USD 71.30");
									System.out.println("Price of one jack knife			=  USD 13.00");
									System.out.println("==========================================================");
									System.out.println("Proceed ?");
									System.out.println("Y/N");
									decision1 = sc.next().charAt(0);
									while (decision1 != 'Y' && decision1 != 'N') {
										System.out.println("Invalid input, please try again");
										decision1 = sc.next().charAt(0);
									}
									if (decision1 == 'Y') {
										totalSprinklersPrice = sprinklerApprox * 2;
										totalFireExtinguisherPrice = totalFireExtinguisher * 35;
										totalLifeBoatsPrice = lifeboats * 27000;
										totalLifeJacketsPrice = totalLifeJackets *80;
										totalFoodPrice = totalFoodSupply * 121;
										totalWaterPrice = totalWaterSupply * 1.80;
										totalDrinkingVesselPrice = totalDrinkingVessel * 7;
										totalFishingTacklePrice = totalFishingTackle * 25;
										totalSurvivalManualPrice = totalSurvivalManual * 5;
										totalCompassPrice = totalCompass * 120;
										totalBucketsPrice = totalBuckets * 2;
										totalFlaresPrice = totalFlares * 114.26;
										totalTorchPrice = totalTorch * 9.50;
										totalWhistlePrice = totalWhistle * 5;
										totalTinOpenersPrice = totalTinOpeners * 8;
										totalRescueQuitsPrice = totalRescueQuits * 19;
										totalSARTPrice = totalSART * 71.30;
										totalJackKnifePrice = totalJackKnife * 13;
										System.out.println("==========================================================");
										System.out.println("All equipments price details : ");
										System.out.println("Sprinklers		= " + totalSprinklersPrice);
										System.out.println("Fire Extinguishers	= " + totalFireExtinguisherPrice);
										System.out.println("Lifeboats		= " + totalLifeBoatsPrice);
										System.out.println("Life jackets		= " + totalLifeJacketsPrice);
										System.out.println("Emergency food		= " + totalFoodPrice);
										System.out.println("Water in litres		= " + totalWaterPrice);
										System.out.println("Drinking vessels	= " + totalDrinkingVesselPrice);
										System.out.println("Fishing tackles		= " + totalFishingTacklePrice);
										System.out.println("Survival manuals	= " + totalSurvivalManualPrice);
										System.out.println("Compass			= " + totalCompassPrice);
										System.out.println("Buckets			= " + totalBucketsPrice);
										System.out.println("Flare kits		= " + totalFlaresPrice);
										System.out.println("Electronic torches	= " + totalTorchPrice);
										System.out.println("Whistles		= " + totalWhistlePrice);
										System.out.println("Tin openers		= " + totalTinOpenersPrice);
										System.out.println("Rescue quits		= " + totalRescueQuitsPrice);
										System.out.println("SARTs			= " + totalSARTPrice);
										System.out.println("Jack knives		= " + totalJackKnifePrice);
										System.out.println("==========================================================");
										double totalPrice = totalSprinklersPrice + totalFireExtinguisherPrice + totalLifeBoatsPrice
												+ totalLifeJacketsPrice + totalFoodPrice + totalWaterPrice + totalDrinkingVesselPrice
												+ totalFishingTacklePrice + totalSurvivalManualPrice + totalCompassPrice + totalBucketsPrice
												+ totalFlaresPrice + totalTorchPrice + totalWhistlePrice + totalTinOpenersPrice
												+ totalRescueQuitsPrice + totalSARTPrice + totalJackKnifePrice;
										System.out.println();
										System.out.print("Total price of the whole equipment is : USD ");
										System.out.printf("%.2f", totalPrice);
										System.out.println();
										System.out.println("Proceed ?");
										System.out.println("Y/N");
										decision1 = sc.next().charAt(0);
										while (decision1 != 'Y' && decision1 != 'N') {
											System.out.println("Invalid input, please try again");
											decision1 = sc.next().charAt(0);
										}
										if (decision1 == 'Y') {
											totalRevenueOrLoss = moneyAcquired - totalPrice ;
											System.out.print("Total revenue / loss of your budget is : USD ");
											System.out.printf("%.2f", totalRevenueOrLoss);
											System.out.println();
											System.out.print("Please insert how many trips will your ship be doing in one year : ");
											tripsPerOneYear = sc.nextInt();
											totalRevenueOrLossAfterSailing = ((tripsPerOneYear * 5) * moneyAcquired) - totalPrice;
											System.out.print(
													"The total revenue / loss of your budget after 5 years is : USD ");
											System.out.printf("%.2f", totalRevenueOrLossAfterSailing);
											System.out.println();
											System.out.println("Thank you for using our services.");
											sc.close();
											break;
										}
										
									}
								}
								
							} 
							
						default:
							System.out.println("Invalid input, please try again");
						} 
				}
				}
			}
			}
		}
	}

