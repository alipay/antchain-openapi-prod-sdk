// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 公证处信息
    public class NotaryPublicOffice : TeaModel {
        // 公证处code
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 公证处名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 公证处所在省（直辖市）
        [NameInMap("province")]
        [Validation(Required=true)]
        public string Province { get; set; }

        // 公证处所在市
        [NameInMap("city")]
        [Validation(Required=true)]
        public string City { get; set; }

        // 公证处完整名称
        [NameInMap("org_name")]
        [Validation(Required=true)]
        public string OrgName { get; set; }

        // 公证处隶属
        [NameInMap("belong")]
        [Validation(Required=true)]
        public string Belong { get; set; }

    }

}
