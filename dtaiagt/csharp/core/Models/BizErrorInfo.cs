// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // 异常对象
    public class BizErrorInfo : TeaModel {
        // code
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 异常信息
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        // params
        [NameInMap("params")]
        [Validation(Required=false)]
        public string Params { get; set; }

    }

}
