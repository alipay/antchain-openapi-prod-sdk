// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 农民工考勤
    public class WorkersCheckAttendance : TeaModel {
        // 考勤类型  [1.入场 2.退场]
        [NameInMap("attendance_type")]
        [Validation(Required=true)]
        public string AttendanceType { get; set; }

        // 打卡时间
        [NameInMap("clock_in_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ClockInTime { get; set; }

    }

}
