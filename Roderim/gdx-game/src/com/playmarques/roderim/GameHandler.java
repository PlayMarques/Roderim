package com.playmarques.roderim;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.playmarques.roderim.view.scenes.*;

public class GameHandler implements ApplicationListener
{
	SpriteBatch batch;
	_Scene scene;

	@Override
	public void create()
	{
		batch = new SpriteBatch();
		scene = new HallScene();
		scene.onCreate();
		
	}
	

	@Override
	public void render()
	{        
	    Gdx.gl.glClearColor(1, 1, 1, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//draw() from batch is called from scene
		scene.onRender(batch);
		batch.end();
		//Update the logic of a scene each frame
		scene.onUpdate(Gdx.graphics.getDeltaTime());
		//When a new scene is set we catch it
		_Scene nextScene = scene.getNextScene();
		if(nextScene != null){
			//clean up the old scene
			scene.onClean();
			//set the new scene to run
			scene = nextScene;
			//set up the new scene
			scene.onCreate();
		}
	}

	@Override
	public void dispose()
	{
		scene.onClean();
		batch.dispose();
	}

	@Override
	public void resize(int width, int height)
	{
	}

	@Override
	public void pause()
	{
	}

	@Override
	public void resume()
	{
	}
}
