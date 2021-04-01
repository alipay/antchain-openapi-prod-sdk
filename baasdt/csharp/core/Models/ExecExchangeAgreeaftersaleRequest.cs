// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ExecExchangeAgreeaftersaleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链id
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 要代理操作的租户ID
        [NameInMap("delegated_tenant_id")]
        [Validation(Required=false)]
        public string DelegatedTenantId { get; set; }

        // 权益id
        [NameInMap("equity_id")]
        [Validation(Required=true)]
        public string EquityId { get; set; }

        // 额外信息
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

        // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
        [NameInMap("origin_tx_id")]
        [Validation(Required=true)]
        public string OriginTxId { get; set; }

        // 外部交易ID
        [NameInMap("out_tx_id")]
        [Validation(Required=true)]
        public string OutTxId { get; set; }

    }

}
