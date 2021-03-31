// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class StartFinanceWaybillRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 货物运费险
        [NameInMap("cargo_insurance_money")]
        [Validation(Required=false)]
        public string CargoInsuranceMoney { get; set; }

        // 车牌颜色
        [NameInMap("cart_badge_color")]
        [Validation(Required=true)]
        public string CartBadgeColor { get; set; }

        // 车牌号
        [NameInMap("cart_badge_no")]
        [Validation(Required=true)]
        public string CartBadgeNo { get; set; }

        // 承运商did
        [NameInMap("car_captain_did")]
        [Validation(Required=false)]
        public string CarCaptainDid { get; set; }

        // 司机分布式数字身份
        [NameInMap("driver_did")]
        [Validation(Required=true)]
        public string DriverDid { get; set; }

        // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

        // 起运时间，13位毫秒级时间戳
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public long? StartTime { get; set; }

        // 运单id
        [NameInMap("tax_waybill_id")]
        [Validation(Required=true)]
        public string TaxWaybillId { get; set; }

    }

}
