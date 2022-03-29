// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateSofamqCellRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // cell
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

        // cell_type
        [NameInMap("cell_type")]
        [Validation(Required=false)]
        public string CellType { get; set; }

        // default
        [NameInMap("datacenter")]
        [Validation(Required=false)]
        public string Datacenter { get; set; }

        // endpoint
        [NameInMap("endpoint")]
        [Validation(Required=false)]
        public string Endpoint { get; set; }

        // endpoint_type
        [NameInMap("endpoint_type")]
        [Validation(Required=false)]
        public string EndpointType { get; set; }

        // ns id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // room
        [NameInMap("room")]
        [Validation(Required=false)]
        public string Room { get; set; }

    }

}
