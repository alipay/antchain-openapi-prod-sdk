// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // metric query metadata
    public class XMetricQueryMetadata : TeaModel {
        // query clause name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 32位datasource uuid
        [NameInMap("datasource_uuid")]
        [Validation(Required=true)]
        public string DatasourceUuid { get; set; }

        // metric name
        [NameInMap("metric_name")]
        [Validation(Required=false)]
        public string MetricName { get; set; }

        //  
        [NameInMap("table_name")]
        [Validation(Required=false)]
        public string TableName { get; set; }

        //  
        [NameInMap("conditions")]
        [Validation(Required=false)]
        public List<XCondition> Conditions { get; set; }

    }

}
