// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class QueryAsoDistinctRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // App ID
        [NameInMap("appid")]
        [Validation(Required=true)]
        public string Appid { get; set; }

        // 苹果设备的 IDFA
        [NameInMap("idfa")]
        [Validation(Required=true)]
        public string Idfa { get; set; }

        // 渠道标识(默认 qimai )
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

    }

}
