// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // DatasourceCRULResponseCURequest
    public class XDatasourceCRULResponseCURequest : TeaModel {
        //  
        [NameInMap("api_version")]
        [Validation(Required=false)]
        public string ApiVersion { get; set; }

        //  
        [NameInMap("metadata")]
        [Validation(Required=true)]
        public XResource Metadata { get; set; }

        //  
        [NameInMap("spec")]
        [Validation(Required=true)]
        public XSpec Spec { get; set; }

    }

}
