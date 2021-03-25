// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ExecCouponBindRequest : TeaModel {
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

        // 用户脱敏ID
        [NameInMap("desensitized_uid")]
        [Validation(Required=false)]
        public string DesensitizedUid { get; set; }

        // 绑定的持有者信息
        [NameInMap("holder_user_account")]
        [Validation(Required=false)]
        public string HolderUserAccount { get; set; }

        // 交易幂等ID
        [NameInMap("out_tx_id")]
        [Validation(Required=true)]
        public string OutTxId { get; set; }

        // 电子券公钥对应的私钥，对 couponId||outTxId 的签名
        [NameInMap("public_key_sign")]
        [Validation(Required=true)]
        public string PublicKeySign { get; set; }

        // 用户公钥对应的私钥，对 outTxId 的签名
        [NameInMap("uid_public_key_sign")]
        [Validation(Required=false)]
        public string UidPublicKeySign { get; set; }

    }

}
