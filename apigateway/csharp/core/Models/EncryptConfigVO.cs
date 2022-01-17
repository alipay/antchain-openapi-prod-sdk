// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // EncryptConfigVO
    public class EncryptConfigVO : TeaModel {
        // app_id
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // 加密状态
        [NameInMap("encryption_status")]
        [Validation(Required=false)]
        public string EncryptionStatus { get; set; }

        // 加密类型
        [NameInMap("encrypt_type")]
        [Validation(Required=false)]
        public string EncryptType { get; set; }

        // key_pair
        [NameInMap("key_pair")]
        [Validation(Required=false)]
        public string KeyPair { get; set; }

        // private_key
        [NameInMap("private_key")]
        [Validation(Required=false)]
        public string PrivateKey { get; set; }

        // pub_key
        [NameInMap("pub_key")]
        [Validation(Required=false)]
        public string PubKey { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
