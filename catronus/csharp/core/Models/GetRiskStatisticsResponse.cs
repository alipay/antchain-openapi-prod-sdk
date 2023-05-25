// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class GetRiskStatisticsResponse : TeaModel {
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

        // 风险总数
        [NameInMap("total_risk_tasks_count")]
        [Validation(Required=false)]
        public long? TotalRiskTasksCount { get; set; }

        // 未修复风险数
        [NameInMap("unfixed_risk_tasks_count")]
        [Validation(Required=false)]
        public long? UnfixedRiskTasksCount { get; set; }

        // 未响应风险数
        [NameInMap("unconfirmed_risks_tasks_count")]
        [Validation(Required=false)]
        public long? UnconfirmedRisksTasksCount { get; set; }

        // 镜像漏洞风险数
        [NameInMap("image_risk_tasks_count")]
        [Validation(Required=false)]
        public long? ImageRiskTasksCount { get; set; }

        // 基线风险数
        [NameInMap("benchmark_risk_tasks_count")]
        [Validation(Required=false)]
        public long? BenchmarkRiskTasksCount { get; set; }

        // 运行时风险数
        [NameInMap("runtime_risk_tasks_count")]
        [Validation(Required=false)]
        public long? RuntimeRiskTasksCount { get; set; }

    }

}
