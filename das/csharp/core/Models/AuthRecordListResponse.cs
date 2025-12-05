// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 授权记录列表响应
    public class AuthRecordListResponse : TeaModel {
        // 授权请求id
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 授权用户did
        [NameInMap("user_did")]
        [Validation(Required=true)]
        public string UserDid { get; set; }

        // 授权用户信息
        [NameInMap("user_info")]
        [Validation(Required=true)]
        public string UserInfo { get; set; }

        // 授权内容
        [NameInMap("auth_content")]
        [Validation(Required=true)]
        public AuthContent AuthContent { get; set; }

        // 授权结果
        [NameInMap("auth_result")]
        [Validation(Required=true)]
        public bool? AuthResult { get; set; }

        // 授权请求时间
        [NameInMap("request_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string RequestTime { get; set; }

        // 协议列表
        [NameInMap("agreement_list")]
        [Validation(Required=true)]
        public List<Agreement> AgreementList { get; set; }

    }

}
