// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 链接信息
    public class LinkDTO : TeaModel {
        // demo工程
        [NameInMap("demo_project")]
        [Validation(Required=true)]
        public string DemoProject { get; set; }

        // 产品文档
        [NameInMap("product_doc")]
        [Validation(Required=true)]
        public string ProductDoc { get; set; }

        // 快速开始文档
        [NameInMap("quick_start")]
        [Validation(Required=true)]
        public string QuickStart { get; set; }

    }

}
