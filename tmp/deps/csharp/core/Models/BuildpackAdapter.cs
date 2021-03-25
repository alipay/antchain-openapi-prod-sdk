// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // BuildpackV2Adapter
    public class BuildpackAdapter : TeaModel {
        // buildpackArch
        [NameInMap("buildpack_arch")]
        [Validation(Required=false)]
        public string BuildpackArch { get; set; }

        // fullVersion
        [NameInMap("full_version")]
        [Validation(Required=false)]
        public string FullVersion { get; set; }

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

    }

}
