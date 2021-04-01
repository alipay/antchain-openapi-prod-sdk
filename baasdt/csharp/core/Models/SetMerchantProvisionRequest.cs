// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class SetMerchantProvisionRequest : TeaModel {
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

        // 新的授信上限（单位：元）
        [NameInMap("credit_max_amount")]
        [Validation(Required=false)]
        public string CreditMaxAmount { get; set; }

        // 新的授信已使用数额（单位：元）
        [NameInMap("credit_used_amount")]
        [Validation(Required=false)]
        public string CreditUsedAmount { get; set; }

        // 币种
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 新的备付金余额（单位：元）
        [NameInMap("debit_amount")]
        [Validation(Required=false)]
        public string DebitAmount { get; set; }

        // 要设置备付金的商户租户ID
        [NameInMap("opt_tenant_id")]
        [Validation(Required=true)]
        public string OptTenantId { get; set; }

        // 初始的授信上限（单位：元）
        [NameInMap("original_credit_max_amount")]
        [Validation(Required=false)]
        public string OriginalCreditMaxAmount { get; set; }

        // 初始的授信已使用数额（单位：元）
        [NameInMap("original_credit_used_amount")]
        [Validation(Required=false)]
        public string OriginalCreditUsedAmount { get; set; }

        // 初始的备付金余额（单位：元）
        [NameInMap("original_debit_amount")]
        [Validation(Required=false)]
        public string OriginalDebitAmount { get; set; }

        // 外部交易ID（确保幂等）
        [NameInMap("out_tx_id")]
        [Validation(Required=true)]
        public string OutTxId { get; set; }

    }

}
