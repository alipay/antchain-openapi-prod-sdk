// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云区块链Rest信息
    public class ALiYunChainRest : TeaModel {
        // access_id
        [NameInMap("access_id")]
        [Validation(Required=false)]
        public string AccessId { get; set; }

        // create_time
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // rest
        [NameInMap("rest")]
        [Validation(Required=false)]
        public string Rest { get; set; }

        // update_time
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public long? UpdateTime { get; set; }

    }

}
