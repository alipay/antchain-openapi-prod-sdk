// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QuerySecurityTextdetoxificationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 待祛毒语料文本
        [NameInMap("question")]
        [Validation(Required=true)]
        public string Question { get; set; }

        // 租户标识
        [NameInMap("business_id")]
        [Validation(Required=false)]
        public string BusinessId { get; set; }

        // 应用码
        [NameInMap("app_code")]
        [Validation(Required=true)]
        public string AppCode { get; set; }

    }

}
