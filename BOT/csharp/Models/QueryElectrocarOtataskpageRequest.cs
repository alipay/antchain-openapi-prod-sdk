// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryElectrocarOtataskpageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 当前页码
        [NameInMap("current")]
        [Validation(Required=true)]
        public long? Current { get; set; }

        // 每页显示条数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 可信物联产品唯一标识
        [NameInMap("trust_product_key")]
        [Validation(Required=true)]
        public string TrustProductKey { get; set; }

        // OTA任务id
        [NameInMap("job_id")]
        [Validation(Required=true)]
        public string JobId { get; set; }

        // OTA固件id
        [NameInMap("firmware_id")]
        [Validation(Required=false)]
        public string FirmwareId { get; set; }

        // 任务状态：CONFIRM, QUEUED, NOTIFIED, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED
        [NameInMap("task_status")]
        [Validation(Required=false)]
        public string TaskStatus { get; set; }

        // 设备名称列表
        [NameInMap("device_names")]
        [Validation(Required=false)]
        public List<string> DeviceNames { get; set; }

    }

}
