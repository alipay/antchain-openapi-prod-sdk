// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 虚拟身份
    public class StsActor : TeaModel {
        // 虚拟身份受信关系集合，通常只包含一个
        [NameInMap("bindings")]
        [Validation(Required=true)]
        public List<StsActorBinding> Bindings { get; set; }

        // 针对虚拟身份的描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 虚拟身份名称，租户内唯一
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 虚拟身份所在租户
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

    }

}
