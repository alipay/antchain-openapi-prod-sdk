// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 派生DID的具体参数
    public class DeriveDid : TeaModel {
        // 派生的子did
        [NameInMap("childdid")]
        [Validation(Required=true)]
        public string Childdid { get; set; }

        // 子did 的did doc
        [NameInMap("childdiddoc")]
        [Validation(Required=true)]
        public string Childdiddoc { get; set; }

        // 用户输入用于派生子did的派生码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

    }

}
