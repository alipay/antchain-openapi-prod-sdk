// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FINMATERIAL.Models
{
    // 请求成功时返回搜索结果
    public class Result : TeaModel {
        // WebResults 实际返回的网页结果数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("result_count")]
        [Validation(Required=true)]
        public long? ResultCount { get; set; }

        // 网页搜索结果列表，对应请求中的 search_type=web
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("web_results")]
        [Validation(Required=true)]
        public List<WebItem> WebResults { get; set; }

        // 本次搜索的上下文信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("search_context")]
        [Validation(Required=true)]
        public SearchContext SearchContext { get; set; }

        // 行业数据检索结果列表。仅在 filter_enable_industry_data_search=true 且命中时返回，支持多个结果，一般仅 1 个；开关关闭时不调用垂类接口且省略此字段。
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("industry_data")]
        [Validation(Required=false)]
        public List<IndustryDataItem> IndustryData { get; set; }

    }

}
