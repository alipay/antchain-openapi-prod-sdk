// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    // 动态工作流配置
    public class DynamicDsl : TeaModel {
        //  
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        //  
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        //  
        [NameInMap("auto_start")]
        [Validation(Required=true)]
        public bool? AutoStart { get; set; }

        //  
        [NameInMap("parameters")]
        [Validation(Required=true)]
        public string Parameters { get; set; }

    }

}
