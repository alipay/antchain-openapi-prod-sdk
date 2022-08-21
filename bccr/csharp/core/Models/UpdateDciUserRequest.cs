// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class UpdateDciUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // dci用户ID
        [NameInMap("dci_user_id")]
        [Validation(Required=true)]
        public string DciUserId { get; set; }

        // 证件正面oss fileId
        [NameInMap("cert_front_file_id")]
        [Validation(Required=true)]
        public string CertFrontFileId { get; set; }

        // 证件背面oss fileId
        [NameInMap("cert_back_file_id")]
        [Validation(Required=false)]
        public string CertBackFileId { get; set; }

        // 手机号
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 客户端令牌
        [NameInMap("client_token")]
        [Validation(Required=false)]
        public string ClientToken { get; set; }

    }

}
