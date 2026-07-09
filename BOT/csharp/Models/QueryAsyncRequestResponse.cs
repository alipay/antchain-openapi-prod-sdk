// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryAsyncRequestResponse : TeaModel {
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

        // 执行状态 枚举
        // RUNNING	请求正在处理
        // SUCCESS	请求处理成功
        // FAILED	请求处理失败
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 异步接口的执行结果 ：根据同步接口的出参构建的JSON字符串
        [NameInMap("response")]
        [Validation(Required=false)]
        public string Response { get; set; }

    }

}
