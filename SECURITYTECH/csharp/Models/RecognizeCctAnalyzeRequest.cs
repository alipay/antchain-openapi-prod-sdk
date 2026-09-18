// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class RecognizeCctAnalyzeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // channel
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // content_type
        [NameInMap("content_type")]
        [Validation(Required=true)]
        public string ContentType { get; set; }

        // user_id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // request_id
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // data_map
        [NameInMap("data_map")]
        [Validation(Required=true)]
        public CctDataMap DataMap { get; set; }

    }

}
