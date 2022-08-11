// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_20ab7e4471e24e8fbfaa7df4ba0613c8.Models
{
    public class StartBaasDidVerifiableclaimVerifierRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用于零知识证明类型的可验证声明的验证。index是对应于完整VC的一个json字符串，其中key值保持和原始VC一致，value如果是1表示verificate_claim对应key携带的是对应field的原始值，而如果Key的value是0表示verificate_claim对应key携带的是对应field的merkle root值。
        [NameInMap("indexs")]
        [Validation(Required=false)]
        public string Indexs { get; set; }

        // 可验证声明
        [NameInMap("verifiable_claim")]
        [Validation(Required=true)]
        public string VerifiableClaim { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
