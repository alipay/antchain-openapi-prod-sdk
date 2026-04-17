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
        /// <summary>
        /// <b>Example:</b>
        /// <para>1234</para>
        /// </summary>
        [NameInMap("cost")]
        [Validation(Required=true)]
        public long? Cost { get; set; }

        // response_status
        /// <summary>
        /// <b>Example:</b>
        /// <para>response_status</para>
        /// </summary>
        [NameInMap("response_status")]
        [Validation(Required=true)]
        public string ResponseStatus { get; set; }

        // response_code
        /// <summary>
        /// <b>Example:</b>
        /// <para>200</para>
        /// </summary>
        [NameInMap("response_code")]
        [Validation(Required=true)]
        public string ResponseCode { get; set; }

        // request_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>request_id</para>
        /// </summary>
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // payload
        [NameInMap("payload")]
        [Validation(Required=true)]
        public SCRealEstateQueryResponsePayload Payload { get; set; }

    }

}
