package com.example.androidmin3d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class min3dtest extends Activity
{
	@Override
	public void onCreate(Bundle icicle)
	{
		super.onCreate(icicle);
		this.startActivity(new Intent(this, Obj3DView.class));
	}
}