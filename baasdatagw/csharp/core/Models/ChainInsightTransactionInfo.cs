// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 链上交易基础信息
    public class ChainInsightTransactionInfo : TeaModel {
        // 交易ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 交易类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 交易发起者
        [NameInMap("from")]
        [Validation(Required=false)]
        public string From { get; set; }

        // 交易接收者
        [NameInMap("to")]
        [Validation(Required=false)]
        public string To { get; set; }

        // 交易成块高度
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // 交易成块时间，毫秒时间戳
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public long? Timestamp { get; set; }

        // 合约中 ABI 的状态  (无需上传) none / （可以上传）pending / （可以更新）uploaded
        [NameInMap("abi_status")]
        [Validation(Required=false)]
        public string AbiStatus { get; set; }

    }

}
