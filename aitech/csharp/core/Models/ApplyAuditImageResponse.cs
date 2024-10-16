// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class ApplyAuditImageResponse : TeaModel {
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

        // 请求ID，必须唯一
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // 任务ID，必须唯一
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // 数据ID，必须唯一
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // 审核内容类型
        [NameInMap("content_type")]
        [Validation(Required=false)]
        public string ContentType { get; set; }

        // 审核结果
        [NameInMap("result")]
        [Validation(Required=false)]
        public string Result { get; set; }

    }

}
