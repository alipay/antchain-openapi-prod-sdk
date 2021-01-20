// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // PontusTrendRequest
    public class PontusTrendRequest : TeaModel {
        // token
        [NameInMap("token")]
        [Validation(Required=false)]
        public string Token { get; set; }

        // metric_table
        [NameInMap("metric_table")]
        [Validation(Required=false)]
        public string MetricTable { get; set; }

        // site_env
        [NameInMap("site_env")]
        [Validation(Required=false)]
        public string SiteEnv { get; set; }

        // view_id
        [NameInMap("view_id")]
        [Validation(Required=false)]
        public string ViewId { get; set; }

        // period_type
        [NameInMap("period_type")]
        [Validation(Required=false)]
        public string PeriodType { get; set; }

        // extraDimNames
        [NameInMap("extra_dim_names")]
        [Validation(Required=false)]
        public List<string> ExtraDimNames { get; set; }

        // metric_filter
        [NameInMap("metric_filter")]
        [Validation(Required=false)]
        public string MetricFilter { get; set; }

        // start
        [NameInMap("start")]
        [Validation(Required=false)]
        public long? Start { get; set; }

        // end
        [NameInMap("end")]
        [Validation(Required=false)]
        public long? End { get; set; }

        // dim_conditions_list
        [NameInMap("dim_conditions_list")]
        [Validation(Required=false)]
        public List<KeySet> DimConditionsList { get; set; }

        // dim_expression
        [NameInMap("dim_expression")]
        [Validation(Required=false)]
        public KeySet DimExpression { get; set; }

        // dim_expression_list
        [NameInMap("dim_expression_list")]
        [Validation(Required=false)]
        public List<KeySet> DimExpressionList { get; set; }

    }

}
