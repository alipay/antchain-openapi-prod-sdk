// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ExecMypointsOrderskuRequest : TeaModel {
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

        // 环境标识
        [NameInMap("env")]
        [Validation(Required=true)]
        public string Env { get; set; }

        // 业务幂等号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 手机号
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

        // 预下单号
        [NameInMap("pre_order_id")]
        [Validation(Required=true)]
        public string PreOrderId { get; set; }

        // 商品ID
        [NameInMap("sku_id")]
        [Validation(Required=true)]
        public string SkuId { get; set; }

    }

}
