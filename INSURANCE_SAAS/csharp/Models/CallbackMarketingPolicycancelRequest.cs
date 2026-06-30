// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class CallbackMarketingPolicycancelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求 id，做防重校验逻辑
        // 接口根据 requestId 做防重校验逻辑，若重复会报错
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 保单号（可脱敏处理）
        [NameInMap("policy_no")]
        [Validation(Required=true)]
        public string PolicyNo { get; set; }

        // 退保时间（yyyy-MM-dd  HH:mm:ss）
        [NameInMap("cancel_time")]
        [Validation(Required=true)]
        public string CancelTime { get; set; }

        // 保险止期（yyyy-MM-dd  HH:mm:ss）
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public string EndTime { get; set; }

    }

}
