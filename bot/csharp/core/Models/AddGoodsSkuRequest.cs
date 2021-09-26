// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class AddGoodsSkuRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // GoodsTypeEnum,商品一级类目
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 商品二级类目
        [NameInMap("second_type")]
        [Validation(Required=true)]
        public string SecondType { get; set; }

        // 商品品牌
        [NameInMap("brand")]
        [Validation(Required=true)]
        public string Brand { get; set; }

        // 商品名称，型号
        [NameInMap("model")]
        [Validation(Required=true)]
        public string Model { get; set; }

        // 市场价
        [NameInMap("market_price")]
        [Validation(Required=true)]
        public long? MarketPrice { get; set; }

        // 手机型号信息
        [NameInMap("phone_info")]
        [Validation(Required=false)]
        public PhoneInfo PhoneInfo { get; set; }

        // 电脑型号信息
        [NameInMap("computer_info")]
        [Validation(Required=false)]
        public ComputerInfo ComputerInfo { get; set; }

    }

}
