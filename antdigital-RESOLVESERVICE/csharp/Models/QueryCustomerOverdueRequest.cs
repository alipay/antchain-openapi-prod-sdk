// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RESOLVESERVICE.Models
{
    public class QueryCustomerOverdueRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户号
        [NameInMap("customer_account")]
        [Validation(Required=true)]
        public string CustomerAccount { get; set; }

        // 产品类型
        [NameInMap("product_type")]
        [Validation(Required=true)]
        public string ProductType { get; set; }

    }

}
