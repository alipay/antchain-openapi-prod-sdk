// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAuthVcReplaceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 长度不超过64字符的业务流水唯一ID，用于对一个业务流的追踪，查询等。
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 业务类型，通常需要与授权宝服务沟通确定，业务类型可能影响此接口内部实现逻辑，长度不超过32字符。
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 一个json的string。内容包含具体需要的声明，不同业务场景不同。
        [NameInMap("claim_content")]
        [Validation(Required=true)]
        public string ClaimContent { get; set; }

        // 如果在相同的biz_type下，还需要针对声明claim进行细化划分，可以使用此字段。
        [NameInMap("claim_type")]
        [Validation(Required=false)]
        public string ClaimType { get; set; }

        // 非托管的情况下必选，业务方持有的did身份。
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // 申请声明颁发后的有效期，可选参数，如果不指定则默认申请永久有效。
        [NameInMap("expire")]
        [Validation(Required=false)]
        public long? Expire { get; set; }

        // 业务方可以传递的附加信息
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // 非托管的情况下必选。 使用did字段的密钥进行整体传送内容（不包括此signature字段）签名的结果，具体签名规则： 1. Map<String,String> params 的key按照字典序排序 2. 拼接为 key1=value1&key2=value2&key3=value3 ... 3. 计算sha256(第2步结果)得到hash 4. 使用hash 和 签名的did请求DIS的签名。
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 涉及的C类用户身份信息，如果是支付宝体系内，需要提供userId，并且提供二要素信息(name，certNo)
        // 如果已知目标C类用户的did，则可以直接指定did，比如：{"did": "XXXX"}
        [NameInMap("user_info")]
        [Validation(Required=true)]
        public string UserInfo { get; set; }

        // 目标被替换的卡证vcId，此vcId指向的VC将被吊销，然后颁发新的vc。
        // 如果不指定此字段，如果有效卡证唯一，授权宝会默认找到唯一的有效卡证vcId进行吊销，然后颁发新的vc。
        [NameInMap("vc_id")]
        [Validation(Required=false)]
        public string VcId { get; set; }

    }

}
