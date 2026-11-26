// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateIotsuccessProductMcpResponse : TeaModel {
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

        [NameInMap("plugin_id")]
        [Validation(Required=true)]
        public string PluginId { get; set; }

        // 枚举:REVIEWING,READY,FAILED
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        [NameInMap("header_names")]
        [Validation(Required=true)]
        public List<string> HeaderNames { get; set; }

        [NameInMap("has_secret")]
        [Validation(Required=true)]
        public bool? HasSecret { get; set; }

    }

}
