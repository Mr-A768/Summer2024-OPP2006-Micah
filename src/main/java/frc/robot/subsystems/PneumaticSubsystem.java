// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PneumaticSubsystem extends SubsystemBase {

  public static DoubleSolenoid solenoid = new DoubleSolenoid(5, PneumaticsModuleType.CTREPCM, 0, 1);

  /** Creates a new PneumaticSubsystem. */
  public PneumaticSubsystem() {
    // sets the solenoid to a known position on init
    solenoid.set(Value.kReverse);
  }

  public void toggleSolenoid() {
    solenoid.toggle();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
