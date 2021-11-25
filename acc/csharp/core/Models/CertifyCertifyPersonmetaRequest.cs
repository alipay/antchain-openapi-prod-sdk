// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class CertifyCertifyPersonmetaRequest : TeaModel {
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

        // 姓名
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 身份证号
        [NameInMap("user_cert_no")]
        [Validation(Required=true)]
        public string UserCertNo { get; set; }

    }

}
