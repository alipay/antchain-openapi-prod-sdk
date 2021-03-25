// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // BuildpackCompositeVO
    public class BuildpackCompositeVO : TeaModel {
        // app_service_count
        [NameInMap("app_service_count")]
        [Validation(Required=false)]
        public long? AppServiceCount { get; set; }

        // creator
        [NameInMap("creator")]
        [Validation(Required=false)]
        public UserDTO Creator { get; set; }

        // origin_type
        [NameInMap("origin_type")]
        [Validation(Required=false)]
        public string OriginType { get; set; }

        // publisher
        [NameInMap("publisher")]
        [Validation(Required=false)]
        public UserDTO Publisher { get; set; }

        // supported_o_s
        [NameInMap("supported_o_s")]
        [Validation(Required=false)]
        public List<BuildpackOS> SupportedOS { get; set; }

        // supported_regions
        [NameInMap("supported_regions")]
        [Validation(Required=false)]
        public List<BuildpackRegionRelationDetail> SupportedRegions { get; set; }

        // techstack
        [NameInMap("techstack")]
        [Validation(Required=false)]
        public Techstack Techstack { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // fullVersion
        [NameInMap("full_version")]
        [Validation(Required=false)]
        public string FullVersion { get; set; }

    }

}
