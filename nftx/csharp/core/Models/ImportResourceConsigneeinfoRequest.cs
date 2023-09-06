// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    public class ImportResourceConsigneeinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 手机号
        [NameInMap("phone")]
        [Validation(Required=true)]
        public string Phone { get; set; }

        // 收货地址
        [NameInMap("delivery_address")]
        [Validation(Required=true)]
        public string DeliveryAddress { get; set; }

        // email
        [NameInMap("email")]
        [Validation(Required=true)]
        public string Email { get; set; }

        // 中奖人手机号
        [NameInMap("lucky_phone")]
        [Validation(Required=true)]
        public string LuckyPhone { get; set; }

        // 单据号，幂等用
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

    }

}
