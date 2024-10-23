// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.UNITYCS.Models
{
    public class GetDepositResponse : TeaModel {
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

        // 交易Hash
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 块高
        [NameInMap("block_number")]
        [Validation(Required=false)]
        public long? BlockNumber { get; set; }

        // 交易时间戳
        [NameInMap("tx_time")]
        [Validation(Required=false)]
        public long? TxTime { get; set; }

        // 上链的基础信息json
        [NameInMap("base_info_json")]
        [Validation(Required=false)]
        public string BaseInfoJson { get; set; }

    }

}
