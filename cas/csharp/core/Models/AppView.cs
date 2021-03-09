// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用信息
    public class AppView : TeaModel {
        // 应用组id
        [NameInMap("app_domain_id")]
        [Validation(Required=false)]
        public string AppDomainId { get; set; }

        // 应用扩展信息
        [NameInMap("app_extra_infos")]
        [Validation(Required=false)]
        public List<AppExtraInfo> AppExtraInfos { get; set; }

        // 应用等级
        [NameInMap("app_level")]
        [Validation(Required=false)]
        public AppLevel AppLevel { get; set; }

        // 应用负责人
        [NameInMap("app_owner")]
        [Validation(Required=false)]
        public AppOwner AppOwner { get; set; }

        // scm sofa archetype
        [NameInMap("archetype")]
        [Validation(Required=false)]
        public ScmSofaArchetype Archetype { get; set; }

        // 技术栈版本
        [NameInMap("buildpack_version")]
        [Validation(Required=false)]
        public string BuildpackVersion { get; set; }

        // 中文名称
        [NameInMap("chinese_name")]
        [Validation(Required=false)]
        public string ChineseName { get; set; }

        // 代码仓库
        [NameInMap("code_repository")]
        [Validation(Required=false)]
        public CodeRepository CodeRepository { get; set; }

        // 描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 扩展参数，JSOn字符串
        [NameInMap("extra_params")]
        [Validation(Required=false)]
        public string ExtraParams { get; set; }

        // 应用ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 是否组件中心应用
        [NameInMap("is_service")]
        [Validation(Required=false)]
        public bool? IsService { get; set; }

        // 应用名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 负责人ID
        [NameInMap("owner_id")]
        [Validation(Required=false)]
        public string OwnerId { get; set; }

        // 技术栈所属分类ID
        [NameInMap("stack_id")]
        [Validation(Required=true)]
        public string StackId { get; set; }

        // 应用状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 应用标签，JSOn字符串
        [NameInMap("tags")]
        [Validation(Required=false)]
        public string Tags { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 创建时间
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcCreate { get; set; }

        // 修改时间
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcModified { get; set; }

        // 工作空间ID
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // 负责人名称
        [NameInMap("owner_name")]
        [Validation(Required=false)]
        public string OwnerName { get; set; }

        // 应用负责人真实名称
        [NameInMap("real_owner_name")]
        [Validation(Required=true)]
        public string RealOwnerName { get; set; }

        // 应用域路径名
        [NameInMap("domain_names")]
        [Validation(Required=false)]
        public List<string> DomainNames { get; set; }

        // 应用分组名称
        [NameInMap("app_domain_name")]
        [Validation(Required=true)]
        public string AppDomainName { get; set; }

        // 应用等级名称
        [NameInMap("app_level_name")]
        [Validation(Required=true)]
        public string AppLevelName { get; set; }

        // 技术栈名称
        [NameInMap("stack_name")]
        [Validation(Required=false)]
        public string StackName { get; set; }

        // 技术栈版本
        [NameInMap("stack_version")]
        [Validation(Required=false)]
        public string StackVersion { get; set; }

        // 服务器数量
        [NameInMap("container_count")]
        [Validation(Required=false)]
        public long? ContainerCount { get; set; }

        // 数据库个数
        [NameInMap("database_count")]
        [Validation(Required=false)]
        public long? DatabaseCount { get; set; }

        // SLB个数
        [NameInMap("slb_count")]
        [Validation(Required=false)]
        public long? SlbCount { get; set; }

        // ocs个数
        [NameInMap("ocs_count")]
        [Validation(Required=false)]
        public long? OcsCount { get; set; }

        // 发布包个数
        [NameInMap("package_count")]
        [Validation(Required=false)]
        public long? PackageCount { get; set; }

        // 生命周期信息
        [NameInMap("life_cycle")]
        [Validation(Required=false)]
        public AppLifeCycle LifeCycle { get; set; }

    }

}
