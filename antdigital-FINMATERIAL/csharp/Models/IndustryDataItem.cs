// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FINMATERIAL.Models
{
    // 行业数据检索结果列表；命中时返回，支持多个结果，一般仅返回 1 个
    public class IndustryDataItem : TeaModel {
        // 行业数据标题
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 行业数据类型及结构标识，用于确定 CardData 的字段结构
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 行业结构化数据，字段随 Type 定义
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

    }

}
