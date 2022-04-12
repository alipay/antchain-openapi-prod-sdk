// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAM.Models
{
    // 附件上传
    public class UploadRequest : TeaModel {
        // 文件流/文件地址
        [NameInMap("stream")]
        [Validation(Required=true)]
        public string Stream { get; set; }

        // 文件名称
        [NameInMap("filename")]
        [Validation(Required=true)]
        public string Filename { get; set; }

        // 内外工号
        [NameInMap("user")]
        [Validation(Required=true)]
        public string User { get; set; }

        // 附件的关联对象类型
        [NameInMap("target_type")]
        [Validation(Required=true)]
        public string TargetType { get; set; }

        // 附件的关联对象ID
        [NameInMap("target_id")]
        [Validation(Required=true)]
        public long? TargetId { get; set; }

    }

}
