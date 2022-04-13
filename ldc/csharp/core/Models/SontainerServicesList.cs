// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // container_services list
    public class SontainerServicesList : TeaModel {
        // ContainerServiceDeployment
        [NameInMap("list")]
        [Validation(Required=true)]
        public List<ContainerServiceDeployment> List { get; set; }

    }

}
