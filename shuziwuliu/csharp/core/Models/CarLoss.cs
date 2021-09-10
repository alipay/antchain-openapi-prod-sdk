// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 车辆损失详情 
    public class CarLoss : TeaModel {
        // 车牌号，车牌号和车架号至少填一个
        [NameInMap("car_mark")]
        [Validation(Required=false, MaxLength=20)]
        public string CarMark { get; set; }

        // 车主姓名 
        [NameInMap("car_owner_name")]
        [Validation(Required=false, MaxLength=200)]
        public string CarOwnerName { get; set; }

        // 车主联系方式
        [NameInMap("car_owner_contact")]
        [Validation(Required=false, MaxLength=20)]
        public string CarOwnerContact { get; set; }

        // 车架号，车牌号和车架号至少填一个
        [NameInMap("car_vin_no")]
        [Validation(Required=false, MaxLength=100)]
        public string CarVinNo { get; set; }

        // 损失预估，单位（元），最多支持2位小数
        [NameInMap("car_loss_estimate_amount")]
        [Validation(Required=true)]
        public string CarLossEstimateAmount { get; set; }

    }

}
