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
        [Validation(Required=true)]
        public string Token { get; set; }

        // metric_table
        [NameInMap("metric_table")]
        [Validation(Required=true)]
        public string MetricTable { get; set; }

        // site_env
        [NameInMap("site_env")]
        [Validation(Required=true)]
        public string SiteEnv { get; set; }

        // view_id
        [NameInMap("view_id")]
        [Validation(Required=true)]
        public string ViewId { get; set; }

        // period_type
        [NameInMap("period_type")]
        [Validation(Required=true)]
        public string PeriodType { get; set; }

        // extraDimNames
        [NameInMap("extra_dim_names")]
        [Validation(Required=true)]
        public List<string> ExtraDimNames { get; set; }

        // metric_filter
        [NameInMap("metric_filter")]
        [Validation(Required=true)]
        public string MetricFilter { get; set; }

        // start
        [NameInMap("start")]
        [Validation(Required=true)]
        public long? Start { get; set; }

        // end
        [NameInMap("end")]
        [Validation(Required=true)]
        public long? End { get; set; }

        // dim_conditions_list
        [NameInMap("dim_conditions_list")]
        [Validation(Required=true)]
        public List<KeySet> DimConditionsList { get; set; }

        // dim_expression
        [NameInMap("dim_expression")]
        [Validation(Required=true)]
        public KeySet DimExpression { get; set; }

        // dim_expression_list
        [NameInMap("dim_expression_list")]
        [Validation(Required=true)]
        public List<KeySet> DimExpressionList { get; set; }

    }

}
