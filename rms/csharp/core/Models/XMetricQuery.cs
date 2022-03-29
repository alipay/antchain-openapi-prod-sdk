// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // metric query
    public class XMetricQuery : TeaModel {
        //  
        [NameInMap("timeout")]
        [Validation(Required=false)]
        public long? Timeout { get; set; }

        // start timestamp
        [NameInMap("start")]
        [Validation(Required=false)]
        public long? Start { get; set; }

        // end timestamp
        [NameInMap("end")]
        [Validation(Required=false)]
        public long? End { get; set; }

        // value step
        [NameInMap("step")]
        [Validation(Required=false)]
        public long? Step { get; set; }

        // instant time
        [NameInMap("time")]
        [Validation(Required=false)]
        public long? Time { get; set; }

        // query clause
        [NameInMap("query")]
        [Validation(Required=false)]
        public string Query { get; set; }

        //  
        [NameInMap("query_metadatas")]
        [Validation(Required=false)]
        public List<XMetricQueryMetadata> QueryMetadatas { get; set; }

        //  
        [NameInMap("datasource_uuid")]
        [Validation(Required=false)]
        public string DatasourceUuid { get; set; }

        //  
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

        //  
        [NameInMap("tag")]
        [Validation(Required=false)]
        public string Tag { get; set; }

        //  
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public long? TenantId { get; set; }

        //  
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public long? WorkspaceId { get; set; }

        //  
        [NameInMap("datasource_type")]
        [Validation(Required=false)]
        public string DatasourceType { get; set; }

        //  
        [NameInMap("null_value_type")]
        [Validation(Required=false)]
        public string NullValueType { get; set; }

    }

}
