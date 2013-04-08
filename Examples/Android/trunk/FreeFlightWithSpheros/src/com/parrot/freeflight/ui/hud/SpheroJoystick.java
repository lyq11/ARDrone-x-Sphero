package com.parrot.freeflight.ui.hud;

import android.content.Context;

import com.parrot.freeflight.R;

public class SpheroJoystick extends JoystickBase {
	
	public SpheroJoystick(Context context, Align align, boolean absolute) {
		super(context, align, absolute);
		this.alphaEnabled = false;
		this.enabled = false;
	}
	
	@Override
	protected int getBackgroundDrawableId() {
		return R.drawable.accelero_background;
	}
	
	@Override
	protected int getTumbDrawableId() {
		return R.drawable.joystick_sphero;
	}
	
	@Override
	protected void onActionMove(float x, float y) {
		
	}
	
}