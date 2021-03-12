// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAmlPersonTwofactorRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 完整证件号，与证件类型配对
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 证件类型
        // 001，身份证
        // 目前只支持身份证
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public long? CertType { get; set; }

        // 张三
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
