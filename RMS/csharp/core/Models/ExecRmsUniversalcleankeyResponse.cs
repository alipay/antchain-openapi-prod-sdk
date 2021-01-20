// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class ExecRmsUniversalcleankeyResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // error_message
        [NameInMap("error_message")]
        [Validation(Required=false)]
        public CallErrorMessage ErrorMessage { get; set; }

        // part_suc
        [NameInMap("part_suc")]
        [Validation(Required=false)]
        public bool? PartSuc { get; set; }

        // result
        [NameInMap("result")]
        [Validation(Required=false)]
        public string Result { get; set; }

        // success
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

    }

}
