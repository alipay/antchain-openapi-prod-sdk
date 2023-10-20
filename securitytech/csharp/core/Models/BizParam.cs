// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 业务参数
    public class BizParam : TeaModel {
        // 参数类型枚举，mobile、cert、biz_license
        [NameInMap("param_key")]
        [Validation(Required=true)]
        public string ParamKey { get; set; }

        // 值，如加密后的手机号
        [NameInMap("param_value")]
        [Validation(Required=true)]
        public string ParamValue { get; set; }

    }

}
