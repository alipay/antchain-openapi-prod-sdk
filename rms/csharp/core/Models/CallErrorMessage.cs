// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // CallErrorMessage
    public class CallErrorMessage : TeaModel {
        // error_code
        [NameInMap("error_code")]
        [Validation(Required=true)]
        public string ErrorCode { get; set; }

        // message
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // cause
        [NameInMap("cause")]
        [Validation(Required=false)]
        public string Cause { get; set; }

    }

}
