// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryTxtransactionChaindataResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 请求结果
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 区块hash
        [NameInMap("block_hash")]
        [Validation(Required=false)]
        public string BlockHash { get; set; }

        // 父区块hash
        [NameInMap("parent_block_hash")]
        [Validation(Required=false)]
        public string ParentBlockHash { get; set; }

        // 交易时间戳
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public string Timestamp { get; set; }

        // 该交易所能消耗的最大gas
        [NameInMap("gas")]
        [Validation(Required=false)]
        public long? Gas { get; set; }

        // 交易发起方账户
        [NameInMap("from")]
        [Validation(Required=false)]
        public string From { get; set; }

        // 交易接收方账户
        [NameInMap("to")]
        [Validation(Required=false)]
        public string To { get; set; }

        // 交易类型
        [NameInMap("tx_type")]
        [Validation(Required=false)]
        public string TxType { get; set; }

        // 交易返回的数据
        [NameInMap("data")]
        [Validation(Required=false)]
        public QueryChainDataTransactionResultData Data { get; set; }

    }

}
