// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryAuthVehicleinsuranceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 车牌号
        [NameInMap("vehicle_no")]
        [Validation(Required=true)]
        public string VehicleNo { get; set; }

        // 车型代码. 可选, 02 普通小客车(默认); 52 新能源小客车
        [NameInMap("vehicle_type")]
        [Validation(Required=false)]
        public string VehicleType { get; set; }

        // 车辆识别码
        [NameInMap("vin")]
        [Validation(Required=true)]
        public string Vin { get; set; }

        // 车主认证信息
        [NameInMap("owner_meta_info")]
        [Validation(Required=true)]
        public UserMetaInfo OwnerMetaInfo { get; set; }

        // 业务类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 业务id
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

    }

}
