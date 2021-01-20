// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryOperationlogRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // event
        [NameInMap("event")]
        [Validation(Required=false)]
        public string Event { get; set; }

        // page_no
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public long? PageNo { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // result
        [NameInMap("result")]
        [Validation(Required=false)]
        public bool? Result { get; set; }

        // target_id
        [NameInMap("target_id")]
        [Validation(Required=false)]
        public string TargetId { get; set; }

        // target_type
        [NameInMap("target_type")]
        [Validation(Required=false)]
        public string TargetType { get; set; }

        // user_id
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

    }

}
