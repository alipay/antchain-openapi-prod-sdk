// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // 知识库-文档切片-文件信息
    public class FileReq : TeaModel {
        // 导入文件地址
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 文件名称
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 文件类型，不设置使用全局类型
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 文件标签列表（用于AI参考）
        [NameInMap("tag_list")]
        [Validation(Required=false)]
        public List<string> TagList { get; set; }

    }

}
