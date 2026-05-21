// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACNCONTRACTREVIEW.Models
{
    // 文件合同信息
    public class ContractFile : TeaModel {
        // 文件名称
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 文件下载地址
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

        // 文件类型，如 docx、pdf
        [NameInMap("file_type")]
        [Validation(Required=false)]
        public string FileType { get; set; }

    }

}
