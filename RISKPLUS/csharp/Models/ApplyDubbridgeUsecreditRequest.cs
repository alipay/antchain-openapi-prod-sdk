// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ApplyDubbridgeUsecreditRequest : TeaModel {
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
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 还款方式:1：等额本息，2：等额本金
        [NameInMap("repay_type")]
        [Validation(Required=true)]
        public string RepayType { get; set; }

        // 1：手机数码 2：旅游 3：装修 4：教育 5：婚庆 6：租房 7：家具家居 8：健康医疗 9：其他消费 10：家用电器
        [NameInMap("loan_way")]
        [Validation(Required=true)]
        public string LoanWay { get; set; }

        // 还款日
        [NameInMap("repay_date")]
        [Validation(Required=false)]
        public string RepayDate { get; set; }

        // 渠道类型
        [NameInMap("channel_type")]
        [Validation(Required=false)]
        public string ChannelType { get; set; }

        // 客户类型
        [NameInMap("custom_type")]
        [Validation(Required=false)]
        public string CustomType { get; set; }

        // 风险数据对象（json字符串）
        [NameInMap("risk_data")]
        [Validation(Required=false)]
        public string RiskData { get; set; }

        // 资金源编码
        [NameInMap("loan_inst_code")]
        [Validation(Required=false)]
        public string LoanInstCode { get; set; }

        // 银行卡号
        [NameInMap("bank_card_no")]
        [Validation(Required=false)]
        public string BankCardNo { get; set; }

        // 影像件信息
        [NameInMap("materials")]
        [Validation(Required=false)]
        public List<Material> Materials { get; set; }

        // 优惠券id
        [NameInMap("coupon_id")]
        [Validation(Required=false)]
        public string CouponId { get; set; }

        // 导流平台
        [NameInMap("traffic_platform")]
        [Validation(Required=false)]
        public string TrafficPlatform { get; set; }

        // 业务方订单号
        [NameInMap("biz_order_no")]
        [Validation(Required=false)]
        public string BizOrderNo { get; set; }

    }

}
