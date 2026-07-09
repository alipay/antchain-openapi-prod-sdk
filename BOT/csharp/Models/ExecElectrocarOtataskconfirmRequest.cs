// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ExecElectrocarOtataskconfirmRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备定位信息
        [NameInMap("device_locator")]
        [Validation(Required=true)]
        public DeviceLocator DeviceLocator { get; set; }

        // OTA 执行通道
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // OTA 任务 ID
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // BLE 分包大小
        [NameInMap("trans_size")]
        [Validation(Required=false)]
        public long? TransSize { get; set; }

    }

}
