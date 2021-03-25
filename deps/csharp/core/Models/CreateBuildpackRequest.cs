// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class CreateBuildpackRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 技术栈所支持的租户名称列表
        [NameInMap("available_tenant_names")]
        [Validation(Required=false)]
        public List<string> AvailableTenantNames { get; set; }

        // 技术栈的编译打包命令
        [NameInMap("build_command")]
        [Validation(Required=false)]
        public string BuildCommand { get; set; }

        // 分享给其他租户时留下的联系信息
        [NameInMap("contact_info")]
        [Validation(Required=false)]
        public string ContactInfo { get; set; }

        // 当前技术栈是否是debug模式
        [NameInMap("debug_mode")]
        [Validation(Required=false)]
        public bool? DebugMode { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 环境变量
        [NameInMap("env_params")]
        [Validation(Required=false)]
        public List<BuildpackParamTemplate> EnvParams { get; set; }

        // 技术栈的版本号
        [NameInMap("full_version")]
        [Validation(Required=false)]
        public string FullVersion { get; set; }

        // 主版本号
        [NameInMap("major_version")]
        [Validation(Required=false)]
        public long? MajorVersion { get; set; }

        // 次版本号
        [NameInMap("minor_version")]
        [Validation(Required=false)]
        public long? MinorVersion { get; set; }

        // 补丁版本号
        [NameInMap("patch_version")]
        [Validation(Required=false)]
        public long? PatchVersion { get; set; }

        // 技术栈的作用域，可以是SYSTEM或者CUSTOM
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // 支持的操作系统ID
        [NameInMap("supported_os")]
        [Validation(Required=false)]
        public List<long?> SupportedOs { get; set; }

        // 技术栈支持的地域信息
        [NameInMap("supported_regions")]
        [Validation(Required=false)]
        public List<BuildpackRegionRelation> SupportedRegions { get; set; }

        // 技术栈大类的id
        [NameInMap("techstack_id")]
        [Validation(Required=false)]
        public long? TechstackId { get; set; }

    }

}
