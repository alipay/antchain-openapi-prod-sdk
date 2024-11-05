// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ASSET.Models
{
    public class QuerySupplierMonthwriteofffileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 云站租户 id
        [NameInMap("cloud_tenant_id")]
        [Validation(Required=true)]
        public string CloudTenantId { get; set; }

        // 请求唯一id	
        // 
        [NameInMap("request_unique_id")]
        [Validation(Required=false)]
        public string RequestUniqueId { get; set; }

        // 202408
        [NameInMap("billing_month")]
        [Validation(Required=false)]
        public string BillingMonth { get; set; }

    }

}
