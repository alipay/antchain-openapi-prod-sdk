// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    // 商品信息
    public class ProudctInfo : TeaModel {
        // 商品名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 商品图片链接列表
        [NameInMap("proudct_images")]
        [Validation(Required=false)]
        public List<string> ProudctImages { get; set; }

    }

}
