// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ReplaceIpCodecirculationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 数字凭证加密编码或UNI序列号
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 领取用户的名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 领取用户的手机号
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

        // 当前持有人手机号
        [NameInMap("seller_phone_number")]
        [Validation(Required=true)]
        public string SellerPhoneNumber { get; set; }

        // 外部客户自定义客户ID
        [NameInMap("external_user_id")]
        [Validation(Required=false)]
        public string ExternalUserId { get; set; }

        // 用户头像地址
        [NameInMap("avatar")]
        [Validation(Required=false)]
        public string Avatar { get; set; }

        // 领取用户的位置信息
        [NameInMap("gps")]
        [Validation(Required=false)]
        public string Gps { get; set; }

        // 交易单ID
        [NameInMap("flow_order_id")]
        [Validation(Required=true)]
        public string FlowOrderId { get; set; }

        // 交易金额
        [NameInMap("flow_amount")]
        [Validation(Required=true)]
        public string FlowAmount { get; set; }

        // 流转交易平台
        [NameInMap("flow_trade_platform")]
        [Validation(Required=true)]
        public string FlowTradePlatform { get; set; }

        // 商品名称
        [NameInMap("flow_goods_name")]
        [Validation(Required=false)]
        public string FlowGoodsName { get; set; }

        // 交易时间戳
        [NameInMap("flow_transaction_time")]
        [Validation(Required=true)]
        public long? FlowTransactionTime { get; set; }

        // 流转信息jsonstring
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
