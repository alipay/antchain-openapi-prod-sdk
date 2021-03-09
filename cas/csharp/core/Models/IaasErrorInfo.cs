// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // IaasErrorInfo
    public class IaasErrorInfo : TeaModel {
        // error_code
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // error_message
        [NameInMap("error_message")]
        [Validation(Required=false)]
        public string ErrorMessage { get; set; }

        // status_code
        [NameInMap("status_code")]
        [Validation(Required=false)]
        public long? StatusCode { get; set; }

        // host_id
        [NameInMap("host_id")]
        [Validation(Required=false)]
        public string HostId { get; set; }

        // requestId
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

    }

}
