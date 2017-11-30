package com.mygdx.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector3;


public class menu implements InputProcessor {

    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;
    private OrthographicCamera camera;


    public void render_menu() {

        Gdx.input.setInputProcessor(this);
        TmxMapLoader loader = new TmxMapLoader();
        map = loader.load("splash.tmx");
        renderer = new OrthogonalTiledMapRenderer(map,1/16f);
        camera = new OrthographicCamera();
        camera.setToOrtho(false,12,8);

        renderer.setView(camera);
        renderer.render();




    }


    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {

        Vector3 position = camera.unproject(new Vector3(screenX,screenY,0));
        System.out.print((int)position.x + "  " + (int)position.y + "\n");

        if(((int)position.x==8||(int)position.x==9)&&(int)position.y==5)
            System.exit(0);
        if (((int)position.x==2||(int)position.x==3)&&(int)position.y==5)
            System.out.print("you made it here\n");
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}