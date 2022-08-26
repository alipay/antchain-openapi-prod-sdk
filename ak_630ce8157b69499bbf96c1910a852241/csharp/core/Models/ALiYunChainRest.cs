// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_630ce8157b69499bbf96c1910a852241.Models
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

        // REST开通结果
        [NameInMap("result")]
        [Validation(Required=false)]
        public string Result { get; set; }

    }

}
