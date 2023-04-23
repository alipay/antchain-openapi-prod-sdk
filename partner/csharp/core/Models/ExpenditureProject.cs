// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 支出项目
    public class ExpenditureProject : TeaModel {
        // 项目阶段：   
        //     REQUIREMENT_CONFIRM("REQUIREMENT_CONFIRM", "需求确认", "SOLUTION"),
        //     SOLUTION("SOLUTION", "方案沟通", "TALKS"),
        //     TALKS("TALKS", "商务谈判", "SIGNED"),
        //     SIGNED("SIGNED", "签约完成", "SIGNED"),
        //     ABORT("ABORT", "项目终止", "ABORT"),
        // 
        [NameInMap("stage")]
        [Validation(Required=true)]
        public string Stage { get; set; }

        // 项目状态：
        //     DOING("DOING","进行中"),
        //     ABORTED("ABORTED","已终止"),
        //     FINISHED("FINISHED","已完成"),
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 支出合同信息
        [NameInMap("contract")]
        [Validation(Required=false)]
        public ExpenditureContract Contract { get; set; }

        // 支出配置单信息
        [NameInMap("quotation")]
        [Validation(Required=false)]
        public ExpenditureQuotation Quotation { get; set; }

        // 合作计划id
        [NameInMap("collaboration_plan_id")]
        [Validation(Required=false)]
        public long? CollaborationPlanId { get; set; }

    }

}
