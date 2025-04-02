// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 标签配置全量信息
    public class RiskLabelConfigInfo : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 线索ID
        [NameInMap("tag_id")]
        [Validation(Required=true)]
        public string TagId { get; set; }

        // 标签文本
        [NameInMap("tag_text")]
        [Validation(Required=true)]
        public string TagText { get; set; }

        // 风险维度
        [NameInMap("risk_dimension_type")]
        [Validation(Required=true)]
        public string RiskDimensionType { get; set; }

        // 线索类型
        [NameInMap("risk_detail_type")]
        [Validation(Required=true)]
        public string RiskDetailType { get; set; }

        // 趋势图表名
        [NameInMap("tag_trend_chart_name")]
        [Validation(Required=true)]
        public string TagTrendChartName { get; set; }

        // 线索列表表头，英文逗号分隔
        [NameInMap("tag_list_headers")]
        [Validation(Required=true)]
        public string TagListHeaders { get; set; }

        // 标签列表，排序字段
        [NameInMap("tag_list_order_column")]
        [Validation(Required=true)]
        public string TagListOrderColumn { get; set; }

        // 标签列表排序方式
        [NameInMap("tag_list_order_type")]
        [Validation(Required=true)]
        public string TagListOrderType { get; set; }

        // 标记删除
        [NameInMap("is_delete")]
        [Validation(Required=true)]
        public long? IsDelete { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 操作人ID
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

    }

}
