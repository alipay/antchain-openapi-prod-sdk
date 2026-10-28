// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ExecIotagentPluginResponse : TeaModel {
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

        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        [NameInMap("target_plugin_id")]
        [Validation(Required=false)]
        public string TargetPluginId { get; set; }

        [NameInMap("message_id")]
        [Validation(Required=false)]
        public string MessageId { get; set; }

        [NameInMap("message_type")]
        [Validation(Required=false)]
        public string MessageType { get; set; }

        // 业务响应数据，JSON格式
        [NameInMap("payload")]
        [Validation(Required=false)]
        public string Payload { get; set; }

        // Unix Epoch 毫秒
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public long? Timestamp { get; set; }

    }

}
