// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备信息
    public class DeviceInfos : TeaModel {
        // tuid
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("tuid")]
        [Validation(Required=false)]
        public string Tuid { get; set; }

        // 设备状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>online</para>
        /// </summary>
        [NameInMap("device_status")]
        [Validation(Required=false)]
        public string DeviceStatus { get; set; }

        // ota version
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("device_ota_version")]
        [Validation(Required=false)]
        public string DeviceOtaVersion { get; set; }

    }

}
