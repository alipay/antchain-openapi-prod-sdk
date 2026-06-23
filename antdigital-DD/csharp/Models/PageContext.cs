// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 页面上下文
    public class PageContext : TeaModel {
        // 页面di
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("page_id")]
        [Validation(Required=false)]
        public string PageId { get; set; }

        // 页面标题
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("page_title")]
        [Validation(Required=false)]
        public string PageTitle { get; set; }

    }

}
