// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryOpsappsvcRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用的名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 当前页码，默认为1
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public int? PageNum { get; set; }

        // 分页大小，默认10，最大50
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public int? PageSize { get; set; }

        // 应用服务的名称，如果为空，会查询该应用下所有应用服务的运维历史
        [NameInMap("service_name")]
        [Validation(Required=false)]
        public string ServiceName { get; set; }

    }

}
