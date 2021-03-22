// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class SetCommissionRequest : TeaModel {
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

        // 手续费列表，可传入多个
        [NameInMap("commissions")]
        [Validation(Required=true)]
        public List<Commission> Commissions { get; set; }

        // 商品类型。可按照如下文档查询商品对应的类型，及数据格式 https://tech.antfin.com/docs/2/163896
        [NameInMap("equity_type")]
        [Validation(Required=true)]
        public long? EquityType { get; set; }

        // 是否设置全局手续费。若是false，需传入optTenantId
        [NameInMap("if_global")]
        [Validation(Required=false)]
        public bool? IfGlobal { get; set; }

        // 要设置手续费的租户对象，如果为空表示设置全局手续费（IfGlobal需设置为true）
        [NameInMap("opt_tenant_id")]
        [Validation(Required=false)]
        public string OptTenantId { get; set; }

        // 交易幂等ID
        [NameInMap("out_tx_id")]
        [Validation(Required=true)]
        public string OutTxId { get; set; }

    }

}
