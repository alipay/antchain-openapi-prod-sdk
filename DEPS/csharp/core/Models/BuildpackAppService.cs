// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // BuildpackAppService
    public class BuildpackAppService : TeaModel {
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

        // buildpackId
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

        // utcCreate
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcCreate { get; set; }

        // utcModified
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcModified { get; set; }

        // workspaceId
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
