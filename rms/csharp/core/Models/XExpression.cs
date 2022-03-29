// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // Expression
    public class XExpression : TeaModel {
        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        //  
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        //  
        [NameInMap("match_expression")]
        [Validation(Required=false)]
        public XMatchExpression MatchExpression { get; set; }

        //   
        [NameInMap("translate_expression")]
        [Validation(Required=false)]
        public XTranslate TranslateExpression { get; set; }

        //  metric type
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        //  
        [NameInMap("unit")]
        [Validation(Required=false)]
        public string Unit { get; set; }

        //  
        [NameInMap("downsample_func")]
        [Validation(Required=false)]
        public string DownsampleFunc { get; set; }

        //  
        [NameInMap("aggregation_func")]
        [Validation(Required=false)]
        public string AggregationFunc { get; set; }

        // prometheus tags
        [NameInMap("expression_tags")]
        [Validation(Required=false)]
        public List<XMetricInfo> ExpressionTags { get; set; }

        // prometheus metric-tags 是否采集
        [NameInMap("enabled")]
        [Validation(Required=false)]
        public bool? Enabled { get; set; }

        // line filter
        [NameInMap("values")]
        [Validation(Required=false)]
        public List<string> Values { get; set; }

        //  
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        //  
        [NameInMap("path_parameters")]
        [Validation(Required=false)]
        public List<XStringKeyValue> PathParameters { get; set; }

        // x
        [NameInMap("calculation_expression")]
        [Validation(Required=false)]
        public XCalculationExpression CalculationExpression { get; set; }

        // 计算数据源使用的原始指标名称
        [NameInMap("source_name")]
        [Validation(Required=false)]
        public string SourceName { get; set; }

    }

}
