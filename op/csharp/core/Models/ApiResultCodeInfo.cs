// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // api返回结果
    public class ApiResultCodeInfo : TeaModel {
        // 返回结果码
        [NameInMap("internal_code")]
        [Validation(Required=true)]
        public string InternalCode { get; set; }

        // 外部结果码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 返回结果描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 返回结果码解决方案
        [NameInMap("resolution")]
        [Validation(Required=true)]
        public string Resolution { get; set; }

    }

}
