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
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 线索ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>124</para>
        /// </summary>
        [NameInMap("tag_id")]
        [Validation(Required=true)]
        public string TagId { get; set; }

        // 标签文本
        /// <summary>
        /// <b>Example:</b>
        /// <para>233444</para>
        /// </summary>
        [NameInMap("tag_text")]
        [Validation(Required=true)]
        public string TagText { get; set; }

        // 风险维度
        /// <summary>
        /// <b>Example:</b>
        /// <para>风险维度</para>
        /// </summary>
        [NameInMap("risk_dimension_type")]
        [Validation(Required=true)]
        public string RiskDimensionType { get; set; }

        // 线索类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>列表</para>
        /// </summary>
        [NameInMap("risk_detail_type")]
        [Validation(Required=true)]
        public string RiskDetailType { get; set; }

        // 趋势图表名
        /// <summary>
        /// <b>Example:</b>
        /// <para>XX趋势图</para>
        /// </summary>
        [NameInMap("tag_trend_chart_name")]
        [Validation(Required=true)]
        public string TagTrendChartName { get; set; }

        // 线索列表表头，英文逗号分隔
        /// <summary>
        /// <b>Example:</b>
        /// <para>日期</para>
        /// </summary>
        [NameInMap("tag_list_headers")]
        [Validation(Required=true)]
        public string TagListHeaders { get; set; }

        // 标签列表，排序字段
        /// <summary>
        /// <b>Example:</b>
        /// <para>日期</para>
        /// </summary>
        [NameInMap("tag_list_order_column")]
        [Validation(Required=true)]
        public string TagListOrderColumn { get; set; }

        // 标签列表排序方式
        /// <summary>
        /// <b>Example:</b>
        /// <para>顺序</para>
        /// </summary>
        [NameInMap("tag_list_order_type")]
        [Validation(Required=true)]
        public string TagListOrderType { get; set; }

        // 标记删除
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("is_delete")]
        [Validation(Required=true)]
        public long? IsDelete { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 操作人ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1233</para>
        /// </summary>
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

    }

}
