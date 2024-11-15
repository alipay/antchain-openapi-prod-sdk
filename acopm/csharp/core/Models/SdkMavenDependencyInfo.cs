// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    // sdk的maven依赖信息
    public class SdkMavenDependencyInfo : TeaModel {
        // client端依赖
        [NameInMap("reference_client")]
        [Validation(Required=true)]
        public string ReferenceClient { get; set; }

        // server端依赖
        [NameInMap("referenc_server")]
        [Validation(Required=true)]
        public string ReferencServer { get; set; }

        // client端maven仓库地址
        [NameInMap("maven_link_client")]
        [Validation(Required=true)]
        public string MavenLinkClient { get; set; }

        // server端maven仓库地址
        [NameInMap("maven_link_server")]
        [Validation(Required=true)]
        public string MavenLinkServer { get; set; }

    }

}
