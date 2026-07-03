// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 标签信息
    public class RiskLabelInfo : TeaModel {
        // 线索明细类型(字段停用)
        /// <summary>
        /// <b>Example:</b>
        /// <para>s d d f d f</para>
        /// </summary>
        [NameInMap("clue_detail_type")]
        [Validation(Required=true)]
        public string ClueDetailType { get; set; }

        // odps数据产出时间，冗余字段，业务上不需要，以备错误排查
        /// <summary>
        /// <b>Example:</b>
        /// <para>20190823</para>
        /// </summary>
        [NameInMap("dt")]
        [Validation(Required=false)]
        public string Dt { get; set; }

        // 数据产生时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy-MM-dd hh:mm:ss</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 记录唯一ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 0-正常 1-删除
        /// <summary>
        /// <b>Example:</b>
        /// <para>is_deleted</para>
        /// </summary>
        [NameInMap("is_deleted")]
        [Validation(Required=true)]
        public long? IsDeleted { get; set; }

        // 企业ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>A123445</para>
        /// </summary>
        [NameInMap("mct_one_id")]
        [Validation(Required=true)]
        public string MctOneId { get; set; }

        // 操作人ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

        // 操作类型
        // add、delete、update
        /// <summary>
        /// <b>Example:</b>
        /// <para>add</para>
        /// </summary>
        [NameInMap("op_type")]
        [Validation(Required=true)]
        public string OpType { get; set; }

        // 企业名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>东方财富公司</para>
        /// </summary>
        [NameInMap("org_name")]
        [Validation(Required=true)]
        public string OrgName { get; set; }

        // 线索类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>列表</para>
        /// </summary>
        [NameInMap("risk_detail_type")]
        [Validation(Required=true)]
        public string RiskDetailType { get; set; }

        // 风险维度
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>风险维度</para>
        /// </summary>
        [NameInMap("risk_dimension_type")]
        [Validation(Required=true)]
        public string RiskDimensionType { get; set; }

        // 线索概览
        /// <summary>
        /// <b>Example:</b>
        /// <para>s d f g</para>
        /// </summary>
        [NameInMap("tag_clue")]
        [Validation(Required=true)]
        public string TagClue { get; set; }

        // 线索明细
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("tag_clue_detail")]
        [Validation(Required=true)]
        public string TagClueDetail { get; set; }

        // 标签ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>NM23</para>
        /// </summary>
        [NameInMap("tag_id")]
        [Validation(Required=true)]
        public string TagId { get; set; }

        // 线索列表表头，英文逗号分隔
        // 
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

        // 标签文本
        /// <summary>
        /// <b>Example:</b>
        /// <para>1233</para>
        /// </summary>
        [NameInMap("tag_text")]
        [Validation(Required=true)]
        public string TagText { get; set; }

        // 趋势图表名
        /// <summary>
        /// <b>Example:</b>
        /// <para>XX趋势图 </para>
        /// </summary>
        [NameInMap("tag_trend_chart_name")]
        [Validation(Required=true)]
        public string TagTrendChartName { get; set; }

        // 数据同步到公有云时间(业务上赋值当天)
        /// <summary>
        /// <b>Example:</b>
        /// <para>20190823</para>
        /// </summary>
        [NameInMap("update_date")]
        [Validation(Required=true)]
        public string UpdateDate { get; set; }

    }

}
