// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAuthVcBatchauthRequest : TeaModel {
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
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 批量进行可验证声明颁发的所有候选声明内容
        [NameInMap("claim_list")]
        [Validation(Required=true)]
        public List<Claim> ClaimList { get; set; }

        // 非托管的情况下必选，业务方持有的did身份。
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // 业务方可以传递的附加信息，通常跟可验证声明的claim有关，目前是可选项，将来业务复杂后，需要指定claim类型，或者附加信息内容说明。
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // jN1LVH5YhbTvgrdeBqlImPJBWDzVdNyyHZ1n9A0pSOQKnt11jWM5Qn707+wEa7bc8TOd1WvRItTe\r\nmx4xYCqX0gE=\r\n	
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 涉及的C类用户身份信息，如果是支付宝体系内，需要提供userId，并且提供二要素信息(name，certNo)
        [NameInMap("user_info")]
        [Validation(Required=true)]
        public string UserInfo { get; set; }

    }

}
