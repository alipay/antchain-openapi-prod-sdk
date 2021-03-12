// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryBusinessDepositRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务链对应的bizId    
        // 
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 用户did身份
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 存证数据业务逻辑id
        [NameInMap("key_id")]
        [Validation(Required=true)]
        public string KeyId { get; set; }

        // 存证数据对应的链上交易哈希，若无则返回最新的交易哈希。
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

    }

}
