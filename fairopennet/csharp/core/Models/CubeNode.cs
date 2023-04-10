// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    // 描述一个cube节点
    public class CubeNode : TeaModel {
        // 无
        [NameInMap("domain")]
        [Validation(Required=true)]
        public string Domain { get; set; }

        // 无
        [NameInMap("endpoints")]
        [Validation(Required=true)]
        public List<string> Endpoints { get; set; }

        //  
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        //  
        [NameInMap("node_id_hash")]
        [Validation(Required=true)]
        public string NodeIdHash { get; set; }

        //  
        [NameInMap("node_public_key")]
        [Validation(Required=true)]
        public string NodePublicKey { get; set; }

        //  
        [NameInMap("is_connected")]
        [Validation(Required=true)]
        public bool? IsConnected { get; set; }

        //  
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

    }

}
