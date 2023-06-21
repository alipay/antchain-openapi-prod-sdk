// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 合同信息
    public class BclContractInfo : TeaModel {
        // 待签署,SIGNING
        // 拒签,REJECT
        // 签署失败,SIGN_FAIL
        // 签署完成,FINISH
        [NameInMap("sign_status")]
        [Validation(Required=true)]
        public string SignStatus { get; set; }

        // 签署完成的合同文件 只有签署完成才有
        [NameInMap("signed_files")]
        [Validation(Required=false)]
        public List<BclFileInfo> SignedFiles { get; set; }

    }

}
