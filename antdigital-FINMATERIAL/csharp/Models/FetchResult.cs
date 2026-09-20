// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FINMATERIAL.Models
{
    // 网页读取与正文解析成功时返回
    public class FetchResult : TeaModel {
        // 本次 Fetch 结果唯一标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>fetch_req_b24edf30205c491b97ef1500a405b961</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 内容唯一标识，用于内容去重与引用
        /// <summary>
        /// <b>Example:</b>
        /// <para>compensatory_e81c1f5749545c5f7d247b3a100ffe62</para>
        /// </summary>
        [NameInMap("content_id")]
        [Validation(Required=true)]
        public string ContentId { get; set; }

        // 原始网页链接
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 网页标题
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("title")]
        [Validation(Required=false)]
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

        // 网页声明的内容描述；来源于页面公开元信息，不是模型生成摘要
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 清洗后的网页主要正文
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 内容发布时间，ISO 8601 格式
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

        // 来源站点 Logo 链接
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("logo_url")]
        [Validation(Required=false)]
        public string LogoUrl { get; set; }

        // 正文实际输出格式：text 或 markdown
        /// <summary>
        /// <b>Example:</b>
        /// <para>text</para>
        /// </summary>
        [NameInMap("content_formats")]
        [Validation(Required=false)]
        public string ContentFormats { get; set; }

    }

}
