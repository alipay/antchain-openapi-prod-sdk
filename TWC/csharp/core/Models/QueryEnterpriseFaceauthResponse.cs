// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryEnterpriseFaceauthResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 认证唯一性标识
        [NameInMap("biz_no")]
        [Validation(Required=false)]
        public string BizNo { get; set; }

        // 认证失败错误码
        [NameInMap("failed_code")]
        [Validation(Required=false)]
        public string FailedCode { get; set; }

        // 认证是否通过
        [NameInMap("passed")]
        [Validation(Required=false)]
        public bool? Passed { get; set; }

    }

}
