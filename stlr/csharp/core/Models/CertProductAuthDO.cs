// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 证书授权产品信息
    public class CertProductAuthDO : TeaModel {
        // 三方平台产品ID
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 三方平台产品名称
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

    }

}
