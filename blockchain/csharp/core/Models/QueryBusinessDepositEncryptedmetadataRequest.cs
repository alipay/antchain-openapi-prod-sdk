// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryBusinessDepositEncryptedmetadataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链的业务id
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 发起者的did身份
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 存证的唯一主键key_id
        [NameInMap("key_id")]
        [Validation(Required=true)]
        public string KeyId { get; set; }

        // 被存证的交易txHash，若不传则默认key_id最近的交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

    }

}
