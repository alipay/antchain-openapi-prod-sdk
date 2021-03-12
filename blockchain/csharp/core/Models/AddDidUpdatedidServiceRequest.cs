// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class AddDidUpdatedidServiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 待处理did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 具体操作名
        [NameInMap("operation")]
        [Validation(Required=true)]
        public string Operation { get; set; }

        // 添加的did service info
        [NameInMap("payload")]
        [Validation(Required=true)]
        public UpdateDidService Payload { get; set; }

        // sig(hash(operation+payload+did)) 使用sdk生成方式
        [NameInMap("request_signature")]
        [Validation(Required=true)]
        public string RequestSignature { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
