// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QuerySecurityPolicyResponse : TeaModel {
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

        // 风险咨询情况下返回的风险等级，风险处理不会返回该值
        [NameInMap("level")]
        [Validation(Required=false)]
        public long? Level { get; set; }

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

        // native场景下的核身id
        [NameInMap("verify_id")]
        [Validation(Required=false)]
        public string VerifyId { get; set; }

        // h5场景下的核身地址
        [NameInMap("verify_url")]
        [Validation(Required=false)]
        public string VerifyUrl { get; set; }

        // 场景分
        [NameInMap("model_details")]
        [Validation(Required=false)]
        public ModelDetails ModelDetails { get; set; }

        // 输出变量
        [NameInMap("variable_details")]
        [Validation(Required=false)]
        public VariableDetails VariableDetails { get; set; }

        // 策略详情
        [NameInMap("strategy_details")]
        [Validation(Required=false)]
        public StrategyDetails StrategyDetails { get; set; }

    }

}
