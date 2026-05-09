// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAASPLATFORM.Models
{
    // 操作主体
    public class OperateSubject : TeaModel {
        // 主体名称
        [NameInMap("subject_name")]
        [Validation(Required=true)]
        public string SubjectName { get; set; }

        // 证件类型,ID_CARD:身份证;PASSPORT:护照;BUSINESS_LICENSE:营业执照;OTHER:其他
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 证件号码，可以脱敏传输
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 主体信息明文计算出来的hash数据
        [NameInMap("subject_hash")]
        [Validation(Required=true)]
        public string SubjectHash { get; set; }

    }

}
