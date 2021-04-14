// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class GetCourtTextnotaryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 地理位置信息
        [NameInMap("location")]
        [Validation(Required=false)]
        public Location Location { get; set; }

        // 存证阶段
        [NameInMap("phase")]
        [Validation(Required=false)]
        public string Phase { get; set; }

        // 扩展属性
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 存证事务ID
        [NameInMap("transaction_id")]
        [Validation(Required=false)]
        public string TransactionId { get; set; }

        // 交易哈希
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

    }

}
