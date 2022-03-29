// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // resource target
    public class XTarget : TeaModel {
        // target type
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // resource kind
        [NameInMap("metadata_kind")]
        [Validation(Required=false)]
        public string MetadataKind { get; set; }

        // resource name
        [NameInMap("metadata_name")]
        [Validation(Required=false)]
        public string MetadataName { get; set; }

        // where 条件
        [NameInMap("conditions")]
        [Validation(Required=false)]
        public List<XCondition> Conditions { get; set; }

        //  
        [NameInMap("front_type")]
        [Validation(Required=false)]
        public string FrontType { get; set; }

        //  
        [NameInMap("from_datasource_uuid")]
        [Validation(Required=false)]
        public string FromDatasourceUuid { get; set; }

        //  
        [NameInMap("from_datasource_name")]
        [Validation(Required=false)]
        public string FromDatasourceName { get; set; }

        //  
        [NameInMap("from_datasource_md5")]
        [Validation(Required=false)]
        public string FromDatasourceMd5 { get; set; }

        //  
        [NameInMap("from_datasource_metric_name")]
        [Validation(Required=false)]
        public string FromDatasourceMetricName { get; set; }

    }

}
