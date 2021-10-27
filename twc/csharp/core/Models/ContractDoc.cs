// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 电子合同文档
    public class ContractDoc : TeaModel {
        // 上传的电子合同文档是否被加密过，0-未被加密，1-被加密过，默认0
        [NameInMap("encryption")]
        [Validation(Required=false)]
        public long? Encryption { get; set; }

        // 电子合同文档的ID
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 电子合同文档名称，默认文件名称
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 电子合同文档密码, 如果encryption值为1, 文档密码不能为空，默认没有密码
        [NameInMap("file_password")]
        [Validation(Required=false)]
        public string FilePassword { get; set; }

    }

}
