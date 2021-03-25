// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryCommissionRequest : TeaModel {
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

        // 商品类型。可按照如下文档查询商品对应的类型，及数据格式https://tech.antfin.com/docs/2/163896
        [NameInMap("equity_type")]
        [Validation(Required=true)]
        public long? EquityType { get; set; }

        // 是否查询当前生效的手续费信息。如为false，则查询该商品的全部手续费信息
        [NameInMap("if_current")]
        [Validation(Required=true)]
        public bool? IfCurrent { get; set; }

        // 是否查询全局的手续费信息
        [NameInMap("if_global")]
        [Validation(Required=true)]
        public bool? IfGlobal { get; set; }

        // 查询该租户的手续费信息
        [NameInMap("delegated_tenant_id")]
        [Validation(Required=true)]
        public string DelegatedTenantId { get; set; }

    }

}
