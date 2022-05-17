// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ListAppportraitAppRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 应用分组名称
        [NameInMap("app_group_name")]
        [Validation(Required=false)]
        public string AppGroupName { get; set; }

        // 应用负责人
        [NameInMap("owner_display_name")]
        [Validation(Required=false)]
        public string OwnerDisplayName { get; set; }

        // 技术栈名称
        [NameInMap("buildpack_name")]
        [Validation(Required=false)]
        public string BuildpackName { get; set; }

        // 技术栈版本
        [NameInMap("buildpack_version")]
        [Validation(Required=false)]
        public string BuildpackVersion { get; set; }

        // TenantId
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // TenantName
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

    }

}
