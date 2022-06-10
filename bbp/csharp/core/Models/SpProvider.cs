// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    // 供应商
    public class SpProvider : TeaModel {
        // 供应商编号
        [NameInMap("sup_code")]
        [Validation(Required=true)]
        public string SupCode { get; set; }

        // 供应商名称
        [NameInMap("sup_name")]
        [Validation(Required=true)]
        public string SupName { get; set; }

        // 文件名称
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 文件code
        [NameInMap("file_code")]
        [Validation(Required=true)]
        public string FileCode { get; set; }

        // hash的值
        [NameInMap("hash_code")]
        [Validation(Required=true)]
        public string HashCode { get; set; }

        // 开始时间
        [NameInMap("start_date")]
        [Validation(Required=true)]
        public string StartDate { get; set; }

        // 结束日期
        [NameInMap("closing_date")]
        [Validation(Required=true)]
        public string ClosingDate { get; set; }

        // 文件路径
        [NameInMap("file_path")]
        [Validation(Required=true)]
        public string FilePath { get; set; }

        // 2021-03-04 11:16:23
        [NameInMap("create_date")]
        [Validation(Required=true)]
        public string CreateDate { get; set; }

        // 创建者
        [NameInMap("creator")]
        [Validation(Required=true)]
        public string Creator { get; set; }

    }

}
