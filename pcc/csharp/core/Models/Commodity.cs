// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    // 商品结构
    public class Commodity : TeaModel {
        // 商品编码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 商品名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 商品状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
