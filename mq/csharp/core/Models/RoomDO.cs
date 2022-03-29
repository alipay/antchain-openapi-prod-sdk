// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // room
    public class RoomDO : TeaModel {
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

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // gmt_modified
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public string GmtModified { get; set; }

    }

}
