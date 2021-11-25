// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 企业资信担保
    public class Assure : TeaModel {
        // 担保ID
        // 
        // 
        [NameInMap("assure_id")]
        [Validation(Required=true)]
        public string AssureId { get; set; }

        // 文件信息，支持上传多个文件
        // 
        // 
        [NameInMap("file_defines")]
        [Validation(Required=true)]
        public List<FileDefine> FileDefines { get; set; }

    }

}
