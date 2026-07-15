// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 证书模板详情类
    public class TemplateInfoDTO : TeaModel {
        // 主键
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 模板类别：马拉松类、滑雪类
        /// <summary>
        /// <b>Example:</b>
        /// <para>marathon</para>
        /// </summary>
        [NameInMap("category")]
        [Validation(Required=true)]
        public string Category { get; set; }

        // 模板内容， json格式文本
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("claim_template")]
        [Validation(Required=true)]
        public string ClaimTemplate { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021-01-01 00:00:00</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 修改时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021-01-01 00:00:00</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public string GmtModified { get; set; }

    }

}
