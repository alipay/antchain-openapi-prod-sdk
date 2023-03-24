// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMONRCSMART.Models
{
    // 图片、音频、视频、文件信息
    public class DataVo : TeaModel {
        // 文件审核地址
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 文件类型
        [NameInMap("file_type")]
        [Validation(Required=false)]
        public string FileType { get; set; }

    }

}
