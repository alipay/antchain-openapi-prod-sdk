// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInsureRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户的订单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 保险类型枚举，PERFORMANCE：履约
        [NameInMap("insure_product_type")]
        [Validation(Required=true)]
        public string InsureProductType { get; set; }

        // 保险公司枚举，PA：平安保险
        [NameInMap("insure_company_type")]
        [Validation(Required=true)]
        public string InsureCompanyType { get; set; }

    }

}
