// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // x
    public class XCalculationExpression : TeaModel {
        // x
        [NameInMap("function")]
        [Validation(Required=false)]
        public string Function { get; set; }

        // x
        [NameInMap("parameters")]
        [Validation(Required=false)]
        public List<XCalculationParameter> Parameters { get; set; }

        // PromQL
        [NameInMap("query")]
        [Validation(Required=false)]
        public string Query { get; set; }

        //  
        [NameInMap("query_metadatas")]
        [Validation(Required=false)]
        public List<XMetricQueryMetadata> QueryMetadatas { get; set; }

        // calculation type
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
