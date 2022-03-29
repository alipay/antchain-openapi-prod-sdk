// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateSofamqNodeRequest : TeaModel {
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

        // hostname
        [NameInMap("hostname")]
        [Validation(Required=true)]
        public string Hostname { get; set; }

        // node_group
        [NameInMap("node_group")]
        [Validation(Required=false)]
        public string NodeGroup { get; set; }

        // node_type
        [NameInMap("node_type")]
        [Validation(Required=false)]
        public string NodeType { get; set; }

        // perm
        [NameInMap("perm")]
        [Validation(Required=false)]
        public string Perm { get; set; }

        // rip
        [NameInMap("rip")]
        [Validation(Required=false)]
        public string Rip { get; set; }

        // room
        [NameInMap("room")]
        [Validation(Required=false)]
        public string Room { get; set; }

        // vip
        [NameInMap("vip")]
        [Validation(Required=false)]
        public string Vip { get; set; }

        // default
        [NameInMap("data_center")]
        [Validation(Required=false)]
        public string DataCenter { get; set; }

    }

}
