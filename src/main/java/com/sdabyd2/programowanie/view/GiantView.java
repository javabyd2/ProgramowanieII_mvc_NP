package com.sdabyd2.programowanie.view;

import com.sdabyd2.programowanie.model.GiantModel;

public class GiantView {

    public GiantView() {
    }
    public void displayGiant(GiantModel giantModel){
        System.out.println(giantModel.toString());
    }
}
