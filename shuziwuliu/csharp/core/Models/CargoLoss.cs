// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 货物损失详情
    public class CargoLoss : TeaModel {
        // 物品类型
        [NameInMap("cargo_type")]
        [Validation(Required=false, MaxLength=200)]
        public string CargoType { get; set; }

        // 物品名称
        [NameInMap("cargo_name")]
        [Validation(Required=true, MaxLength=500)]
        public string CargoName { get; set; }

        // 物品所有人
        [NameInMap("cargo_owner")]
        [Validation(Required=false, MaxLength=200)]
        public string CargoOwner { get; set; }

        // 物品损失描述 
        [NameInMap("cargo_loss_desc")]
        [Validation(Required=false, MaxLength=500)]
        public string CargoLossDesc { get; set; }

        // 损失预估，单位（元），最多支持2位小数
        [NameInMap("cargo_loss_estimate_amount")]
        [Validation(Required=true)]
        public string CargoLossEstimateAmount { get; set; }

    }

}
