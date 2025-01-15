// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETING.Models
{
    // 页面上下文
    public class PageContext : TeaModel {
        // 页面di
        [NameInMap("page_id")]
        [Validation(Required=false)]
        public string PageId { get; set; }

        // 页面标题
        [NameInMap("page_title")]
        [Validation(Required=false)]
        public string PageTitle { get; set; }

    }

}
