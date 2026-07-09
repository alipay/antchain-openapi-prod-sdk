// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ExecElectrocarOtataskretryRequest : TeaModel {
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

        // OTA 执行通道：TUYA_4G / EKYT_BLE / IOT_AGENT_BLE
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // OTA 批次 ID；4G 通道重试时需要透传 Hub
        [NameInMap("job_id")]
        [Validation(Required=true)]
        public string JobId { get; set; }

        // OTA 任务 ID；4G 通道为 Hub taskId，本地通道为本地任务主键字符串
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // BLE 分包大小，单位 B
        [NameInMap("trans_size")]
        [Validation(Required=true)]
        public long? TransSize { get; set; }

    }

}
