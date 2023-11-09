// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2abe765c32934341bd9bb6cc1c8ff589.Models
{
    public class SyncAntchainAtoFundWithholdingcontractRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单号
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 商家在数科注册的租户id
        [NameInMap("merchant_tenant_id")]
        [Validation(Required=true, MaxLength=50)]
        public string MerchantTenantId { get; set; }

        // 代扣协议号
        [NameInMap("withholding_contract_id")]
        [Validation(Required=true, MaxLength=100)]
        public string WithholdingContractId { get; set; }

        // json的字符串，存储额外信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 签署状态：
        // - ACCEPT : 接受
        // - REFUSE : 拒绝
        // - TIMEOUT : 超时
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
