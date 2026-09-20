// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FINMATERIAL.Models
{
    // 本次搜索的上下文信息
    public class SearchContext : TeaModel {
        // 原始搜索内容
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("origin_query")]
        [Validation(Required=true)]
        public string OriginQuery { get; set; }

        // 实际执行的搜索类型，当前为 web
        /// <summary>
        /// <b>Example:</b>
        /// <para>web</para>
        /// </summary>
        [NameInMap("search_type")]
        [Validation(Required=true)]
        public string SearchType { get; set; }

        // 实际执行的 AI 上下文档位；当前为 auto，后续可返回 fast 或 pro
        /// <summary>
        /// <b>Example:</b>
        /// <para>auto</para>
        /// </summary>
        [NameInMap("mode")]
        [Validation(Required=true)]
        public string Mode { get; set; }

    }

}
