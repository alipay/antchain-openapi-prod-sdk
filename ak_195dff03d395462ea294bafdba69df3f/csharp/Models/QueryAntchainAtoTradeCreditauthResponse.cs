// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class QueryAntchainAtoTradeCreditauthResponse : TeaModel {
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

        // 授权id
        [NameInMap("auth_id")]
        [Validation(Required=false)]
        public string AuthId { get; set; }

        // 商户统一社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 资方统一社会信用代码
        [NameInMap("fund_id")]
        [Validation(Required=false)]
        public string FundId { get; set; }

        // 授权类型
        [NameInMap("auth_type")]
        [Validation(Required=false)]
        public string AuthType { get; set; }

        // 授权结果
        [NameInMap("auth_result")]
        [Validation(Required=false)]
        public string AuthResult { get; set; }

        // 授权开始时间
        [NameInMap("auth_begin_time")]
        [Validation(Required=false)]
        public string AuthBeginTime { get; set; }

        // 授权结束时间
        [NameInMap("auth_end_time")]
        [Validation(Required=false)]
        public string AuthEndTime { get; set; }

        // 授权申请过期时间
        [NameInMap("auth_apply_expire_time")]
        [Validation(Required=false)]
        public string AuthApplyExpireTime { get; set; }

        // 授权信息
        [NameInMap("auth_info")]
        [Validation(Required=false)]
        public string AuthInfo { get; set; }

        // 合同信息
        [NameInMap("auth_contract")]
        [Validation(Required=false)]
        public string AuthContract { get; set; }

    }

}
