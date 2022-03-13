package com.sofka.game;

import com.sofka.domain.*;
import com.sofka.service.BingoBallotService;
import com.sofka.service.TuplesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class WinCheck {

    @Autowired
    private TuplesService tuplesService;


    @Autowired
    private BingoBallotService bingoBallotService;

    private final static int b=0;
    private final static int i=1;
    private final static int n=2;
    private final static int g=3;
    private final static int o=4;
    private int b1;
    private int b2;
    private int b3;
    private int b4;
    private int b5;

    private int i1;
    private int i2;
    private int i3;
    private int i4;
    private int i5;

    private int n1;
    private int n2;
    private int n4;
    private int n5;

    private int g1;
    private int g2;
    private int g3;
    private int g4;
    private int g5;

    private int o1;
    private int o2;
    private int o3;
    private int o4;
    private int o5;

    public void init(Game game){
        ArrayList<Integer> tupleONumbers=new ArrayList<>();
        BTuples bTuples=tuplesService.findBTuple(game).orElse(null);
        this.b1=bTuples.getNumber1();
        this.b2=bTuples.getNumber2();
        this.b3=bTuples.getNumber3();
        this.b4=bTuples.getNumber4();
        this.b5=bTuples.getNumber5();
        ITuples iTuples=tuplesService.findITuple(game).orElse(null);
        this.i1=bTuples.getNumber1();
        this.i2=bTuples.getNumber2();
        this.i3=bTuples.getNumber3();
        this.i4=bTuples.getNumber4();
        this.i5=bTuples.getNumber5();
        NTuples nTuples =tuplesService.findNTuple(game).orElse(null);
        this.n1= nTuples.getNumber1();
        this.n2= nTuples.getNumber2();
        this.n4= nTuples.getNumber3();
        this.n5= nTuples.getNumber4();
        GTuples gTuples =tuplesService.findGTuple(game).orElse(null);
        this.g1= gTuples.getNumber1();
        this.g2= gTuples.getNumber2();
        this.g3= gTuples.getNumber3();
        this.g4= gTuples.getNumber4();
        this.g5= gTuples.getNumber5();
        OTuples oTuples =tuplesService.findOTuple(game).orElse(null);
        this.o1= oTuples.getNumber1();
        this.o2= oTuples.getNumber2();
        this.o3= oTuples.getNumber3();
        this.o4= oTuples.getNumber4();
        this.o5= oTuples.getNumber5();

    }
    public boolean isDiagonal(){
        return  bingoBallotService.checkBingoBallot(b,b1)
                &bingoBallotService.checkBingoBallot(i, i2 )
                &bingoBallotService.checkBingoBallot(g,g4)
                &bingoBallotService.checkBingoBallot(o,o5);

    }


    //BingoBallot bingoBallot= IBingoBallotService;

    public boolean isReverseDiagonal(){
        return bingoBallotService.checkBingoBallot(b,b5)
                &bingoBallotService.checkBingoBallot(i, i4)
                &bingoBallotService.checkBingoBallot(g,g2)
                &bingoBallotService.checkBingoBallot(o,o1);

    }

    public boolean isFourCorners() {

        return bingoBallotService.checkBingoBallot(b,b1)
                &bingoBallotService.checkBingoBallot(b, b5 )
                &bingoBallotService.checkBingoBallot(o,o4)
                &bingoBallotService.checkBingoBallot(o,o5);
    }


    public boolean isVertical(){
        boolean isVertical=false;

        for (int index = 0; index < 5; index++) {
            boolean vertical = bingoBallotService.checkBingoBallot(b, b1)
                    & bingoBallotService.checkBingoBallot(b, b2)
                    & bingoBallotService.checkBingoBallot(b, b3)
                    & bingoBallotService.checkBingoBallot(b, b4)
                    & bingoBallotService.checkBingoBallot(b, b5);
            if (vertical) {
                isVertical = true;
            }
        }
            return isVertical;
    }

    public boolean isHorizontal(){
        boolean isHorizontal =false;
        boolean horizontal1 = bingoBallotService.checkBingoBallot(b, b1)
                & bingoBallotService.checkBingoBallot(i, i1)
                & bingoBallotService.checkBingoBallot(n, n1)
                & bingoBallotService.checkBingoBallot(g, g1)
                & bingoBallotService.checkBingoBallot(o, o1);

        boolean horizontal2 = bingoBallotService.checkBingoBallot(b, b2)
                & bingoBallotService.checkBingoBallot(i, i2)
                & bingoBallotService.checkBingoBallot(n, n2)
                & bingoBallotService.checkBingoBallot(g, g2)
                & bingoBallotService.checkBingoBallot(o, o2);

        boolean horizontal3 = bingoBallotService.checkBingoBallot(b, b3)
                & bingoBallotService.checkBingoBallot(i, i3)
                & bingoBallotService.checkBingoBallot(g, g3)
                & bingoBallotService.checkBingoBallot(o, o3);

        boolean horizontal4 = bingoBallotService.checkBingoBallot(b, b4)
                & bingoBallotService.checkBingoBallot(i, i4)
                & bingoBallotService.checkBingoBallot(n, n4)
                & bingoBallotService.checkBingoBallot(g, g4)
                & bingoBallotService.checkBingoBallot(o, o4);

        boolean horizontal5 = bingoBallotService.checkBingoBallot(b, b5)
                & bingoBallotService.checkBingoBallot(i, i5)
                & bingoBallotService.checkBingoBallot(n, n5)
                & bingoBallotService.checkBingoBallot(g, g5)
                & bingoBallotService.checkBingoBallot(o, o5);

        isHorizontal=horizontal1&horizontal2&horizontal3&horizontal3&horizontal5;

        return isHorizontal;

    }

    public boolean won(){
        return this.isDiagonal()&this.isReverseDiagonal()&this.isFourCorners()
                &this.isHorizontal()&this.isVertical();
    }


}
