// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 用户信息
    public class UserData : TeaModel {
        // 用户账号
        [NameInMap("account")]
        [Validation(Required=true)]
        public string Account { get; set; }

        // 账号类型
        [NameInMap("account_type")]
        [Validation(Required=true)]
        public string AccountType { get; set; }

        // 证件名称
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 证件号码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 证件类型
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 联系方式
        [NameInMap("contact_info")]
        [Validation(Required=false)]
        public string ContactInfo { get; set; }

        // 企业法人
        [NameInMap("legal_person")]
        [Validation(Required=false)]
        public string LegalPerson { get; set; }

        // 注册时间
        [NameInMap("reg_time")]
        [Validation(Required=true)]
        public long? RegTime { get; set; }

        // 账号状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 用户类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
