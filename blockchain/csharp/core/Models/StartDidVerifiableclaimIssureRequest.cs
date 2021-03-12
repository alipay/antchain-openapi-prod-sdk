// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidVerifiableclaimIssureRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 颁发证书声明
        [NameInMap("bare_claim")]
        [Validation(Required=true)]
        public BareClaim BareClaim { get; set; }

        // 过期时间
        [NameInMap("expire")]
        [Validation(Required=true)]
        public long? Expire { get; set; }

        // 由谁来颁发，该did必须为调用者自己或者自己代理的did
        [NameInMap("issuer")]
        [Validation(Required=true)]
        public string Issuer { get; set; }

        // 为哪个did颁发
        [NameInMap("subject")]
        [Validation(Required=true)]
        public string Subject { get; set; }

        // 验证声明类型，目前默认VerifiableCredential
        [NameInMap("type")]
        [Validation(Required=false)]
        public List<string> Type { get; set; }

        // 验证声明状态方式，目前只支持直接通过声明id上链查找状态方式，后续会支持更多方式
        [NameInMap("verify_status_type")]
        [Validation(Required=false)]
        public string VerifyStatusType { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
