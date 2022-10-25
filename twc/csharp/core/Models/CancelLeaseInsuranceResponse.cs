// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CancelLeaseInsuranceResponse : TeaModel {
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

        // 退保状态：CALCE_FAIL退保失败、CACEL_SUCCESS退保成功、CANCELING退保中
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 退保保单号
        [NameInMap("policy_no")]
        [Validation(Required=false)]
        public string PolicyNo { get; set; }

        // 退还保费，单位：分
        [NameInMap("srd_premium")]
        [Validation(Required=false)]
        public string SrdPremium { get; set; }

        // 结果码，00表示成功
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 结果描述
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
