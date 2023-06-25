// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class SendCollectorDevicebizdataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据模型Id
        // 
        // 
        [NameInMap("data_model_id")]
        [Validation(Required=true)]
        public string DataModelId { get; set; }

        // 业务号，防重放
        // 
        // 
        [NameInMap("nonce")]
        [Validation(Required=true)]
        public string Nonce { get; set; }

        // 上传数据
        [NameInMap("content")]
        [Validation(Required=true)]
        public List<BizContentGroup> Content { get; set; }

        // 场景码，与content中的chainDeviceId至少有一个不为空
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 开启后，接口返回值中包含txHash
        [NameInMap("wait_check_and_hash")]
        [Validation(Required=false)]
        public bool? WaitCheckAndHash { get; set; }

    }

}
