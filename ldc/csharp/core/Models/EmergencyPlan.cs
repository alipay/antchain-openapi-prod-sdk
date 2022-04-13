// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 守夜人预案信息
    public class EmergencyPlan : TeaModel {
        // 预案id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 预案名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
