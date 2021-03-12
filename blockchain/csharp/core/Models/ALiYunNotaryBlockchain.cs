// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云存证链信息
    public class ALiYunNotaryBlockchain : TeaModel {
        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // bizid
        [NameInMap("bizid")]
        [Validation(Required=false)]
        public string Bizid { get; set; }

        // chain_type
        [NameInMap("chain_type")]
        [Validation(Required=false)]
        public string ChainType { get; set; }

        // node_num
        [NameInMap("node_num")]
        [Validation(Required=false)]
        public long? NodeNum { get; set; }

        // member_status
        [NameInMap("member_status")]
        [Validation(Required=false)]
        public string MemberStatus { get; set; }

        // block_height
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // transactions
        [NameInMap("transactions")]
        [Validation(Required=false)]
        public long? Transactions { get; set; }

        // network
        [NameInMap("network")]
        [Validation(Required=false)]
        public string Network { get; set; }

        // version
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}
