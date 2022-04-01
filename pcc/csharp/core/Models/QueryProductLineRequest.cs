// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    public class QueryProductLineRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 是否查询l3级产品
        [NameInMap("need_product")]
        [Validation(Required=true)]
        public bool? NeedProduct { get; set; }

        // 是否查询l5
        [NameInMap("need_sku")]
        [Validation(Required=true)]
        public bool? NeedSku { get; set; }

    }

}
