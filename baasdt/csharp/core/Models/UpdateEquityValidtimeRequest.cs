// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class UpdateEquityValidtimeRequest : TeaModel {
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

        // 要代理的租户ID
        [NameInMap("delegated_tenant_id")]
        [Validation(Required=false)]
        public string DelegatedTenantId { get; set; }

        // 权益商品ID
        [NameInMap("equity_id")]
        [Validation(Required=true)]
        public string EquityId { get; set; }

        // 外部交易ID
        [NameInMap("out_tx_id")]
        [Validation(Required=true)]
        public string OutTxId { get; set; }

        // 权益商品使用有效期右闭区间
        [NameInMap("use_valid_not_after")]
        [Validation(Required=false)]
        public string UseValidNotAfter { get; set; }

        // 权益商品使用有效期左闭区间
        [NameInMap("use_valid_not_before")]
        [Validation(Required=false)]
        public string UseValidNotBefore { get; set; }

        // 权益商品兑换有效期右闭区间
        [NameInMap("valid_not_after")]
        [Validation(Required=false)]
        public string ValidNotAfter { get; set; }

        // 权益商品兑换有效期左闭区间
        [NameInMap("valid_not_before")]
        [Validation(Required=false)]
        public string ValidNotBefore { get; set; }

    }

}
