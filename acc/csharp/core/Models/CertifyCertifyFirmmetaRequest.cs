// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class CertifyCertifyFirmmetaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 自定义唯一id
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 租户类型
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 企业名称
        [NameInMap("firm_name")]
        [Validation(Required=true)]
        public string FirmName { get; set; }

        // 企业营业执照号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 法人姓名
        [NameInMap("lp_cert_name")]
        [Validation(Required=true)]
        public string LpCertName { get; set; }

        // 法人身份证号
        [NameInMap("lp_cert_no")]
        [Validation(Required=true)]
        public string LpCertNo { get; set; }

    }

}
