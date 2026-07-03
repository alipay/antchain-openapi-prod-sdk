// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class VerifyDubbridgeCustomerBankcardRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单号
        [NameInMap("order_no")]
        [Validation(Required=false)]
        public string OrderNo { get; set; }

        // 客户号
        [NameInMap("customer_no")]
        [Validation(Required=false)]
        public string CustomerNo { get; set; }

        // 绑卡流水
        [NameInMap("bind_serial_no")]
        [Validation(Required=true)]
        public string BindSerialNo { get; set; }

        // 绑卡验证码
        [NameInMap("bind_valid_code")]
        [Validation(Required=true)]
        public string BindValidCode { get; set; }

        // 银行卡号
        [NameInMap("bank_card_no")]
        [Validation(Required=true)]
        public string BankCardNo { get; set; }

        // 渠道号
        [NameInMap("channel_code")]
        [Validation(Required=true)]
        public string ChannelCode { get; set; }

        // 业务类型
        [NameInMap("prod_type")]
        [Validation(Required=false)]
        public string ProdType { get; set; }

    }

}
