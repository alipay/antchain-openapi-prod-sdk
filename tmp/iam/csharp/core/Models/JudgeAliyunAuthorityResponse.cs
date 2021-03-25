// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class JudgeAliyunAuthorityResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 权限校验是否通过
        [NameInMap("result")]
        [Validation(Required=false)]
        public bool? Result { get; set; }

        // 失败原因
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

        // 解决方案
        [NameInMap("solution")]
        [Validation(Required=false)]
        public string Solution { get; set; }

    }

}
