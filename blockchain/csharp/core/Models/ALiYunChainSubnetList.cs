// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云子链列表信息
    public class ALiYunChainSubnetList : TeaModel {
        // ant_chain_id
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // 子链名称
        [NameInMap("blockchain_name")]
        [Validation(Required=false)]
        public string BlockchainName { get; set; }

        // 联盟管理员
        [NameInMap("consortium_admin")]
        [Validation(Required=false)]
        public bool? ConsortiumAdmin { get; set; }

        // 子链列表信息
        [NameInMap("blockchain_subnet_list")]
        [Validation(Required=false)]
        public List<ALiYunChainSubnet> BlockchainSubnetList { get; set; }

    }

}
