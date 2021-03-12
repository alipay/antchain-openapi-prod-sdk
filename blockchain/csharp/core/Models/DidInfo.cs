// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 分布式数字身份信息
    public class DidInfo : TeaModel {
        // 分布式数字身份id
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 分布式数字身份对应的用户名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
