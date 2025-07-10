// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MDPAPI.Models
{
    // AppIdQualityScoresDONew
    public class AppIdQualityScoresDONew : TeaModel {
        // modelId
        [NameInMap("modelid")]
        [Validation(Required=true)]
        public string Modelid { get; set; }

        // qualityscore
        [NameInMap("qualityscore")]
        [Validation(Required=true)]
        public string Qualityscore { get; set; }

    }

}
