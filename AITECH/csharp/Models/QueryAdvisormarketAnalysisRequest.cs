// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QueryAdvisormarketAnalysisRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 创建接口返回的任务 ID。type=result 时必填；type=status 时用于精确查询，不能与 task_status 同时传入。
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // 查询模式。status 查询状态或任务列表；result 查询指定成功任务的结果下载地址。可选值：status、result。
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 状态列表筛选条件，仅在 type=status 且未传 task_id 时使用。可选值：QUEUED、PROCESSING、SUCCESS、FAILED；不要传 CLOSED。
        [NameInMap("task_status")]
        [Validation(Required=false)]
        public string TaskStatus { get; set; }

    }

}
