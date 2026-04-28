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
        [NameInMap("tuid")]
        [Validation(Required=false)]
        public string Tuid { get; set; }

        // 设备状态
        [NameInMap("device_status")]
        [Validation(Required=false)]
        public string DeviceStatus { get; set; }

        // ota version
        [NameInMap("device_ota_version")]
        [Validation(Required=false)]
        public string DeviceOtaVersion { get; set; }

    }

}
