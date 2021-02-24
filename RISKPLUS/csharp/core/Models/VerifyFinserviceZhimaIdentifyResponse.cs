// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class VerifyFinserviceZhimaIdentifyResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 本次认证的唯一标识，商户需要记录，后续的操作都需要用到。
        [NameInMap("data")]
        [Validation(Required=false)]
        public ZhimaIdentifyResp Data { get; set; }

    }

}
