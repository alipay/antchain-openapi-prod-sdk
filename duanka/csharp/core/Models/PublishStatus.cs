// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    // PublishStatus
    public class PublishStatus : TeaModel {
        // status
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // errorCode
        [NameInMap("error_code")]
        [Validation(Required=true)]
        public string ErrorCode { get; set; }

        // message
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // errorData
        [NameInMap("error_data")]
        [Validation(Required=true)]
        public string ErrorData { get; set; }

    }

}
