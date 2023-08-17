// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    public class CreateItagAntitagTaskJsonResponse : TeaModel {
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

        // 结果码
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 消息体
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

        // 请求ID
        [NameInMap("requestid")]
        [Validation(Required=false)]
        public string Requestid { get; set; }

        // 成功标识
        [NameInMap("succ")]
        [Validation(Required=false)]
        public string Succ { get; set; }

        // 任务ID
        [NameInMap("taskid")]
        [Validation(Required=false)]
        public string Taskid { get; set; }

    }

}
