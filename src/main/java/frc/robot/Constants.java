// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    //testing25
    
    public static final class Drivetrain {
        public static final int leftFrontTaloniD = 1; //PDP 14
        public static final int rightFrontTaloniD = 4; //PDP 12

        public static final int leftBackTaloniD = 0; //PDP 3
        public static final int rightBackTaloniD = 3; //PDP 13
        
    }

    public static final class Ports {
        public static final int Actuator = 7;
    }

    public static final class Encoder {
        public static final int leftEncoder = 0;
        public static final int rightEncoder = 1;
    }

    public static final class Climber {
        public static final int climberSparkPwm = 2;
    
    }

    public static final class Deployer {
        public static final int deploySparkPwm = 6;
        
    }
    

}
