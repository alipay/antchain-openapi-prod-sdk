// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryBlockResponse : TeaModel {
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

        // 区块信息
        [NameInMap("block")]
        [Validation(Required=false)]
        public Block Block { get; set; }

        // 区块高度
        [NameInMap("block_number")]
        [Validation(Required=false)]
        public long? BlockNumber { get; set; }

        // 链ID
        [NameInMap("chain_id")]
        [Validation(Required=false)]
        public string ChainId { get; set; }

        // 过滤后的交易数量
        [NameInMap("filtered_tx_count")]
        [Validation(Required=false)]
        public long? FilteredTxCount { get; set; }

        // 区块中交易总数
        [NameInMap("total_tx_count")]
        [Validation(Required=false)]
        public long? TotalTxCount { get; set; }

    }

}
