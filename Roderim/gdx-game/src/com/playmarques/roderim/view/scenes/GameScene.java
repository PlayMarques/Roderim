package com.playmarques.roderim.view.scenes;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.*;

public class GameScene implements _Scene
{
	private _Scene nextScene;

	@Override
	public void onCreate()
	{
		// TODO: Implement this method
	}

	@Override
	public void onUpdate(float deltaTime)
	{
		// TODO: Implement this method
		if(Gdx.input.isTouched()){
			setNextScene(new HallScene());
		}
	}

	@Override
	public void onRender(SpriteBatch batch)
	{
		// TODO: Implement this method
	}

	@Override
	public void onClean()
	{
		// TODO: Implement this method
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
