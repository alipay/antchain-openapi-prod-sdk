// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class PullAuthWebpageUrlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 实人认证使用的biz_id，长度不超过64字符的业务唯一id
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 实人认证使用的biz_type，通常为业务方自己在阿里云实人认证控制台创建。
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 业务方C端用户身份证信息，会进入可验证声明claim内容中。
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 业务方可以传递的附加信息，通常跟可验证声明的claim有关，目前是可选项，将来业务复杂后，需要指定claim类型，或者附加信息内容说明.
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // 业务方C端用户姓名信息，会进入可验证声明claim内容中。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 业务方B类身份标识id，与创建的业务方B类DID（颁发可验证声明的subject目标）时baas.auth.corporate.did.create接口的入参owner_uid相同。
        [NameInMap("pk_id")]
        [Validation(Required=true)]
        public string PkId { get; set; }

    }

}
