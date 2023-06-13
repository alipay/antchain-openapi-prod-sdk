// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class SyncIotbasicDevicestatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备did
        [NameInMap("device_did")]
        [Validation(Required=true)]
        public string DeviceDid { get; set; }

        // 设备状态
        [NameInMap("device_status")]
        [Validation(Required=false)]
        public string DeviceStatus { get; set; }

        // 设备签名
        [NameInMap("device_signature")]
        [Validation(Required=true)]
        public string DeviceSignature { get; set; }

        // 业务状态
        [NameInMap("biz_status_info")]
        [Validation(Required=false)]
        public BizStatusInfoOp BizStatusInfo { get; set; }

    }

}
