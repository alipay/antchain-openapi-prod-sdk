// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class StartEvidenceQueryResponse : TeaModel {
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

        // 交易在区块链所在块高度
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // API消耗时间（毫秒单位）
        [NameInMap("cost_millis")]
        [Validation(Required=false)]
        public long? CostMillis { get; set; }

        // 唯一ID，等于输入同名参数
        [NameInMap("nonce")]
        [Validation(Required=false)]
        public string Nonce { get; set; }

        // unix时间戳(毫秒单位)
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public long? Timestamp { get; set; }

        // 区块链交易地址txHash
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 交易存储区块链的链上unix时间戳
        [NameInMap("tx_timestamp")]
        [Validation(Required=false)]
        public long? TxTimestamp { get; set; }

        // 信物链查询链上获取的数据，参考结构体定义
        [NameInMap("data")]
        [Validation(Required=false)]
        public EvidenceBaseModel Data { get; set; }

    }

}
