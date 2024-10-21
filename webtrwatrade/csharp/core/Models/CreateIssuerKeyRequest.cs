// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    public class CreateIssuerKeyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 密钥名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 创建类型
        // KEY_FILE：上传密钥文件"
        // CREATE_NEW_KEY：系统创建密钥"
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 文件流
        /// <summary>
        /// 待上传文件
        /// </summary>
        [NameInMap("fileObject")]
        [Validation(Required=false)]
        public Stream FileObject { get; set; }

        /// <summary>
        /// 待上传文件名
        /// </summary>
        [NameInMap("fileObjectName")]
        [Validation(Required=false)]
        public string FileObjectName { get; set; }

        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // 文件解密密码
        [NameInMap("password")]
        [Validation(Required=false)]
        public string Password { get; set; }

    }

}
