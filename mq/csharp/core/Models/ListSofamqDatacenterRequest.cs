// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class ListSofamqDatacenterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // instance id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // cluster
        [NameInMap("cluster")]
        [Validation(Required=false)]
        public string Cluster { get; set; }

        // datacenter
        [NameInMap("datacenter")]
        [Validation(Required=false)]
        public string Datacenter { get; set; }

        // room
        [NameInMap("room")]
        [Validation(Required=false)]
        public string Room { get; set; }

    }

}
