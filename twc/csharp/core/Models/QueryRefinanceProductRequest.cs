// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryRefinanceProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资产包id
        [NameInMap("package_id")]
        [Validation(Required=true)]
        public string PackageId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 合约id
        [NameInMap("application_id")]
        [Validation(Required=true)]
        public string ApplicationId { get; set; }

        // 商品id
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 商品版本号
        [NameInMap("product_version")]
        [Validation(Required=true)]
        public string ProductVersion { get; set; }

    }

}
