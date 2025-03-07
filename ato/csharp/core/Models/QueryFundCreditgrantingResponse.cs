// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryFundCreditgrantingResponse : TeaModel {
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

        // 授信id
        [NameInMap("granting_id")]
        [Validation(Required=false)]
        public string GrantingId { get; set; }

        // 授信授权id
        [NameInMap("auth_id")]
        [Validation(Required=false)]
        public string AuthId { get; set; }

        // 资方社会信用代码
        [NameInMap("fund_id")]
        [Validation(Required=false)]
        public string FundId { get; set; }

        // 商户社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 商户租户id
        // 
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 授信额度，单位为分
        [NameInMap("granting_line")]
        [Validation(Required=false)]
        public long? GrantingLine { get; set; }

        // 授信有效期开始时间(yyyy-MM-dd HH:mm:ss)
        [NameInMap("effect_start_time")]
        [Validation(Required=false)]
        public string EffectStartTime { get; set; }

        // 授信有效期结束时间(yyyy-MM-dd HH:mm:ss)
        [NameInMap("effect_end_time")]
        [Validation(Required=false)]
        public string EffectEndTime { get; set; }

        // 授信状态
        // CREDITED:已授信
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
