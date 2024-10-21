// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 机构类型
    public class InstitutionType : TeaModel {
        // 机构类型编码
        // ISSUER/PLATFORM/DISTRIBUTOR
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 机构类型名称
        //  ISSUER/PLATFORM/DISTRIBUTOR
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
