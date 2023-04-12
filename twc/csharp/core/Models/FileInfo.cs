// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 文件key和文件名称
    public class FileInfo : TeaModel {
        // 文件key
        [NameInMap("file_key")]
        [Validation(Required=true)]
        public string FileKey { get; set; }

        // 文件名称
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 文件类型(枚举)
        // CASE_NOTICE: 立案通知书
        // CASE_VERDICT: 仲裁裁决书
        // CASE_EFFECT_PROVE: 裁决书司法生效证明
        // CASE_SERVED_NOTICE: 电子送达通知
        // PAYMETN_INFO: 缴费相关文件
        [NameInMap("file_type")]
        [Validation(Required=false)]
        public string FileType { get; set; }

    }

}
