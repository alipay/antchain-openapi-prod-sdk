// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 签署人状态
    public class AntSignOperatorResult : TeaModel {
        // 签署方UserId
        [NameInMap("sign_user_id")]
        [Validation(Required=true)]
        public string SignUserId { get; set; }

        // 签署方证件号
        [NameInMap("sign_cert_no")]
        [Validation(Required=true)]
        public string SignCertNo { get; set; }

        // 签署方证件名称
        [NameInMap("sign_cert_name")]
        [Validation(Required=true)]
        public string SignCertName { get; set; }

        // 签署方证件类型
        [NameInMap("sign_cert_type")]
        [Validation(Required=true)]
        public string SignCertType { get; set; }

        // 是否授权
        [NameInMap("authorized")]
        [Validation(Required=true)]
        public long? Authorized { get; set; }

        // 授权时间
        [NameInMap("authorize_time")]
        [Validation(Required=false)]
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

        // 邮件联系地址
        [NameInMap("email_address")]
        [Validation(Required=false)]
        public string EmailAddress { get; set; }

        // 电话联系方式
        [NameInMap("mobile_number")]
        [Validation(Required=false)]
        public string MobileNumber { get; set; }

        // 签署顺序
        [NameInMap("sign_order")]
        [Validation(Required=false)]
        public long? SignOrder { get; set; }

        // 签署失败原因
        [NameInMap("fail_info")]
        [Validation(Required=false)]
        public string FailInfo { get; set; }

        // 备注
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 是否我方公司
        [NameInMap("our_corp")]
        [Validation(Required=false)]
        public long? OurCorp { get; set; }

        // 签署状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 签署时间
        [NameInMap("sign_time")]
        [Validation(Required=false)]
        public string SignTime { get; set; }

        // [签署方子类型 企业子类型： BUS：企业 SINGLE：个体工商户 GOV：党政机关 INST：事业单位 COMMON：社会组织 OTHER：其他组织
        [NameInMap("sign_sub_type")]
        [Validation(Required=false)]
        public string SignSubType { get; set; }

    }

}
