// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 基线扫描框架
    public class Framework : TeaModel {
        // 策略id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 框架名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 是否启用
        [NameInMap("enable")]
        [Validation(Required=false)]
        public bool? Enable { get; set; }

        // 描述
        [NameInMap("describe")]
        [Validation(Required=false)]
        public string Describe { get; set; }

    }

}
