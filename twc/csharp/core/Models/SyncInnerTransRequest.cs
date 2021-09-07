// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class SyncInnerTransRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 事务id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 存证事务id
        [NameInMap("transaction_id")]
        [Validation(Required=true)]
        public string TransactionId { get; set; }

        // 存证的用户id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 业务id
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public long? BizId { get; set; }

        // 子业务id
        [NameInMap("sub_biz_id")]
        [Validation(Required=false)]
        public string SubBizId { get; set; }

        // 存证主体的json字符串
        [NameInMap("customer")]
        [Validation(Required=false)]
        public string Customer { get; set; }

        // 存证初始化时间
        [NameInMap("register_time")]
        [Validation(Required=true)]
        public long? RegisterTime { get; set; }

        // 到期时间
        [NameInMap("expire_time")]
        [Validation(Required=false)]
        public long? ExpireTime { get; set; }

        // 扩展属性
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 是否有效
        [NameInMap("active")]
        [Validation(Required=false)]
        public bool? Active { get; set; }

        // 交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

    }

}
