// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    public class QueryAgreementAppResponse : TeaModel {
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

        // 隐私协议版本号
        [NameInMap("privacy_agreement_no")]
        [Validation(Required=false)]
        public string PrivacyAgreementNo { get; set; }

        // 用户协议版本号
        [NameInMap("user_agreement_no")]
        [Validation(Required=false)]
        public string UserAgreementNo { get; set; }

        // 隐私协议签署时间
        [NameInMap("privacy_agreement_sign_time")]
        [Validation(Required=false)]
        public string PrivacyAgreementSignTime { get; set; }

        // 用户协议签署时间
        [NameInMap("user_agreement_sign_time")]
        [Validation(Required=false)]
        public string UserAgreementSignTime { get; set; }

    }

}
