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
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("event_type")]
        [Validation(Required=true)]
        public string EventType { get; set; }

        // 驾驶事件的结束时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1736152040551</para>
        /// </summary>
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

        // 驾驶事件发生地点的经度坐标
        /// <summary>
        /// <b>Example:</b>
        /// <para>121.4737</para>
        /// </summary>
        [NameInMap("lng")]
        [Validation(Required=true)]
        public string Lng { get; set; }

        // 驾驶事件发生地点的纬度坐标
        /// <summary>
        /// <b>Example:</b>
        /// <para>31.2304</para>
        /// </summary>
        [NameInMap("lat")]
        [Validation(Required=true)]
        public string Lat { get; set; }

        // 驾驶事件开始的速度
        /// <summary>
        /// <b>Example:</b>
        /// <para>60</para>
        /// </summary>
        [NameInMap("start_speed")]
        [Validation(Required=false)]
        public string StartSpeed { get; set; }

        // 驾驶事件结束时的速度
        /// <summary>
        /// <b>Example:</b>
        /// <para>45</para>
        /// </summary>
        [NameInMap("end_speed")]
        [Validation(Required=false)]
        public string EndSpeed { get; set; }

        // 驾驶过程中的平均速度
        /// <summary>
        /// <b>Example:</b>
        /// <para>52.5</para>
        /// </summary>
        [NameInMap("average_speed")]
        [Validation(Required=false)]
        public string AverageSpeed { get; set; }

        // 驾驶过程中车辆的转弯角度
        /// <summary>
        /// <b>Example:</b>
        /// <para>90</para>
        /// </summary>
        [NameInMap("turning_angle")]
        [Validation(Required=false)]
        public string TurningAngle { get; set; }

        // 驾驶事件的持续时间（以秒为单位)
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("duration")]
        [Validation(Required=false)]
        public string Duration { get; set; }

    }

}
