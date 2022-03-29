// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateSofamqRoomRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // cluster
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // endpoint
        [NameInMap("endpoint")]
        [Validation(Required=false)]
        public string Endpoint { get; set; }

        // endpoint_type
        [NameInMap("endpoint_type")]
        [Validation(Required=false)]
        public string EndpointType { get; set; }

        // region
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // room
        [NameInMap("room")]
        [Validation(Required=true)]
        public string Room { get; set; }

    }

}
