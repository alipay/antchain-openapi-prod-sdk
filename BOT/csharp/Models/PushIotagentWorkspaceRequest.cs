// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PushIotagentWorkspaceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        [NameInMap("media_type")]
        [Validation(Required=true)]
        public string MediaType { get; set; }

        [NameInMap("size_bytes")]
        [Validation(Required=true)]
        public long? SizeBytes { get; set; }

        [NameInMap("sha256")]
        [Validation(Required=false)]
        public string Sha256 { get; set; }

        [NameInMap("client_id")]
        [Validation(Required=false)]
        public string ClientId { get; set; }

        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

    }

}
