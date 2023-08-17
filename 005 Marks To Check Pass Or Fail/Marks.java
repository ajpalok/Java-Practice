class Marks{
    String id;
    double quizMark, midMark, finalMark;

    Marks(String id, double quizMark, double midMark, double finalMark){
        this.id = id;
        this.quizMark = quizMark;
        this.midMark = midMark;
        this.finalMark = finalMark;
    }

    void passedOrNot(){;
        if(quizMark + midMark + finalMark >= 55){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
