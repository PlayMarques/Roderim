package com.playmarques.roderim.view.scenes;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.*;

public class HallScene implements _Scene
{
	private _Scene nextScene;
	private Texture texture;

	@Override
	public void onUpdate(float deltaTime)
	{
		// TODO: Implement this method
		if(Gdx.input.isTouched()){
			setNextScene(new GameScene());
		}
	}

	@Override
	public void onCreate()
	{
		// TODO: Implement this method
		texture = new Texture(Gdx.files.internal("android.jpg"));
	}

	@Override
	public void onRender(SpriteBatch batch)
	{
		// TODO: Implement this method
		batch.draw(texture, 100, 100);
	}

	@Override
	public void onClean()
	{
		// TODO: Implement this method
		texture.dispose();
	}

	@Override
	public _Scene getNextScene()
	{
		// TODO: Implement this method
		return nextScene;
	}

	@Override
	public void setNextScene(_Scene nextScene)
	{
		// TODO: Implement this method
		this.nextScene = nextScene;
	}
	
	
}
