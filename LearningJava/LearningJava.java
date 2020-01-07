// CONDITIONALS

// If else statement
if (mood == “hungry”) {
  System.out.println(“Eat something.”);
}else if (mood == “tired”) {
  System.out.println(“Take a nap.”);
}else if (mood == “thirsty”) {
  System.out.println(“Drink water.”);
}else{
System.out.println(“Pet your dog!”);
}

//Switch statement
switch (mood) {
  case "hungry": 
   System.out.println(“Eat something.”);
  break; 
  case "tired": 
     System.out.println(“Take a nap.”);
  break; 
    case "thirsty": 
  System.out.println(“Drink water.”);
  break; 
    default:
      System.out.println("Pet your dog.");
}

