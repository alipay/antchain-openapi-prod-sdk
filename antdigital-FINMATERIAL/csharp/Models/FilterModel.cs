// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FINMATERIAL.Models
{
    // 搜索结果过滤条件
    public class FilterModel : TeaModel {
        // 仅搜索指定网站。例如 ["gov.cn"] 表示只返回该域名下的内容；填写域名，不包含协议和路径
        /// <summary>
        /// <b>Example:</b>
        /// <para>[&quot;gov.cn&quot;]</para>
        /// </summary>
        [NameInMap("include_domains")]
        [Validation(Required=false)]
        public List<string> IncludeDomains { get; set; }

        // 排除指定网站；填写域名，不包含协议和路径
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("exclude_domains")]
        [Validation(Required=false)]
        public List<string> ExcludeDomains { get; set; }

        // 预留。计划用于按发布时间筛选，当前不生效
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("time_range")]
        [Validation(Required=false)]
        public string TimeRange { get; set; }

        // 是否同时查询行业垂类数据接口；命中结果通过 Result.IndustryData 独立返回
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("need_url")]
        [Validation(Required=false)]
        public bool? NeedUrl { get; set; }

        // 预留。计划支持 news 等网页搜索领域，当前不生效
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("industry")]
        [Validation(Required=false)]
        public string Industry { get; set; }

    }

}
