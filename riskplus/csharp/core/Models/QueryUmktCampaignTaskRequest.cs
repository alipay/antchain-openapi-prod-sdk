// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryUmktCampaignTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 半圈投计划id
        [NameInMap("campaign_id")]
        [Validation(Required=true)]
        public long? CampaignId { get; set; }

        // 任务唯一id
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // 圈投任务执行日期
        [NameInMap("exec_date")]
        [Validation(Required=false)]
        public string ExecDate { get; set; }

    }

}
