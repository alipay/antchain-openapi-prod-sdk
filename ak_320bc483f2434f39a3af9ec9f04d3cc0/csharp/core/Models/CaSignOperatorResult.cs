// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 签署人状态
    public class CaSignOperatorResult : TeaModel {
        // 签署方UserId
        [NameInMap("sign_user_id")]
        [Validation(Required=true)]
        public string SignUserId { get; set; }

        // 签署方证件号
        [NameInMap("sign_cert_no")]
        [Validation(Required=false)]
        public string SignCertNo { get; set; }

        // 签署方证件名称
        [NameInMap("sign_cert_name")]
        [Validation(Required=true)]
        public string SignCertName { get; set; }

        // 签署方证件类型
        [NameInMap("sign_cert_type")]
        [Validation(Required=false)]
        public string SignCertType { get; set; }

        // 是否授权
        [NameInMap("authorized")]
        [Validation(Required=false)]
        public long? Authorized { get; set; }

        // 授权时间
        [NameInMap("authorize_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AuthorizeTime { get; set; }

        // 授权人证件号码
        [NameInMap("auth_person_cert_no")]
        [Validation(Required=false)]
        public string AuthPersonCertNo { get; set; }

        // 授权人证件名称
        [NameInMap("auth_person_cert_name")]
        [Validation(Required=false)]
        public string AuthPersonCertName { get; set; }

        // 授权人证件类型
        [NameInMap("auth_person_cert_type")]
        [Validation(Required=false)]
        public string AuthPersonCertType { get; set; }

        // 签署失败原因
        [NameInMap("fail_info")]
        [Validation(Required=false)]
        public string FailInfo { get; set; }

        // SIGNNED
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 签署时间
        [NameInMap("sign_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string SignTime { get; set; }

        // 是否我方公司
        [NameInMap("our_corp")]
        [Validation(Required=false)]
        public long? OurCorp { get; set; }

        // 电话联系方式，脱敏显示
        [NameInMap("mobile_number")]
        [Validation(Required=false)]
        public string MobileNumber { get; set; }

        // 邮件联系地址，脱敏展示返回
        [NameInMap("email_address")]
        [Validation(Required=false)]
        public string EmailAddress { get; set; }

    }

}
