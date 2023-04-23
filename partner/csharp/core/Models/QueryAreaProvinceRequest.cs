// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    public class QueryAreaProvinceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 省份, 空:全部省份, 不为空筛选关键字省份
        [NameInMap("province")]
        [Validation(Required=false)]
        public string Province { get; set; }

    }

}
