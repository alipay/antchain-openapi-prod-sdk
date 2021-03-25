// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryBlockanalysisTransactionResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 区块高度
        [NameInMap("block_number")]
        [Validation(Required=false)]
        public long? BlockNumber { get; set; }

        // 交易数据，hex格式
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // 交易发起方
        [NameInMap("from")]
        [Validation(Required=false)]
        public string From { get; set; }

        // 交易单据信息
        [NameInMap("receipt")]
        [Validation(Required=false)]
        public BlockReceipt Receipt { get; set; }

        // 交易时间戳
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public string Timestamp { get; set; }

        // 交易接收方
        [NameInMap("to")]
        [Validation(Required=false)]
        public string To { get; set; }

        // 交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 交易类型
        [NameInMap("tx_type")]
        [Validation(Required=false)]
        public long? TxType { get; set; }

    }

}
