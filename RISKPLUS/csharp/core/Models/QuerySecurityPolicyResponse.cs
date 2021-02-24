// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QuerySecurityPolicyResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 风险咨询情况下返回的风险等级，风险处理不会返回该值
        [NameInMap("level")]
        [Validation(Required=false)]
        public int? Level { get; set; }

        // 反馈成功之后的id
        [NameInMap("security_id")]
        [Validation(Required=false)]
        public string SecurityId { get; set; }

        // 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
        [NameInMap("security_result")]
        [Validation(Required=false)]
        public string SecurityResult { get; set; }

        // 是否成功
        [NameInMap("success")]
        [Validation(Required=true)]
        public string Success { get; set; }

        // 有风险需要失败业务情况下的返回码
        [NameInMap("template_code")]
        [Validation(Required=false)]
        public string TemplateCode { get; set; }

        // 有风险需要失败业务情况下的返回码描述
        [NameInMap("template_desc")]
        [Validation(Required=false)]
        public string TemplateDesc { get; set; }

        // native场景下的核身id
        [NameInMap("verify_id")]
        [Validation(Required=false)]
        public string VerifyId { get; set; }

        // h5场景下的核身地址
        [NameInMap("verify_url")]
        [Validation(Required=false)]
        public string VerifyUrl { get; set; }

    }

}
