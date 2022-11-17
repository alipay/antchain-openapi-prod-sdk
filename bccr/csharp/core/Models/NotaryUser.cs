// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 出证用户（申请人，经办人）
    public class NotaryUser : TeaModel {
        // 用户类型
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

        // 用户名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 用户账号
        [NameInMap("user_account")]
        [Validation(Required=false)]
        public string UserAccount { get; set; }

        // 证件类型
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 证件号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 联系电话
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 法定代表人姓名,用户类型为机构时必填
        [NameInMap("legal_person_name")]
        [Validation(Required=false)]
        public string LegalPersonName { get; set; }

        // 法定代表人证件号码,用户类型为机构时必填
        [NameInMap("legal_person_cert_no")]
        [Validation(Required=false)]
        public string LegalPersonCertNo { get; set; }

        // 法定代表人证件类型
        [NameInMap("legal_person_cert_type")]
        [Validation(Required=false)]
        public string LegalPersonCertType { get; set; }

        // 身份证正面
        [NameInMap("cert_front_file")]
        [Validation(Required=false)]
        public string CertFrontFile { get; set; }

        // 身份证反面
        [NameInMap("cert_back_file")]
        [Validation(Required=false)]
        public string CertBackFile { get; set; }

        // 企业营业执照
        [NameInMap("enterprise_cert_file")]
        [Validation(Required=false)]
        public string EnterpriseCertFile { get; set; }

    }

}
