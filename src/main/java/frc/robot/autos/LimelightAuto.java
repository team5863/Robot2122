package frc.robot.autos;

import java.util.function.BooleanSupplier;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.ConditionalCommand;
import edu.wpi.first.wpilibj2.command.ParallelDeadlineGroup;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.WaitUntilCommand;
import frc.robot.commands.DeployControl;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.IntakeControl;
import frc.robot.commands.LimeDrive;
import frc.robot.commands.Shoot;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.limeMaster;
import frc.robot.subsystems.Deploy;

public class LimelightAuto extends SequentialCommandGroup {


    public LimelightAuto(DriveTrain m_driveTrain, limeMaster m_limelight, Shooter m_Shooter, Intake m_Intake, Deploy m_deploy){
      
        //Temporary

        addCommands(
            new ParallelDeadlineGroup(
                new LimeDrive(() -> 0, () -> 0, m_limelight, m_driveTrain)
            )


           /* new ParallelDeadlineGroup( //shoot!
                new WaitCommand(1),
                new Shoot(m_Shooter, 0.93),
                new LimeDrive(m_driveTrain, () -> 0, () -> 0)
            )*/

        );
    }
    
}




