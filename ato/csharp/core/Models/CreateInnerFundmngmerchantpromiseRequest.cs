// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CreateInnerFundmngmerchantpromiseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资方租户id
        [NameInMap("fund_tenant_id")]
        [Validation(Required=true)]
        public string FundTenantId { get; set; }

        // 商户租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 订单所属商户的社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 订单所属融资方的社会统一信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true)]
        public string FundId { get; set; }

        // 商家还款方式
        // FULL_REPAYMENT_PER_INSTALLMENT
        // (每期全额还款)
        [NameInMap("merchant_pay_type")]
        [Validation(Required=true)]
        public string MerchantPayType { get; set; }

        // 商户代偿开始时间
        [NameInMap("merchant_compensate_start_day")]
        [Validation(Required=true)]
        public long? MerchantCompensateStartDay { get; set; }

        // 商户还款开始期数
        [NameInMap("pay_start_term_index")]
        [Validation(Required=true)]
        public long? PayStartTermIndex { get; set; }

        // 分账支付宝账号uid
        [NameInMap("divide_alipay_user_id")]
        [Validation(Required=true)]
        public string DivideAlipayUserId { get; set; }

        // 分账支付宝登录账号
        [NameInMap("divide_alipay_login_id")]
        [Validation(Required=true)]
        public string DivideAlipayLoginId { get; set; }

        // 代偿支付宝账号uid
        [NameInMap("compensate_alipay_user_id")]
        [Validation(Required=true)]
        public string CompensateAlipayUserId { get; set; }

        // 代偿支付宝登录账号
        [NameInMap("compensate_alipay_login_id")]
        [Validation(Required=true)]
        public string CompensateAlipayLoginId { get; set; }

    }

}
