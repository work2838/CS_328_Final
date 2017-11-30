package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Quest extends ApplicationAdapter {
	menu NewMenu = new menu();
	
	@Override
	public void create () {


	}

	@Override
	public void render () {

	NewMenu.render_menu();
	}

	@Override
	public void dispose () {

	}
}
