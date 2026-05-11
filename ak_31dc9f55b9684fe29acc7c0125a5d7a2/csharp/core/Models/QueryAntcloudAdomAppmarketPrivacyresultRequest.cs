// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_31dc9f55b9684fe29acc7c0125a5d7a2.Models
{
    public class QueryAntcloudAdomAppmarketPrivacyresultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 商品实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 执行记录id
        [NameInMap("record_id")]
        [Validation(Required=true)]
        public string RecordId { get; set; }

        // 响应的结果文件是否为密文，默认非密文
        [NameInMap("is_encrypt_file")]
        [Validation(Required=false)]
        public bool? IsEncryptFile { get; set; }

        // 大模型调用鉴权token
        [NameInMap("req_token")]
        [Validation(Required=false)]
        public string ReqToken { get; set; }

    }

}
