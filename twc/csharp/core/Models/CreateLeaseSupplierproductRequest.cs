// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseSupplierproductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 系统来源
        [NameInMap("origin")]
        [Validation(Required=true)]
        public string Origin { get; set; }

        // 采购商品信息
        [NameInMap("product_info")]
        [Validation(Required=true)]
        public SupplierProductItem ProductInfo { get; set; }

        // 本阶段额外信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
