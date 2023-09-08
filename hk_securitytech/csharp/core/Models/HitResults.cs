// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.HK_SECURITYTECH.Models
{
    // Hit details
    public class HitResults : TeaModel {
        // Reason for the screening decision. See more details in API-specific result codes. 
        [NameInMap("result_code")]
        [Validation(Required=true)]
        public string ResultCode { get; set; }

        // Result status. Possible values and their meanings are as below: 
        // 
        // "S": successful
        // 
        // "F": failed
        // 
        // "U": unknown issue
        [NameInMap("result_status")]
        [Validation(Required=true)]
        public string ResultStatus { get; set; }

        // Result message.
        // 
        // See more details in API-specific result codes.
        [NameInMap("result_message")]
        [Validation(Required=true)]
        public string ResultMessage { get; set; }

    }

}
