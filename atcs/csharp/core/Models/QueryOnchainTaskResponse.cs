// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATCS.Models
{
    public class QueryOnchainTaskResponse : TeaModel {
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

        // 任务处理结果列表
        [NameInMap("task_result_list")]
        [Validation(Required=false)]
        public List<TaskResult> TaskResultList { get; set; }

        // 分布式身份唯一标识
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

    }

}
