// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 银行
    public class Bank : TeaModel {
        // 地址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 银行编号
        [NameInMap("bank_no")]
        [Validation(Required=false)]
        public string BankNo { get; set; }

        // 法人证件号
        [NameInMap("legal_person_cert_no")]
        [Validation(Required=false)]
        public string LegalPersonCertNo { get; set; }

        // 法人手机号
        [NameInMap("legal_person_mobile")]
        [Validation(Required=false)]
        public string LegalPersonMobile { get; set; }

        // 法人姓名
        [NameInMap("legal_person_name")]
        [Validation(Required=false)]
        public string LegalPersonName { get; set; }

        // 行内级别，比如：SUB_BRANCH=支行
        [NameInMap("level")]
        [Validation(Required=false)]
        public string Level { get; set; }

        // 蚂蚁智能合同的机构id
        [NameInMap("myc_org_id")]
        [Validation(Required=false)]
        public string MycOrgId { get; set; }

        // 银行名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // OSS存储跟路径
        [NameInMap("oss_base_fold")]
        [Validation(Required=false)]
        public string OssBaseFold { get; set; }

        // 银行证件号
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 上级行号，比如支行对应的分行
        [NameInMap("parent_bank_no")]
        [Validation(Required=false)]
        public string ParentBankNo { get; set; }

        // 蚂蚁链隐私数据网络的身份id
        [NameInMap("pdn_did")]
        [Validation(Required=false)]
        public string PdnDid { get; set; }

        // 公钥
        [NameInMap("pub_key")]
        [Validation(Required=false)]
        public string PubKey { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 法人证件类型，比如：ID_CARD=身份证
        [NameInMap("legal_person_cert_type")]
        [Validation(Required=false)]
        public string LegalPersonCertType { get; set; }

        // 授权合同签署后小程序端的回跳地址
        [NameInMap("auth_callback_url")]
        [Validation(Required=false)]
        public string AuthCallbackUrl { get; set; }

        // 抵押登记相关合同签署后小程序端的回跳地址
        [NameInMap("mg_callback_url")]
        [Validation(Required=false)]
        public string MgCallbackUrl { get; set; }

        // 银行接收房产链通知接口地址
        [NameInMap("bk_callback_url")]
        [Validation(Required=false)]
        public string BkCallbackUrl { get; set; }

        // 银行证件类型
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public string CertType { get; set; }

    }

}
