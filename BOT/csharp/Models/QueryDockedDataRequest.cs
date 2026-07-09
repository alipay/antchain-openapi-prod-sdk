// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryDockedDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 1. 已对接的接口名 ; 
        // 2. docked_method可通过 实例化SDK中的Request模型后获取，例如：
        // String dockedMethod = new CreateDeviceDatamodelRequest().getMethod();
        [NameInMap("docked_method")]
        [Validation(Required=true)]
        public string DockedMethod { get; set; }

        // 关键key为chainDeviceId 时不填
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 1. 接口中的关键key ，例如 deviceId ；
        // 2. key为chainDeviceId时，scene字段不填
        // 
        [NameInMap("key")]
        [Validation(Required=false)]
        public List<string> Key { get; set; }

    }

}
