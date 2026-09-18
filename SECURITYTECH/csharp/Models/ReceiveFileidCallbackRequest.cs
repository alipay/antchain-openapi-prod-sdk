// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class ReceiveFileidCallbackRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // string
        /// <summary>
        /// <para>待上传文件</para>
        /// </summary>
        [NameInMap("fileObject")]
        [Validation(Required=false)]
        public Stream FileObject { get; set; }

        /// <summary>
        /// <para>待上传文件名</para>
        /// </summary>
        [NameInMap("fileObjectName")]
        [Validation(Required=false)]
        public string FileObjectName { get; set; }

        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 上传场景
        [NameInMap("upload_scene")]
        [Validation(Required=true)]
        public string UploadScene { get; set; }

        // 渠道方租户
        [NameInMap("channel_tenant")]
        [Validation(Required=true)]
        public string ChannelTenant { get; set; }

        // 上传唯一标识
        [NameInMap("upload_id")]
        [Validation(Required=true)]
        public string UploadId { get; set; }

    }

}
