package com.knnapplication;

import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import com.knnapplication.views.ExampleView;
import com.knnapplication.views.PrimaryView;
import com.knnapplication.views.SecondaryView;
import com.gluonhq.charm.glisten.application.AppManager;
import com.gluonhq.charm.glisten.visual.Swatch;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import static com.gluonhq.charm.glisten.application.AppManager.HOME_VIEW;
import static com.gluonhq.charm.glisten.application.AppManager.initialize;

public class KNNApplication extends Application {

    public static final String PRIMARY_VIEW = HOME_VIEW;
    public static final String SECONDARY_VIEW = "Secondary View";
    public static final String EXAMPLE_VIEW = "Example View";

    private final AppManager appManager = AppManager.initialize(this::postInit);


    @Override
    public void init() {
        appManager.addViewFactory(PRIMARY_VIEW, () -> new PrimaryView().getView());
        appManager.addViewFactory(SECONDARY_VIEW, () -> new SecondaryView().getView());
        appManager.addViewFactory(EXAMPLE_VIEW, () -> new ExampleView().getView());

        DrawerManager.buildDrawer(appManager);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        appManager.start(primaryStage);


    }

    private void postInit(Scene scene) {
        Swatch.BLUE.assignTo(scene);

        scene.getStylesheets().add(KNNApplication.class.getResource("style.css").toExternalForm());
        ((Stage) scene.getWindow()).getIcons().add(new Image(KNNApplication.class.getResourceAsStream("/icon.png")));
    }

    public static void main(String args[]) {
        launch(args);
    }
}
