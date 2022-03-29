// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // node
    public class NodeDO : TeaModel {
        // cluster
        [NameInMap("cluster")]
        [Validation(Required=false)]
        public string Cluster { get; set; }

        // default
        [NameInMap("data_center")]
        [Validation(Required=false)]
        public string DataCenter { get; set; }

        // hostname
        [NameInMap("hostname")]
        [Validation(Required=true)]
        public string Hostname { get; set; }

        // node group
        [NameInMap("node_group")]
        [Validation(Required=false)]
        public string NodeGroup { get; set; }

        // node type
        [NameInMap("node_type")]
        [Validation(Required=false)]
        public string NodeType { get; set; }

        // node perm
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

        // 节点状态 MASTER|SLAVE|OFFLINE
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 节点所属环境
        [NameInMap("env")]
        [Validation(Required=false)]
        public string Env { get; set; }

        // 节点所在城市
        [NameInMap("city")]
        [Validation(Required=false)]
        public string City { get; set; }

    }

}
