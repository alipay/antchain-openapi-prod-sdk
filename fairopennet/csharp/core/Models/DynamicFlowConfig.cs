// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    // 工作流动态配置
    public class DynamicFlowConfig : TeaModel {
        //  
        [NameInMap("network_id")]
        [Validation(Required=true)]
        public string NetworkId { get; set; }

        //  
        [NameInMap("space_id")]
        [Validation(Required=true)]
        public string SpaceId { get; set; }

        //  
        [NameInMap("dsl")]
        [Validation(Required=true)]
        public DynamicDsl Dsl { get; set; }

    }

}
