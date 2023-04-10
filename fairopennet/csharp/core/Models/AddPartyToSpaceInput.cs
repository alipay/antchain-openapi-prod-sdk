// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    // 添加协作参与方到协作空间
    public class AddPartyToSpaceInput : TeaModel {
        //  
        [NameInMap("network_id")]
        [Validation(Required=true)]
        public string NetworkId { get; set; }

        //  
        [NameInMap("space_id")]
        [Validation(Required=true)]
        public string SpaceId { get; set; }

        //  
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        //  
        [NameInMap("party_id")]
        [Validation(Required=true)]
        public string PartyId { get; set; }

    }

}
