// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryQmpDataaccessStatisticResponse : TeaModel {
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

        // 回执统计结果
        [NameInMap("statistic_result")]
        [Validation(Required=false)]
        public StatisticResult StatisticResult { get; set; }

        // 任务状态
        [NameInMap("task_status")]
        [Validation(Required=false)]
        public string TaskStatus { get; set; }

    }

}
