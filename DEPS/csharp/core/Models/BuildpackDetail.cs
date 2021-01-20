// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 技术栈的详细信息，包括关联信息
    public class BuildpackDetail : TeaModel {
        // 使用该技术栈版本的appservice的数量
        [NameInMap("app_service_count")]
        [Validation(Required=false)]
        public long? AppServiceCount { get; set; }

        // 可以使用该技术栈版本的租户ID
        [NameInMap("available_tenant_names")]
        [Validation(Required=false)]
        public List<string> AvailableTenantNames { get; set; }

        // buildCommand
        [NameInMap("build_command")]
        [Validation(Required=false)]
        public string BuildCommand { get; set; }

        // 分享给其他租户留下的联系信息
        [NameInMap("contact_info")]
        [Validation(Required=false)]
        public string ContactInfo { get; set; }

        // createdFrom
        [NameInMap("created_from")]
        [Validation(Required=false)]
        public string CreatedFrom { get; set; }

        // creationChain
        [NameInMap("creation_chain")]
        [Validation(Required=false)]
        public List<string> CreationChain { get; set; }

        // creationTime
        [NameInMap("creation_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreationTime { get; set; }

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

        // extraInfo
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 技术栈版本号
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

        // modificationTime
        [NameInMap("modification_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModificationTime { get; set; }

        // 原始类型
        [NameInMap("origin_type")]
        [Validation(Required=false)]
        public string OriginType { get; set; }

        // 补丁版本号
        [NameInMap("patch_version")]
        [Validation(Required=false)]
        public long? PatchVersion { get; set; }

        // 发布时间
        [NameInMap("publication_time")]
        [Validation(Required=false)]
        public string PublicationTime { get; set; }

        // 发布时间，日期格式
        [NameInMap("publication_time_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string PublicationTimeDate { get; set; }

        // 技术栈版本提供方所在域
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // 技术栈版本的状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 支持的操作系统列表
        [NameInMap("supported_os")]
        [Validation(Required=false)]
        public List<BuildpackOS> SupportedOs { get; set; }

        // 支持的地域ID列表
        [NameInMap("supported_regions")]
        [Validation(Required=false)]
        public List<string> SupportedRegions { get; set; }

        // 支持的地域列表
        [NameInMap("supported_regions_list")]
        [Validation(Required=false)]
        public List<BuildpackRegionRelationDetail> SupportedRegionsList { get; set; }

        // techstack
        [NameInMap("techstack")]
        [Validation(Required=false)]
        public Techstack Techstack { get; set; }

        // 关联的 Techstack ID
        [NameInMap("techstack_id")]
        [Validation(Required=false)]
        public long? TechstackId { get; set; }

        // tenantId
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

    }

}
