// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    public class ListLibraryDocRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 知识库ID
        [NameInMap("library_id")]
        [Validation(Required=true)]
        public long? LibraryId { get; set; }

        // 文档标题模糊匹配
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 当前页
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
