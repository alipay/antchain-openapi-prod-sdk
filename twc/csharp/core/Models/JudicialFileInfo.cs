// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 司法纠纷平台通用文件信息结构体
    public class JudicialFileInfo : TeaModel {
        // 文件全名, 包含后缀
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 文件key
        [NameInMap("file_key")]
        [Validation(Required=false)]
        public string FileKey { get; set; }

        // 文件下载地址
        [NameInMap("download_url")]
        [Validation(Required=false)]
        public string DownloadUrl { get; set; }

        // 司法纠纷平台文件类型
        [NameInMap("judicial_file_type")]
        [Validation(Required=false)]
        public string JudicialFileType { get; set; }

    }

}
