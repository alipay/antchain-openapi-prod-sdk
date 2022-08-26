// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_6f72e7df0c87441c84120631f5b37b12.Models
{
    // 阿里云蚂蚁区块链相关下载结果
    public class ALiYunChainDownload : TeaModel {
        // download_path
        [NameInMap("download_path")]
        [Validation(Required=false)]
        public ALiYunDownloadPath DownloadPath { get; set; }

        // private_key
        [NameInMap("private_key")]
        [Validation(Required=false)]
        public string PrivateKey { get; set; }

    }

}
