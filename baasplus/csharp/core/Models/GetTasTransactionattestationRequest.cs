// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class GetTasTransactionattestationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 事物hash(支持sha256或sm3摘要算法)
        // 长度64个字符。
        [NameInMap("rid")]
        [Validation(Required=true)]
        public string Rid { get; set; }

        // 摘要算法默认，（sha256或者sm3 默认sm3）
        [NameInMap("algorithm")]
        [Validation(Required=false)]
        public string Algorithm { get; set; }

        // 返回tsr是否压缩精简，true表示要压缩精简，false表示不压缩精简 （默认为true）
        [NameInMap("compress")]
        [Validation(Required=false)]
        public bool? Compress { get; set; }

        // tsr中是否保存证书，true表示保存，false表示不保存（默认为false）
        [NameInMap("cert_req")]
        [Validation(Required=false)]
        public bool? CertReq { get; set; }

        // 事务id，允许大小写数字且小于十位的字符串
        [NameInMap("trans_id")]
        [Validation(Required=true)]
        public string TransId { get; set; }

        // 对事务的描述，长度小于20位
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

    }

}
