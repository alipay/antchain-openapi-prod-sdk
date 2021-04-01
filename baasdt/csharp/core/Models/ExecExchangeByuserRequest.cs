// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ExecExchangeByuserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资产ID
        [NameInMap("asset_id")]
        [Validation(Required=true)]
        public string AssetId { get; set; }

        // 资产发行方
        [NameInMap("asset_issuer")]
        [Validation(Required=true)]
        public string AssetIssuer { get; set; }

        // 期望资产汇率
        [NameInMap("asset_rate")]
        [Validation(Required=true)]
        public string AssetRate { get; set; }

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

        // 权益商品提供方ID
        [NameInMap("equity_provider")]
        [Validation(Required=true)]
        public string EquityProvider { get; set; }

        // 期望权益汇率
        [NameInMap("equity_rate")]
        [Validation(Required=true)]
        public string EquityRate { get; set; }

        // 兑换时必要信息，敏感信息需加密。兑换时必要的信息，敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

        // 外部交易ID
        [NameInMap("out_tx_id")]
        [Validation(Required=true)]
        public string OutTxId { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
