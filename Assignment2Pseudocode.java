package assignment2;

> START
WHILE       decision is equal to N {
    OUTPUT 		"Welcome to the ship safety equipment predictor!"
	OUTPUT 		"This program is meant to predict how many budget be put in the safety equipment of a cruise liner."
	OUTPUT 		"We will start by choosing the type of cruising you will do."
	OUTPUT      "Please select the type of travelling your liner will do : "
	OUTPUT      "   1.International cruising        2.Domesting cruising"
	INPUT       typeOfTravel
	WHILE       typeOfTravel is not equal to 1 and 2 {
	    OUTPUT      "Invalid INPUT, please try again"
	    INPUT       "typeOfTravel"
	}
	
	//-------------------------------------------------
    // International
	//-------------------------------------------------
	
	IF          typeOfTravel is equal to 1 {
	    OUTPUT      "You have selected International cruising"
	    OUTPUT      "Please enter the length of the ship : "
	    INPUT       lengthOfShip
	    OUTPUT      "Please enter the width of the ship : "
	    INPUT       widthOfShip
	    CALCULATE   ship2DApproxSize = widthOfShip + lengthOfShip
	    CALCULATE   distanceToBeAchieved = (ship2DApproxSize * 2) / 5
	    CALCULATE   sprinklerApprox = 17 * ship2DApproxSize
	    CALCULATE   fireExtinguisherApprox = (ship2DApproxSize * 5) / 3
	    OUTPUT      "Please insert the number of guest passengers that will be aboard : "
	    INPUT       guestPassengers
	    OUTPUT      "Please insert the number of insurance money the guest passengers will be obliged to pay : "
	    INPUT       insuranceCost
	    CALCULATE   moneyAcquired = guestPassengers * insuranceCost
	    OUTPUT      "Please insert the number of employees that will be aboard the ship : "
	    INPUT       employees
	    CALCULATE   totalPassengers = guestPassengers + employees
	    OUTPUT      "Proceed ?"
	    OUTPUT      "Y/N"
	    INPUT       decision
	    WHILE       decision is not equal to Y or N {
	        OUTPUT      "Invalid INPUT, please try again"
	        INPUT       decision
	        }
	    IF          decision is equal to Y {
	      WHILE           decision1 is equal to N {
	        OUTPUT     "Please insert what type of lIFeboats you want to have in your liner : "
	        OUTPUT      "       1.Huge          2.Medium        "
	        INPUT       typeOfLIFeboat
	        WHILE       typeOfLIFeboat is not equal to 1 and is not equal to 2 {
	            OUTPUT      "Invalid INPUT, please try again"
	            INPUT       typeOfLIFeboat
	        }
	        
    	        //**************************************************
    	        // Huge Lifeboat, International
    	        //**************************************************
    	        
    	        IF          typeOfLifeboat is equal to 1 {
    	            CALCULATE   lifeboats = (((totalPassengers * 37.5) / 100) / 75) * 2
    	            CALCULATE   employeesPerLIFeboat = employees / lIFeboats
    	            OUTPUT      "================================================"
    	            OUTPUT      "Size and distance details :"
    	            OUTPUT      "Ship's 2D size                     = " + ship2DApproxSize
    	            OUTPUT      "Ship's safe distance to an island  = " + distanceToBeAchieved
    	            OUTPUT      ""
    	            OUTPUT      "-------------------------------------------------"
    	            OUTPUT      ""
    	            OUTPUT      "Equipment details : "
    	            OUTPUT      "LIFeboats that will be on the ship                 = " + lIFeboats
    	            OUTPUT      "Sprinklers that will be installed on the ship      = " + sprinklerApprox
    	            OUTPUT      "Fire extinguishers that will be aboard the ship    = " + fireExtinguisherApprox
    	            OUTPUT      ""
    	            OUTPUT      "-------------------------------------------------"
    	            OUTPUT      "Per-lIFeboat equipment details : "
    	            OUTPUT      "LIFe jackets           = 150"
    	            OUTPUT      "Box of food supply     = 7"
    	            OUTPUT      "Litres of water        = 750"
    	            OUTPUT      "Drinking vessels       = 150"
    	            OUTPUT      "Fishing tackles        = 1"
    	            OUTPUT      "Survival manual        = 1"
    	            OUTPUT      "Compass                = 1"
    	            OUTPUT      "Buckets                = 2"
    	            OUTPUT      "Hatchets               = 2"
    	            OUTPUT      "Flare kits             = 1"
    	            OUTPUT      "Electronic torches     = 1"
    	            OUTPUT      "Whistle                = 1"
    	            OUTPUT      "Tin openers            = 3"
    	            OUTPUT      "Rescue quits           = 2"
    	            OUTPUT      "SART                   = 1"
    	            OUTPUT      "Fire extinguisher      = 1"
    	            OUTPUT      "Jack KnIFe             = 1"
    	            OUTPUT      "Employees              = " + employeesPerLIFeboat
                    OUTPUT      "================================================"
                    OUTPUT      ""
                    OUTPUT      "Proceed ?"
                    OUTPUT      "Y/N"
                    INPUT       decision1
                    WHILE       decision1 is not equal to Y and N {
                        OUTPUT      "Invalid INPUT, please try again"
	                    INPUT       decision1
                    } 
                    
                    IF decision1 is equal to Y {
                        CALCULATE       totalLIFeJackets        = 150 * lIFeboats
                        CALCULATE       totalFoodSupply         = lIFeboats * 7
                        CALCULATE       totalWaterSupply        = (150 * 5) * lIFeboats
                        CALCULATE       totalDrinkingVessel     = 150 * lIFeboats
                        CALCULATE       totalFishingTackle      = lIFeboats
                        CALCULATE       totalSurvivalManual     = lIFeboats
                        CALCULATE       totalCompass            = lIFeboats
                        CALCULATE       totalBuckets            = 2 * lIFeboats
                        CALCULATE       totalHatchets           = 2 * lIFeboats
                        CALCULATE       totalFlares             = lIFeboats
                        CALCULATE       totalTorch              = lIFeboats
                        CALCULATE       totalWhistle            = lIFeboats
                        CALCULATE       totalTinOpeners         = 3 * lIFeboats
                        CALCULATE       totalRescueQuits        = 2 * lIFeboats
                        CALCULATE       totalSART               = lIFeboats
                        CALCULATE       totalFireExtinguisher   = lIFeboats + fireExtinguisherApprox
                        CALCULATE       totalJackKnIFe          = lIFeboats
                        OUTPUT		"=========================================================="
                		OUTPUT		"Total Equipment details : "
                		OUTPUT		"Total LIFe Jackets on all lIFeboats 			: " + totalLIFeJackets
                		OUTPUT		"Total Food supply on all lIFeboats 			: " + totalFoodSupply
                		OUTPUT		"Total Water supply on all lIFeboats 			: " + totalWaterSupply
                		OUTPUT		"Total Drinking vessels on all lIFeboats 		: " + totalDrinkingVessel
                		OUTPUT		"Total Fishing tackles on all lIFeboats 		: " + fishingTackle
                		OUTPUT		"Total Survival Manual on all lIFeboats 		: " + totalSurvivalManual
                		OUTPUT		"Total Compass on all lIFeboats 				: " + totalCompass
                		OUTPUT		"Total Buckets on all lIFeboats 				: " + totalBuckets,
                		OUTPUT		"Total Hatchets on all lIFeboats 				: " + totalHatchets
                		OUTPUT		"Total Flare kits on all lIFeboats 				: " + totalFlares
                		OUTPUT		"Total Electronic torches on all lIFeboats 		: " + totalTorch
                		OUTPUT		"Total Whistles on all lIFeboats 				: " + totalWhistle
                		OUTPUT		"Total Tin openers on all lIFeboats 			: " + totalTinOpeners
                		OUTPUT		"Total Rescue quits on all lIFeboats 			: " + totalRescueQuits
                		OUTPUT		"Total SART on all lIFeboats 					: " + totalSART
                		OUTPUT		"Total Fire extinguisher on all lIFeboats 		: " + lIFeboats
                		OUTPUT		"Total Fire extinguisher on boat and lIFeboat	: " + totalFireExtinguisher
                		OUTPUT		"Total Jack knives on all lIFeboats 			: " + totalJackKnIFe	
                		OUTPUT		"=========================================================="
                		OUTPUT      ""
                        OUTPUT      "Proceed ?"
                        OUTPUT      "Y/N"
                        INPUT       decision1
                        WHILE       decision1 is not equal to Y and N {
                            OUTPUT      "Invalid INPUT, please try again"
    	                    INPUT       decision1
                        } 
                        IF          decision1 is equal to Y {
                            OUTPUT		"=========================================================="
                    		OUTPUT		"Price details : "
                    		OUTPUT		"Price of one sprinkler				=  USD 2.00"
                    		OUTPUT		"Price of one fire extinguisher		=  USD 35.00"
                    		OUTPUT		"Price of one lIFe boat				=  USD 50000.00"
                    		OUTPUT		"Price of one lIFe jacket			=  USD 80.00"
                    		OUTPUT		"Price of one food supply			=  USD 121.00"
                    		OUTPUT		"Price of one litre of water		=  USD 1.80"
                    		OUTPUT		"Price of one drinking vessel		=  USD 7.00"
                    		OUTPUT		"Price of one fishing tackle		=  USD 25.00"
                    		OUTPUT		"Price of one survival manual		=  USD 5.00"
                    		OUTPUT		"Price of one compass				=  USD 120.00"
                    		OUTPUT		"Price of one bucket				=  USD 2.00"
                    		OUTPUT		"Price of one hatchet				=  USD 200.00"
                    		OUTPUT		"Price of one flare kit				=  USD 114.26"
                    		OUTPUT		"Price of one electronic torch		=  USD 9.50"
                    		OUTPUT		"Price of one whistle				=  USD 5.00"
                    		OUTPUT		"Price of one tin opener			=  USD 8.00"
                    		OUTPUT		"Price of one rescue quit			=  USD 19.00"
                    		OUTPUT		"Price of one SART					=  USD 71.30"
                    		OUTPUT		"Price of one jack knIFe			=  USD 13.00"
                    		OUTPUT		"=========================================================="
                    		OUTPUT      ""
                            OUTPUT      "Proceed ?"
                            OUTPUT      "Y/N"
                            INPUT       decision1
                            WHILE       decision1 is not equal to Y and N {
                                OUTPUT      "Invalid INPUT, please try again"
    	                        INPUT       decision1
                            } 
                            IF decision1 is equal to Y { 
                                CALCULATE		totalSprinklersPrice 			= sprinklerApprox * 2
                        		CALCULATE 		totalFireExtinguisherPrice 		= totalFireExtinguisher * 35
                        		CALCULATE		totalLIFeBoatsPrice				= lIFeboats * 50000
                        		CALCULATE 		totalLIFeJacketsPrice 			= totalLIFeJackets * 80 
                        		CALCULATE		totalFoodPrice 					= totalFoodSupply * 121
                        		CALCULATE		totalWaterPrice 				= totalWaterSupply * 1.80
                        		CALCULATE		totalDrinkingVesselPrice 		= totalDrinkingVessel * 7
                        		CALCULATE		totalFishingTacklePrice 		= totalFishingTackles *  25
                        		CALCULATE		totalSurvivalManualPrice	 	= totalSurvivalManual * 5
                        		CALCULATE		totalCompassPrice 				= totalCompass * 120
                        		CALCULATE		totalBucketsPrice 				= totalBuckets * 2
                        		CALCULATE		totalHatchetsPrice 				= totalHatchets * 200
                        		CALCULATE		totalFlaresPrice 				= totalFlares * 114.26
                        		CALCULATE		totalTorchPrice 				= totalTorch * 9.50
                        		CALCULATE		totalWhistlePrice 				= totalWhitsle * 5
                        		CALCULATE		totalTinOpenerPrice 			= totalTinOpeners * 8
                        		CALCULATE		totalRescueQuitsPrice 			= totalRescueQuit * 19
                        		CALCULATE		totalSARTPrice 					= totalSART * 71.30
                        		CALCULATE		totalJackKnIFePrice 			= totalJackKnIFe * 13
                        		OUTPUT		"=========================================================="
                        		OUTPUT		"All equipments price Details :"
                        		OUTPUT		"Sprinklers				= " + totalSprinklerPrice
                        		OUTPUT		"Fire extinguishers		= " + totalFireExtinguisherPrice
                        		OUTPUT		"LIFeboats				= " + totalLIFeboatPrice
                        		OUTPUT		"LIFe Jackets			= " + totalLIFeJacketsPrice
                        		OUTPUT		"Emergency food			= " + totalFoodPrice
                        		OUTPUT		"Water in litres		= " + totalWaterPrice
                        		OUTPUT		"Drinking vessels		= " + totalDrinkingVesselPrice
                        		OUTPUT		"Fishing tackle			= " + totalFishingTacklePrice
                        		OUTPUT		"Survival Manuals		= " + totalSurvivalManualPrice
                        		OUTPUT		"Compass				= " + totalCompassPrice
                        		OUTPUT		"Buckets				= " + totalBucketsPrice
                        		OUTPUT		"Hatchets				= " + totalHatchetsPrice
                        		OUTPUT		"Flare kits				= " + totalFlaresPrice
                        		OUTPUT		"Electronic Torches		= " + totalTorchPrice 
                        		OUTPUT		"Whistles				= " + totalWhistlePrice
                        		OUTPUT		"Tin Openers			= " + totalTinOpenerPrice
                        		OUTPUT		"Rescue quits			= " + totalRescueQuitsPrice
                        		OUTPUT		"SART					= " + totalSARTPrice
                        		OUTPUT		"Jack knives			= " + totalJackKnIFePrice
                        		OUTPUT		"=========================================================="
                        		CALCULATE	totalPrice = totalSprinklerPrice + totalFireExtinguisherPrice + totalLIFeboatPrice + totalLIFeJacketsPrice + totalFoodPrice + totalWaterPrice + totalDrinkingVesselPrice + totalFishingTacklePrice + totalSurvivalManualPrice + totalCompassPrice + totalBucketsPrice + totalHatchetsPrice + totalFlaresPrice + totalTorchPrice + totalWhistlePrice + totalTinOpenerPrice + totalRescueQuitsPrice + totalSARTPrice + totalJackKnIFePrice
                        		OUTPUT		"Total Price of the whole equipments is : " + totalPrice
                        		OUTPUT      ""
                                OUTPUT      "Proceed ?"
                                OUTPUT      "Y/N"
                                INPUT       decision1
                                WHILE       decision1 is not equal to Y and N {
                                    OUTPUT      "Invalid INPUT, please try again"
        	                        INPUT       decision1
                                }
                                IF          decision1 is equal to Y {
                                    CALCULATE       totalRevenueOrLoss = totalPrice - moneyAcquired
                                    OUTPUT          "Total revenue / loss of your budget is : " + totalRevenueOrLoss
                                    OUTPUT          ""
                                    OUTPUT          "Please insert how many trips will your ship be doing in one year : "
                                    INPUT           tripsPerOneYear
                                    CALCULATE       totalRevenueOrLossAfterSailing = ((tripsPerOneYear * 5) * moneyAcquired) - totalPrice
                                    OUTPUT          "The total revenue / loss of your budget after 5 years is : " + totalRevenueOrLossAfterSailing
                                    
                                    >end IF
                                }
                        }
                    }
    	        }
	    }
    	      	//**************************************************
    	        // Medium Lifeboat, International
    	        //**************************************************
    	        
    	        IF          typeOfLifeboat is equal to 2 {
    	            CALCULATE   lifeboats = (((totalPassengers * 37.5) / 100) / 50) * 2
    	            CALCULATE   employeesPerLIFeboat = employees / lifeboats
    	            OUTPUT      "================================================"
    	            OUTPUT      "Size and distance details :"
    	            OUTPUT      "Ship's 2D size                     = " + ship2DApproxSize
    	            OUTPUT      "Ship's safe distance to an island  = " + distanceToBeAchieved
    	            OUTPUT      ""
    	            OUTPUT      "-------------------------------------------------"
    	            OUTPUT      ""
    	            OUTPUT      "Equipment details : "
    	            OUTPUT      "LIFeboats that will be on the ship                 = " + lifeboats
    	            OUTPUT      "Sprinklers that will be installed on the ship      = " + sprinklerApprox
    	            OUTPUT      "Fire extinguishers that will be aboard the ship    = " + fireExtinguisherApprox
    	            OUTPUT      ""
    	            OUTPUT      "-------------------------------------------------"
    	            OUTPUT      "Per-lIFeboat equipment details : "
    	            OUTPUT      "LIFe jackets           = 113"
    	            OUTPUT      "Box of food supply     = 5"
    	            OUTPUT      "Litres of water        = 563"
    	            OUTPUT      "Drinking vessels       = 113"
    	            OUTPUT      "Fishing tackles        = 1"
    	            OUTPUT      "Survival manual        = 1"
    	            OUTPUT      "Compass                = 1"
    	            OUTPUT      "Buckets                = 1"
    	            OUTPUT      "Hatchets               = 1"
    	            OUTPUT      "Flare kits             = 1"
    	            OUTPUT      "Electronic torches     = 1"
    	            OUTPUT      "Whistle                = 1"
    	            OUTPUT      "Tin openers            = 2"
    	            OUTPUT      "Rescue quits           = 1"
    	            OUTPUT      "SART                   = 1"
    	            OUTPUT      "Fire extinguisher      = 1"
    	            OUTPUT      "Jack KnIFe             = 1"
    	            OUTPUT      "Employees              = " + employeesPerLIFeboat
                    OUTPUT      "================================================"
                    OUTPUT      ""
                    OUTPUT      "Proceed ?"
                    OUTPUT      "Y/N"
                    INPUT       decision1
                    WHILE       decision1 is not equal to Y and N {
                        OUTPUT      "Invalid INPUT, please try again"
	                    INPUT       decision1
                    } 
                    
                    IF decision1 is equal to Y {
                        CALCULATE       totalLIFeJackets        = 113 * lIFeboats
                        CALCULATE       totalFoodSupply         = lIFeboats * 5
                        CALCULATE       totalWaterSupply        = (113 * 5) * lIFeboats
                        CALCULATE       totalDrinkingVessel     = 113 * lIFeboats
                        CALCULATE       totalFishingTackle      = lIFeboats
                        CALCULATE       totalSurvivalManual     = lIFeboats
                        CALCULATE       totalCompass            = lIFeboats
                        CALCULATE       totalBuckets            = lIFeboats
                        CALCULATE       totalHatchets           = lIFeboats
                        CALCULATE       totalFlares             = lIFeboats
                        CALCULATE       totalTorch              = lIFeboats
                        CALCULATE       totalWhistle            = lIFeboats
                        CALCULATE       totalTinOpeners         = 2 * lIFeboats
                        CALCULATE       totalRescueQuits        = lIFeboats
                        CALCULATE       totalSART               = lIFeboats
                        CALCULATE       totalFireExtinguisher   = lIFeboats + fireExtinguisherApprox
                        CALCULATE       totalJackKnIFe          = lIFeboats
                        OUTPUT		"=========================================================="
                		OUTPUT		"Total Equipment details : "
                		OUTPUT		"Total LIFe Jackets on all lIFeboats 			: " + totalLIFeJackets
                		OUTPUT		"Total Food supply on all lIFeboats 			: " + totalFoodSupply
                		OUTPUT		"Total Water supply on all lIFeboats 			: " + totalWaterSupply
                		OUTPUT		"Total Drinking vessels on all lIFeboats 		: " + totalDrinkingVessel
                		OUTPUT		"Total Fishing tackles on all lIFeboats 		: " + fishingTackle
                		OUTPUT		"Total Survival Manual on all lIFeboats 		: " + totalSurvivalManual
                		OUTPUT		"Total Compass on all lIFeboats 				: " + totalCompass
                		OUTPUT		"Total Buckets on all lIFeboats 				: " + totalBuckets,
                		OUTPUT		"Total Hatchets on all lIFeboats 				: " + totalHatchets
                		OUTPUT		"Total Flare kits on all lIFeboats 				: " + totalFlares
                		OUTPUT		"Total Electronic torches on all lIFeboats 		: " + totalTorch
                		OUTPUT		"Total Whistles on all lIFeboats 				: " + totalWhistle
                		OUTPUT		"Total Tin openers on all lIFeboats 			: " + totalTinOpeners
                		OUTPUT		"Total Rescue quits on all lIFeboats 			: " + totalRescueQuits
                		OUTPUT		"Total SART on all lIFeboats 					: " + totalSART
                		OUTPUT		"Total Fire extinguisher on all lIFeboats 		: " + lIFeboats
                		OUTPUT		"Total Fire extinguisher on boat and lIFeboat	: " + totalFireExtinguisher
                		OUTPUT		"Total Jack knives on all lIFeboats 			: " + totalJackKnIFe	
                		OUTPUT		"=========================================================="
                		OUTPUT      ""
                        OUTPUT      "Proceed ?"
                        OUTPUT      "Y/N"
                        INPUT       decision1
                        WHILE       decision1 is not equal to Y and N {
                            OUTPUT      "Invalid INPUT, please try again"
    	                    INPUT       decision1
                        } 
                        IF          decision1 is equal to Y {
                            OUTPUT		"=========================================================="
                    		OUTPUT		"Price details : "
                    		OUTPUT		"Price of one sprinkler				=  USD 2.00"
                    		OUTPUT		"Price of one fire extinguisher		=  USD 35.00"
                    		OUTPUT		"Price of one lIFe boat				=  USD 38000.00"
                    		OUTPUT		"Price of one lIFe jacket			=  USD 80.00"
                    		OUTPUT		"Price of one food supply			=  USD 121.00"
                    		OUTPUT		"Price of one litre of water		=  USD 1.80"
                    		OUTPUT		"Price of one drinking vessel		=  USD 7.00"
                    		OUTPUT		"Price of one fishing tackle		=  USD 25.00"
                    		OUTPUT		"Price of one survival manual		=  USD 5.00"
                    		OUTPUT		"Price of one compass				=  USD 120.00"
                    		OUTPUT		"Price of one bucket				=  USD 2.00"
                    		OUTPUT		"Price of one hatchet				=  USD 200.00"
                    		OUTPUT		"Price of one flare kit				=  USD 114.26"
                    		OUTPUT		"Price of one electronic torch		=  USD 9.50"
                    		OUTPUT		"Price of one whistle				=  USD 5.00"
                    		OUTPUT		"Price of one tin opener			=  USD 8.00"
                    		OUTPUT		"Price of one rescue quit			=  USD 19.00"
                    		OUTPUT		"Price of one SART					=  USD 71.30"
                    		OUTPUT		"Price of one jack knIFe			=  USD 13.00"
                    		OUTPUT		"=========================================================="
                    		OUTPUT      ""
                            OUTPUT      "Proceed ?"
                            OUTPUT      "Y/N"
                            INPUT       decision1
                            WHILE       decision1 is not equal to Y and N {
                                OUTPUT      "Invalid INPUT, please try again"
    	                        INPUT       decision1
                            } 
                            IF decision1 is equal to Y { 
                                CALCULATE		totalSprinklersPrice 			= sprinklerApprox * 2
                        		CALCULATE 		totalFireExtinguisherPrice 		= totalFireExtinguisher * 35
                        		CALCULATE		totalLIFeBoatsPrice				= lIFeboats * 38000
                        		CALCULATE 		totalLIFeJacketsPrice 			= totalLIFeJackets * 80 
                        		CALCULATE		totalFoodPrice 					= totalFoodSupply * 121
                        		CALCULATE		totalWaterPrice 				= totalWaterSupply * 1.80
                        		CALCULATE		totalDrinkingVesselPrice 		= totalDrinkingVessel * 7
                        		CALCULATE		totalFishingTacklePrice 		= totalFishingTackles *  25
                        		CALCULATE		totalSurvivalManualPrice	 	= totalSurvivalManual * 5
                        		CALCULATE		totalCompassPrice 				= totalCompass * 120
                        		CALCULATE		totalBucketsPrice 				= totalBuckets * 2
                        		CALCULATE		totalHatchetsPrice 				= totalHatchets * 200
                        		CALCULATE		totalFlaresPrice 				= totalFlares * 114.26
                        		CALCULATE		totalTorchPrice 				= totalTorch * 9.50
                        		CALCULATE		totalWhistlePrice 				= totalWhitsle * 5
                        		CALCULATE		totalTinOpenerPrice 			= totalTinOpeners * 8
                        		CALCULATE		totalRescueQuitsPrice 			= totalRescueQuit * 19
                        		CALCULATE		totalSARTPrice 					= totalSART * 71.30
                        		CALCULATE		totalJackKnIFePrice 			= totalJackKnIFe * 13
                        		OUTPUT		"=========================================================="
                        		OUTPUT		"All equipments price Details :"
                        		OUTPUT		"Sprinklers				= " + totalSprinklerPrice
                        		OUTPUT		"Fire extinguishers		= " + totalFireExtinguisherPrice
                        		OUTPUT		"LIFeboats				= " + totalLIFeboatPrice
                        		OUTPUT		"LIFe Jackets			= " + totalLIFeJacketsPrice
                        		OUTPUT		"Emergency food			= " + totalFoodPrice
                        		OUTPUT		"Water in litres		= " + totalWaterPrice
                        		OUTPUT		"Drinking vessels		= " + totalDrinkingVesselPrice
                        		OUTPUT		"Fishing tackle			= " + totalFishingTacklePrice
                        		OUTPUT		"Survival Manuals		= " + totalSurvivalManualPrice
                        		OUTPUT		"Compass				= " + totalCompassPrice
                        		OUTPUT		"Buckets				= " + totalBucketsPrice
                        		OUTPUT		"Hatchets				= " + totalHatchetsPrice
                        		OUTPUT		"Flare kits				= " + totalFlaresPrice
                        		OUTPUT		"Electronic Torches		= " + totalTorchPrice 
                        		OUTPUT		"Whistles				= " + totalWhistlePrice
                        		OUTPUT		"Tin Openers			= " + totalTinOpenerPrice
                        		OUTPUT		"Rescue quits			= " + totalRescueQuitsPrice
                        		OUTPUT		"SART					= " + totalSARTPrice
                        		OUTPUT		"Jack knives			= " + totalJackKnIFePrice
                        		OUTPUT		"=========================================================="
                        		CALCULATE	totalPrice = totalSprinklerPrice + totalFireExtinguisherPrice + totalLIFeboatPrice + totalLIFeJacketsPrice + totalFoodPrice + totalWaterPrice + totalDrinkingVesselPrice + totalFishingTacklePrice + totalSurvivalManualPrice + totalCompassPrice + totalBucketsPrice + totalHatchetsPrice + totalFlaresPrice + totalTorchPrice + totalWhistlePrice + totalTinOpenerPrice + totalRescueQuitsPrice + totalSARTPrice + totalJackKnIFePrice
                        		OUTPUT		"Total Price of the whole equipments is : " + totalPrice
                        		OUTPUT      ""
                                OUTPUT      "Proceed ?"
                                OUTPUT      "Y/N"
                                INPUT       decision1
                                WHILE       decision1 is not equal to Y and N {
                                    OUTPUT      "Invalid INPUT, please try again"
        	                        INPUT       decision1
                                }
                                IF          decision1 is equal to Y {
                                    CALCULATE       totalRevenueOrLoss = totalPrice - moneyAcquired
                                    OUTPUT          "Total revenue / loss of your budget is : " + totalRevenueOrLoss
                                    OUTPUT          ""
                                    OUTPUT          "Please insert how many trips will your ship be doing in one year : "
                                    INPUT           tripsPerOneYear
                                    CALCULATE       totalRevenueOrLossAfterSailing = ((tripsPerOneYear * 5) * moneyAcquired) - totalPrice
                                    OUTPUT          "The total revenue / loss of your budget after 5 years is : " + totalRevenueOrLossAfterSailing
                                    
                                    >end IF
                                }
                        }
                    }
    	        }
	    }
    	        
	}
  }
}
	//-------------------------------------------------
    // Domestic
	//-------------------------------------------------
	
	IF          typeOfTravel is equal to 1 {
	    OUTPUT      "You have selected Domestic cruising"
	    OUTPUT      "Please enter the length of the ship : "
	    INPUT       lengthOfShip
	    OUTPUT      "Please enter the width of the ship : "
	    INPUT       widthOfShip
	    CALCULATE   ship2DApproxSize = widthOfShip + lengthOfShip
	    CALCULATE   distanceToBeAchieved = (ship2DApproxSize * 2) / 5
	    CALCULATE   sprinklerApprox = 17 * ship2DApproxSize
	    CALCULATE   fireExtinguisherApprox = (ship2DApproxSize * 5) / 3
	    OUTPUT      "Please insert the number of guest passengers that will be aboard : "
	    INPUT       guestPassengers
	    OUTPUT      "Please insert the number of insurance money the guest passengers will be obliged to pay : "
	    INPUT       insuranceCost
	    CALCULATE   moneyAcquired = guestPassengers * insuranceCost
	    OUTPUT      "Please insert the number of employees that will be aboard the ship : "
	    INPUT       employees
	    CALCULATE   totalPassengers = guestPassengers + employees
	    OUTPUT      "Proceed ?"
	    OUTPUT      "Y/N"
	    INPUT       decision
	    WHILE       decision is not equal to Y or N {
	        OUTPUT      "Invalid INPUT, please try again"
	        INPUT       decision
	        }
	    IF          decision is equal to Y {
	      WHILE           decision1 is equal to N {
	        OUTPUT     "Please insert what type of lIFeboats you want to have in your liner : "
	        OUTPUT      "       1.Huge          2.Medium        3.Small			4. Raft		  "
	        INPUT       typeOfLIFeboat
	        WHILE       typeOfLIFeboat is not equal to 1 and is not equal to 2 {
	            OUTPUT      "Invalid INPUT, please try again"
	            INPUT       typeOfLIFeboat
	        }
	        
    	        //**************************************************
    	        // Huge Lifeboat, Domestic
    	        //**************************************************
    	        
    	        IF          typeOfLifeboat is equal to 1 {
    	            CALCULATE   lifeboats = (((totalPassengers * 37.5) / 100) / 75) * 2
    	            CALCULATE   employeesPerLIFeboat = employees / lIFeboats
    	            OUTPUT      "================================================"
    	            OUTPUT      "Size and distance details :"
    	            OUTPUT      "Ship's 2D size                     = " + ship2DApproxSize
    	            OUTPUT      "Ship's safe distance to an island  = " + distanceToBeAchieved
    	            OUTPUT      ""
    	            OUTPUT      "-------------------------------------------------"
    	            OUTPUT      ""
    	            OUTPUT      "Equipment details : "
    	            OUTPUT      "LIFeboats that will be on the ship                 = " + lIFeboats
    	            OUTPUT      "Sprinklers that will be installed on the ship      = " + sprinklerApprox
    	            OUTPUT      "Fire extinguishers that will be aboard the ship    = " + fireExtinguisherApprox
    	            OUTPUT      ""
    	            OUTPUT      "-------------------------------------------------"
    	            OUTPUT      "Per-lIFeboat equipment details : "
    	            OUTPUT      "LIFe jackets           = 150"
    	            OUTPUT      "Box of food supply     = 7"
    	            OUTPUT      "Litres of water        = 750"
    	            OUTPUT      "Drinking vessels       = 150"
    	            OUTPUT      "Fishing tackles        = 1"
    	            OUTPUT      "Survival manual        = 1"
    	            OUTPUT      "Compass                = 1"
    	            OUTPUT      "Buckets                = 2"
    	            OUTPUT      "Hatchets               = 2"
    	            OUTPUT      "Flare kits             = 1"
    	            OUTPUT      "Electronic torches     = 1"
    	            OUTPUT      "Whistle                = 1"
    	            OUTPUT      "Tin openers            = 3"
    	            OUTPUT      "Rescue quits           = 2"
    	            OUTPUT      "SART                   = 1"
    	            OUTPUT      "Fire extinguisher      = 1"
    	            OUTPUT      "Jack KnIFe             = 1"
    	            OUTPUT      "Employees              = " + employeesPerLIFeboat
                    OUTPUT      "================================================"
                    OUTPUT      ""
                    OUTPUT      "Proceed ?"
                    OUTPUT      "Y/N"
                    INPUT       decision1
                    WHILE       decision1 is not equal to Y and N {
                        OUTPUT      "Invalid INPUT, please try again"
	                    INPUT       decision1
                    } 
                    
                    IF decision1 is equal to Y {
                        CALCULATE       totalLIFeJackets        = 150 * lIFeboats
                        CALCULATE       totalFoodSupply         = lIFeboats * 7
                        CALCULATE       totalWaterSupply        = (150 * 5) * lIFeboats
                        CALCULATE       totalDrinkingVessel     = 150 * lIFeboats
                        CALCULATE       totalFishingTackle      = lIFeboats
                        CALCULATE       totalSurvivalManual     = lIFeboats
                        CALCULATE       totalCompass            = lIFeboats
                        CALCULATE       totalBuckets            = 2 * lIFeboats
                        CALCULATE       totalHatchets           = 2 * lIFeboats
                        CALCULATE       totalFlares             = lIFeboats
                        CALCULATE       totalTorch              = lIFeboats
                        CALCULATE       totalWhistle            = lIFeboats
                        CALCULATE       totalTinOpeners         = 3 * lIFeboats
                        CALCULATE       totalRescueQuits        = 2 * lIFeboats
                        CALCULATE       totalSART               = lIFeboats
                        CALCULATE       totalFireExtinguisher   = lIFeboats + fireExtinguisherApprox
                        CALCULATE       totalJackKnIFe          = lIFeboats
                        OUTPUT		"=========================================================="
                		OUTPUT		"Total Equipment details : "
                		OUTPUT		"Total LIFe Jackets on all lIFeboats 			: " + totalLIFeJackets
                		OUTPUT		"Total Food supply on all lIFeboats 			: " + totalFoodSupply
                		OUTPUT		"Total Water supply on all lIFeboats 			: " + totalWaterSupply
                		OUTPUT		"Total Drinking vessels on all lIFeboats 		: " + totalDrinkingVessel
                		OUTPUT		"Total Fishing tackles on all lIFeboats 		: " + fishingTackle
                		OUTPUT		"Total Survival Manual on all lIFeboats 		: " + totalSurvivalManual
                		OUTPUT		"Total Compass on all lIFeboats 				: " + totalCompass
                		OUTPUT		"Total Buckets on all lIFeboats 				: " + totalBuckets,
                		OUTPUT		"Total Hatchets on all lIFeboats 				: " + totalHatchets
                		OUTPUT		"Total Flare kits on all lIFeboats 				: " + totalFlares
                		OUTPUT		"Total Electronic torches on all lIFeboats 		: " + totalTorch
                		OUTPUT		"Total Whistles on all lIFeboats 				: " + totalWhistle
                		OUTPUT		"Total Tin openers on all lIFeboats 			: " + totalTinOpeners
                		OUTPUT		"Total Rescue quits on all lIFeboats 			: " + totalRescueQuits
                		OUTPUT		"Total SART on all lIFeboats 					: " + totalSART
                		OUTPUT		"Total Fire extinguisher on all lIFeboats 		: " + lIFeboats
                		OUTPUT		"Total Fire extinguisher on boat and lIFeboat	: " + totalFireExtinguisher
                		OUTPUT		"Total Jack knives on all lIFeboats 			: " + totalJackKnIFe	
                		OUTPUT		"=========================================================="
                		OUTPUT      ""
                        OUTPUT      "Proceed ?"
                        OUTPUT      "Y/N"
                        INPUT       decision1
                        WHILE       decision1 is not equal to Y and N {
                            OUTPUT      "Invalid INPUT, please try again"
    	                    INPUT       decision1
                        } 
                        IF          decision1 is equal to Y {
                            OUTPUT		"=========================================================="
                    		OUTPUT		"Price details : "
                    		OUTPUT		"Price of one sprinkler				=  USD 2.00"
                    		OUTPUT		"Price of one fire extinguisher		=  USD 35.00"
                    		OUTPUT		"Price of one lIFe boat				=  USD 50000.00"
                    		OUTPUT		"Price of one lIFe jacket			=  USD 80.00"
                    		OUTPUT		"Price of one food supply			=  USD 121.00"
                    		OUTPUT		"Price of one litre of water		=  USD 1.80"
                    		OUTPUT		"Price of one drinking vessel		=  USD 7.00"
                    		OUTPUT		"Price of one fishing tackle		=  USD 25.00"
                    		OUTPUT		"Price of one survival manual		=  USD 5.00"
                    		OUTPUT		"Price of one compass				=  USD 120.00"
                    		OUTPUT		"Price of one bucket				=  USD 2.00"
                    		OUTPUT		"Price of one hatchet				=  USD 200.00"
                    		OUTPUT		"Price of one flare kit				=  USD 114.26"
                    		OUTPUT		"Price of one electronic torch		=  USD 9.50"
                    		OUTPUT		"Price of one whistle				=  USD 5.00"
                    		OUTPUT		"Price of one tin opener			=  USD 8.00"
                    		OUTPUT		"Price of one rescue quit			=  USD 19.00"
                    		OUTPUT		"Price of one SART					=  USD 71.30"
                    		OUTPUT		"Price of one jack knIFe			=  USD 13.00"
                    		OUTPUT		"=========================================================="
                    		OUTPUT      ""
                            OUTPUT      "Proceed ?"
                            OUTPUT      "Y/N"
                            INPUT       decision1
                            WHILE       decision1 is not equal to Y and N {
                                OUTPUT      "Invalid INPUT, please try again"
    	                        INPUT       decision1
                            } 
                            IF decision1 is equal to Y { 
                                CALCULATE		totalSprinklersPrice 			= sprinklerApprox * 2
                        		CALCULATE 		totalFireExtinguisherPrice 		= totalFireExtinguisher * 35
                        		CALCULATE		totalLIFeBoatsPrice				= lIFeboats * 50000
                        		CALCULATE 		totalLIFeJacketsPrice 			= totalLIFeJackets * 80 
                        		CALCULATE		totalFoodPrice 					= totalFoodSupply * 121
                        		CALCULATE		totalWaterPrice 				= totalWaterSupply * 1.80
                        		CALCULATE		totalDrinkingVesselPrice 		= totalDrinkingVessel * 7
                        		CALCULATE		totalFishingTacklePrice 		= totalFishingTackles *  25
                        		CALCULATE		totalSurvivalManualPrice	 	= totalSurvivalManual * 5
                        		CALCULATE		totalCompassPrice 				= totalCompass * 120
                        		CALCULATE		totalBucketsPrice 				= totalBuckets * 2
                        		CALCULATE		totalHatchetsPrice 				= totalHatchets * 200
                        		CALCULATE		totalFlaresPrice 				= totalFlares * 114.26
                        		CALCULATE		totalTorchPrice 				= totalTorch * 9.50
                        		CALCULATE		totalWhistlePrice 				= totalWhitsle * 5
                        		CALCULATE		totalTinOpenerPrice 			= totalTinOpeners * 8
                        		CALCULATE		totalRescueQuitsPrice 			= totalRescueQuit * 19
                        		CALCULATE		totalSARTPrice 					= totalSART * 71.30
                        		CALCULATE		totalJackKnIFePrice 			= totalJackKnIFe * 13
                        		OUTPUT		"=========================================================="
                        		OUTPUT		"All equipments price Details :"
                        		OUTPUT		"Sprinklers				= " + totalSprinklerPrice
                        		OUTPUT		"Fire extinguishers		= " + totalFireExtinguisherPrice
                        		OUTPUT		"LIFeboats				= " + totalLIFeboatPrice
                        		OUTPUT		"LIFe Jackets			= " + totalLIFeJacketsPrice
                        		OUTPUT		"Emergency food			= " + totalFoodPrice
                        		OUTPUT		"Water in litres		= " + totalWaterPrice
                        		OUTPUT		"Drinking vessels		= " + totalDrinkingVesselPrice
                        		OUTPUT		"Fishing tackle			= " + totalFishingTacklePrice
                        		OUTPUT		"Survival Manuals		= " + totalSurvivalManualPrice
                        		OUTPUT		"Compass				= " + totalCompassPrice
                        		OUTPUT		"Buckets				= " + totalBucketsPrice
                        		OUTPUT		"Hatchets				= " + totalHatchetsPrice
                        		OUTPUT		"Flare kits				= " + totalFlaresPrice
                        		OUTPUT		"Electronic Torches		= " + totalTorchPrice 
                        		OUTPUT		"Whistles				= " + totalWhistlePrice
                        		OUTPUT		"Tin Openers			= " + totalTinOpenerPrice
                        		OUTPUT		"Rescue quits			= " + totalRescueQuitsPrice
                        		OUTPUT		"SART					= " + totalSARTPrice
                        		OUTPUT		"Jack knives			= " + totalJackKnIFePrice
                        		OUTPUT		"=========================================================="
                        		CALCULATE	totalPrice = totalSprinklerPrice + totalFireExtinguisherPrice + totalLIFeboatPrice + totalLIFeJacketsPrice + totalFoodPrice + totalWaterPrice + totalDrinkingVesselPrice + totalFishingTacklePrice + totalSurvivalManualPrice + totalCompassPrice + totalBucketsPrice + totalHatchetsPrice + totalFlaresPrice + totalTorchPrice + totalWhistlePrice + totalTinOpenerPrice + totalRescueQuitsPrice + totalSARTPrice + totalJackKnIFePrice
                        		OUTPUT		"Total Price of the whole equipments is : " + totalPrice
                        		OUTPUT      ""
                                OUTPUT      "Proceed ?"
                                OUTPUT      "Y/N"
                                INPUT       decision1
                                WHILE       decision1 is not equal to Y and N {
                                    OUTPUT      "Invalid INPUT, please try again"
        	                        INPUT       decision1
                                }
                                IF          decision1 is equal to Y {
                                    CALCULATE       totalRevenueOrLoss = totalPrice - moneyAcquired
                                    OUTPUT          "Total revenue / loss of your budget is : " + totalRevenueOrLoss
                                    OUTPUT          ""
                                    OUTPUT          "Please insert how many trips will your ship be doing in one year : "
                                    INPUT           tripsPerOneYear
                                    CALCULATE       totalRevenueOrLossAfterSailing = ((tripsPerOneYear * 5) * moneyAcquired) - totalPrice
                                    OUTPUT          "The total revenue / loss of your budget after 5 years is : " + totalRevenueOrLossAfterSailing
                                    
                                    >end IF
                                }
                        }
                    }
    	        }
	    }
    	      	//**************************************************
    	        // Medium Lifeboat, Domestic
    	        //**************************************************
    	        
    	        IF          typeOfLifeboat is equal to 2 {
    	            CALCULATE   lifeboats = (((totalPassengers * 37.5) / 100) / 50) * 2
    	            CALCULATE   employeesPerLIFeboat = employees / lifeboats
    	            OUTPUT      "================================================"
    	            OUTPUT      "Size and distance details :"
    	            OUTPUT      "Ship's 2D size                     = " + ship2DApproxSize
    	            OUTPUT      "Ship's safe distance to an island  = " + distanceToBeAchieved
    	            OUTPUT      ""
    	            OUTPUT      "-------------------------------------------------"
    	            OUTPUT      ""
    	            OUTPUT      "Equipment details : "
    	            OUTPUT      "LIFeboats that will be on the ship                 = " + lifeboats
    	            OUTPUT      "Sprinklers that will be installed on the ship      = " + sprinklerApprox
    	            OUTPUT      "Fire extinguishers that will be aboard the ship    = " + fireExtinguisherApprox
    	            OUTPUT      ""
    	            OUTPUT      "-------------------------------------------------"
    	            OUTPUT      "Per-lIFeboat equipment details : "
    	            OUTPUT      "LIFe jackets           = 113"
    	            OUTPUT      "Box of food supply     = 5"
    	            OUTPUT      "Litres of water        = 563"
    	            OUTPUT      "Drinking vessels       = 113"
    	            OUTPUT      "Fishing tackles        = 1"
    	            OUTPUT      "Survival manual        = 1"
    	            OUTPUT      "Compass                = 1"
    	            OUTPUT      "Buckets                = 1"
    	            OUTPUT      "Hatchets               = 1"
    	            OUTPUT      "Flare kits             = 1"
    	            OUTPUT      "Electronic torches     = 1"
    	            OUTPUT      "Whistle                = 1"
    	            OUTPUT      "Tin openers            = 2"
    	            OUTPUT      "Rescue quits           = 1"
    	            OUTPUT      "SART                   = 1"
    	            OUTPUT      "Fire extinguisher      = 1"
    	            OUTPUT      "Jack KnIFe             = 1"
    	            OUTPUT      "Employees              = " + employeesPerLIFeboat
                    OUTPUT      "================================================"
                    OUTPUT      ""
                    OUTPUT      "Proceed ?"
                    OUTPUT      "Y/N"
                    INPUT       decision1
                    WHILE       decision1 is not equal to Y and N {
                        OUTPUT      "Invalid INPUT, please try again"
	                    INPUT       decision1
                    } 
                    
                    IF decision1 is equal to Y {
                        CALCULATE       totalLIFeJackets        = 113 * lIFeboats
                        CALCULATE       totalFoodSupply         = lIFeboats * 5
                        CALCULATE       totalWaterSupply        = (113 * 5) * lIFeboats
                        CALCULATE       totalDrinkingVessel     = 113 * lIFeboats
                        CALCULATE       totalFishingTackle      = lIFeboats
                        CALCULATE       totalSurvivalManual     = lIFeboats
                        CALCULATE       totalCompass            = lIFeboats
                        CALCULATE       totalBuckets            = lIFeboats
                        CALCULATE       totalHatchets           = lIFeboats
                        CALCULATE       totalFlares             = lIFeboats
                        CALCULATE       totalTorch              = lIFeboats
                        CALCULATE       totalWhistle            = lIFeboats
                        CALCULATE       totalTinOpeners         = 2 * lIFeboats
                        CALCULATE       totalRescueQuits        = lIFeboats
                        CALCULATE       totalSART               = lIFeboats
                        CALCULATE       totalFireExtinguisher   = lIFeboats + fireExtinguisherApprox
                        CALCULATE       totalJackKnIFe          = lIFeboats
                        OUTPUT		"=========================================================="
                		OUTPUT		"Total Equipment details : "
                		OUTPUT		"Total LIFe Jackets on all lIFeboats 			: " + totalLIFeJackets
                		OUTPUT		"Total Food supply on all lIFeboats 			: " + totalFoodSupply
                		OUTPUT		"Total Water supply on all lIFeboats 			: " + totalWaterSupply
                		OUTPUT		"Total Drinking vessels on all lIFeboats 		: " + totalDrinkingVessel
                		OUTPUT		"Total Fishing tackles on all lIFeboats 		: " + fishingTackle
                		OUTPUT		"Total Survival Manual on all lIFeboats 		: " + totalSurvivalManual
                		OUTPUT		"Total Compass on all lIFeboats 				: " + totalCompass
                		OUTPUT		"Total Buckets on all lIFeboats 				: " + totalBuckets,
                		OUTPUT		"Total Hatchets on all lIFeboats 				: " + totalHatchets
                		OUTPUT		"Total Flare kits on all lIFeboats 				: " + totalFlares
                		OUTPUT		"Total Electronic torches on all lIFeboats 		: " + totalTorch
                		OUTPUT		"Total Whistles on all lIFeboats 				: " + totalWhistle
                		OUTPUT		"Total Tin openers on all lIFeboats 			: " + totalTinOpeners
                		OUTPUT		"Total Rescue quits on all lIFeboats 			: " + totalRescueQuits
                		OUTPUT		"Total SART on all lIFeboats 					: " + totalSART
                		OUTPUT		"Total Fire extinguisher on all lIFeboats 		: " + lIFeboats
                		OUTPUT		"Total Fire extinguisher on boat and lIFeboat	: " + totalFireExtinguisher
                		OUTPUT		"Total Jack knives on all lIFeboats 			: " + totalJackKnIFe	
                		OUTPUT		"=========================================================="
                		OUTPUT      ""
                        OUTPUT      "Proceed ?"
                        OUTPUT      "Y/N"
                        INPUT       decision1
                        WHILE       decision1 is not equal to Y and N {
                            OUTPUT      "Invalid INPUT, please try again"
    	                    INPUT       decision1
                        } 
                        IF          decision1 is equal to Y {
                            OUTPUT		"=========================================================="
                    		OUTPUT		"Price details : "
                    		OUTPUT		"Price of one sprinkler				=  USD 2.00"
                    		OUTPUT		"Price of one fire extinguisher		=  USD 35.00"
                    		OUTPUT		"Price of one lIFe boat				=  USD 38000.00"
                    		OUTPUT		"Price of one lIFe jacket			=  USD 80.00"
                    		OUTPUT		"Price of one food supply			=  USD 121.00"
                    		OUTPUT		"Price of one litre of water		=  USD 1.80"
                    		OUTPUT		"Price of one drinking vessel		=  USD 7.00"
                    		OUTPUT		"Price of one fishing tackle		=  USD 25.00"
                    		OUTPUT		"Price of one survival manual		=  USD 5.00"
                    		OUTPUT		"Price of one compass				=  USD 120.00"
                    		OUTPUT		"Price of one bucket				=  USD 2.00"
                    		OUTPUT		"Price of one hatchet				=  USD 200.00"
                    		OUTPUT		"Price of one flare kit				=  USD 114.26"
                    		OUTPUT		"Price of one electronic torch		=  USD 9.50"
                    		OUTPUT		"Price of one whistle				=  USD 5.00"
                    		OUTPUT		"Price of one tin opener			=  USD 8.00"
                    		OUTPUT		"Price of one rescue quit			=  USD 19.00"
                    		OUTPUT		"Price of one SART					=  USD 71.30"
                    		OUTPUT		"Price of one jack knIFe			=  USD 13.00"
                    		OUTPUT		"=========================================================="
                    		OUTPUT      ""
                            OUTPUT      "Proceed ?"
                            OUTPUT      "Y/N"
                            INPUT       decision1
                            WHILE       decision1 is not equal to Y and N {
                                OUTPUT      "Invalid INPUT, please try again"
    	                        INPUT       decision1
                            } 
                            IF decision1 is equal to Y { 
                                CALCULATE		totalSprinklersPrice 			= sprinklerApprox * 2
                        		CALCULATE 		totalFireExtinguisherPrice 		= totalFireExtinguisher * 35
                        		CALCULATE		totalLIFeBoatsPrice				= lIFeboats * 38000
                        		CALCULATE 		totalLIFeJacketsPrice 			= totalLIFeJackets * 80 
                        		CALCULATE		totalFoodPrice 					= totalFoodSupply * 121
                        		CALCULATE		totalWaterPrice 				= totalWaterSupply * 1.80
                        		CALCULATE		totalDrinkingVesselPrice 		= totalDrinkingVessel * 7
                        		CALCULATE		totalFishingTacklePrice 		= totalFishingTackles *  25
                        		CALCULATE		totalSurvivalManualPrice	 	= totalSurvivalManual * 5
                        		CALCULATE		totalCompassPrice 				= totalCompass * 120
                        		CALCULATE		totalBucketsPrice 				= totalBuckets * 2
                        		CALCULATE		totalHatchetsPrice 				= totalHatchets * 200
                        		CALCULATE		totalFlaresPrice 				= totalFlares * 114.26
                        		CALCULATE		totalTorchPrice 				= totalTorch * 9.50
                        		CALCULATE		totalWhistlePrice 				= totalWhitsle * 5
                        		CALCULATE		totalTinOpenerPrice 			= totalTinOpeners * 8
                        		CALCULATE		totalRescueQuitsPrice 			= totalRescueQuit * 19
                        		CALCULATE		totalSARTPrice 					= totalSART * 71.30
                        		CALCULATE		totalJackKnIFePrice 			= totalJackKnIFe * 13
                        		OUTPUT		"=========================================================="
                        		OUTPUT		"All equipments price Details :"
                        		OUTPUT		"Sprinklers				= " + totalSprinklerPrice
                        		OUTPUT		"Fire extinguishers		= " + totalFireExtinguisherPrice
                        		OUTPUT		"LIFeboats				= " + totalLIFeboatPrice
                        		OUTPUT		"LIFe Jackets			= " + totalLIFeJacketsPrice
                        		OUTPUT		"Emergency food			= " + totalFoodPrice
                        		OUTPUT		"Water in litres		= " + totalWaterPrice
                        		OUTPUT		"Drinking vessels		= " + totalDrinkingVesselPrice
                        		OUTPUT		"Fishing tackle			= " + totalFishingTacklePrice
                        		OUTPUT		"Survival Manuals		= " + totalSurvivalManualPrice
                        		OUTPUT		"Compass				= " + totalCompassPrice
                        		OUTPUT		"Buckets				= " + totalBucketsPrice
                        		OUTPUT		"Hatchets				= " + totalHatchetsPrice
                        		OUTPUT		"Flare kits				= " + totalFlaresPrice
                        		OUTPUT		"Electronic Torches		= " + totalTorchPrice 
                        		OUTPUT		"Whistles				= " + totalWhistlePrice
                        		OUTPUT		"Tin Openers			= " + totalTinOpenerPrice
                        		OUTPUT		"Rescue quits			= " + totalRescueQuitsPrice
                        		OUTPUT		"SART					= " + totalSARTPrice
                        		OUTPUT		"Jack knives			= " + totalJackKnIFePrice
                        		OUTPUT		"=========================================================="
                        		CALCULATE	totalPrice = totalSprinklerPrice + totalFireExtinguisherPrice + totalLIFeboatPrice + totalLIFeJacketsPrice + totalFoodPrice + totalWaterPrice + totalDrinkingVesselPrice + totalFishingTacklePrice + totalSurvivalManualPrice + totalCompassPrice + totalBucketsPrice + totalHatchetsPrice + totalFlaresPrice + totalTorchPrice + totalWhistlePrice + totalTinOpenerPrice + totalRescueQuitsPrice + totalSARTPrice + totalJackKnIFePrice
                        		OUTPUT		"Total Price of the whole equipments is : " + totalPrice
                        		OUTPUT      ""
                                OUTPUT      "Proceed ?"
                                OUTPUT      "Y/N"
                                INPUT       decision1
                                WHILE       decision1 is not equal to Y and N {
                                    OUTPUT      "Invalid INPUT, please try again"
        	                        INPUT       decision1
                                }
                                IF          decision1 is equal to Y {
                                    CALCULATE       totalRevenueOrLoss = totalPrice - moneyAcquired
                                    OUTPUT          "Total revenue / loss of your budget is : " + totalRevenueOrLoss
                                    OUTPUT          ""
                                    OUTPUT          "Please insert how many trips will your ship be doing in one year : "
                                    INPUT           tripsPerOneYear
                                    CALCULATE       totalRevenueOrLossAfterSailing = ((tripsPerOneYear * 5) * moneyAcquired) - totalPrice
                                    OUTPUT          "The total revenue / loss of your budget after 5 years is : " + totalRevenueOrLossAfterSailing
                                    
                                    >end IF
                                }
                        }
                    }
    	        }
	    }
				//**************************************************
    	        // Small Lifeboat, Domestic
    	        //**************************************************
    	        
    	        IF          typeOfLifeboat is equal to 3 {
    	            CALCULATE   lifeboats = (((totalPassengers * 37.5) / 100) / 32) * 2
    	            CALCULATE   employeesPerLIFeboat = employees / lifeboats
    	            OUTPUT      "================================================"
    	            OUTPUT      "Size and distance details :"
    	            OUTPUT      "Ship's 2D size                     = " + ship2DApproxSize
    	            OUTPUT      "Ship's safe distance to an island  = " + distanceToBeAchieved
    	            OUTPUT      ""
    	            OUTPUT      "-------------------------------------------------"
    	            OUTPUT      ""
    	            OUTPUT      "Equipment details : "
    	            OUTPUT      "LIFeboats that will be on the ship                 = " + lifeboats
    	            OUTPUT      "Sprinklers that will be installed on the ship      = " + sprinklerApprox
    	            OUTPUT      "Fire extinguishers that will be aboard the ship    = " + fireExtinguisherApprox
    	            OUTPUT      ""
    	            OUTPUT      "-------------------------------------------------"
    	            OUTPUT      "Per-lIFeboat equipment details : "
    	            OUTPUT      "LIFe jackets           = 75"
    	            OUTPUT      "Box of food supply     = 4"
    	            OUTPUT      "Litres of water        = 375"
    	            OUTPUT      "Drinking vessels       = 75"
    	            OUTPUT      "Fishing tackles        = 1"
    	            OUTPUT      "Survival manual        = 1"
    	            OUTPUT      "Compass                = 1"
    	            OUTPUT      "Buckets                = 1"
    	            OUTPUT      "Hatchets               = 1"
    	            OUTPUT      "Flare kits             = 1"
    	            OUTPUT      "Electronic torches     = 1"
    	            OUTPUT      "Whistle                = 1"
    	            OUTPUT      "Tin openers            = 1"
    	            OUTPUT      "Rescue quits           = 1"
    	            OUTPUT      "SART                   = 1"
    	            OUTPUT      "Fire extinguisher      = 1"
    	            OUTPUT      "Jack KnIFe             = 1"
    	            OUTPUT      "Employees              = " + employeesPerLIFeboat
                    OUTPUT      "================================================"
                    OUTPUT      ""
                    OUTPUT      "Proceed ?"
                    OUTPUT      "Y/N"
                    INPUT       decision1
                    WHILE       decision1 is not equal to Y and N {
                        OUTPUT      "Invalid INPUT, please try again"
	                    INPUT       decision1
                    } 
                    
                    IF decision1 is equal to Y {
                        CALCULATE       totalLIFeJackets        = 75 * lIFeboats
                        CALCULATE       totalFoodSupply         = lIFeboats * 4
                        CALCULATE       totalWaterSupply        = (75 * 5) * lIFeboats
                        CALCULATE       totalDrinkingVessel     = 75 * lIFeboats
                        CALCULATE       totalFishingTackle      = lIFeboats
                        CALCULATE       totalSurvivalManual     = lIFeboats
                        CALCULATE       totalCompass            = lIFeboats
                        CALCULATE       totalBuckets            = lIFeboats
                        CALCULATE       totalHatchets           = lIFeboats
                        CALCULATE       totalFlares             = lIFeboats
                        CALCULATE       totalTorch              = lIFeboats
                        CALCULATE       totalWhistle            = lIFeboats
                        CALCULATE       totalTinOpeners         = lIFeboats
                        CALCULATE       totalRescueQuits        = lIFeboats
                        CALCULATE       totalSART               = lIFeboats
                        CALCULATE       totalFireExtinguisher   = lIFeboats + fireExtinguisherApprox
                        CALCULATE       totalJackKnIFe          = lIFeboats
                        OUTPUT		"=========================================================="
                		OUTPUT		"Total Equipment details : "
                		OUTPUT		"Total LIFe Jackets on all lIFeboats 			: " + totalLIFeJackets
                		OUTPUT		"Total Food supply on all lIFeboats 			: " + totalFoodSupply
                		OUTPUT		"Total Water supply on all lIFeboats 			: " + totalWaterSupply
                		OUTPUT		"Total Drinking vessels on all lIFeboats 		: " + totalDrinkingVessel
                		OUTPUT		"Total Fishing tackles on all lIFeboats 		: " + fishingTackle
                		OUTPUT		"Total Survival Manual on all lIFeboats 		: " + totalSurvivalManual
                		OUTPUT		"Total Compass on all lIFeboats 				: " + totalCompass
                		OUTPUT		"Total Buckets on all lIFeboats 				: " + totalBuckets,
                		OUTPUT		"Total Hatchets on all lIFeboats 				: " + totalHatchets
                		OUTPUT		"Total Flare kits on all lIFeboats 				: " + totalFlares
                		OUTPUT		"Total Electronic torches on all lIFeboats 		: " + totalTorch
                		OUTPUT		"Total Whistles on all lIFeboats 				: " + totalWhistle
                		OUTPUT		"Total Tin openers on all lIFeboats 			: " + totalTinOpeners
                		OUTPUT		"Total Rescue quits on all lIFeboats 			: " + totalRescueQuits
                		OUTPUT		"Total SART on all lIFeboats 					: " + totalSART
                		OUTPUT		"Total Fire extinguisher on all lIFeboats 		: " + lIFeboats
                		OUTPUT		"Total Fire extinguisher on boat and lIFeboat	: " + totalFireExtinguisher
                		OUTPUT		"Total Jack knives on all lIFeboats 			: " + totalJackKnIFe	
                		OUTPUT		"=========================================================="
                		OUTPUT      ""
                        OUTPUT      "Proceed ?"
                        OUTPUT      "Y/N"
                        INPUT       decision1
                        WHILE       decision1 is not equal to Y and N {
                            OUTPUT      "Invalid INPUT, please try again"
    	                    INPUT       decision1
                        } 
                        IF          decision1 is equal to Y {
                            OUTPUT		"=========================================================="
                    		OUTPUT		"Price details : "
                    		OUTPUT		"Price of one sprinkler				=  USD 2.00"
                    		OUTPUT		"Price of one fire extinguisher		=  USD 35.00"
                    		OUTPUT		"Price of one lIFe boat				=  USD 27000.00"
                    		OUTPUT		"Price of one lIFe jacket			=  USD 80.00"
                    		OUTPUT		"Price of one food supply			=  USD 121.00"
                    		OUTPUT		"Price of one litre of water		=  USD 1.80"
                    		OUTPUT		"Price of one drinking vessel		=  USD 7.00"
                    		OUTPUT		"Price of one fishing tackle		=  USD 25.00"
                    		OUTPUT		"Price of one survival manual		=  USD 5.00"
                    		OUTPUT		"Price of one compass				=  USD 120.00"
                    		OUTPUT		"Price of one bucket				=  USD 2.00"
                    		OUTPUT		"Price of one hatchet				=  USD 200.00"
                    		OUTPUT		"Price of one flare kit				=  USD 114.26"
                    		OUTPUT		"Price of one electronic torch		=  USD 9.50"
                    		OUTPUT		"Price of one whistle				=  USD 5.00"
                    		OUTPUT		"Price of one tin opener			=  USD 8.00"
                    		OUTPUT		"Price of one rescue quit			=  USD 19.00"
                    		OUTPUT		"Price of one SART					=  USD 71.30"
                    		OUTPUT		"Price of one jack knIFe			=  USD 13.00"
                    		OUTPUT		"=========================================================="
                    		OUTPUT      ""
                            OUTPUT      "Proceed ?"
                            OUTPUT      "Y/N"
                            INPUT       decision1
                            WHILE       decision1 is not equal to Y and N {
                                OUTPUT      "Invalid INPUT, please try again"
    	                        INPUT       decision1
                            } 
                            IF decision1 is equal to Y { 
                                CALCULATE		totalSprinklersPrice 			= sprinklerApprox * 2
                        		CALCULATE 		totalFireExtinguisherPrice 		= totalFireExtinguisher * 35
                        		CALCULATE		totalLIFeBoatsPrice				= lIFeboats * 27000
                        		CALCULATE 		totalLIFeJacketsPrice 			= totalLIFeJackets * 80 
                        		CALCULATE		totalFoodPrice 					= totalFoodSupply * 121
                        		CALCULATE		totalWaterPrice 				= totalWaterSupply * 1.80
                        		CALCULATE		totalDrinkingVesselPrice 		= totalDrinkingVessel * 7
                        		CALCULATE		totalFishingTacklePrice 		= totalFishingTackles *  25
                        		CALCULATE		totalSurvivalManualPrice	 	= totalSurvivalManual * 5
                        		CALCULATE		totalCompassPrice 				= totalCompass * 120
                        		CALCULATE		totalBucketsPrice 				= totalBuckets * 2
                        		CALCULATE		totalHatchetsPrice 				= totalHatchets * 200
                        		CALCULATE		totalFlaresPrice 				= totalFlares * 114.26
                        		CALCULATE		totalTorchPrice 				= totalTorch * 9.50
                        		CALCULATE		totalWhistlePrice 				= totalWhitsle * 5
                        		CALCULATE		totalTinOpenerPrice 			= totalTinOpeners * 8
                        		CALCULATE		totalRescueQuitsPrice 			= totalRescueQuit * 19
                        		CALCULATE		totalSARTPrice 					= totalSART * 71.30
                        		CALCULATE		totalJackKnIFePrice 			= totalJackKnIFe * 13
                        		OUTPUT		"=========================================================="
                        		OUTPUT		"All equipments price Details :"
                        		OUTPUT		"Sprinklers				= " + totalSprinklerPrice
                        		OUTPUT		"Fire extinguishers		= " + totalFireExtinguisherPrice
                        		OUTPUT		"LIFeboats				= " + totalLIFeboatPrice
                        		OUTPUT		"LIFe Jackets			= " + totalLIFeJacketsPrice
                        		OUTPUT		"Emergency food			= " + totalFoodPrice
                        		OUTPUT		"Water in litres		= " + totalWaterPrice
                        		OUTPUT		"Drinking vessels		= " + totalDrinkingVesselPrice
                        		OUTPUT		"Fishing tackle			= " + totalFishingTacklePrice
                        		OUTPUT		"Survival Manuals		= " + totalSurvivalManualPrice
                        		OUTPUT		"Compass				= " + totalCompassPrice
                        		OUTPUT		"Buckets				= " + totalBucketsPrice
                        		OUTPUT		"Hatchets				= " + totalHatchetsPrice
                        		OUTPUT		"Flare kits				= " + totalFlaresPrice
                        		OUTPUT		"Electronic Torches		= " + totalTorchPrice 
                        		OUTPUT		"Whistles				= " + totalWhistlePrice
                        		OUTPUT		"Tin Openers			= " + totalTinOpenerPrice
                        		OUTPUT		"Rescue quits			= " + totalRescueQuitsPrice
                        		OUTPUT		"SART					= " + totalSARTPrice
                        		OUTPUT		"Jack knives			= " + totalJackKnIFePrice
                        		OUTPUT		"=========================================================="
                        		CALCULATE	totalPrice = totalSprinklerPrice + totalFireExtinguisherPrice + totalLIFeboatPrice + totalLIFeJacketsPrice + totalFoodPrice + totalWaterPrice + totalDrinkingVesselPrice + totalFishingTacklePrice + totalSurvivalManualPrice + totalCompassPrice + totalBucketsPrice + totalHatchetsPrice + totalFlaresPrice + totalTorchPrice + totalWhistlePrice + totalTinOpenerPrice + totalRescueQuitsPrice + totalSARTPrice + totalJackKnIFePrice
                        		OUTPUT		"Total Price of the whole equipments is : " + totalPrice
                        		OUTPUT      ""
                                OUTPUT      "Proceed ?"
                                OUTPUT      "Y/N"
                                INPUT       decision1
                                WHILE       decision1 is not equal to Y and N {
                                    OUTPUT      "Invalid INPUT, please try again"
        	                        INPUT       decision1
                                }
                                IF          decision1 is equal to Y {
                                    CALCULATE       totalRevenueOrLoss = totalPrice - moneyAcquired
                                    OUTPUT          "Total revenue / loss of your budget is : " + totalRevenueOrLoss
                                    OUTPUT          ""
                                    OUTPUT          "Please insert how many trips will your ship be doing in one year : "
                                    INPUT           tripsPerOneYear
                                    CALCULATE       totalRevenueOrLossAfterSailing = ((tripsPerOneYear * 5) * moneyAcquired) - totalPrice
                                    OUTPUT          "The total revenue / loss of your budget after 5 years is : " + totalRevenueOrLossAfterSailing
                                    
                                    >end IF
                                }
                        }
                    }
    	        }
	    }
				//**************************************************
    	        // Liferafts, Domestic
    	        //**************************************************
    	        
    	        IF          typeOfLifeboat is equal to 4 {
    	            CALCULATE   lifeboats = (((totalPassengers * 15) / 100) / 32) * 2
    	            CALCULATE   employeesPerLIFeboat = employees / lifeboats
    	            OUTPUT      "================================================"
    	            OUTPUT      "Size and distance details :"
    	            OUTPUT      "Ship's 2D size                     = " + ship2DApproxSize
    	            OUTPUT      "Ship's safe distance to an island  = " + distanceToBeAchieved
    	            OUTPUT      ""
    	            OUTPUT      "-------------------------------------------------"
    	            OUTPUT      ""
    	            OUTPUT      "Equipment details : "
    	            OUTPUT      "LIFeboats that will be on the ship                 = " + lifeboats
    	            OUTPUT      "Sprinklers that will be installed on the ship      = " + sprinklerApprox
    	            OUTPUT      "Fire extinguishers that will be aboard the ship    = " + fireExtinguisherApprox
    	            OUTPUT      ""
    	            OUTPUT      "-------------------------------------------------"
    	            OUTPUT      "Per-lIFeboat equipment details : "
    	            OUTPUT      "LIFe jackets           = 35"
    	            OUTPUT      "Box of food supply     = 2"
    	            OUTPUT      "Litres of water        = 188"
    	            OUTPUT      "Drinking vessels       = 35"
    	            OUTPUT      "Fishing tackles        = 1"
    	            OUTPUT      "Survival manual        = 1"
    	            OUTPUT      "Compass                = 1"
    	            OUTPUT      "Buckets                = 1"
    	            OUTPUT      "Flare kits             = 1"
    	            OUTPUT      "Electronic torches     = 1"
    	            OUTPUT      "Whistle                = 1"
    	            OUTPUT      "Tin openers            = 1"
    	            OUTPUT      "Rescue quits           = 1"
    	            OUTPUT      "SART                   = 1"
    	            OUTPUT      "Jack KnIFe             = 1"
    	            OUTPUT      "Employees              = " + employeesPerLIFeboat
                    OUTPUT      "================================================"
                    OUTPUT      ""
                    OUTPUT      "Proceed ?"
                    OUTPUT      "Y/N"
                    INPUT       decision1
                    WHILE       decision1 is not equal to Y and N {
                        OUTPUT      "Invalid INPUT, please try again"
	                    INPUT       decision1
                    } 
                    
                    IF decision1 is equal to Y {
                        CALCULATE       totalLIFeJackets        = 35 * lIFeboats
                        CALCULATE       totalFoodSupply         = lIFeboats * 2
                        CALCULATE       totalWaterSupply        = (35 * 5) * lIFeboats
                        CALCULATE       totalDrinkingVessel     = 35 * lIFeboats
                        CALCULATE       totalFishingTackle      = lIFeboats
                        CALCULATE       totalSurvivalManual     = lIFeboats
                        CALCULATE       totalCompass            = lIFeboats
                        CALCULATE       totalBuckets            = lIFeboats
                        CALCULATE       totalFlares             = lIFeboats
                        CALCULATE       totalTorch              = lIFeboats
                        CALCULATE       totalWhistle            = lIFeboats
                        CALCULATE       totalTinOpeners         = lIFeboats
                        CALCULATE       totalRescueQuits        = lIFeboats
                        CALCULATE       totalSART               = lIFeboats
                        CALCULATE       totalFireExtinguisher   = fireExtinguisherApprox
                        CALCULATE       totalJackKnIFe          = lIFeboats
                        OUTPUT		"=========================================================="
                		OUTPUT		"Total Equipment details : "
                		OUTPUT		"Total LIFe Jackets on all lIFeboats 			: " + totalLIFeJackets
                		OUTPUT		"Total Food supply on all lIFeboats 			: " + totalFoodSupply
                		OUTPUT		"Total Water supply on all lIFeboats 			: " + totalWaterSupply
                		OUTPUT		"Total Drinking vessels on all lIFeboats 		: " + totalDrinkingVessel
                		OUTPUT		"Total Fishing tackles on all lIFeboats 		: " + fishingTackle
                		OUTPUT		"Total Survival Manual on all lIFeboats 		: " + totalSurvivalManual
                		OUTPUT		"Total Compass on all lIFeboats 				: " + totalCompass
                		OUTPUT		"Total Buckets on all lIFeboats 				: " + totalBuckets,
                		OUTPUT		"Total Flare kits on all lIFeboats 				: " + totalFlares
                		OUTPUT		"Total Electronic torches on all lIFeboats 		: " + totalTorch
                		OUTPUT		"Total Whistles on all lIFeboats 				: " + totalWhistle
                		OUTPUT		"Total Tin openers on all lIFeboats 			: " + totalTinOpeners
                		OUTPUT		"Total Rescue quits on all lIFeboats 			: " + totalRescueQuits
                		OUTPUT		"Total SART on all lIFeboats 					: " + totalSART
                		OUTPUT		"Total Fire extinguisher on boat and lIFeboat	: " + totalFireExtinguisher
                		OUTPUT		"Total Jack knives on all lIFeboats 			: " + totalJackKnIFe	
                		OUTPUT		"=========================================================="
                		OUTPUT      ""
                        OUTPUT      "Proceed ?"
                        OUTPUT      "Y/N"
                        INPUT       decision1
                        WHILE       decision1 is not equal to Y and N {
                            OUTPUT      "Invalid INPUT, please try again"
    	                    INPUT       decision1
                        } 
                        IF          decision1 is equal to Y {
                            OUTPUT		"=========================================================="
                    		OUTPUT		"Price details : "
                    		OUTPUT		"Price of one sprinkler				=  USD 2.00"
                    		OUTPUT		"Price of one fire extinguisher		=  USD 35.00"
                    		OUTPUT		"Price of one lIFe boat				=  USD 15000.00"
                    		OUTPUT		"Price of one lIFe jacket			=  USD 80.00"
                    		OUTPUT		"Price of one food supply			=  USD 121.00"
                    		OUTPUT		"Price of one litre of water		=  USD 1.80"
                    		OUTPUT		"Price of one drinking vessel		=  USD 7.00"
                    		OUTPUT		"Price of one fishing tackle		=  USD 25.00"
                    		OUTPUT		"Price of one survival manual		=  USD 5.00"
                    		OUTPUT		"Price of one compass				=  USD 120.00"
                    		OUTPUT		"Price of one bucket				=  USD 2.00"
                    		OUTPUT		"Price of one flare kit				=  USD 114.26"
                    		OUTPUT		"Price of one electronic torch		=  USD 9.50"
                    		OUTPUT		"Price of one whistle				=  USD 5.00"
                    		OUTPUT		"Price of one tin opener			=  USD 8.00"
                    		OUTPUT		"Price of one rescue quit			=  USD 19.00"
                    		OUTPUT		"Price of one SART					=  USD 71.30"
                    		OUTPUT		"Price of one jack knIFe			=  USD 13.00"
                    		OUTPUT		"=========================================================="
                    		OUTPUT      ""
                            OUTPUT      "Proceed ?"
                            OUTPUT      "Y/N"
                            INPUT       decision1
                            WHILE       decision1 is not equal to Y and N {
                                OUTPUT      "Invalid INPUT, please try again"
    	                        INPUT       decision1
                            } 
                            IF decision1 is equal to Y { 
                                CALCULATE		totalSprinklersPrice 			= sprinklerApprox * 2
                        		CALCULATE 		totalFireExtinguisherPrice 		= totalFireExtinguisher * 35
                        		CALCULATE		totalLIFeBoatsPrice				= lIFeboats * 15000
                        		CALCULATE 		totalLIFeJacketsPrice 			= totalLIFeJackets * 80 
                        		CALCULATE		totalFoodPrice 					= totalFoodSupply * 121
                        		CALCULATE		totalWaterPrice 				= totalWaterSupply * 1.80
                        		CALCULATE		totalDrinkingVesselPrice 		= totalDrinkingVessel * 7
                        		CALCULATE		totalFishingTacklePrice 		= totalFishingTackles *  25
                        		CALCULATE		totalSurvivalManualPrice	 	= totalSurvivalManual * 5
                        		CALCULATE		totalCompassPrice 				= totalCompass * 120
                        		CALCULATE		totalBucketsPrice 				= totalBuckets * 2
                        		CALCULATE		totalHatchetsPrice 				= totalHatchets * 200
                        		CALCULATE		totalFlaresPrice 				= totalFlares * 114.26
                        		CALCULATE		totalTorchPrice 				= totalTorch * 9.50
                        		CALCULATE		totalWhistlePrice 				= totalWhitsle * 5
                        		CALCULATE		totalTinOpenerPrice 			= totalTinOpeners * 8
                        		CALCULATE		totalRescueQuitsPrice 			= totalRescueQuit * 19
                        		CALCULATE		totalSARTPrice 					= totalSART * 71.30
                        		CALCULATE		totalJackKnIFePrice 			= totalJackKnIFe * 13
                        		OUTPUT		"=========================================================="
                        		OUTPUT		"All equipments price Details :"
                        		OUTPUT		"Sprinklers				= " + totalSprinklerPrice
                        		OUTPUT		"Fire extinguishers		= " + totalFireExtinguisherPrice
                        		OUTPUT		"LIFeboats				= " + totalLIFeboatPrice
                        		OUTPUT		"LIFe Jackets			= " + totalLIFeJacketsPrice
                        		OUTPUT		"Emergency food			= " + totalFoodPrice
                        		OUTPUT		"Water in litres		= " + totalWaterPrice
                        		OUTPUT		"Drinking vessels		= " + totalDrinkingVesselPrice
                        		OUTPUT		"Fishing tackle			= " + totalFishingTacklePrice
                        		OUTPUT		"Survival Manuals		= " + totalSurvivalManualPrice
                        		OUTPUT		"Compass				= " + totalCompassPrice
                        		OUTPUT		"Buckets				= " + totalBucketsPrice
                        		OUTPUT		"Flare kits				= " + totalFlaresPrice
                        		OUTPUT		"Electronic Torches		= " + totalTorchPrice 
                        		OUTPUT		"Whistles				= " + totalWhistlePrice
                        		OUTPUT		"Tin Openers			= " + totalTinOpenerPrice
                        		OUTPUT		"Rescue quits			= " + totalRescueQuitsPrice
                        		OUTPUT		"SART					= " + totalSARTPrice
                        		OUTPUT		"Jack knives			= " + totalJackKnIFePrice
                        		OUTPUT		"=========================================================="
                        		CALCULATE	totalPrice = totalSprinklerPrice + totalFireExtinguisherPrice + totalLIFeboatPrice + totalLIFeJacketsPrice + totalFoodPrice + totalWaterPrice + totalDrinkingVesselPrice + totalFishingTacklePrice + totalSurvivalManualPrice + totalCompassPrice + totalBucketsPrice + totalFlaresPrice + totalTorchPrice + totalWhistlePrice + totalTinOpenerPrice + totalRescueQuitsPrice + totalSARTPrice + totalJackKnIFePrice
                        		OUTPUT		"Total Price of the whole equipments is : " + totalPrice
                        		OUTPUT      ""
                                OUTPUT      "Proceed ?"
                                OUTPUT      "Y/N"
                                INPUT       decision1
                                WHILE       decision1 is not equal to Y and N {
                                    OUTPUT      "Invalid INPUT, please try again"
        	                        INPUT       decision1
                                }
                                IF          decision1 is equal to Y {
                                    CALCULATE       totalRevenueOrLoss = totalPrice - moneyAcquired
                                    OUTPUT          "Total revenue / loss of your budget is : " + totalRevenueOrLoss
                                    OUTPUT          ""
                                    OUTPUT          "Please insert how many trips will your ship be doing in one year : "
                                    INPUT           tripsPerOneYear
                                    CALCULATE       totalRevenueOrLossAfterSailing = ((tripsPerOneYear * 5) * moneyAcquired) - totalPrice
                                    OUTPUT          "The total revenue / loss of your budget after 5 years is : " + totalRevenueOrLossAfterSailing
                                    
                                    >end IF
                                }
                        }
                    }
    	        }
	    }
    	        
	}
  }
}
}