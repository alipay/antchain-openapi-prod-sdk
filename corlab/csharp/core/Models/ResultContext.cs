// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CORLAB.Models
{
    // corlab任务查询结果信息
    public class ResultContext : TeaModel {
        // 产品码
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 结果文件名
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 结果文件下载地址
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

    }

}
