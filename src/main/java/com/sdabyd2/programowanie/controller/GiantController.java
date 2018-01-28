package com.sdabyd2.programowanie.controller;

import com.sdabyd2.programowanie.model.Fatigue;
import com.sdabyd2.programowanie.model.GiantModel;
import com.sdabyd2.programowanie.model.Health;
import com.sdabyd2.programowanie.model.Nourishment;
import com.sdabyd2.programowanie.view.GiantView;

import java.util.List;

public class GiantController {

    private GiantView giantView;
    private List<GiantModel> giantModel;

    public GiantController(List<GiantModel> giantModel, GiantView giantView){
        this.giantView = giantView;
        this.giantModel = giantModel;
    }
    public Health getHealth(int which){
        return giantModel.get(which).getHealth();
    }
    public void setHealth(Health health, int which){
        this.giantModel.get(which).setHealth(health);
    }
    public Fatigue getFatigue(int which){
        return giantModel.get(which).getFatigue();
    }
    public void setFatigue(Fatigue fatigue, int which){
        this.giantModel.get(which).setFatigue(fatigue);
    }
    public Nourishment getNourishment(int which){
        return giantModel.get(which).getNourishment();
    }
    public void setNourishment(Nourishment nourishment, int which){
        this.giantModel.get(which).setNourishment(nourishment);
    }
    public void updateView(){
        for (GiantModel model : giantModel) {
            this.giantView.displayGiant(model);
        }
    }
}
