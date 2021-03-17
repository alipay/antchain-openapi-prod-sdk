// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 不动产基本信息
    public class RealtyBasicInfo : TeaModel {
        // 权证类型，可选值：HOUSE_OWNERSHIP_CERT,OTHER_RIGHT_CERT,REALTY_OWNERSHIP_CERT,MORTGAGE_REG_CERT
        [NameInMap("realty_cert_type")]
        [Validation(Required=true)]
        public string RealtyCertType { get; set; }

        // 权证号码
        [NameInMap("realty_cert_no")]
        [Validation(Required=true)]
        public string RealtyCertNo { get; set; }

        // 坐落位置
        [NameInMap("location")]
        [Validation(Required=true)]
        public string Location { get; set; }

        // 权利人列表
        [NameInMap("obligee_list")]
        [Validation(Required=false)]
        public List<EntityBasicInfo> ObligeeList { get; set; }

    }

}
