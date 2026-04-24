// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢-电商-企业信息
    public class EcEnterpriseInfo : TeaModel {
        // 企业名称
        [NameInMap("ent_name")]
        [Validation(Required=true)]
        public string EntName { get; set; }

        // 申请企业证件类型
        [NameInMap("ent_id_type")]
        [Validation(Required=true)]
        public string EntIdType { get; set; }

        // 客户企业的统一社会信用代码，有企业信息则必输
        [NameInMap("ent_id_no")]
        [Validation(Required=true)]
        public string EntIdNo { get; set; }

    }

}
