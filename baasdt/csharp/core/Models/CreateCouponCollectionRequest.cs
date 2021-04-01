// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class CreateCouponCollectionRequest : TeaModel {
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

        // 批次ID
        [NameInMap("collection_id")]
        [Validation(Required=true)]
        public string CollectionId { get; set; }

        // 电子券前缀
        [NameInMap("coupon_number_prefix")]
        [Validation(Required=true)]
        public string CouponNumberPrefix { get; set; }

        // 批次创建者
        [NameInMap("issuer")]
        [Validation(Required=true)]
        public string Issuer { get; set; }

        // 批次名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 是否创建时就记名
        [NameInMap("need_pre_registered")]
        [Validation(Required=true)]
        public bool? NeedPreRegistered { get; set; }

        // 是否记名电子券
        [NameInMap("need_registered")]
        [Validation(Required=true)]
        public bool? NeedRegistered { get; set; }

        // 交易幂等ID
        [NameInMap("out_tx_id")]
        [Validation(Required=true)]
        public string OutTxId { get; set; }

    }

}
