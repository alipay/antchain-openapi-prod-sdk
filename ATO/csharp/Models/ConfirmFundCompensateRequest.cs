// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class ConfirmFundCompensateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资方社会统一信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true)]
        public string FundId { get; set; }

        // 商户租户id
        [NameInMap("merchant_tenant_id")]
        [Validation(Required=true)]
        public string MerchantTenantId { get; set; }

        // 商户社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 签约串类型 
        // TRANSFER:转账代偿签约串 
        // WITHHOLD:代扣代偿签约串
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
