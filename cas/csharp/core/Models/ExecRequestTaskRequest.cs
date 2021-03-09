// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ExecRequestTaskRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // rmc_request_id，注意区分OPENAPI自身的request_id
        [NameInMap("rmc_request_id")]
        [Validation(Required=true)]
        public string RmcRequestId { get; set; }

        // task_ids
        [NameInMap("task_ids")]
        [Validation(Required=true)]
        public List<string> TaskIds { get; set; }

    }

}
