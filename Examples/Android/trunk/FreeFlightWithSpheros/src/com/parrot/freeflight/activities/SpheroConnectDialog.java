package com.parrot.freeflight.activities;

import orbotix.view.connection.SpheroConnectionView;
import orbotix.view.connection.SpheroConnectionView.OnRobotConnectionEventListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.parrot.freeflight.R;

public class SpheroConnectDialog extends DialogFragment {

	SpheroConnectionView connectionView;
	
	OnRobotConnectionEventListener robotConnectionListener;
	
	public SpheroConnectDialog() {
		
	}
	
	public SpheroConnectDialog(OnRobotConnectionEventListener robotConnectionListener) {
		this.robotConnectionListener = robotConnectionListener;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.sphero_connectivity_alert, container);
		
		connectionView = (SpheroConnectionView)view.findViewById(R.id.sphero_connection_view);
		connectionView.setSingleSpheroMode(false);
		connectionView.setOneAtATimeMode(false);
		connectionView.setOnRobotConnectionEventListener(robotConnectionListener);
		
		getDialog().setTitle("Connect Sphero");
		
		return view;
	}

	@Override
	public void onStart() {
		connectionView.showSpheros();
		super.onStart();
	}
	
	
	
}
