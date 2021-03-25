// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 一个部署起来提供服务的应用实例信息
    public class AppServiceEntity : TeaModel {
        // appId
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // appName
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // buildpackFullVersion
        [NameInMap("buildpack_full_version")]
        [Validation(Required=false)]
        public string BuildpackFullVersion { get; set; }

        // 构建包id
        [NameInMap("buildpack_id")]
        [Validation(Required=false)]
        public string BuildpackId { get; set; }

        // cellIds
        [NameInMap("cell_ids")]
        [Validation(Required=false)]
        public List<string> CellIds { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 当前应用服务用到的 ecs 资源列表
        [NameInMap("ecs_list")]
        [Validation(Required=false)]
        public List<Computer> EcsList { get; set; }

        // extendProperties
        [NameInMap("extend_properties")]
        [Validation(Required=false)]
        public string ExtendProperties { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // isDefault
        [NameInMap("is_default")]
        [Validation(Required=false)]
        public bool? IsDefault { get; set; }

        // isService
        [NameInMap("is_service")]
        [Validation(Required=false)]
        public bool? IsService { get; set; }

        // lastDeployStatus
        [NameInMap("last_deploy_status")]
        [Validation(Required=false)]
        public string LastDeployStatus { get; set; }

        // lastDeployVersion
        [NameInMap("last_deploy_version")]
        [Validation(Required=false)]
        public string LastDeployVersion { get; set; }

        // lastOpsOrderId
        [NameInMap("last_ops_order_id")]
        [Validation(Required=false)]
        public string LastOpsOrderId { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // ownerId
        [NameInMap("owner_id")]
        [Validation(Required=false)]
        public string OwnerId { get; set; }

        // 当前应用服务使用的 rds 资源列表
        [NameInMap("rds_list")]
        [Validation(Required=false)]
        public List<DepsDatabase> RdsList { get; set; }

        // 当前应用服务使用的 slb 资源列表
        [NameInMap("slb_list")]
        [Validation(Required=false)]
        public List<SLBInfo> SlbList { get; set; }

        // techstackId
        [NameInMap("techstack_id")]
        [Validation(Required=false)]
        public long? TechstackId { get; set; }

        // techstackIdentity
        [NameInMap("techstack_identity")]
        [Validation(Required=false)]
        public string TechstackIdentity { get; set; }

        // techstackName
        [NameInMap("techstack_name")]
        [Validation(Required=false)]
        public string TechstackName { get; set; }

        // 创建时间
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcCreate { get; set; }

        // 修改时间
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcModified { get; set; }

        // 工作空间显示名称
        [NameInMap("workspace_display_name")]
        [Validation(Required=false)]
        public string WorkspaceDisplayName { get; set; }

        // workspaceId
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // 工作空间名称
        [NameInMap("workspace_name")]
        [Validation(Required=false)]
        public string WorkspaceName { get; set; }

        // 负责人登录名称
        [NameInMap("owner_login_name")]
        [Validation(Required=false)]
        public string OwnerLoginName { get; set; }

        // 负责人显示名称
        [NameInMap("owner_display_name")]
        [Validation(Required=false)]
        public string OwnerDisplayName { get; set; }

    }

}
