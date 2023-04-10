// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    public class StopFlowinstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        //  
        [NameInMap("network_id")]
        [Validation(Required=true)]
        public string NetworkId { get; set; }

        //  
        [NameInMap("space_id")]
        [Validation(Required=true)]
        public string SpaceId { get; set; }

        //  
        [NameInMap("party_id")]
        [Validation(Required=true)]
        public string PartyId { get; set; }

        //  
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        //  
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

    }

}
