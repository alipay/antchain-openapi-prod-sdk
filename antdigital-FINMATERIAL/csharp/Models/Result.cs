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

    }

}
