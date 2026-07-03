// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 部标数据查询接口中返回的聚合统计指标结构体
    public class JtExtraData : TeaModel {
        // 查询的时间范围内的行驶总里程
        /// <summary>
        /// <b>Example:</b>
        /// <para>312</para>
        /// </summary>
        [NameInMap("delta_mileage")]
        [Validation(Required=true)]
        public long? DeltaMileage { get; set; }

        // 最大车速
        /// <summary>
        /// <b>Example:</b>
        /// <para>60</para>
        /// </summary>
        [NameInMap("max_speed")]
        [Validation(Required=true)]
        public long? MaxSpeed { get; set; }

        // 平均车速
        /// <summary>
        /// <b>Example:</b>
        /// <para>60</para>
        /// </summary>
        [NameInMap("avg_speed")]
        [Validation(Required=true)]
        public long? AvgSpeed { get; set; }

    }

}
