// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    // 查询健康信息扩展参数
    public class QueryHealthInfoExtendedArg : TeaModel {
        // 参数名
        [NameInMap("arg_key")]
        [Validation(Required=false)]
        public string ArgKey { get; set; }

        // 参数值
        [NameInMap("arg_value")]
        [Validation(Required=false)]
        public string ArgValue { get; set; }

    }

}
