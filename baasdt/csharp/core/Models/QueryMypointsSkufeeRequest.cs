// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryMypointsSkufeeRequest : TeaModel {
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

        // 预下单数量
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

        // 环境标识(sandbox/prod)
        [NameInMap("env")]
        [Validation(Required=true)]
        public string Env { get; set; }

        // 备注信息
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

        // 业务幂等号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 商品ID
        [NameInMap("sku_id")]
        [Validation(Required=true)]
        public string SkuId { get; set; }

    }

}
