// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class SetSofamqConnectorplancheckpointRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // connector任务执行计划Id	
        // 
        [NameInMap("plan_id")]
        [Validation(Required=true)]
        public string PlanId { get; set; }

        // Connector任务名	
        // 
        [NameInMap("job")]
        [Validation(Required=true)]
        public string Job { get; set; }

        // 重置任务请求
        [NameInMap("reset_offset_request")]
        [Validation(Required=true)]
        public ResetJobOffsetRequest ResetOffsetRequest { get; set; }

    }

}
