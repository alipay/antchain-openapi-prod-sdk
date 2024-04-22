// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ExecThingServiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 服务标识
        [NameInMap("identifier")]
        [Validation(Required=true)]
        public string Identifier { get; set; }

        // 可信设备唯一ID
        [NameInMap("trustiot_entity_id")]
        [Validation(Required=false)]
        public long? TrustiotEntityId { get; set; }

        // 设备编号/资产ID
        [NameInMap("device_id")]
        [Validation(Required=false)]
        public string DeviceId { get; set; }

        // 物模型服务入参
        [NameInMap("input_data")]
        [Validation(Required=true)]
        public string InputData { get; set; }

    }

}
