// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class ApplyAidashboardDeviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // ai仪表产品key
        [NameInMap("product_key")]
        [Validation(Required=true)]
        public string ProductKey { get; set; }

        // 设备公钥
        [NameInMap("device_pub_key")]
        [Validation(Required=true)]
        public string DevicePubKey { get; set; }

        // 设备序列号
        [NameInMap("sn")]
        [Validation(Required=true)]
        public string Sn { get; set; }

    }

}
