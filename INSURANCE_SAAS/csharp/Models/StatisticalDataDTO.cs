// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    // 媒体统计数据条目
    public class StatisticalDataDTO : TeaModel {
        // 项目标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026072000000138312001</para>
        /// </summary>
        [NameInMap("project")]
        [Validation(Required=true)]
        public string Project { get; set; }

        // 统计维度id
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026072000000138312001</para>
        /// </summary>
        [NameInMap("dimension_id")]
        [Validation(Required=true)]
        public string DimensionId { get; set; }

        // 时间维度
        /// <summary>
        /// <b>Example:</b>
        /// <para>hour</para>
        /// </summary>
        [NameInMap("time_period")]
        [Validation(Required=true)]
        public string TimePeriod { get; set; }

        // 开始时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy-MM-dd HH:mm</para>
        /// </summary>
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public string StartTime { get; set; }

        // 结束时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy-MM-dd HH:mm</para>
        /// </summary>
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public string EndTime { get; set; }

        // 花费金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>6666.66</para>
        /// </summary>
        [NameInMap("cost_money")]
        [Validation(Required=true)]
        public string CostMoney { get; set; }

        // 曝光量
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("media_impression_count")]
        [Validation(Required=true)]
        public long? MediaImpressionCount { get; set; }

        // 点击量
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("media_click_count")]
        [Validation(Required=true)]
        public long? MediaClickCount { get; set; }

        // 目标转化量相关数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("conversion_data_list")]
        [Validation(Required=true)]
        public List<ConversionDataDTO> ConversionDataList { get; set; }

    }

}
