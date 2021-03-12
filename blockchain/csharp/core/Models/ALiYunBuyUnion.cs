// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云售卖联盟信息
    public class ALiYunBuyUnion : TeaModel {
        // consortium_name
        [NameInMap("consortium_name")]
        [Validation(Required=false)]
        public string ConsortiumName { get; set; }

        // consortium_id
        [NameInMap("consortium_id")]
        [Validation(Required=false)]
        public string ConsortiumId { get; set; }

    }

}
