// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class CreateSidecarInstanceRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 规则描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 实例名称
        [NameInMap("instance_name")]
        [Validation(Required=false)]
        public string InstanceName { get; set; }

        // 环境参数模板
        [NameInMap("params")]
        [Validation(Required=false)]
        public string Params { get; set; }

        // 自定义规则内容
        [NameInMap("rule")]
        [Validation(Required=false)]
        public string Rule { get; set; }

        // sidecar生效范围：workspace、workspace_group、region	
        // 
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // scope对应的唯一标识，例如workspace对应workspace id	
        // 
        [NameInMap("scope_identity")]
        [Validation(Required=false)]
        public string ScopeIdentity { get; set; }

        // sidecar版本id	
        // 
        [NameInMap("sidecar_release_version_id")]
        [Validation(Required=false)]
        public string SidecarReleaseVersionId { get; set; }

        // sidecar环境参数配置	
        // 
        [NameInMap("params_configs")]
        [Validation(Required=false)]
        public List<SidecarParamsConfig> ParamsConfigs { get; set; }

    }

}
