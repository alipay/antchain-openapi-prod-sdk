// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateAuthClaimUrlRequest : TeaModel {
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

        // 授权声明内容
        [NameInMap("claim_value")]
        [Validation(Required=true)]
        public string ClaimValue { get; set; }

        // 被授权企业did
        [NameInMap("corp_did")]
        [Validation(Required=true)]
        public string CorpDid { get; set; }

        // 过期时间选项
        [NameInMap("expire_options")]
        [Validation(Required=true)]
        public List<ValueUnitPair> ExpireOptions { get; set; }

        // 授权是否可撤销
        [NameInMap("revocable")]
        [Validation(Required=true)]
        public bool? Revocable { get; set; }

    }

}
