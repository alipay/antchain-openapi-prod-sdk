// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class CreateMerchantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链ID
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 商户描述，不超过2048
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 商户的资金管理员 归属的租户ID
        [NameInMap("fund_manager_tenant_id")]
        [Validation(Required=true)]
        public string FundManagerTenantId { get; set; }

        // 商户角色，是否是资产发行商
        [NameInMap("if_asset_issuer")]
        [Validation(Required=true)]
        public bool? IfAssetIssuer { get; set; }

        // 商户角色，是否是采购商
        [NameInMap("if_equity_consumer")]
        [Validation(Required=true)]
        public bool? IfEquityConsumer { get; set; }

        // 商户角色，是否是供应商
        [NameInMap("if_equity_provider")]
        [Validation(Required=true)]
        public bool? IfEquityProvider { get; set; }

        // 商户归属的租户ID
        [NameInMap("opt_tenant_id")]
        [Validation(Required=true)]
        public string OptTenantId { get; set; }

        // 外部交易ID（确保幂等）
        [NameInMap("out_tx_id")]
        [Validation(Required=true)]
        public string OutTxId { get; set; }

    }

}
