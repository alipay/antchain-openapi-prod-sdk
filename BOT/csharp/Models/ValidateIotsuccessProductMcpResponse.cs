// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ValidateIotsuccessProductMcpResponse : TeaModel {
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

        [NameInMap("reachable")]
        [Validation(Required=true)]
        public bool? Reachable { get; set; }

        // 应用层鉴权结果；无可判定认证机制时为null，WebSocket握手不等于鉴权成功
        [NameInMap("authenticated")]
        [Validation(Required=true)]
        public bool? Authenticated { get; set; }

        // 完成initialize及initialized通知和tools/list；仅握手成功不得为true
        [NameInMap("protocol_ready")]
        [Validation(Required=true)]
        public bool? ProtocolReady { get; set; }

        [NameInMap("latency_ms")]
        [Validation(Required=true)]
        public long? LatencyMs { get; set; }

    }

}
