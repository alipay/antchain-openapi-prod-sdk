// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class CreateCouponListRequest : TeaModel {
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

        // 电子券创建参数列表
        [NameInMap("coupons")]
        [Validation(Required=true)]
        public List<CouponCreate> Coupons { get; set; }

        // 交易幂等ID
        [NameInMap("out_tx_id")]
        [Validation(Required=true)]
        public string OutTxId { get; set; }

    }

}
