// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 企业银行授信
    public class BandCert : TeaModel {
        // 银行账号
        // 
        // 
        [NameInMap("bank_account")]
        [Validation(Required=true)]
        public string BankAccount { get; set; }

        // 银行名称
        // 
        // 
        [NameInMap("bank_name")]
        [Validation(Required=true)]
        public string BankName { get; set; }

        // 文件信息，支持上传多个文件
        // 
        // 
        [NameInMap("file_defines")]
        [Validation(Required=true)]
        public List<FileDefine> FileDefines { get; set; }

    }

}
