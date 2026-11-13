// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CORLAB.Models
{
    public class QueryModelbackProductextRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 通过产品Code查询出相关产品的产品名、模版字段等信息
        [NameInMap("product_codes")]
        [Validation(Required=false)]
        public List<string> ProductCodes { get; set; }

    }

}
