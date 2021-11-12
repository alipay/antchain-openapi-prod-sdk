// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 发布单
    public class OpsPlan : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 环境Id
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

        // 解决方案Id
        [NameInMap("solution_id")]
        [Validation(Required=true)]
        public string SolutionId { get; set; }

        // 发布单类型
        [NameInMap("ops_type")]
        [Validation(Required=true)]
        public string OpsType { get; set; }

        // 发布单类型
        [NameInMap("plan_type")]
        [Validation(Required=true)]
        public string PlanType { get; set; }

        // 创建人id
        [NameInMap("creator")]
        [Validation(Required=true)]
        public string Creator { get; set; }

        // 创建人名称
        [NameInMap("creator_name")]
        [Validation(Required=true)]
        public string CreatorName { get; set; }

        // 发布单状态
        [NameInMap("ops_plan_status")]
        [Validation(Required=true)]
        public string OpsPlanStatus { get; set; }

        // 创建时间
        [NameInMap("utc_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreate { get; set; }

        // 修改时间
        [NameInMap("utc_modified")]
        [Validation(Required=true)]
        public string UtcModified { get; set; }

    }

}
