// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    public class JudgeCodeFakescreenRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备型号
        [NameInMap("device_type")]
        [Validation(Required=false)]
        public string DeviceType { get; set; }

        // 未闪光图片的fileId
        [NameInMap("unflashed_file_id")]
        [Validation(Required=true)]
        public string UnflashedFileId { get; set; }

        // 闪光后图片fileId
        [NameInMap("flashed_file_id")]
        [Validation(Required=true)]
        public string FlashedFileId { get; set; }

        // 上传文件类型，默认为id。
        // id标识通过网关上传，参数为网关的fileId。
        // url标识上传的为图片可访问链接。
        [NameInMap("file_type")]
        [Validation(Required=false)]
        public string FileType { get; set; }

    }

}
