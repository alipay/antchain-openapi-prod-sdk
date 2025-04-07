// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 行程详情
    public class TripTrace : TeaModel {
        // 定位数据
        [NameInMap("device_location")]
        [Validation(Required=true)]
        public string DeviceLocation { get; set; }

    }

}
