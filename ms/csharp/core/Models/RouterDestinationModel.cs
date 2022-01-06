// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 路由目标
    public class RouterDestinationModel : TeaModel {
        // 路由目标集合
        [NameInMap("destination")]
        [Validation(Required=false)]
        public List<BaseConditionModel> Destination { get; set; }

        // 权重
        [NameInMap("weight")]
        [Validation(Required=false)]
        public long? Weight { get; set; }

    }

}
