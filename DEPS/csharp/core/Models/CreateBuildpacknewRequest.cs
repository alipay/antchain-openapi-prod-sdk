// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class CreateBuildpacknewRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // availableTenantNames
        [NameInMap("available_tenant_names")]
        [Validation(Required=false)]
        public List<string> AvailableTenantNames { get; set; }

        // buildpackParams
        [NameInMap("buildpack_params")]
        [Validation(Required=false)]
        public List<BuildpackParamTemplate> BuildpackParams { get; set; }

        // buildCommand
        [NameInMap("build_command")]
        [Validation(Required=false)]
        public string BuildCommand { get; set; }

        // buildCommandParams
        [NameInMap("build_command_params")]
        [Validation(Required=false)]
        public List<BuildCommandParams> BuildCommandParams { get; set; }

        // contact_info
        // 
        [NameInMap("contact_info")]
        [Validation(Required=false)]
        public string ContactInfo { get; set; }

        // debug_mode
        // 
        [NameInMap("debug_mode")]
        [Validation(Required=false)]
        public bool? DebugMode { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // full_version
        // 
        [NameInMap("full_version")]
        [Validation(Required=false)]
        public string FullVersion { get; set; }

        // major_version
        // 
        [NameInMap("major_version")]
        [Validation(Required=false)]
        public long? MajorVersion { get; set; }

        // minor_version
        // 
        [NameInMap("minor_version")]
        [Validation(Required=false)]
        public long? MinorVersion { get; set; }

        // patch_version
        // 
        [NameInMap("patch_version")]
        [Validation(Required=false)]
        public long? PatchVersion { get; set; }

        // scope
        // 
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // StorageUploadEndpoint
        [NameInMap("storage_upload_endpoints")]
        [Validation(Required=false)]
        public string StorageUploadEndpoints { get; set; }

        // supported_os
        // 
        [NameInMap("supported_os")]
        [Validation(Required=false)]
        public List<long?> SupportedOs { get; set; }

        // supported_regions
        // 
        [NameInMap("supported_regions")]
        [Validation(Required=false)]
        public List<BuildpackRegionRelation> SupportedRegions { get; set; }

        // techstack_id
        // 
        [NameInMap("techstack_id")]
        [Validation(Required=false)]
        public long? TechstackId { get; set; }

        // techstack
        [NameInMap("techstack")]
        [Validation(Required=false)]
        public Techstack Techstack { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
