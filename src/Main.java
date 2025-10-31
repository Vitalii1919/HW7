//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            var dog = 8.0;
            System.out.println(dog);
            dog = dog + 4;
            System.out.println(dog);
            dog = dog - 3.5;
            System.out.println(dog);

            var cat = 3.6;
            System.out.println(cat);
            cat = cat + 4;
            System.out.println(cat);
            cat = cat -1.6;
            System.out.println(cat);

            var paper = 763789;
            System.out.println(paper);
            paper = paper + 4;
            System.out.println(paper);
            paper = paper - 7639;
            System.out.println(paper);

            var friend = 19;
            System.out.println(friend);
            friend = friend + 2;
            System.out.println(friend);
            friend = friend / 7;
            System.out.println(friend);

            var frog = 3.5;
            System.out.println(frog);
            frog = frog * 10;
            System.out.println(frog);
            frog = frog / 3.5;
            System.out.println(frog);
            frog = frog + 4;
            System.out.println(frog);

            var oneBoxer = 78.2;
            var secondBoxer =  82.7;
            var totalWeightOfTwoFighters = oneBoxer + secondBoxer;
            var differenceBetweenTheWeightsOfTheFighters = secondBoxer - oneBoxer;
            System.out.println(oneBoxer);
            System.out.println(secondBoxer);
            System.out.println(totalWeightOfTwoFighters);
            System.out.println(differenceBetweenTheWeightsOfTheFighters);

            var differenceInTheWeightsOfAthletesFirstWay = secondBoxer - oneBoxer;
            var differenceInTheWeightsOfAthletesSecondWay = secondBoxer % oneBoxer;
            System.out.println(differenceInTheWeightsOfAthletesFirstWay);
            System.out.println(differenceInTheWeightsOfAthletesSecondWay);

            var totalNumberOfHours = 640;
            var timeOfEachEmployee = 8;
            var totalEmployees = totalNumberOfHours / timeOfEachEmployee;
            System.out.println("Всего работников в компании - " + totalEmployees + "  человек");


            var increaseBy94TotalEmployees =  totalEmployees  + 94;
            var totalTimeIfIncreaseBy94Employees =  increaseBy94TotalEmployees * timeOfEachEmployee;
            System.out.println(increaseBy94TotalEmployees);
            System.out.println("Если в компании работает - " + increaseBy94TotalEmployees + "  человека," +
                    " то всего " + totalTimeIfIncreaseBy94Employees +  " часов работы может быть поделено между сотрудниками"
            );





        }
    }
}