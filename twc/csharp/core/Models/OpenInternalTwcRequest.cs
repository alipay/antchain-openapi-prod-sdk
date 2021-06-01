// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class OpenInternalTwcRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权开通的租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 授权开通的产品码
        [NameInMap("product")]
        [Validation(Required=true)]
        public string Product { get; set; }

        // 授权开通的行业类型（版权/租赁）
        [NameInMap("customer_biz_id")]
        [Validation(Required=true)]
        public string CustomerBizId { get; set; }

        // 授权码
        [NameInMap("auth_code")]
        [Validation(Required=true)]
        public string AuthCode { get; set; }

    }

}
