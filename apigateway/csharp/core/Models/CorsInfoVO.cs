// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // CorsInfoVO
    public class CorsInfoVO : TeaModel {
        // 是否允许发送COOKIE
        [NameInMap("allow_credentials")]
        [Validation(Required=false)]
        public bool? AllowCredentials { get; set; }

        // 允许的 request headers
        [NameInMap("allow_headers")]
        [Validation(Required=false)]
        public List<string> AllowHeaders { get; set; }

        // 允许的http method
        [NameInMap("allow_methods")]
        [Validation(Required=false)]
        public List<string> AllowMethods { get; set; }

        // 允许的 ORIGIN
        [NameInMap("allow_origins")]
        [Validation(Required=false)]
        public List<string> AllowOrigins { get; set; }

        // API数量
        [NameInMap("api_count")]
        [Validation(Required=false)]
        public long? ApiCount { get; set; }

        // cors标识
        [NameInMap("cors_id")]
        [Validation(Required=false)]
        public string CorsId { get; set; }

        // cors名称
        [NameInMap("cors_name")]
        [Validation(Required=false)]
        public string CorsName { get; set; }

        // cors_scop
        [NameInMap("cors_scop")]
        [Validation(Required=false)]
        public string CorsScop { get; set; }

        // cors状态
        [NameInMap("cors_status")]
        [Validation(Required=false)]
        public string CorsStatus { get; set; }

        // 允许暴露的 reponse header
        [NameInMap("expose_headers")]
        [Validation(Required=false)]
        public List<string> ExposeHeaders { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 预检请求的有效期
        [NameInMap("max_age")]
        [Validation(Required=false)]
        public long? MaxAge { get; set; }

        // 创建人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 租户标识
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 工作空间标识
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
