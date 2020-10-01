package org.firstinspires.ftc.teamcode.Hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class RoboCop {

    public Motors motors;
    public HardwareMap hardwareMap;

    public RoboCop(HardwareMap hm) {

       hardwareMap = hm;

    motors= new Motors(
       hm.get(DcMotor.class, Config.left_back),
       hm.get(DcMotor.class, Config.left_front),
       hm.get(DcMotor.class, Config.right_back),
       hm.get(DcMotor.class, Config.right_front)
        );
    }

}
