// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class UpdateEquityExchangelimitRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链ID
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 代理操作专用，要代理操作的租户ID
        [NameInMap("delegated_tenant_id")]
        [Validation(Required=false)]
        public string DelegatedTenantId { get; set; }

        // 权益商品ID
        [NameInMap("equity_id")]
        [Validation(Required=true)]
        public string EquityId { get; set; }

        // 商户每日兑换上限
        [NameInMap("limit_per_merchant_and_day")]
        [Validation(Required=false)]
        public long? LimitPerMerchantAndDay { get; set; }

        // 商户每月兑换上限
        [NameInMap("limit_per_merchant_and_montn")]
        [Validation(Required=false)]
        public long? LimitPerMerchantAndMontn { get; set; }

        // 用户每日兑换上限
        [NameInMap("limit_per_user_and_day")]
        [Validation(Required=false)]
        public long? LimitPerUserAndDay { get; set; }

        // 用户每月兑换上限
        [NameInMap("limit_per_user_and_month")]
        [Validation(Required=false)]
        public long? LimitPerUserAndMonth { get; set; }

        // 外部交易ID
        [NameInMap("out_tx_id")]
        [Validation(Required=true)]
        public string OutTxId { get; set; }

    }

}
