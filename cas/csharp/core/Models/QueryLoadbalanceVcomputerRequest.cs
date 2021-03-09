// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryLoadbalanceVcomputerRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // computer_ids
        [NameInMap("computer_ids")]
        [Validation(Required=false)]
        public List<string> ComputerIds { get; set; }

        // computer_ports
        [NameInMap("computer_ports")]
        [Validation(Required=false)]
        public List<string> ComputerPorts { get; set; }

        // current_page
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // ips
        [NameInMap("ips")]
        [Validation(Required=false)]
        public List<string> Ips { get; set; }

        // ip_ports
        [NameInMap("ip_ports")]
        [Validation(Required=false)]
        public List<string> IpPorts { get; set; }

        // max_weight
        [NameInMap("max_weight")]
        [Validation(Required=false)]
        public long? MaxWeight { get; set; }

        // min_weight
        [NameInMap("min_weight")]
        [Validation(Required=false)]
        public long? MinWeight { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // ports
        [NameInMap("ports")]
        [Validation(Required=false)]
        public List<string> Ports { get; set; }

        // v_computer_group_ids
        [NameInMap("v_computer_group_ids")]
        [Validation(Required=false)]
        public List<string> VComputerGroupIds { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

    }

}
