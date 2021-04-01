// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateLogisticFinanceCargoorderRequest : TeaModel {
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

        // 货主did
        [NameInMap("consignor_did")]
        [Validation(Required=true)]
        public string ConsignorDid { get; set; }

        // 卸货地
        [NameInMap("delivery_place")]
        [Validation(Required=true)]
        public string DeliveryPlace { get; set; }

        // 装货地
        [NameInMap("loading_place")]
        [Validation(Required=true)]
        public string LoadingPlace { get; set; }

        // 平台did
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

        // 联系人电话
        [NameInMap("user_phone")]
        [Validation(Required=false)]
        public string UserPhone { get; set; }

        // 重量
        [NameInMap("weight")]
        [Validation(Required=true)]
        public string Weight { get; set; }

    }

}
