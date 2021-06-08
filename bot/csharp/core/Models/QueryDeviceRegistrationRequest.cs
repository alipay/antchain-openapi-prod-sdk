// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryDeviceRegistrationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备Id，由接入方提供，场景内唯一
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 场景号
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 可信根派生公钥
        [NameInMap("device_public_key")]
        [Validation(Required=true)]
        public string DevicePublicKey { get; set; }

    }

}
