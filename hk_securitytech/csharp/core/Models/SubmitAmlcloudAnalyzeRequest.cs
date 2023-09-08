// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.HK_SECURITYTECH.Models
{
    public class SubmitAmlcloudAnalyzeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // biz_code
        [NameInMap("biz_code")]
        [Validation(Required=true)]
        public string BizCode { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // tnt_inst_id
        [NameInMap("tnt_inst_id")]
        [Validation(Required=true)]
        public string TntInstId { get; set; }

        // extendData
        [NameInMap("extend_data")]
        [Validation(Required=true)]
        public ExtendData ExtendData { get; set; }

    }

}
