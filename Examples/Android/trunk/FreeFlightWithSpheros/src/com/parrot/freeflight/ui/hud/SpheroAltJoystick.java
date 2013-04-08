package com.parrot.freeflight.ui.hud;

import android.content.Context;

import com.parrot.freeflight.R;

public class SpheroAltJoystick extends JoystickBase {
	
	public SpheroAltJoystick(Context context, Align align, boolean absolute) {
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
		return R.drawable.joystick_sphero_alt;
	}
	
	@Override
	protected void onActionMove(float x, float y) {
		
	}
	
}