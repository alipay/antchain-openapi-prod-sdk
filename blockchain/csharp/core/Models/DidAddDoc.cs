// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 创建did doc时的具体操作
    public class DidAddDoc : TeaModel {
        // did doc content
        [NameInMap("doc")]
        [Validation(Required=true)]
        public string Doc { get; set; }

    }

}
