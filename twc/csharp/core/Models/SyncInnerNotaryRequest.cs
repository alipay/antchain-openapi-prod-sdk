// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class SyncInnerNotaryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // DB的存证id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 事务id
        [NameInMap("transaction_id")]
        [Validation(Required=true)]
        public string TransactionId { get; set; }

        // 交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 阶段
        [NameInMap("phase")]
        [Validation(Required=true)]
        public string Phase { get; set; }

        // 内容hash
        [NameInMap("content_hash")]
        [Validation(Required=true)]
        public string ContentHash { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 存证类型
        [NameInMap("notary_type")]
        [Validation(Required=true)]
        public string NotaryType { get; set; }

        // 大小
        [NameInMap("notary_size")]
        [Validation(Required=false)]
        public long? NotarySize { get; set; }

        // 用户id
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

        // 是否需要可信时间
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public bool? Tsr { get; set; }

    }

}
