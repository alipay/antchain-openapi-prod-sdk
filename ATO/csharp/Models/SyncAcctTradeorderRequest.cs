// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SyncAcctTradeorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 关联的签约单号，长度大于6小于50
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 平台商统一社会信用代码，长度大于0小于等于32
        [NameInMap("platform_id")]
        [Validation(Required=true)]
        public string PlatformId { get; set; }

        // 平台传入的交易订单号，长度大于6小于50
        [NameInMap("acct_trade_order_id")]
        [Validation(Required=true)]
        public string AcctTradeOrderId { get; set; }

        // 交易订单信息，JSON字符串，参考后文 TradeOrderInfoRequest 定义
        [NameInMap("order_info")]
        [Validation(Required=true)]
        public string OrderInfo { get; set; }

        // 商品信息，JSON字符串，参考后文 TradeProductInfoRequest 定义
        [NameInMap("product_info")]
        [Validation(Required=true)]
        public string ProductInfo { get; set; }

        // 交易卖家信息，JSON字符串，参考后文 TradeUserInfoRequest 定义；平台账号ID、姓名、身份证号需与关联签约单一致
        [NameInMap("user_info")]
        [Validation(Required=true)]
        public string UserInfo { get; set; }

        // 交易买家信息，JSON字符串，参考后文 TradeThirdUserInfoRequest 定义
        [NameInMap("third_user_info")]
        [Validation(Required=true)]
        public string ThirdUserInfo { get; set; }

    }

}
