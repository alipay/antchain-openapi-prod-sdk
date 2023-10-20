// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 业务请求入参，兼容批量调用
    public class BizQueryParam : TeaModel {
        // 参数列表，数组
        [NameInMap("biz_params")]
        [Validation(Required=true)]
        public List<BizParam> BizParams { get; set; }

    }

}
