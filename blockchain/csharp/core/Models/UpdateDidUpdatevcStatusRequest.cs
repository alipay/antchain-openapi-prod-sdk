// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class UpdateDidUpdatevcStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // did描述符
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 可验证声明更新
        [NameInMap("operation")]
        [Validation(Required=true)]
        public string Operation { get; set; }

        // 更新可验证声明状态
        [NameInMap("payload")]
        [Validation(Required=true)]
        public UpdateVCStatus Payload { get; set; }

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
