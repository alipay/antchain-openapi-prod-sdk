// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 授权上链文件
    public class AuthChainFile : TeaModel {
        // 签署文件的hash值
        [NameInMap("sign_file_hash")]
        [Validation(Required=true)]
        public string SignFileHash { get; set; }

        // 上链事务唯一标识
        [NameInMap("upload_chain_tx_code")]
        [Validation(Required=true)]
        public string UploadChainTxCode { get; set; }

        // 蚂蚁区块链统一证据编号
        [NameInMap("baas_uniq_code")]
        [Validation(Required=true)]
        public string BaasUniqCode { get; set; }

        // 上链时间(13位毫秒级时间戳)
        [NameInMap("upload_chain_time")]
        [Validation(Required=true)]
        public string UploadChainTime { get; set; }

        // 上链文件下载链接
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

    }

}
