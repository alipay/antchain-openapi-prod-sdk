// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class GetBuildpackResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // buildpackParams
        [NameInMap("buildpack_params")]
        [Validation(Required=false)]
        public List<BuildpackParamTemplate> BuildpackParams { get; set; }

        // contactInfo
        [NameInMap("contact_info")]
        [Validation(Required=false)]
        public string ContactInfo { get; set; }

        // creatorId
        [NameInMap("creator_id")]
        [Validation(Required=false)]
        public string CreatorId { get; set; }

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

        // fullVersion
        [NameInMap("full_version")]
        [Validation(Required=false)]
        public string FullVersion { get; set; }

        // publicationTime
        [NameInMap("publication_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string PublicationTime { get; set; }

        // publisherId
        [NameInMap("publisher_id")]
        [Validation(Required=false)]
        public string PublisherId { get; set; }

        // scope
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // sharedTenants
        [NameInMap("shared_tenants")]
        [Validation(Required=false)]
        public List<string> SharedTenants { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // supportedOs
        [NameInMap("supported_os")]
        [Validation(Required=false)]
        public List<BuildpackOS> SupportedOs { get; set; }

        // supportedRegions
        [NameInMap("supported_regions")]
        [Validation(Required=false)]
        public List<string> SupportedRegions { get; set; }

        // techstackId
        [NameInMap("techstack_id")]
        [Validation(Required=false)]
        public string TechstackId { get; set; }

    }

}
