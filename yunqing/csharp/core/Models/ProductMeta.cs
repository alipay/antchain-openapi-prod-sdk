// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 产品元信息
    public class ProductMeta : TeaModel {
        // 产品code
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 产品名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 产品标签
        [NameInMap("labels")]
        [Validation(Required=false)]
        public List<string> Labels { get; set; }

        // 产品版本
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

        // 所属产品集
        [NameInMap("group")]
        [Validation(Required=false)]
        public string Group { get; set; }

    }

}
