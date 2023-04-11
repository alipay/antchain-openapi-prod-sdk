// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    public class QueryPartyRegisterstatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 节点的nodeId
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        // 用户的partyId
        [NameInMap("party_id")]
        [Validation(Required=true)]
        public string PartyId { get; set; }

    }

}
