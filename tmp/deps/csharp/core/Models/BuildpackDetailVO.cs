// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // BuildpackDetailVO
    public class BuildpackDetailVO : TeaModel {
        // appServiceCount
        [NameInMap("app_service_count")]
        [Validation(Required=false)]
        public long? AppServiceCount { get; set; }

        // availableTenantNames
        [NameInMap("available_tenant_names")]
        [Validation(Required=false)]
        public List<string> AvailableTenantNames { get; set; }

        // buildpack_params
        [NameInMap("buildpack_params")]
        [Validation(Required=false)]
        public List<BuildpackParamTemplate> BuildpackParams { get; set; }

        // buildCommand
        [NameInMap("build_command")]
        [Validation(Required=false)]
        public string BuildCommand { get; set; }

        // build_commandp_params
        [NameInMap("build_command_params")]
        [Validation(Required=false)]
        public List<BuildCommandParams> BuildCommandParams { get; set; }

        // contactInfo
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

        // creator
        [NameInMap("creator")]
        [Validation(Required=false)]
        public UserDTO Creator { get; set; }

        // debugMode
        [NameInMap("debug_mode")]
        [Validation(Required=false)]
        public bool? DebugMode { get; set; }

        // depracationNote
        [NameInMap("depracation_note")]
        [Validation(Required=false)]
        public string DepracationNote { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // extraInfo
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // fullVersion
        [NameInMap("full_version")]
        [Validation(Required=false)]
        public string FullVersion { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // industryLabel
        [NameInMap("industry_label")]
        [Validation(Required=false)]
        public string IndustryLabel { get; set; }

        // majorVersion
        [NameInMap("major_version")]
        [Validation(Required=false)]
        public long? MajorVersion { get; set; }

        // minorVersion
        [NameInMap("minor_version")]
        [Validation(Required=false)]
        public long? MinorVersion { get; set; }

        // modificationTime
        [NameInMap("modification_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModificationTime { get; set; }

        // originType
        [NameInMap("origin_type")]
        [Validation(Required=false)]
        public string OriginType { get; set; }

        // patchVersion
        [NameInMap("patch_version")]
        [Validation(Required=false)]
        public long? PatchVersion { get; set; }

        // publicationTime
        [NameInMap("publication_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string PublicationTime { get; set; }

        // publisher
        [NameInMap("publisher")]
        [Validation(Required=false)]
        public UserDTO Publisher { get; set; }

        // scope
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // storageUploadEndpoints
        [NameInMap("storage_upload_endpoints")]
        [Validation(Required=false)]
        public List<UploadEndpoint> StorageUploadEndpoints { get; set; }

        // supportedOS
        [NameInMap("supported_o_s")]
        [Validation(Required=false)]
        public List<BuildpackOS> SupportedOS { get; set; }

        // supportedRegions
        [NameInMap("supported_regions")]
        [Validation(Required=false)]
        public List<BuildpackRegionRelationDetail> SupportedRegions { get; set; }

        // techstack
        [NameInMap("techstack")]
        [Validation(Required=false)]
        public Techstack Techstack { get; set; }

        // tenantId
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

    }

}
