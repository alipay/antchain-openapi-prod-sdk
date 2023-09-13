// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    // 权限点
    public class Action : TeaModel {
        // 权限点ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 权限点名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

    }

}
