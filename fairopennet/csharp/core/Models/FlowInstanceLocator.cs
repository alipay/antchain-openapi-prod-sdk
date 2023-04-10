// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    // 工作流实例的定位符
    public class FlowInstanceLocator : TeaModel {
        //  
        [NameInMap("network_id")]
        [Validation(Required=true)]
        public string NetworkId { get; set; }

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

    }

}
