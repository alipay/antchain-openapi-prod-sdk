// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAASPLATFORM.Models
{
    public class QueryCertificationStatusResponse : TeaModel {
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

        // 任务ID
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // 业务编号
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 出证类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 任务状态：INIT/PROCESSING/SUCCESS/FAIL
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 错误信息（失败时）
        [NameInMap("erro_msg")]
        [Validation(Required=false)]
        public string ErroMsg { get; set; }

    }

}
