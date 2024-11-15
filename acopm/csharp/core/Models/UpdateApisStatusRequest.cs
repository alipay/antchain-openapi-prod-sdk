// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class UpdateApisStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 待更新的api数组
        [NameInMap("apis")]
        [Validation(Required=true)]
        public List<string> Apis { get; set; }

        // 产品码，原字段废弃
        [NameInMap("new_product_code")]
        [Validation(Required=true)]
        public string NewProductCode { get; set; }

    }

}
