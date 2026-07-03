// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRpgwSignUrlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业标识，固定值
        [NameInMap("company_code")]
        [Validation(Required=true)]
        public string CompanyCode { get; set; }

        // 调用方平台用户id
        [NameInMap("platform_user_identification")]
        [Validation(Required=true)]
        public string PlatformUserIdentification { get; set; }

        // 手机号
        [NameInMap("user_code")]
        [Validation(Required=true)]
        public string UserCode { get; set; }

    }

}
