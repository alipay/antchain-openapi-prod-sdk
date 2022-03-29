// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // datacenter
    public class DataCenterDO : TeaModel {
        // cluster
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // datacenter
        [NameInMap("datacenter")]
        [Validation(Required=true)]
        public string Datacenter { get; set; }

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
