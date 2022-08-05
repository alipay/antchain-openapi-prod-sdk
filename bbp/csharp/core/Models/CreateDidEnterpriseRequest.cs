// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    public class CreateDidEnterpriseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        [NameInMap("biz_code")]
        [Validation(Required=true)]
        public string BizCode { get; set; }

        // 企业唯一编码
        [NameInMap("enterprise_code")]
        [Validation(Required=true)]
        public string EnterpriseCode { get; set; }

        // 企业名称
        [NameInMap("enterprise_name")]
        [Validation(Required=false)]
        public string EnterpriseName { get; set; }

        // ORG_CERT 全国组织机构代码证书
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public string CertType { get; set; }

    }

}
