// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 存证元数据
    public class NotaryMetaParam : TeaModel {
        // 描述本条存证在存证事务中的阶段，用户可自行维护
        [NameInMap("phase")]
        [Validation(Required=true)]
        public string Phase { get; set; }

        // 扩展字段
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 全局唯一的存证事务ID
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

    }

}
