// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryLeaseAsynccallResponse : TeaModel {
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

        // 上链状态
        // TOBE_CHAIN(待上链)
        // CHAINING（上链中）SUCCESS(上链成功)
        // FAIL(上链失败)
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 成功的时候返回txHash
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 上链失败信息，status为FAIL时返回
        [NameInMap("chain_fail_message")]
        [Validation(Required=false)]
        public string ChainFailMessage { get; set; }

    }

}
