// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_1f51f68dfc5d438387dbbaa76f5997f4.Models
{
    // 上传者信息
    public class UploaderInfo : TeaModel {
        // 上传者证书hash
        [NameInMap("cert_hash")]
        [Validation(Required=true)]
        public string CertHash { get; set; }

        // 上传者身份证明
        [NameInMap("uploader")]
        [Validation(Required=true)]
        public string Uploader { get; set; }

        // 上传时间
        [NameInMap("upload_time")]
        [Validation(Required=true)]
        public long? UploadTime { get; set; }

        // 经度
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public string Longitude { get; set; }

        // 纬度
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public string Latitude { get; set; }

    }

}
