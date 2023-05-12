// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class QueryAppsBiztypeResponse : TeaModel {
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

        // 异库模式更新信息
        [NameInMap("asyn_info")]
        [Validation(Required=false)]
        public AsynDbTxInfo AsynInfo { get; set; }

        // Saga状态机的json定义
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // initiator
        [NameInMap("initiator")]
        [Validation(Required=false)]
        public Initiator Initiator { get; set; }

        // participators
        [NameInMap("participators")]
        [Validation(Required=false)]
        public List<Participator> Participators { get; set; }

    }

}
