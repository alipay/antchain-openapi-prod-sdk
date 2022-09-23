// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 司法纠纷平台自然人通用结构体
    public class JudicialPersonInfo : TeaModel {
        // 姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 身份证号码
        [NameInMap("cert_number")]
        [Validation(Required=false)]
        public string CertNumber { get; set; }

        // 联系电话
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 民族
        [NameInMap("nationality")]
        [Validation(Required=false)]
        public string Nationality { get; set; }

        // 通讯地址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 身份证明
        [NameInMap("identity_certification")]
        [Validation(Required=false)]
        public JudicialFileInfo IdentityCertification { get; set; }

        // 职务
        [NameInMap("job_title")]
        [Validation(Required=false)]
        public string JobTitle { get; set; }

        // 任职证明
        [NameInMap("job_certification")]
        [Validation(Required=false)]
        public JudicialFileInfo JobCertification { get; set; }

        // 性别， 0-男，1-女
        [NameInMap("sex")]
        [Validation(Required=false)]
        public long? Sex { get; set; }

        // 联系邮件地址
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

    }

}
