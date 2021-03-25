// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class CheckPlanOperationResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // data
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // error_messages
        [NameInMap("error_reasons")]
        [Validation(Required=false)]
        public List<string> ErrorReasons { get; set; }

        // validation_messages
        [NameInMap("validation_messages")]
        [Validation(Required=false)]
        public string ValidationMessages { get; set; }

    }

}
