// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // LB查询对应的VComputer
    public class VComputer : TeaModel {
        // v_computer_group
        [NameInMap("v_computer_group")]
        [Validation(Required=false)]
        public VComputerGroup VComputerGroup { get; set; }

        // ip
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // computer
        [NameInMap("computer")]
        [Validation(Required=false)]
        public Computer Computer { get; set; }

        // port
        [NameInMap("port")]
        [Validation(Required=false)]
        public long? Port { get; set; }

        // weight
        [NameInMap("weight")]
        [Validation(Required=false)]
        public long? Weight { get; set; }

        // 是否是EIP
        [NameInMap("is_eip")]
        [Validation(Required=false)]
        public bool? IsEip { get; set; }

        // is_managed_computer
        [NameInMap("is_managed_computer")]
        [Validation(Required=false)]
        public bool? IsManagedComputer { get; set; }

        // iaas_id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

    }

}
