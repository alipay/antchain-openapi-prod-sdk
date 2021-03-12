// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateNotaryRawTextRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 如果已经在链上有账户，可以直接使用已有的账户进行存证。如果为空，服务端会在链上创建一个
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 链的唯一性标示，请联系baas平台获取
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 存证内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
