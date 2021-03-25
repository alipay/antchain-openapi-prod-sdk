// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateSidecarVersionRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // sidecar版本描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // sidecar生效范围：workspace、workspace_group、region	
        // 
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // scope对应的唯一标识，例如workspace对应workspace id
        [NameInMap("scope_identity")]
        [Validation(Required=false)]
        public string ScopeIdentity { get; set; }

        // sidecar名称
        [NameInMap("sidecar_name")]
        [Validation(Required=false)]
        public string SidecarName { get; set; }

        // sidecar版本号
        [NameInMap("sidecar_version")]
        [Validation(Required=false)]
        public string SidecarVersion { get; set; }

        // 版本状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // sidecar模板内容
        [NameInMap("template")]
        [Validation(Required=false)]
        public string Template { get; set; }

        // sidecar模板配置
        [NameInMap("template_configs")]
        [Validation(Required=false)]
        public List<SidecarTemplateConfig> TemplateConfigs { get; set; }

        // sidecar版本类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 版本周期：alpha/beta/release
        // 
        [NameInMap("version_period")]
        [Validation(Required=false)]
        public string VersionPeriod { get; set; }

        // 版本特性
        [NameInMap("release_note")]
        [Validation(Required=false)]
        public string ReleaseNote { get; set; }

    }

}
