// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // qmp分层信息
    public class DecisionInfo : TeaModel {
        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 计划配置ID
        [NameInMap("offline_decision_plan_id")]
        [Validation(Required=true)]
        public long? OfflineDecisionPlanId { get; set; }

        // 总数量
        [NameInMap("total_num")]
        [Validation(Required=true)]
        public long? TotalNum { get; set; }

        // 分层结果数
        [NameInMap("decision_num")]
        [Validation(Required=true)]
        public long? DecisionNum { get; set; }

        // 文件路径
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

    }

}
