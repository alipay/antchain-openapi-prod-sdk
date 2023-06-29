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

    }

}
