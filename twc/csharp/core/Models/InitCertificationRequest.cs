// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class InitCertificationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 申请人的身份信息
        [NameInMap("applier")]
        [Validation(Required=true)]
        public Identity Applier { get; set; }

        // 存证证明所要展示的存证信息，可填多个
        [NameInMap("notary_info")]
        [Validation(Required=true)]
        public List<NotaryInfo> NotaryInfo { get; set; }

        // 存证证明的类型：STANDARD（标准存证证明）或COPYRIGHT（版权存证证明），默认为COPYRIGHT
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
