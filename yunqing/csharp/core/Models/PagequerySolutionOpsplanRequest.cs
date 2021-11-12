// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class PagequerySolutionOpsplanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 解决方案Id
        [NameInMap("solution_id")]
        [Validation(Required=true)]
        public string SolutionId { get; set; }

        // 环境Id
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

        // 当前页
        [NameInMap("current_page")]
        [Validation(Required=true)]
        public string CurrentPage { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public string PageSize { get; set; }

        // RELEASE
        [NameInMap("plan_type")]
        [Validation(Required=true)]
        public string PlanType { get; set; }

        // FAILED
        [NameInMap("ops_plan_status")]
        [Validation(Required=true)]
        public string OpsPlanStatus { get; set; }

    }

}
