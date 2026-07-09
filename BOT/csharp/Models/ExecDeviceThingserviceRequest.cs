// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ExecDeviceThingserviceRequest : TeaModel {
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

        // 签名
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

        // 服务调用标识符
        [NameInMap("service_identifier")]
        [Validation(Required=true)]
        public string ServiceIdentifier { get; set; }

        // 服务调用参数
        // key-value，json字符串
        [NameInMap("service_args")]
        [Validation(Required=false)]
        public string ServiceArgs { get; set; }

    }

}
