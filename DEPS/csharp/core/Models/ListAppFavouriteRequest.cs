// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class ListAppFavouriteRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
        [NameInMap("orders")]
        [Validation(Required=false)]
        public List<string> Orders { get; set; }

    }

}
