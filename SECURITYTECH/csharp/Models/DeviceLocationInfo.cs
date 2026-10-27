// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 设备定位信息
    public class DeviceLocationInfo : TeaModel {
        // 纬度
        /// <summary>
        /// <b>Example:</b>
        /// <para>30.288701</para>
        /// </summary>
        [NameInMap("lat")]
        [Validation(Required=true)]
        public string Lat { get; set; }

        // 经度
        /// <summary>
        /// <b>Example:</b>
        /// <para>120.160256</para>
        /// </summary>
        [NameInMap("lng")]
        [Validation(Required=true)]
        public string Lng { get; set; }

        // 最后一次定位上报时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-10-13 10:00:00</para>
        /// </summary>
        [NameInMap("location_time")]
        [Validation(Required=true)]
        public string LocationTime { get; set; }

        // 预留可扩展字段json
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
