// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class EncryptIdsquaredAuthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 待加密原文
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // productSource
        [NameInMap("product_source")]
        [Validation(Required=false)]
        public long? ProductSource { get; set; }

        // 客户端鉴权码
        [NameInMap("device_auth_code")]
        [Validation(Required=true)]
        public string DeviceAuthCode { get; set; }

        // deviceExtra
        [NameInMap("device_extra")]
        [Validation(Required=false)]
        public string DeviceExtra { get; set; }

        // apiVersion
        [NameInMap("api_version")]
        [Validation(Required=false)]
        public string ApiVersion { get; set; }

        // productKey
        [NameInMap("product_key")]
        [Validation(Required=false)]
        public string ProductKey { get; set; }

        // deviceChallenge客户端挑战码
        [NameInMap("device_challenge")]
        [Validation(Required=false)]
        public string DeviceChallenge { get; set; }

        // serverExtra
        [NameInMap("server_extra")]
        [Validation(Required=false)]
        public string ServerExtra { get; set; }

        // id2
        [NameInMap("id2")]
        [Validation(Required=true)]
        public string Id2 { get; set; }

    }

}
