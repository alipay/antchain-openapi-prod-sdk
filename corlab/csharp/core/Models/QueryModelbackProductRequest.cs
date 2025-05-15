// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CORLAB.Models
{
    public class QueryModelbackProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 产品码，不传者返回该用户下所有产品，多个用逗号分隔
        [NameInMap("product_codes")]
        [Validation(Required=true)]
        public string ProductCodes { get; set; }

    }

}
