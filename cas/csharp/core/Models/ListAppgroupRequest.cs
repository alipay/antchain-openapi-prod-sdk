// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ListAppgroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 动态查询
        [NameInMap("dynamic_query")]
        [Validation(Required=false)]
        public DynamicQuery DynamicQuery { get; set; }

        // 应用分组查询
        [NameInMap("query")]
        [Validation(Required=false)]
        public AppDomainQuery Query { get; set; }

    }

}
