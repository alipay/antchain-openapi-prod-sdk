// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class WorkersCheckAttendance extends TeaModel {
    // 考勤类型  [1.入场 2.退场]
    @NameInMap("attendance_type")
    @Validation(required = true)
    public String attendanceType;

    // 打卡时间
    @NameInMap("clock_in_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String clockInTime;

    public static WorkersCheckAttendance build(java.util.Map<String, ?> map) throws Exception {
        WorkersCheckAttendance self = new WorkersCheckAttendance();
        return TeaModel.build(map, self);
    }

    public WorkersCheckAttendance setAttendanceType(String attendanceType) {
        this.attendanceType = attendanceType;
        return this;
    }
    public String getAttendanceType() {
        return this.attendanceType;
    }

    public WorkersCheckAttendance setClockInTime(String clockInTime) {
        this.clockInTime = clockInTime;
        return this;
    }
    public String getClockInTime() {
        return this.clockInTime;
    }

}
