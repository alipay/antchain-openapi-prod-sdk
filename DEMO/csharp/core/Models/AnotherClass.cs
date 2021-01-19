// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 另一个Demo类
    public class AnotherClass : TeaModel {
        // 测试字段
        [NameInMap("bar")]
        [Validation(Required=false)]
        public string Bar { get; set; }

        // 引用字段
        [NameInMap("ref")]
        [Validation(Required=false)]
        public DemoClass Ref { get; set; }

        // 列表引用Struct
        [NameInMap("refList")]
        [Validation(Required=false)]
        public List<DemoClass> RefList { get; set; }

    }

}
