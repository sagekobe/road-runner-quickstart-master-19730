package org.firstinspires.ftc.teamcode;
import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Rotation2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore. eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm. robotcore.hardware.Servo;
@Autonomous (name="First-Roaderunner")

public class firstRR extends LinearOpMode {
@Override
public void runOpMode() throws InterruptedException {
    MecanumDrive drive = new MecanumDrive(hardwareMap, new Pose2d(0,0,0));

    waitForStart();
    Actions.runBlocking(drive.actionBuilder(new Pose2d(0,0,0))
             //.lineToX(10)
            //.splineTo(new Vector2d(30,20), 80)
            //.setTangent(0)
            //.splineToSplineHeading(new Pose2d(30, 30, 0), Math.PI / 2)
            .splineToLinearHeading(new Pose2d(8, 16, -Math.PI / 4), Math.PI / 2)
            .setTangent(0)
            .splineToLinearHeading(new Pose2d(60, -8, -Math.PI / 2),Math.toRadians(-90))
                            //.splineTo(new Vector2d(48, 48), Math.PI / 2)
                           // .splineTo(new Vector2d(65,-13),0)

                    //.lineToXConstantHeading(5)
            .build());
        }
    }