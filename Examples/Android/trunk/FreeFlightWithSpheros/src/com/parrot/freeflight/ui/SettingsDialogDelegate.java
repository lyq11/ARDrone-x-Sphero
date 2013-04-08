package com.parrot.freeflight.ui;

import orbotix.robot.base.Robot;

import com.parrot.freeflight.activities.SettingsDialog;
import com.parrot.freeflight.settings.ApplicationSettings.EAppSettingProperty;

public interface SettingsDialogDelegate
{
    /**
     * Called when dialog is going to be shown.
     * @param dialog - instance of the dialog that is going to be shown.
     */
    public void prepareDialog(SettingsDialog dialog);
    
    /**
     * Called when dialog is dismissed.
     * @param settingsDialog - instance of the dialog
     */
    public void onDismissed(SettingsDialog settingsDialog);
    
    /**
     * Called when application property is changed by the user from settings screen.
     * @param property - one of the EAppSettingProperty values.
     * @param value - value of the property.
     */
    public void onOptionChangedApp(EAppSettingProperty property, Object value);
    
    /**
     * Called when a Sphero is connected
     * 
     */
    public void onSpheroConnected(Robot robot);
    
}
