// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 忘记密码
    public class ForgetMeta : TeaModel {
        // 字段名称
        [NameInMap("label")]
        [Validation(Required=true)]
        public string Label { get; set; }

        // 忘记密码的链接地址，供重置用
        [NameInMap("link")]
        [Validation(Required=true)]
        public string Link { get; set; }

    }

}
