// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 出证的公证书信息
    public class NotaryInfo : TeaModel {
        // 公证书编号
        [NameInMap("notarial_deed_no")]
        [Validation(Required=true)]
        public string NotarialDeedNo { get; set; }

        // 电子公证书文件路径
        [NameInMap("notary_paper_path")]
        [Validation(Required=true)]
        public string NotaryPaperPath { get; set; }

        // 公证书出证日期（yyyy-MM-dd）
        [NameInMap("notary_time")]
        [Validation(Required=true)]
        public string NotaryTime { get; set; }

    }

}
