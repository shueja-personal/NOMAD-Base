/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.wrappers;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/**
 * Constructs a WPI_TalonSRX object, resets it to factory settings, and enables motor safety.
 * 
 * @param port - The CAN ID of the Talon
 */
public class NOMAD_TalonSRX extends WPI_TalonSRX{

    public NOMAD_TalonSRX(int port) {
        super(port);
        this.configFactoryDefault();
        this.setSafetyEnabled(true);
    }
}
