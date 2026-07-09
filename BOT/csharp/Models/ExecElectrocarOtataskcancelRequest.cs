// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ExecElectrocarOtataskcancelRequest : TeaModel {
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

        // OTA 执行通道：TUYA_4G / EKYT_BLE / IOT_AGENT_BLE。
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // OTA 批次 ID；4G 通道为 Hub jobId，本地通道为本地批次主键字符串。
        [NameInMap("job_id")]
        [Validation(Required=true)]
        public string JobId { get; set; }

        // 固件包 ID；4G 通道取消时用于透传 Hub，本地通道用于进一步限定目标任务。
        [NameInMap("firmware_id")]
        [Validation(Required=true)]
        public string FirmwareId { get; set; }

        // 取消原因，不传时本地通道默认记录为用户取消
        [NameInMap("cancel_reason")]
        [Validation(Required=false)]
        public string CancelReason { get; set; }

    }

}
