// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    public class QueryOmngGenerationtaskResponse : TeaModel {
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

        // 查询结果
        // 成功：success
        // 失败：fail
        [NameInMap("result")]
        [Validation(Required=false)]
        public string Result { get; set; }

        // 查询失败原因
        [NameInMap("fail_msg")]
        [Validation(Required=false)]
        public string FailMsg { get; set; }

        // 视频场景任务结果信息
        [NameInMap("task_result_info_dto")]
        [Validation(Required=false)]
        public TaskResultInfoDto TaskResultInfoDto { get; set; }

    }

}
