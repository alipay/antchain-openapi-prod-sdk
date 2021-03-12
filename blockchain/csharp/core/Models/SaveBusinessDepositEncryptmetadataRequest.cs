// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class SaveBusinessDepositEncryptmetadataRequest : TeaModel {
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

        // 要加密的数据
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // 用户的did身份地址
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 业务唯一id，只需要本链本用户所用的业务keyId唯一即可
        [NameInMap("key_id")]
        [Validation(Required=false)]
        public string KeyId { get; set; }

        // 存证内容描述，格式为json，其中type为支持的类型：
        // text：文本类型 
        // image：图片类型(待添加) 
        // video：视频类型(待添加) 
        // txHash：存证引用类型(待添加) 
        // map:地图类型(待添加)
        [NameInMap("metadata")]
        [Validation(Required=true)]
        public string Metadata { get; set; }

    }

}
