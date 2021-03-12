// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateAuthClaimVcRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 业务id
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 被授权者did
        [NameInMap("subject_did")]
        [Validation(Required=true)]
        public string SubjectDid { get; set; }

        // 授权内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 授权发起者did
        [NameInMap("issuer_did")]
        [Validation(Required=true)]
        public string IssuerDid { get; set; }

        // 过期时间，长期为-1, 单位为毫秒
        [NameInMap("expire")]
        [Validation(Required=true)]
        public long? Expire { get; set; }

        // 授权是否可撤销
        [NameInMap("revocable")]
        [Validation(Required=true)]
        public bool? Revocable { get; set; }

    }

}
