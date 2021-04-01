// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateAuthUserinfoDidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务类型，通常需要与授权宝服务沟通确定，业务类型可能影响此接口内部实现逻辑，长度不超过32字符。
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 非托管的情况下必选，业务方持有的did身份。
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // 业务方可以传递的附加信息，暂时未启用
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // 非托管的情况下必选。 使用did字段的密钥进行整体传送内容（不包括此signature字段）签名的结果，具体签名规则： 1. Map<String,String> params 的key按照字典序排序 2. 拼接为 key1=value1&key2=value2&key3=value3 ... 3. 计算sha256(第2步结果)得到hash 4. 使用hash 和 签名的did请求DIS的签名。
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 目标用户的相关信息描述，用于创建DID绑定
        [NameInMap("user_info")]
        [Validation(Required=true)]
        public string UserInfo { get; set; }

    }

}
