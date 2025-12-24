// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    // 法人信息
    public class LegalInfo : TeaModel {
        // 法人名称
        [NameInMap("legal_name")]
        [Validation(Required=true)]
        public string LegalName { get; set; }

        // 法人证件号
        [NameInMap("legal_cert_no")]
        [Validation(Required=true)]
        public string LegalCertNo { get; set; }

        // 法人证件正面（人像面）
        [NameInMap("legal_cert_front_file")]
        [Validation(Required=true)]
        public FileInfo LegalCertFrontFile { get; set; }

        // 法人证件反面
        [NameInMap("legal_cert_back_file")]
        [Validation(Required=true)]
        public FileInfo LegalCertBackFile { get; set; }

        // 法人证件是否长期有效（payChannel =JDPAY必填）
        // true：长期，false：非长期
        // 
        [NameInMap("legal_cert_expire_flag")]
        [Validation(Required=false)]
        public bool? LegalCertExpireFlag { get; set; }

        // 法人手机号（payChannel =JDPAY必填）
        [NameInMap("legal_mobile")]
        [Validation(Required=false)]
        public string LegalMobile { get; set; }

        // 证件有效期开始日期（payChannel =JDPAY必填）
        // legalCertExpireFlag=false/true时都必填，时间格式:yyyy-MM-dd
        [NameInMap("legal_effect_date")]
        [Validation(Required=false)]
        public string LegalEffectDate { get; set; }

        // 证件有效期结束（payChannel =JDPAY选填）
        // legalCertExpireFlag=false时必填，时间格式:yyyy-MM-dd
        [NameInMap("legal_expire_date")]
        [Validation(Required=false)]
        public string LegalExpireDate { get; set; }

    }

}
