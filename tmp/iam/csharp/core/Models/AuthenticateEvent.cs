// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 鉴权事件（蚂蚁侧）
    public class AuthenticateEvent : TeaModel {
        // 鉴权操作列表
        [NameInMap("actions")]
        [Validation(Required=true)]
        public List<string> Actions { get; set; }

        // 鉴权对象ID
        [NameInMap("actor_id")]
        [Validation(Required=true)]
        public string ActorId { get; set; }

        // 鉴权条件
        [NameInMap("conditions")]
        [Validation(Required=false)]
        public List<Condition> Conditions { get; set; }

        // 唯一ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
