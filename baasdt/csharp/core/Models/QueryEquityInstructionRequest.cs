// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryEquityInstructionRequest : TeaModel {
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

        // 代理该租户调用接口，会使用该租户发送交易链上查询信息
        [NameInMap("delegated_tenant_id")]
        [Validation(Required=false)]
        public string DelegatedTenantId { get; set; }

        // 权益商品ID
        [NameInMap("equity_id")]
        [Validation(Required=true)]
        public string EquityId { get; set; }

        // 发起操作的租户ID
        [NameInMap("opt_tenant_id")]
        [Validation(Required=true)]
        public string OptTenantId { get; set; }

        // 要查询的流水交易号
        [NameInMap("origin_tx_id")]
        [Validation(Required=true)]
        public string OriginTxId { get; set; }

    }

}
