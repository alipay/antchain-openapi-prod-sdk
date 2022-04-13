// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // ResourceRequirementConfig
    public class ResourceRequirementConfig : TeaModel {
        // limits
        [NameInMap("limits")]
        [Validation(Required=false)]
        public List<MapResourceNameToValue> Limits { get; set; }

        // requests
        [NameInMap("requests")]
        [Validation(Required=false)]
        public List<MapResourceNameToValue> Requests { get; set; }

    }

}
