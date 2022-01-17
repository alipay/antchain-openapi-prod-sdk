// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiRspCodeVO
    public class ApiRspCodeVO : TeaModel {
        // error_code
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // error_msg
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        // error_desc
        [NameInMap("error_desc")]
        [Validation(Required=false)]
        public string ErrorDesc { get; set; }

    }

}
