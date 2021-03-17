// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 签署的合同信息
    // 
    public class Contract : TeaModel {
        // 文件 ID
        [NameInMap("document_id")]
        [Validation(Required=true)]
        public string DocumentId { get; set; }

        // 参数指定合同文件名称
        [NameInMap("contract_name")]
        [Validation(Required=true)]
        public string ContractName { get; set; }

        // 合同文件的URL下载路径，有效期1小时
        [NameInMap("archived_file_url")]
        [Validation(Required=false)]
        public string ArchivedFileUrl { get; set; }

    }

}
