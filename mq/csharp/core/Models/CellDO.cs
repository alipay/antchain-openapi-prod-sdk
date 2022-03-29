// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // cell
    public class CellDO : TeaModel {
        // cell
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

        // cell type
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

        // endpoint type
        [NameInMap("endpoint_type")]
        [Validation(Required=false)]
        public string EndpointType { get; set; }

        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // gmt_modified
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public string GmtModified { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // room
        [NameInMap("room")]
        [Validation(Required=false)]
        public string Room { get; set; }

    }

}
