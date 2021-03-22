// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ExecCouponSignRequest : TeaModel {
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

        // 电子券批次ID
        [NameInMap("collection_id")]
        [Validation(Required=true)]
        public string CollectionId { get; set; }

        // 电子券ID
        [NameInMap("coupon_id")]
        [Validation(Required=true)]
        public string CouponId { get; set; }

        // 脱敏用户ID
        [NameInMap("desensitized_uid")]
        [Validation(Required=true)]
        public string DesensitizedUid { get; set; }

        // 交易幂等ID
        [NameInMap("out_tx_id")]
        [Validation(Required=true)]
        public string OutTxId { get; set; }

        // 用户公钥
        [NameInMap("uid_public_key")]
        [Validation(Required=true)]
        public string UidPublicKey { get; set; }

    }

}
