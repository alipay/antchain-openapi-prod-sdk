// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    // 市场价格
    public class MarketPrice : TeaModel {
        // 市场码
        /// <summary>
        /// <b>Example:</b>
        /// <para>JS</para>
        /// </summary>
        [NameInMap("market_code")]
        [Validation(Required=true)]
        public string MarketCode { get; set; }

        // 目标日期,格式 yyyy-MM-dd
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-07-12</para>
        /// </summary>
        [NameInMap("target_date")]
        [Validation(Required=true)]
        public string TargetDate { get; set; }

        // 查询类型:DAY_AHEAD/REALTIME
        /// <summary>
        /// <b>Example:</b>
        /// <para>DAY_AHEAD</para>
        /// </summary>
        [NameInMap("query_type")]
        [Validation(Required=true)]
        public string QueryType { get; set; }

        // 价格类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>CLEARING</para>
        /// </summary>
        [NameInMap("price_type")]
        [Validation(Required=true)]
        public string PriceType { get; set; }

        // 时点编号,1~96 整数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("period")]
        [Validation(Required=true)]
        public string Period { get; set; }

        // 价格值,单位 元/MWh
        /// <summary>
        /// <b>Example:</b>
        /// <para>100.50</para>
        /// </summary>
        [NameInMap("price_value")]
        [Validation(Required=true)]
        public string PriceValue { get; set; }

        // 数据源更新时间,ISO8601 格式
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-07-12T08:00:00Z</para>
        /// </summary>
        [NameInMap("source_updated_at")]
        [Validation(Required=true)]
        public string SourceUpdatedAt { get; set; }

    }

}
