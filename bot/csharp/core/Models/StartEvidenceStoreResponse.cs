// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class StartEvidenceStoreResponse : TeaModel {
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

        // API消耗时间（毫秒单位）
        [NameInMap("cost_millis")]
        [Validation(Required=false)]
        public long? CostMillis { get; set; }

        // 暂保留
        [NameInMap("data_index")]
        [Validation(Required=false)]
        public string DataIndex { get; set; }

        // 上链附加备注信息，不做上链存储。
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

        // 交易ID，等于输入参数同名字段
        [NameInMap("nonce")]
        [Validation(Required=false)]
        public string Nonce { get; set; }

        // 本地unix时间戳（毫秒单位）
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public long? Timestamp { get; set; }

        // unix链上存储时间戳
        [NameInMap("tx_timestamp")]
        [Validation(Required=false)]
        public long? TxTimestamp { get; set; }

        // 链上交易地址txHash
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

    }

}
