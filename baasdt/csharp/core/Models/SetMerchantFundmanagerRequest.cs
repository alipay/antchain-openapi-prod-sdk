// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class SetMerchantFundmanagerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 外部交易ID
        [NameInMap("out_tx_id")]
        [Validation(Required=true)]
        public string OutTxId { get; set; }

        // 链ID
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 要进行资金管理员设置的租户ID
        [NameInMap("opt_tenant_id")]
        [Validation(Required=true)]
        public string OptTenantId { get; set; }

        // 资金管理员所属的租户ID
        [NameInMap("fund_manager_tenant_id")]
        [Validation(Required=true)]
        public string FundManagerTenantId { get; set; }

    }

}
