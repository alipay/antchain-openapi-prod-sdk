// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidAddvcExecuteRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 发起该交易的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 操作名
        [NameInMap("operation")]
        [Validation(Required=true)]
        public string Operation { get; set; }

        // 创建VC具体参数
        [NameInMap("payload")]
        [Validation(Required=true)]
        public AddVC Payload { get; set; }

        // 使用私钥对消息中其他字段进行签名
        [NameInMap("request_signature")]
        [Validation(Required=true)]
        public string RequestSignature { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
