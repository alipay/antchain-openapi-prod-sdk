// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 动态资源的属性
    public class Attribute : TeaModel {
        // 属性名
        [NameInMap("attribute_name")]
        [Validation(Required=false)]
        public string AttributeName { get; set; }

        // 属性描述
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
