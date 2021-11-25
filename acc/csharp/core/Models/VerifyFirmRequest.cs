// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class VerifyFirmRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 账号id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public long? UserId { get; set; }

        // 企业名称
        [NameInMap("firm_name")]
        [Validation(Required=false)]
        public string FirmName { get; set; }

        // 企业类型
        [NameInMap("firm_type")]
        [Validation(Required=false)]
        public string FirmType { get; set; }

        // 企业营业执照注册号
        [NameInMap("cert_reg_no")]
        [Validation(Required=false)]
        public string CertRegNo { get; set; }

        // 企业营业执照图片，osskey
        [NameInMap("cert_reg_file_id")]
        [Validation(Required=false)]
        public string CertRegFileId { get; set; }

        // 法人证件类型
        [NameInMap("lp_cert_type")]
        [Validation(Required=false)]
        public string LpCertType { get; set; }

        // 证件号码
        [NameInMap("lp_cert_no")]
        [Validation(Required=false)]
        public string LpCertNo { get; set; }

        // 企业法人证件正面图片
        [NameInMap("lp_cert_file_front_id")]
        [Validation(Required=false)]
        public string LpCertFileFrontId { get; set; }

        // 企业法人证件反面图片
        // 
        // 
        [NameInMap("lp_cert_file_reverse_id")]
        [Validation(Required=false)]
        public string LpCertFileReverseId { get; set; }

        // JPEG,JPG
        [NameInMap("cert_reg_file_type")]
        [Validation(Required=false)]
        public string CertRegFileType { get; set; }

        // JPG
        [NameInMap("lp_cert_file_front_type")]
        [Validation(Required=false)]
        public string LpCertFileFrontType { get; set; }

        // 身份证反面文件类型
        [NameInMap("lp_cert_file_reverse_type")]
        [Validation(Required=false)]
        public string LpCertFileReverseType { get; set; }

        // 法人姓名
        [NameInMap("lp_name")]
        [Validation(Required=false)]
        public string LpName { get; set; }

        // 租户信息
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 行业类型
        [NameInMap("industry_type")]
        [Validation(Required=false)]
        public string IndustryType { get; set; }

        // 公司所在地
        [NameInMap("firm_address")]
        [Validation(Required=false)]
        public string FirmAddress { get; set; }

        // 提交类型
        [NameInMap("operation_type")]
        [Validation(Required=true)]
        public string OperationType { get; set; }

    }

}
