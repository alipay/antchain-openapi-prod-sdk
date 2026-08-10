// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 车辆资产验证旗舰版车辆信息
    public class CarInfo : TeaModel {
        // 是否高频使用，格式：YES/NO
        /// <summary>
        /// <b>Example:</b>
        /// <para>YES</para>
        /// </summary>
        [NameInMap("high_frequency")]
        [Validation(Required=false)]
        public string HighFrequency { get; set; }

        // 车辆价值区间，格式：1，2，3...
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // 车辆类型，格式：1，2，3
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 登记时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("time")]
        [Validation(Required=false)]
        public string Time { get; set; }

    }

}
