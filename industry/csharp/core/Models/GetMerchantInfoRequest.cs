// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INDUSTRY.Models
{
    public class GetMerchantInfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // source, 由中台为业务方分配, 标识业务来源
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 行业商户支付宝uid，跟merchant_tenant_name不能同时为空
        [NameInMap("merchant_user_id")]
        [Validation(Required=false)]
        public string MerchantUserId { get; set; }

        // 行业商户租户名称， 跟merchant_user_id不能同时为空
        [NameInMap("merchant_tenant_name")]
        [Validation(Required=false)]
        public string MerchantTenantName { get; set; }

    }

}
