package com.playmarques.roderim.view.scenes;
import com.badlogic.gdx.graphics.g2d.*;

public interface _Scene
{
	public void onCreate();
	public void onUpdate(float deltaTime);
	public void onRender(SpriteBatch batch);
	public void onClean();
	
	public _Scene getNextScene();
	public void setNextScene(_Scene nextScene);
}
