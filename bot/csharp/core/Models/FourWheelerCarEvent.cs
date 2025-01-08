// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 四轮车驾驶事件
    public class FourWheelerCarEvent : TeaModel {
        // 驾驶事件的类型，如正常驾驶、碰撞、急转弯、启动熄火等。
        [NameInMap("event_type")]
        [Validation(Required=true)]
        public string EventType { get; set; }

        // 驾驶事件的结束时间
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

        // 驾驶事件发生地点的经度坐标
        [NameInMap("lng")]
        [Validation(Required=true)]
        public string Lng { get; set; }

        // 驾驶事件发生地点的纬度坐标
        [NameInMap("lat")]
        [Validation(Required=true)]
        public string Lat { get; set; }

        // 驾驶事件开始的速度
        [NameInMap("start_speed")]
        [Validation(Required=false)]
        public string StartSpeed { get; set; }

        // 驾驶事件结束时的速度
        [NameInMap("end_speed")]
        [Validation(Required=false)]
        public string EndSpeed { get; set; }

        // 驾驶过程中的平均速度
        [NameInMap("average_speed")]
        [Validation(Required=false)]
        public string AverageSpeed { get; set; }

        // 驾驶过程中车辆的转弯角度
        [NameInMap("turning_angle")]
        [Validation(Required=false)]
        public string TurningAngle { get; set; }

        // 驾驶事件的持续时间（以秒为单位)
        [NameInMap("duration")]
        [Validation(Required=false)]
        public string Duration { get; set; }

    }

}
