// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 设备发电量
    public class DeviceGeneration : TeaModel {
        // 设备内部编号，注册设备后获取
        [NameInMap("device_no")]
        [Validation(Required=true)]
        public string DeviceNo { get; set; }

        // 逆变器发电量列表
        [NameInMap("inverter_generations")]
        [Validation(Required=true)]
        public List<InverterGeneration> InverterGenerations { get; set; }

    }

}
