// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QuerySofamqConnectorjobpartitionstatuscolumnRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // connector任务执行计划Id
        // 
        [NameInMap("job")]
        [Validation(Required=true)]
        public string Job { get; set; }

        // connector任务执行计划Id
        // 
        [NameInMap("plan_id")]
        [Validation(Required=true)]
        public string PlanId { get; set; }

    }

}
