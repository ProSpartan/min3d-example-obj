package com.example.androidmin3d;

import min3d.core.Object3dContainer;
import min3d.core.RendererActivity;
import min3d.parser.IParser;
import min3d.parser.Parser;
import min3d.vos.Light;

public class Obj3DView extends RendererActivity
{
	private Object3dContainer cubeObject3D;
	
	@Override
	public void initScene()
	{
		scene.lights().add(new Light());
		scene.lights().add(new Light());
		
		Light myLight = new Light();
		myLight.position.setZ(150);
		scene.lights().add(myLight);
		
		IParser myParser = Parser.createParser(Parser.Type.OBJ,  getResources(), "com.example.androidmin3d:raw/cube_obj", true);
		myParser.parse();
		
		cubeObject3D = myParser.getParsedObject();
		cubeObject3D.position().x = cubeObject3D.position().y = cubeObject3D.position().z = 0;
		cubeObject3D.scale().x = cubeObject3D.scale().y = cubeObject3D.scale().z = 0.7f;
		
		scene.addChild(cubeObject3D);
	}
	
	@Override
	public void updateScene()
	{
		cubeObject3D.rotation().x += 0.5;
		cubeObject3D.rotation().z += 1;
	}
}