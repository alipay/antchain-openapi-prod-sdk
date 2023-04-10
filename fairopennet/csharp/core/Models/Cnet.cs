// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    //  
    public class Cnet : TeaModel {
        //  
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        //  
        [NameInMap("blockchain_num")]
        [Validation(Required=true)]
        public string BlockchainNum { get; set; }

        //  
        [NameInMap("my_normal_node_id")]
        [Validation(Required=true)]
        public string MyNormalNodeId { get; set; }

        //  
        [NameInMap("governance_contract")]
        [Validation(Required=true)]
        public string GovernanceContract { get; set; }

        //  
        [NameInMap("my_role")]
        [Validation(Required=true)]
        public string MyRole { get; set; }

        //  
        [NameInMap("party_list")]
        [Validation(Required=true)]
        public List<string> PartyList { get; set; }

    }

}
