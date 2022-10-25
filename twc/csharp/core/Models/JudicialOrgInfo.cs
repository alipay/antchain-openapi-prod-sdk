// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 司法纠纷平台企业信息通用结构体
    public class JudicialOrgInfo : TeaModel {
        // 企业名称
        [NameInMap("org_name")]
        [Validation(Required=true)]
        public string OrgName { get; set; }

        // 企业或机构社会统一信用代码
        [NameInMap("org_cert_num")]
        [Validation(Required=true)]
        public string OrgCertNum { get; set; }

        // 企业联系电话
        [NameInMap("org_phone")]
        [Validation(Required=true)]
        public string OrgPhone { get; set; }

        // 企业联系邮箱
        [NameInMap("org_email")]
        [Validation(Required=false)]
        public string OrgEmail { get; set; }

        // 企业通讯地址
        [NameInMap("org_address")]
        [Validation(Required=false)]
        public string OrgAddress { get; set; }

        // 企业营业执照地址
        [NameInMap("residence_address")]
        [Validation(Required=false)]
        public string ResidenceAddress { get; set; }

        // 企业或机构营业执照信息
        [NameInMap("org_biz_license_info")]
        [Validation(Required=false)]
        public JudicialFileInfo OrgBizLicenseInfo { get; set; }

        // 企业法人信息
        [NameInMap("org_legal_person_info")]
        [Validation(Required=false)]
        public JudicialPersonInfo OrgLegalPersonInfo { get; set; }

        // 企业或机构签章管理员信息
        [NameInMap("org_signature_manager_person_info")]
        [Validation(Required=false)]
        public JudicialPersonInfo OrgSignatureManagerPersonInfo { get; set; }

        // 企业或机构收款银行账户信息
        [NameInMap("org_bank_info")]
        [Validation(Required=false)]
        public JudicialBankInfo OrgBankInfo { get; set; }

    }

}
