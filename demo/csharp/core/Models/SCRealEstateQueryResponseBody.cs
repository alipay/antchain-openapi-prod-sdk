// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // ResponseBody
    public class SCRealEstateQueryResponseBody : TeaModel {
        // cost
        [NameInMap("cost")]
        [Validation(Required=true)]
        public long? Cost { get; set; }

        // response_status
        [NameInMap("response_status")]
        [Validation(Required=true)]
        public string ResponseStatus { get; set; }

        // response_code
        [NameInMap("response_code")]
        [Validation(Required=true)]
        public string ResponseCode { get; set; }

        // request_id
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // payload
        [NameInMap("payload")]
        [Validation(Required=true)]
        public SCRealEstateQueryResponsePayload Payload { get; set; }

    }

}
