// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class ListSofamqNodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // cluster
        [NameInMap("cluster")]
        [Validation(Required=false)]
        public string Cluster { get; set; }

        // data_center
        [NameInMap("data_center")]
        [Validation(Required=false)]
        public string DataCenter { get; set; }

        // hostname
        [NameInMap("hostname")]
        [Validation(Required=false)]
        public string Hostname { get; set; }

        // node_group
        [NameInMap("node_group")]
        [Validation(Required=false)]
        public string NodeGroup { get; set; }

        // room
        [NameInMap("room")]
        [Validation(Required=false)]
        public string Room { get; set; }

        // page num
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // page size
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
