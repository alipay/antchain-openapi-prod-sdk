// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 虚拟身份受信关系
    public class StsActorBinding : TeaModel {
        // 虚拟身份ID
        [NameInMap("actor_id")]
        [Validation(Required=false)]
        public string ActorId { get; set; }

        // 受信对象ID
        [NameInMap("bind_id")]
        [Validation(Required=false)]
        public string BindId { get; set; }

        // 虚拟身份受信类型，可以为TENANT或者ALIYUN_SERVICE
        [NameInMap("bind_type")]
        [Validation(Required=false)]
        public string BindType { get; set; }

    }

}
