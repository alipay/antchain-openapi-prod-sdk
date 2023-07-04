// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 参数模版
    public class ParameterTemplate : TeaModel {
        // template模板值
        [NameInMap("template")]
        [Validation(Required=true)]
        public string Template { get; set; }

        // target 模版对象
        [NameInMap("target")]
        [Validation(Required=false)]
        public string Target { get; set; }

    }

}
