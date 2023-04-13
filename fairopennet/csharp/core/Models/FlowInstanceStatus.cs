// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    // 工作流执行状态
    public class FlowInstanceStatus : TeaModel {
        //  
        [NameInMap("space_id")]
        [Validation(Required=true)]
        public string SpaceId { get; set; }

        //  
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        //  
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        //  
        [NameInMap("consent_on")]
        [Validation(Required=true)]
        public bool? ConsentOn { get; set; }

        //   
        [NameInMap("auto_start")]
        [Validation(Required=true)]
        public bool? AutoStart { get; set; }

        //  
        [NameInMap("static_parameters")]
        [Validation(Required=true)]
        public string StaticParameters { get; set; }

        //  
        [NameInMap("dynamic_parameters")]
        [Validation(Required=true)]
        public string DynamicParameters { get; set; }

        //  
        [NameInMap("total_components")]
        [Validation(Required=true)]
        public long? TotalComponents { get; set; }

        //  
        [NameInMap("completed_components")]
        [Validation(Required=true)]
        public long? CompletedComponents { get; set; }

        //  fair错误码
        [NameInMap("error_code")]
        [Validation(Required=true)]
        public string ErrorCode { get; set; }

        //  Fair错误信息
        [NameInMap("error_message")]
        [Validation(Required=true)]
        public string ErrorMessage { get; set; }

        //  工作流实力执行的状态码
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
