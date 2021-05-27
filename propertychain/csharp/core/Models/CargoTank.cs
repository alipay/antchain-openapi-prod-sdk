// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 船运箱子详情结构体
    public class CargoTank : TeaModel {
        // 箱号
        [NameInMap("box_no")]
        [Validation(Required=true)]
        public string BoxNo { get; set; }

        // 铅封号	
        // 
        [NameInMap("lead_sealing_no")]
        [Validation(Required=true)]
        public string LeadSealingNo { get; set; }

        // 箱型	
        [NameInMap("box_type")]
        [Validation(Required=true)]
        public string BoxType { get; set; }

        // 重量	
        [NameInMap("box_weight")]
        [Validation(Required=true)]
        public string BoxWeight { get; set; }

    }

}
