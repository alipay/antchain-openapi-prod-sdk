// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    // 角色
    public class Role : TeaModel {
        // 角色ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 角色名称
        // 
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 角色类型，CUSTOM:自定义角色，COMMON:系统通用角色
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 角色描述
        // 
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 所有者
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

    }

}
