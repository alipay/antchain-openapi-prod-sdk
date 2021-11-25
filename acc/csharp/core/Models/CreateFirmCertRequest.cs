// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class CreateFirmCertRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 云蚂侧企业id
        [NameInMap("firm_id")]
        [Validation(Required=true)]
        public long? FirmId { get; set; }

        // 企业名称
        [NameInMap("firm_name")]
        [Validation(Required=true)]
        public string FirmName { get; set; }

        // 企业类型
        [NameInMap("firm_type")]
        [Validation(Required=false)]
        public string FirmType { get; set; }

        // 行业类型
        [NameInMap("industry_type")]
        [Validation(Required=true)]
        public string IndustryType { get; set; }

        // 企业地址省份
        [NameInMap("firm_address")]
        [Validation(Required=true)]
        public string FirmAddress { get; set; }

        // 企业营业执照注册号
        [NameInMap("cert_reg_no")]
        [Validation(Required=true)]
        public string CertRegNo { get; set; }

        // 营业执照图片id，应用侧fileId
        [NameInMap("cert_reg_file")]
        [Validation(Required=true)]
        public long? CertRegFile { get; set; }

        // 营业执照图片类型(JPEG,JPG)
        [NameInMap("cert_reg_file_type")]
        [Validation(Required=true)]
        public string CertRegFileType { get; set; }

        // 法定代表人证件类型
        [NameInMap("lp_cert_type")]
        [Validation(Required=true)]
        public string LpCertType { get; set; }

        // 法人证件号码
        [NameInMap("lp_cert_no")]
        [Validation(Required=true)]
        public string LpCertNo { get; set; }

        // 法人姓名
        [NameInMap("lp_name")]
        [Validation(Required=true)]
        public string LpName { get; set; }

        // 法人身份证正面图片id，应用侧FileId
        [NameInMap("lp_cert_file_front")]
        [Validation(Required=true)]
        public long? LpCertFileFront { get; set; }

        // 法人身份证正面图片文件类型(JPEG,JPG)
        [NameInMap("lp_cert_file_front_type")]
        [Validation(Required=true)]
        public string LpCertFileFrontType { get; set; }

        // 法人身份证反面图片id，应用侧FileId
        [NameInMap("lp_cert_file_reverse")]
        [Validation(Required=true)]
        public long? LpCertFileReverse { get; set; }

        // 法人身份证反面图片id，应用侧FileId
        [NameInMap("lp_cert_file_reverse_type")]
        [Validation(Required=true)]
        public string LpCertFileReverseType { get; set; }

    }

}
