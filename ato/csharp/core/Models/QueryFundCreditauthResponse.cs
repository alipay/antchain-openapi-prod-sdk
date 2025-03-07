// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryFundCreditauthResponse : TeaModel {
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

        // 授权类型
        // ● CREDIT_GRANTING 授信
        // ● CREDIT_UTILIZATION 用信
        [NameInMap("auth_type")]
        [Validation(Required=false)]
        public string AuthType { get; set; }

        // 授权结果
        // AUTHORIZED 已同意
        // REJECTED 已拒绝
        // EXPIRED 已过期
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

        // 授信/用信授权信息,json结构
        [NameInMap("auth_info")]
        [Validation(Required=false)]
        public string AuthInfo { get; set; }

    }

}
