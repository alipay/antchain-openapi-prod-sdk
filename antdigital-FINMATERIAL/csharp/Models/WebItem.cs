// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FINMATERIAL.Models
{
    // 网页搜索结果列表，对应请求中的 search_type=web
    public class WebItem : TeaModel {
        // 搜索结果唯一标识
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 内容唯一标识，用于内容去重与引用
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("content_id")]
        [Validation(Required=true)]
        public string ContentId { get; set; }

        // 结果排序位置，从 1 开始
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("sort_id")]
        [Validation(Required=true)]
        public long? SortId { get; set; }

        // 结果标题
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 来源站点名称
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("site_name")]
        [Validation(Required=false)]
        public string SiteName { get; set; }

        // 与 Query 相关的已有摘要，适合模型上下文。include_summary=true 且有可用摘要时返回；false 时省略，不触发在线摘要生成。
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("summary")]
        [Validation(Required=false)]
        public string Summary { get; set; }

        // 清洗后的正文；include_content=true 且当前 mode 有可用正文时返回。standard 默认返回可用正文；fast 预设不返回，pro 预设按需返回。include_content=false 时省略，不改变检索、排序。
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 网页发布时间，ISO 8601 格式
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("publish_time")]
        [Validation(Required=false)]
        public string PublishTime { get; set; }

        // 作者或发布机构
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("author")]
        [Validation(Required=false)]
        public string Author { get; set; }

        // 来源站点图标链接
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("logo_url")]
        [Validation(Required=false)]
        public string LogoUrl { get; set; }

        // 仅在实际返回 Content 时返回正文格式，当前为 text；include_content=false 或无正文时省略。
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("content_formats")]
        [Validation(Required=false)]
        public string ContentFormats { get; set; }

        // 可信等级，取值低/中/高
        /// <summary>
        /// <b>Example:</b>
        /// <para>中</para>
        /// </summary>
        [NameInMap("trusty_level")]
        [Validation(Required=true)]
        public string TrustyLevel { get; set; }

        // 网页或 PDF 的原文链接，均必返。
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

    }

}
