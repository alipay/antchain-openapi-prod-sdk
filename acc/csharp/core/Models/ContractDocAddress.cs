// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 合同文档地址
    public class ContractDocAddress : TeaModel {
        // 电子合同文档ID
        // 
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 电子合同文档名称，默认文件名称
        // 
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 电子合同下载文档地址, 有效时间1小时
        // 
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

        // 链上hash
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

    }

}
