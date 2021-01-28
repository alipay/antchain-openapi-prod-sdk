// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 核验结果
    public class NotaryCheckResult : TeaModel {
        // 存证所在区块高度
        [NameInMap("block_height")]
        [Validation(Required=true)]
        public long? BlockHeight { get; set; }

        // 核验结果错误码
        [NameInMap("error_code")]
        [Validation(Required=true)]
        public long? ErrorCode { get; set; }

        // 错误信息
        [NameInMap("error_message")]
        [Validation(Required=true)]
        public string ErrorMessage { get; set; }

        // 存证时间
        [NameInMap("notary_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string NotaryTime { get; set; }

        // 存证类型
        [NameInMap("notary_type")]
        [Validation(Required=true)]
        public string NotaryType { get; set; }

        // 核验是否成功
        [NameInMap("result")]
        [Validation(Required=true)]
        public bool? Result { get; set; }

        // 存证事务ID
        [NameInMap("transaction_id")]
        [Validation(Required=true)]
        public string TransactionId { get; set; }

        // 交易哈希
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 区块哈希
        [NameInMap("block_hash")]
        [Validation(Required=true)]
        public string BlockHash { get; set; }

        // 存证阶段
        [NameInMap("phase")]
        [Validation(Required=true)]
        public string Phase { get; set; }

    }

}
