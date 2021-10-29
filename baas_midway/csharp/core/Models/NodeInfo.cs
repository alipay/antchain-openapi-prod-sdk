// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAAS_MIDWAY.Models
{
    // 区块链节点信息
    public class NodeInfo : TeaModel {
        // 公网IP
        [NameInMap("public_ip")]
        [Validation(Required=true)]
        public string PublicIp { get; set; }

        // 内网IP
        [NameInMap("private_ip")]
        [Validation(Required=true)]
        public string PrivateIp { get; set; }

        // 连接端口
        [NameInMap("client_port")]
        [Validation(Required=true)]
        public string ClientPort { get; set; }

        // 共识端口
        [NameInMap("p2p_port")]
        [Validation(Required=true)]
        public string P2pPort { get; set; }

    }

}
