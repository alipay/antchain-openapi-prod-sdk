// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DONPA.Models
{
    public class BindSlxfRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 修复批次号
        [NameInMap("batch_id")]
        [Validation(Required=true)]
        public string BatchId { get; set; }

        // 待 修 复 sha256 加 密身份证号
        [NameInMap("id_card")]
        [Validation(Required=true)]
        public string IdCard { get; set; }

        // 脱敏后手机号码加密串， 需要拨打的该手机号码
        [NameInMap("unicom_customer_id")]
        [Validation(Required=true)]
        public string UnicomCustomerId { get; set; }

        // 主叫号码，号码要求备案
        [NameInMap("seat_number")]
        [Validation(Required=true)]
        public string SeatNumber { get; set; }

        // 外显号，外显号要求在外 显号池中
        [NameInMap("show_number")]
        [Validation(Required=true)]
        public string ShowNumber { get; set; }

        // 虚拟小号， 线下分 配
        [NameInMap("tel_x")]
        [Validation(Required=true)]
        public string TelX { get; set; }

    }

}
