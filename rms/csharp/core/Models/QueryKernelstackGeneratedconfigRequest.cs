// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryKernelstackGeneratedconfigRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 不带租户id和workspaceId的universalTableId后缀
        [NameInMap("simple_table_id")]
        [Validation(Required=true)]
        public string SimpleTableId { get; set; }

    }

}
