// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ListSlsLogstoreRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 用于请求的 Logstore 名称（支持部分匹配）。
        [NameInMap("logstore_name")]
        [Validation(Required=false)]
        public string LogstoreName { get; set; }

        // 日志项目名称
        [NameInMap("project_name")]
        [Validation(Required=true)]
        public string ProjectName { get; set; }

        // 区域id
        [NameInMap("sls_region_id")]
        [Validation(Required=false)]
        public string SlsRegionId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

    }

}
