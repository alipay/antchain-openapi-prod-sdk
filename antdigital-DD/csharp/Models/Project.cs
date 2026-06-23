// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 项目
    public class Project : TeaModel {
        // 项目ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1232132131</para>
        /// </summary>
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 项目名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>默认项目</para>
        /// </summary>
        [NameInMap("project_name")]
        [Validation(Required=true)]
        public string ProjectName { get; set; }

        // 项目描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>我是项目描述</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 是否为默认项目
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("is_default")]
        [Validation(Required=true)]
        public bool? IsDefault { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-04-21 09:57:21</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-04-21 09:57:21</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

    }

}
