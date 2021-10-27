// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 个人信息
    public class PersonInfo : TeaModel {
        // 个人证件名称
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 个人证件号码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 证件类型, 默认身份证 RESIDENT：居民身份证号，PASSPORT：护照，MILITARY：军官证
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public string CertType { get; set; }

    }

}
