// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class DeleteStsActorRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 虚拟身份ID，与虚拟身份名称两个参数二选一传入
        [NameInMap("actor_id")]
        [Validation(Required=false)]
        public string ActorId { get; set; }

        // 虚拟身份名称，与虚拟身份名称两个参数二选一传入
        [NameInMap("actor_name")]
        [Validation(Required=false)]
        public string ActorName { get; set; }

    }

}
