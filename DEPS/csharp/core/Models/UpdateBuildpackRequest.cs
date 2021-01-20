// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateBuildpackRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

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

        // 技术栈版本号
        [NameInMap("full_version")]
        [Validation(Required=false)]
        public string FullVersion { get; set; }

        // 技术栈id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 支持的操作系统ID
        [NameInMap("supported_os")]
        [Validation(Required=false)]
        public List<long?> SupportedOs { get; set; }

    }

}
