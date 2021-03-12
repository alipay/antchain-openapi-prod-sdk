// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class SaveBusinessDepositMetadataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务链对应的bizId    
        // 
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 具体存证的内容
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<DepositMetaDataItem> Data { get; set; }

        // 用户的did地址
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 用户自定义唯一keyId，可用该keyId到业务服务中查询存证内容
        [NameInMap("key_id")]
        [Validation(Required=false)]
        public string KeyId { get; set; }

    }

}
