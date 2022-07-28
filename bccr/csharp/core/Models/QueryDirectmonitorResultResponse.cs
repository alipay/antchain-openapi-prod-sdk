// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryDirectmonitorResultResponse : TeaModel {
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

        // 监测任务id
        [NameInMap("monitor_task_id")]
        [Validation(Required=false)]
        public string MonitorTaskId { get; set; }

        // 当前页面监测结果数量
        [NameInMap("result_count")]
        [Validation(Required=false)]
        public long? ResultCount { get; set; }

        // 监测结果列表
        [NameInMap("monitor_result_list")]
        [Validation(Required=false)]
        public List<DirectMonitorResult> MonitorResultList { get; set; }

    }

}
