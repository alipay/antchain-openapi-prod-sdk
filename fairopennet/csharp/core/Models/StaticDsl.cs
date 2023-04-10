// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    // 静态DSL
    public class StaticDsl : TeaModel {
        //  
        [NameInMap("space_id")]
        [Validation(Required=true)]
        public string SpaceId { get; set; }

        //  
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        //  
        [NameInMap("consent_on")]
        [Validation(Required=true)]
        public bool? ConsentOn { get; set; }

        //  
        [NameInMap("parameters")]
        [Validation(Required=true)]
        public string Parameters { get; set; }

    }

}
