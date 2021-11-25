// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 关联企业信息
    public class RefFirm : TeaModel {
        // 企业Id
        // 
        // 
        [NameInMap("firm_user_id")]
        [Validation(Required=true)]
        public long? FirmUserId { get; set; }

        // did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 	
        // 企业所在地
        [NameInMap("firm_address")]
        [Validation(Required=true)]
        public string FirmAddress { get; set; }

        // 企业认证状态
        [NameInMap("firm_cert_status")]
        [Validation(Required=true)]
        public string FirmCertStatus { get; set; }

        // 行业类型
        [NameInMap("industry_type")]
        [Validation(Required=true)]
        public string IndustryType { get; set; }

        // 企业营业执照注册号
        // 
        // 
        [NameInMap("cert_reg_no")]
        [Validation(Required=true)]
        public string CertRegNo { get; set; }

        // 营业执照文件osskey
        // 
        // 
        [NameInMap("cert_reg_file_id")]
        [Validation(Required=true)]
        public string CertRegFileId { get; set; }

        // 营业文件类型(JPEG,JPG)
        // 
        // 
        [NameInMap("cert_reg_file_type")]
        [Validation(Required=true)]
        public string CertRegFileType { get; set; }

        // 法定代表人证件类型
        [NameInMap("lp_cert_type")]
        [Validation(Required=true)]
        public string LpCertType { get; set; }

        // 法人证件号码	
        // 
        [NameInMap("lp_cert_no")]
        [Validation(Required=true)]
        public string LpCertNo { get; set; }

        // 法人姓名
        // 
        // 
        [NameInMap("lp_name")]
        [Validation(Required=true)]
        public string LpName { get; set; }

        // 法人身份证正面图片字节信息，osskeyId
        // 
        // 
        [NameInMap("lp_cert_file_front_id")]
        [Validation(Required=true)]
        public string LpCertFileFrontId { get; set; }

        // 法人身份证正面图片文件类型
        // 
        // 
        [NameInMap("lp_cert_file_front_type")]
        [Validation(Required=true)]
        public string LpCertFileFrontType { get; set; }

        // 企业法人证件反面图片，osskeyId
        // 
        // 
        [NameInMap("lp_cert_file_reverse_id")]
        [Validation(Required=true)]
        public string LpCertFileReverseId { get; set; }

        // 法人身份证反面图片文件类型
        // 
        // 
        [NameInMap("lp_cert_file_reverse_type")]
        [Validation(Required=true)]
        public string LpCertFileReverseType { get; set; }

        // 施工资质
        // 
        // 
        [NameInMap("constructions")]
        [Validation(Required=true)]
        public List<Construction> Constructions { get; set; }

        // 企业名称
        // 
        // 
        [NameInMap("firm_name")]
        [Validation(Required=true)]
        public string FirmName { get; set; }

        // 关联关系 （参见附录三）
        // 
        // 
        [NameInMap("refer_type")]
        [Validation(Required=true)]
        public string ReferType { get; set; }

        // 资信-财报
        // 
        // 
        [NameInMap("account_results")]
        [Validation(Required=true)]
        public List<AccountResult> AccountResults { get; set; }

        // 资信-担保
        // 
        // 
        [NameInMap("assures")]
        [Validation(Required=true)]
        public List<Assure> Assures { get; set; }

        // 奖项
        // 
        // 
        [NameInMap("awards")]
        [Validation(Required=true)]
        public List<Award> Awards { get; set; }

        // 银行授信
        // 
        // 
        [NameInMap("bank_cert")]
        [Validation(Required=true)]
        public BankCert BankCert { get; set; }

        // 类型
        [NameInMap("firm_type")]
        [Validation(Required=true)]
        public string FirmType { get; set; }

        // 银行授信状态
        [NameInMap("bank_cert_status")]
        [Validation(Required=false)]
        public bool? BankCertStatus { get; set; }

        // 资质证书状态
        [NameInMap("construction_status")]
        [Validation(Required=false)]
        public bool? ConstructionStatus { get; set; }

        // 资信-财报状态
        [NameInMap("account_result_status")]
        [Validation(Required=true)]
        public bool? AccountResultStatus { get; set; }

        // 奖项状态
        [NameInMap("award_status")]
        [Validation(Required=false)]
        public bool? AwardStatus { get; set; }

    }

}
