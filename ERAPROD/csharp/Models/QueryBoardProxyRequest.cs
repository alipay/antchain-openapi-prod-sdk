// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ERAPROD.Models
{
    public class QueryBoardProxyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 关键字
        [NameInMap("keyword")]
        [Validation(Required=true)]
        public string Keyword { get; set; }

        // boardId
        [NameInMap("board_id")]
        [Validation(Required=true)]
        public string BoardId { get; set; }

        // 返回条数
        [NameInMap("top_n")]
        [Validation(Required=false)]
        public long? TopN { get; set; }

    }

}
