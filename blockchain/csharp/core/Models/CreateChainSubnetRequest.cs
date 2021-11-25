// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateChainSubnetRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 主链id
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // 子链名称
        [NameInMap("subnet_name")]
        [Validation(Required=false)]
        public string SubnetName { get; set; }

        // 节点的id
        [NameInMap("node_id")]
        [Validation(Required=false)]
        public string NodeId { get; set; }

        // 联盟成员
        [NameInMap("consortium_member")]
        [Validation(Required=false)]
        public string ConsortiumMember { get; set; }

        // 联盟id
        [NameInMap("consortium_id")]
        [Validation(Required=false)]
        public string ConsortiumId { get; set; }

    }

}
