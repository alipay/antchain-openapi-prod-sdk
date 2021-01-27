// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 操作点
    public class Action : TeaModel {
        // 操作点描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 操作点ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 操作点名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
