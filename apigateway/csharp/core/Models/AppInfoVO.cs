// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // AppInfoVO
    public class AppInfoVO : TeaModel {
        // api_count
        [NameInMap("api_count")]
        [Validation(Required=false)]
        public long? ApiCount { get; set; }

        // app_id
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // appSecret
        [NameInMap("app_secret")]
        [Validation(Required=false)]
        public string AppSecret { get; set; }

        // app类型
        [NameInMap("app_type")]
        [Validation(Required=false)]
        public string AppType { get; set; }

        // authenticationConfig
        [NameInMap("authentication_config")]
        [Validation(Required=false)]
        public AuthenticationConfigVO AuthenticationConfig { get; set; }

        // 是否可以删除
        [NameInMap("can_delete")]
        [Validation(Required=false)]
        public bool? CanDelete { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // encryptConfig
        [NameInMap("encrypt_config")]
        [Validation(Required=false)]
        public EncryptConfigVO EncryptConfig { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // operator
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
