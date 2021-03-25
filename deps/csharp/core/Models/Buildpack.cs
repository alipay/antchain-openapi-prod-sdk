// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 一个技术栈版本的基本信息
    public class Buildpack : TeaModel {
        // 可以使用该技术栈版本的租户名称
        [NameInMap("available_tenant_names")]
        [Validation(Required=false)]
        public List<string> AvailableTenantNames { get; set; }

        // 技术栈版本的编译打包命令
        [NameInMap("build_command")]
        [Validation(Required=false)]
        public string BuildCommand { get; set; }

        // 分享给其他租户时留下的联系信息
        [NameInMap("contact_info")]
        [Validation(Required=false)]
        public string ContactInfo { get; set; }

        // 当前技术栈版本是否是debug模式
        [NameInMap("debug_mode")]
        [Validation(Required=false)]
        public bool? DebugMode { get; set; }

        // 废弃技术栈版本的原因
        [NameInMap("depracation_note")]
        [Validation(Required=false)]
        public string DepracationNote { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 技术栈的版本号
        [NameInMap("full_version")]
        [Validation(Required=false)]
        public string FullVersion { get; set; }

        // 技术栈版本ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 行业标志,I(金区)或者N(非金区)
        [NameInMap("industry_label")]
        [Validation(Required=false)]
        public string IndustryLabel { get; set; }

        // 主要版本号
        [NameInMap("major_version")]
        [Validation(Required=false)]
        public long? MajorVersion { get; set; }

        // 次要版本号
        [NameInMap("minor_version")]
        [Validation(Required=false)]
        public long? MinorVersion { get; set; }

        // 补丁版本号
        [NameInMap("patch_version")]
        [Validation(Required=false)]
        public long? PatchVersion { get; set; }

        // 发布时间
        [NameInMap("publication_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string PublicationTime { get; set; }

        // 技术栈版本是系统系统的还是用户自定义的
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // 技术栈版本的状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
