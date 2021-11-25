// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateAuthCertClaimRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，查询等。
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 业务类型，通常需要与授权宝服务沟通确定，业务类型可能影响此接口内部实现逻辑，长度不超过32字符。
        // 
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 一个json的string。内容包含具体需要的声明，不同业务场景不同。
        // 
        [NameInMap("claim_content")]
        [Validation(Required=true)]
        public string ClaimContent { get; set; }

        // 如果在相同的biz_type下，还需要针对声明claim进行细化划分，可以使用此字段。
        // 
        [NameInMap("claim_type")]
        [Validation(Required=false)]
        public string ClaimType { get; set; }

        // 申请声明颁发后的有效期，可选参数，如果不指定则默认申请永久有效。
        // 
        [NameInMap("expire")]
        [Validation(Required=false)]
        public long? Expire { get; set; }

    }

}
