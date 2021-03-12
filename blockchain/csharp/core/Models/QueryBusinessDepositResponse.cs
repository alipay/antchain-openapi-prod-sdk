// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryBusinessDepositResponse : TeaModel {
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

        // 具体存证数据
        [NameInMap("deposit_data")]
        [Validation(Required=false)]
        public string DepositData { get; set; }

        // 业务逻辑对应的存证id
        [NameInMap("deposit_id")]
        [Validation(Required=false)]
        public string DepositId { get; set; }

        // keyId对应的所有相关的历史交易记录
        [NameInMap("history_tx_hashes")]
        [Validation(Required=false)]
        public List<string> HistoryTxHashes { get; set; }

        // 是否查询成功
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
