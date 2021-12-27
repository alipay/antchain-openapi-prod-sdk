// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ApplyDubheUsecreditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授信申请订单号
        [NameInMap("original_order_no")]
        [Validation(Required=true)]
        public string OriginalOrderNo { get; set; }

        // 用信金额
        [NameInMap("loan_amount")]
        [Validation(Required=true)]
        public long? LoanAmount { get; set; }

        // 期数
        [NameInMap("period")]
        [Validation(Required=true)]
        public long? Period { get; set; }

        // 资产方用户唯一标识
        [NameInMap("open_id")]
        [Validation(Required=true)]
        public string OpenId { get; set; }

        // 订单号
        [NameInMap("order_on")]
        [Validation(Required=true)]
        public string OrderOn { get; set; }

        // 还款方式
        [NameInMap("repay_type")]
        [Validation(Required=true)]
        public string RepayType { get; set; }

        // 1：手机数码 2：旅游 3：装修 4：教育 5：婚庆 6：租房 7：家具家居 8：健康医疗 9：其他消费 10：家用电器
        [NameInMap("loan_way")]
        [Validation(Required=true)]
        public string LoanWay { get; set; }

        // 1: APP
        // 2: 支付宝小程序
        // 3：微信小程序
        // 4：微信公众号
        // 5：PC网页
        // 默认1
        [NameInMap("channel_type")]
        [Validation(Required=true)]
        public string ChannelType { get; set; }

        // 1: 新增客户
        // 2：存量激活客户
        // 3：目标营销客户
        // 默认1
        [NameInMap("custom_type")]
        [Validation(Required=true)]
        public string CustomType { get; set; }

        // 指定还款日（仅无在贷借据时生效）
        [NameInMap("repay_date")]
        [Validation(Required=true)]
        public string RepayDate { get; set; }

    }

}
