// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class ApplyUserSmsResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 短信重新触发url
        // 
        // 
        [NameInMap("sms_resend_url")]
        [Validation(Required=false)]
        public string SmsResendUrl { get; set; }

        // 核验id
        // 
        // 
        [NameInMap("verify_id")]
        [Validation(Required=false)]
        public string VerifyId { get; set; }

        // did_24c93459216945468fdf1d899c521910
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

    }

}
