// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    // 工作流静态配置
    public class StaticFlowConfig : TeaModel {
        //  
        [NameInMap("network_id")]
        [Validation(Required=true)]
        public string NetworkId { get; set; }

        //  
        [NameInMap("dsl")]
        [Validation(Required=true)]
        public StaticDsl Dsl { get; set; }

    }

}
