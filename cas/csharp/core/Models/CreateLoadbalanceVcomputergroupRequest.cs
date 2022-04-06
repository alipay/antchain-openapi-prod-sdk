// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateLoadbalanceVcomputergroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // load_balancer_id
        [NameInMap("load_balancer_id")]
        [Validation(Required=true)]
        public string LoadBalancerId { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // computer_ids
        [NameInMap("computer_ids")]
        [Validation(Required=true)]
        public List<string> ComputerIds { get; set; }

        // ports
        [NameInMap("ports")]
        [Validation(Required=true)]
        public List<long?> Ports { get; set; }

        // weights
        [NameInMap("weights")]
        [Validation(Required=true)]
        public List<long?> Weights { get; set; }

        // is_eip
        [NameInMap("is_eip")]
        [Validation(Required=false)]
        public bool? IsEip { get; set; }

        // eips
        [NameInMap("eips")]
        [Validation(Required=false)]
        public List<string> Eips { get; set; }

    }

}
