// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 车辆gps轨迹点
    public class SimCarLocationInfo : TeaModel {
        // 定位时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2025-12-26 17:07:00</para>
        /// </summary>
        [NameInMap("location_time")]
        [Validation(Required=true)]
        public string LocationTime { get; set; }

        // 经度
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("longitude")]
        [Validation(Required=true)]
        public string Longitude { get; set; }

        // 纬度
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("latitude")]
        [Validation(Required=true)]
        public string Latitude { get; set; }

    }

}
