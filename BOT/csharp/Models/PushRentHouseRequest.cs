// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PushRentHouseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 房源信息集合 数组
        [NameInMap("house_list")]
        [Validation(Required=true)]
        public List<HouseInfo> HouseList { get; set; }

        // 企业(业主)身份识别码
        [NameInMap("merchant_id_card")]
        [Validation(Required=true)]
        public string MerchantIdCard { get; set; }

        // 联系电话
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 联系人
        [NameInMap("contract")]
        [Validation(Required=false)]
        public string Contract { get; set; }

        // 对应会员用户id
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

    }

}
