// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryTradeSaleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 查询文本
        [NameInMap("query_text")]
        [Validation(Required=true, MaxLength=2048)]
        public string QueryText { get; set; }

        // 查询场景
        [NameInMap("query_scene")]
        [Validation(Required=true)]
        public string QueryScene { get; set; }

        // 扩展信息，JSON格式
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
