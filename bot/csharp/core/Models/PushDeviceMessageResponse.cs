// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PushDeviceMessageResponse : TeaModel {
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

        // 接口调用结果
        // 
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 云端向设备下发服务调用的消息ID
        // 
        [NameInMap("message_id")]
        [Validation(Required=false)]
        public string MessageId { get; set; }

        // 指令执行 响应结果
        [NameInMap("result")]
        [Validation(Required=false)]
        public string Result { get; set; }

    }

}
