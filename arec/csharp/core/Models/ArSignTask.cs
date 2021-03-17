// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 合同签署任务
    public class ArSignTask : TeaModel {
        // 证件号
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

        // 证件类型，比如：ID_CARD=身份证
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public string CertType { get; set; }

        // 客户编号
        [NameInMap("cm_no")]
        [Validation(Required=false)]
        public string CmNo { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 签署流程编号
        [NameInMap("proc_no")]
        [Validation(Required=false)]
        public string ProcNo { get; set; }

        // 合同签署地址
        [NameInMap("sign_url")]
        [Validation(Required=false)]
        public string SignUrl { get; set; }

        // 签署状态 ，比如：INIT=待签署
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 智慧合同签署账号id
        [NameInMap("myc_account_id")]
        [Validation(Required=false)]
        public string MycAccountId { get; set; }

    }

}
