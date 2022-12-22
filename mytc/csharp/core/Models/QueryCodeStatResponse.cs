// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    public class QueryCodeStatResponse : TeaModel {
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

        // 上链交易量
        [NameInMap("transaction_size")]
        [Validation(Required=false)]
        public long? TransactionSize { get; set; }

        // 上链总数据存储容量占用
        [NameInMap("chain_capacity")]
        [Validation(Required=false)]
        public long? ChainCapacity { get; set; }

        // 记录条数，包括上链和未上链的总数据条数
        [NameInMap("record_size")]
        [Validation(Required=false)]
        public long? RecordSize { get; set; }

        // 对重复操作仅做一次记录的数据统计量。eg: 实际溯源码注册量，实际绑定信息的数据量。
        [NameInMap("valid_size")]
        [Validation(Required=false)]
        public long? ValidSize { get; set; }

    }

}
