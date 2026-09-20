// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FINMATERIAL.Models
{
    public class QueryAntsearchFetchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需要读取的公开网页 URL。每次请求仅支持一个 URL，协议须为 http 或 https
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 正文输出格式：text 或 markdown
        [NameInMap("content_format")]
        [Validation(Required=false)]
        public string ContentFormat { get; set; }

        // 网页读取最大等待时间，单位为秒，取值范围 1～60；超时后返回 IsSuccess=false 和 ErrorCode=FETCH_TIMEOUT
        [NameInMap("timeout")]
        [Validation(Required=false)]
        public long? Timeout { get; set; }

    }

}
