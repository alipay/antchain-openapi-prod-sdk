// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 一个部署起来提供服务的应用实例信息
    public class AppService : TeaModel {
        // app_id
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // buildpack_full_version
        [NameInMap("buildpack_full_version")]
        [Validation(Required=false)]
        public string BuildpackFullVersion { get; set; }

        // buildpack_id
        [NameInMap("buildpack_id")]
        [Validation(Required=false)]
        public string BuildpackId { get; set; }

        // cell_ids
        [NameInMap("cell_ids")]
        [Validation(Required=false)]
        public List<string> CellIds { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // extend_properties
        [NameInMap("extend_properties")]
        [Validation(Required=false)]
        public string ExtendProperties { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // is_default
        [NameInMap("is_default")]
        [Validation(Required=false)]
        public bool? IsDefault { get; set; }

        // is_service
        [NameInMap("is_service")]
        [Validation(Required=false)]
        public bool? IsService { get; set; }

        // last_deploy_status
        [NameInMap("last_deploy_status")]
        [Validation(Required=false)]
        public string LastDeployStatus { get; set; }

        // last_deploy_version
        [NameInMap("last_deploy_version")]
        [Validation(Required=false)]
        public string LastDeployVersion { get; set; }

        // last_ops_order_id
        [NameInMap("last_ops_order_id")]
        [Validation(Required=false)]
        public string LastOpsOrderId { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // owner_id
        [NameInMap("owner_id")]
        [Validation(Required=false)]
        public string OwnerId { get; set; }

        // techstack_id
        [NameInMap("techstack_id")]
        [Validation(Required=false)]
        public long? TechstackId { get; set; }

        // techstack_identity
        [NameInMap("techstack_identity")]
        [Validation(Required=false)]
        public string TechstackIdentity { get; set; }

        // techstack_name
        [NameInMap("techstack_name")]
        [Validation(Required=false)]
        public string TechstackName { get; set; }

        // utc_create
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreate { get; set; }

        // utc_modified
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcModified { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
