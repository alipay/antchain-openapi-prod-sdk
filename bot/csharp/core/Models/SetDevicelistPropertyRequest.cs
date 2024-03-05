// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class SetDevicelistPropertyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备did列表
        [NameInMap("device_did_list")]
        [Validation(Required=true)]
        public List<string> DeviceDidList { get; set; }

        // json格式属性信息，由标识符与属性值（key:value）构成，多个属性用英文逗号隔开。
        [NameInMap("property")]
        [Validation(Required=true)]
        public string Property { get; set; }

        // 签名，用预置秘钥进行签名，只对deviceDidList加签
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

    }

}
