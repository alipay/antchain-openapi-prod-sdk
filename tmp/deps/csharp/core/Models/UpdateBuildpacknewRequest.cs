// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateBuildpacknewRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // available_tenant_names
        [NameInMap("available_tenant_names")]
        [Validation(Required=false)]
        public List<string> AvailableTenantNames { get; set; }

        // buildpack_id
        [NameInMap("buildpack_id")]
        [Validation(Required=false)]
        public string BuildpackId { get; set; }

        // buildpack_params
        [NameInMap("buildpack_params")]
        [Validation(Required=false)]
        public List<BuildpackParamTemplate> BuildpackParams { get; set; }

        // contactInfo
        [NameInMap("contact_info")]
        [Validation(Required=false)]
        public string ContactInfo { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // envParams
        [NameInMap("env_params")]
        [Validation(Required=false)]
        public List<BuildpackParamTemplate> EnvParams { get; set; }

        // fullVersion
        [NameInMap("full_version")]
        [Validation(Required=false)]
        public string FullVersion { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // scope
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // supportedOs
        [NameInMap("supported_os")]
        [Validation(Required=false)]
        public List<long?> SupportedOs { get; set; }

        // supported_regions
        [NameInMap("supported_regions")]
        [Validation(Required=false)]
        public List<BuildpackRegionRelation> SupportedRegions { get; set; }

        // techstack
        [NameInMap("techstack")]
        [Validation(Required=false)]
        public Techstack Techstack { get; set; }

        // techstack_id
        [NameInMap("techstack_id")]
        [Validation(Required=false)]
        public string TechstackId { get; set; }

        // BuildCommandParams
        [NameInMap("build_command_params")]
        [Validation(Required=false)]
        public List<BuildCommandParams> BuildCommandParams { get; set; }

        // creator
        [NameInMap("creator")]
        [Validation(Required=false)]
        public UserDTO Creator { get; set; }

        // publisher
        [NameInMap("publisher")]
        [Validation(Required=false)]
        public UserDTO Publisher { get; set; }

        // originType
        [NameInMap("origin_type")]
        [Validation(Required=false)]
        public string OriginType { get; set; }

        // appServiceCount
        [NameInMap("app_service_count")]
        [Validation(Required=false)]
        public long? AppServiceCount { get; set; }

        // debugMode
        [NameInMap("debug_mode")]
        [Validation(Required=false)]
        public bool? DebugMode { get; set; }

        // majorVersion
        [NameInMap("major_version")]
        [Validation(Required=false)]
        public long? MajorVersion { get; set; }

        // minorVersion
        [NameInMap("minor_version")]
        [Validation(Required=false)]
        public long? MinorVersion { get; set; }

        // patchVersion
        [NameInMap("patch_version")]
        [Validation(Required=false)]
        public long? PatchVersion { get; set; }

        // buildCommand
        [NameInMap("build_command")]
        [Validation(Required=false)]
        public string BuildCommand { get; set; }

        // createdFrom
        [NameInMap("created_from")]
        [Validation(Required=false)]
        public string CreatedFrom { get; set; }

        // publicationTime
        [NameInMap("publication_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string PublicationTime { get; set; }

        // creationChain
        [NameInMap("creation_chain")]
        [Validation(Required=false)]
        public List<string> CreationChain { get; set; }

        // extraInfo
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // depracationNote
        [NameInMap("depracation_note")]
        [Validation(Required=false)]
        public string DepracationNote { get; set; }

        // industryLabel
        [NameInMap("industry_label")]
        [Validation(Required=false)]
        public string IndustryLabel { get; set; }

        // creationTime
        [NameInMap("creation_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreationTime { get; set; }

        // modificationTime
        [NameInMap("modification_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModificationTime { get; set; }

    }

}
