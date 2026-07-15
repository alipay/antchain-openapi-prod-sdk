// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    // 天气预警信息数据
    public class WeatherWarningData : TeaModel {
        // 区县名
        /// <summary>
        /// <b>Example:</b>
        /// <para>宜兴市</para>
        /// </summary>
        [NameInMap("district")]
        [Validation(Required=true)]
        public string District { get; set; }

        // 预警级别
        /// <summary>
        /// <b>Example:</b>
        /// <para>2</para>
        /// </summary>
        [NameInMap("level")]
        [Validation(Required=false)]
        public string Level { get; set; }

        // 预警等级
        /// <summary>
        /// <b>Example:</b>
        /// <para>Yellow</para>
        /// </summary>
        [NameInMap("severity_color")]
        [Validation(Required=false)]
        public string SeverityColor { get; set; }

        // 预警类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>other</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 发布时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-01-01T01:54:00.000+00:00</para>
        /// </summary>
        [NameInMap("pub_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PubTime { get; set; }

        // 预警开始时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-01-01T01:54:00.000+00:00</para>
        /// </summary>
        [NameInMap("warning_start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string WarningStartTime { get; set; }

        // 预警结束时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-01-01T01:54:00.000+00:00</para>
        /// </summary>
        [NameInMap("warning_end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string WarningEndTime { get; set; }

        // 标题
        /// <summary>
        /// <b>Example:</b>
        /// <para>如东县气象台发布海区大风黄色预警</para>
        /// </summary>
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 预警内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>受较强冷空气影响，预计1日夜里到2日白天我县海区将出现9级左右的偏北大风</para>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

    }

}
