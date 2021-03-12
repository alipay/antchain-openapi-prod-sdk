// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云蚂蚁区块链相关下载结果
    public class ALiYunChainDownload : TeaModel {
        // private_key
        [NameInMap("private_key")]
        [Validation(Required=false)]
        public string PrivateKey { get; set; }

        // download_path
        [NameInMap("download_path")]
        [Validation(Required=false)]
        public ALiYunDownloadPath DownloadPath { get; set; }

    }

}
