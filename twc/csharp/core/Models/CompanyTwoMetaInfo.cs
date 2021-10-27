// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 企业信息
    public class CompanyTwoMetaInfo : TeaModel {
        // 企业证件名称
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 企业证件号码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 证件类型, 默认社会统一信用代码  NATIONAL_LEGAL_MERGE:统一社会信用代码，NATIONAL_LEGAL：营业执照号码
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public string CertType { get; set; }

    }

}
