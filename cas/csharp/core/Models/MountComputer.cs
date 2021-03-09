// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // LB后端挂载的主机
    public class MountComputer : TeaModel {
        // computer
        [NameInMap("computer")]
        [Validation(Required=false)]
        public Computer Computer { get; set; }

        // domain
        [NameInMap("domain")]
        [Validation(Required=false)]
        public string Domain { get; set; }

        // loadbalancer
        [NameInMap("loadbalancer")]
        [Validation(Required=false)]
        public LoadBalancer Loadbalancer { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // weight
        [NameInMap("weight")]
        [Validation(Required=true)]
        public long? Weight { get; set; }

    }

}
