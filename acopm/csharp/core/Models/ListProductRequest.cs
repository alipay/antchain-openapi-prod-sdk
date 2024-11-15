// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class ListProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 用户域账号
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 产品关键字
        [NameInMap("keyword")]
        [Validation(Required=false)]
        public string Keyword { get; set; }

        // 每页记录
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 当前页面
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

    }

}
