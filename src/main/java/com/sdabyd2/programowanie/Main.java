package com.sdabyd2.programowanie;

import com.sdabyd2.programowanie.controller.GiantController;
import com.sdabyd2.programowanie.model.Fatigue;
import com.sdabyd2.programowanie.model.GiantModel;
import com.sdabyd2.programowanie.model.Health;
import com.sdabyd2.programowanie.model.Nourishment;
import com.sdabyd2.programowanie.view.GiantView;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<GiantModel> lista = new ArrayList<>();
        GiantModel ogr = new GiantModel(Health.HEALTHY, Fatigue.NO, Nourishment.HUNGRY);
        lista.add(ogr);
        GiantModel troll = new GiantModel(Health.SICK, Fatigue.YES, Nourishment.STARVING);
        lista.add(troll);
        GiantController giantController = new GiantController(lista, new GiantView());

      //  giantController.updateView();
      //  giantController.setHealth(Health.DEAD, 0);
      //  giantController.updateView();
      //  giantController.setFatigue(Fatigue.ASLEEP, 0);
      //  giantController.setNourishment(Nourishment.STARVING, 0);
        giantController.updateView();

    }
}
