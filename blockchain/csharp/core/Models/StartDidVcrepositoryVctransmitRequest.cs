// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidVcrepositoryVctransmitRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户did标示
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 实际参数
        [NameInMap("payload")]
        [Validation(Required=true)]
        public VcTransmitPayload Payload { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // transmit在底层vc仓库使用时候是否需要使用did密钥进行信封封装加密，如果设定true则不需要底层信封加密，需要调用方执行vcContent的加密保护。
        [NameInMap("not_encrypt")]
        [Validation(Required=false)]
        public bool? NotEncrypt { get; set; }

    }

}
