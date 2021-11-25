// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 待签署文件
    public class ContractDocument : TeaModel {
        // 是否加密，0-不加密，1-加，默认0
        // 
        [NameInMap("encryption")]
        [Validation(Required=false)]
        public long? Encryption { get; set; }

        // 电子合同文档的ID
        // 
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 电子合同文档名称，默认文件名称
        // 
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 电子合同文档密码, 如果encryption值为1, 文档密码不能为空，默认没有密码
        // 
        [NameInMap("file_password")]
        [Validation(Required=false)]
        public string FilePassword { get; set; }

    }

}
