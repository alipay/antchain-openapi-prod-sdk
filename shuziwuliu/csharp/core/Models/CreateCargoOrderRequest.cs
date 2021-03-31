// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CreateCargoOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 运费
        [NameInMap("all_freight")]
        [Validation(Required=true)]
        public string AllFreight { get; set; }

        // 货物行业编码
        [NameInMap("cargo_business_code")]
        [Validation(Required=false)]
        public string CargoBusinessCode { get; set; }

        // 货物商品编码
        [NameInMap("cargo_code")]
        [Validation(Required=false)]
        public string CargoCode { get; set; }

        // 货运险金额
        [NameInMap("cargo_insurance_money")]
        [Validation(Required=false)]
        public string CargoInsuranceMoney { get; set; }

        // 货物名称
        [NameInMap("cargo_name")]
        [Validation(Required=true)]
        public string CargoName { get; set; }

        // 货源单号
        [NameInMap("cargo_order")]
        [Validation(Required=true)]
        public string CargoOrder { get; set; }

        // 货物类型
        [NameInMap("cargo_type")]
        [Validation(Required=true)]
        public string CargoType { get; set; }

        // 货物单位
        [NameInMap("cargo_unit")]
        [Validation(Required=false)]
        public string CargoUnit { get; set; }

        // 货物体积，单位（方）
        [NameInMap("cargo_volume")]
        [Validation(Required=false)]
        public string CargoVolume { get; set; }

        // 货主did
        [NameInMap("consignor_did")]
        [Validation(Required=true)]
        public string ConsignorDid { get; set; }

        // 卸货地，XX省-XX市-XX区
        [NameInMap("delivery_place")]
        [Validation(Required=true)]
        public string DeliveryPlace { get; set; }

        // 装货地，XX省-XX市-XX区
        [NameInMap("loading_place")]
        [Validation(Required=true)]
        public string LoadingPlace { get; set; }

        // 所属承运平台did
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

        // 货源单创建时间
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public long? StartTime { get; set; }

        // 联系人电话
        [NameInMap("user_phone")]
        [Validation(Required=false)]
        public string UserPhone { get; set; }

        // 货物重量，单位（吨）
        [NameInMap("weight")]
        [Validation(Required=true)]
        public string Weight { get; set; }

    }

}
