// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class UploadurlBlockchainBotIotagentFilesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 文件名
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 媒体类型
        [NameInMap("media_type")]
        [Validation(Required=true)]
        public string MediaType { get; set; }

        // 文件字节数
        [NameInMap("size_bytes")]
        [Validation(Required=true)]
        public string SizeBytes { get; set; }

        // 内容 SHA-256（十六进制小写）
        [NameInMap("sha256")]
        [Validation(Required=true)]
        public string Sha256 { get; set; }

        // 客户端绑定 ID（租户绑定鉴权锚点）
        [NameInMap("client_id")]
        [Validation(Required=true)]
        public string ClientId { get; set; }

        // 会话ID（scene=SESSION_FILE 时必填）
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

        // 上传场景：SESSION_FILE（默认，会话附件）/SKILL_PACKAGE（SKILL 上传暂存）
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

    }

}
