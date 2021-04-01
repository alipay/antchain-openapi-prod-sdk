// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class SendNotaryTransactionTextRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 存证元数据
        [NameInMap("meta")]
        [Validation(Required=true)]
        public NotaryMetaParam Meta { get; set; }

        // 存证内容
        [NameInMap("notary_content")]
        [Validation(Required=true)]
        public string NotaryContent { get; set; }

        // 是否使用可信时间戳
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public bool? Tsr { get; set; }

    }

}
