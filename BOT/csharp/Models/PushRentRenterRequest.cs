// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PushRentRenterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租客id
        [NameInMap("renter_id")]
        [Validation(Required=true)]
        public string RenterId { get; set; }

        // 租客名称
        [NameInMap("renter_name")]
        [Validation(Required=true)]
        public string RenterName { get; set; }

        // 租客联系电话
        [NameInMap("renter_phone")]
        [Validation(Required=true)]
        public string RenterPhone { get; set; }

        // 租客身份证号
        [NameInMap("renter_id_card")]
        [Validation(Required=false)]
        public string RenterIdCard { get; set; }

        // 房源唯一ID
        [NameInMap("house_id")]
        [Validation(Required=true)]
        public string HouseId { get; set; }

        // 租赁合同信息
        [NameInMap("rent_contract")]
        [Validation(Required=true)]
        public RentContractInfo RentContract { get; set; }

        // 企业(业主)身份识别码
        [NameInMap("merchant_id_card")]
        [Validation(Required=true)]
        public string MerchantIdCard { get; set; }

    }

}
