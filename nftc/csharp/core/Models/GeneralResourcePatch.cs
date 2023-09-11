// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    // 通用资源差量包信息
    public class GeneralResourcePatch : TeaModel {
        // 差量包文件下载地址
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 差量包的旧版本号
        [NameInMap("old_version")]
        [Validation(Required=true)]
        public long? OldVersion { get; set; }

        // md5摘要值
        [NameInMap("md5")]
        [Validation(Required=true)]
        public string Md5 { get; set; }

        // 差量包文件大小
        [NameInMap("size")]
        [Validation(Required=true)]
        public long? Size { get; set; }

    }

}
