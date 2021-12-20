// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ZJLM.Models
{
    // 文件
    public class FileInfoModelResponse : TeaModel {
        // 文件名称
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 文件别名
        [NameInMap("alias_name")]
        [Validation(Required=true)]
        public string AliasName { get; set; }

        // 文件类型
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 文件访问url 地址
        [NameInMap("oss_url")]
        [Validation(Required=true)]
        public string OssUrl { get; set; }

    }

}
