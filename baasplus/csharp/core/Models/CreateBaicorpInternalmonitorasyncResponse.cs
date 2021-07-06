// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class CreateBaicorpInternalmonitorasyncResponse : TeaModel {
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

        // 检测时长，单位为天
        [NameInMap("monitor_duration")]
        [Validation(Required=false)]
        public long? MonitorDuration { get; set; }

        // 监测启动日期，若为空，则立刻开始，从1970开始的毫秒数。
        [NameInMap("start_date")]
        [Validation(Required=false)]
        public long? StartDate { get; set; }

        // 业务方任务id，业务方保证唯一
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

    }

}
