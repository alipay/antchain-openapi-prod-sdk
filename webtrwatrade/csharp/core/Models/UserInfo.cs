// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 用户信息
    public class UserInfo : TeaModel {
        // 钱包地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

    }

}
