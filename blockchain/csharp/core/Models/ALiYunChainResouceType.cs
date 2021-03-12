// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云区块链资源类型信息
    public class ALiYunChainResouceType : TeaModel {
        // type_id
        [NameInMap("type_id")]
        [Validation(Required=false)]
        public long? TypeId { get; set; }

        // cpu
        [NameInMap("cpu")]
        [Validation(Required=false)]
        public long? Cpu { get; set; }

        // memory
        [NameInMap("memory")]
        [Validation(Required=false)]
        public long? Memory { get; set; }

        // disk
        [NameInMap("disk")]
        [Validation(Required=false)]
        public long? Disk { get; set; }

    }

}
