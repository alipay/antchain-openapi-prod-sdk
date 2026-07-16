// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SubmitInnerFundmngbatchloanRequest : TeaModel {
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

        // 商家代偿开始天数
        [NameInMap("merchant_compensate_start_day")]
        [Validation(Required=false)]
        public long? MerchantCompensateStartDay { get; set; }

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

        // 融资模式
        // 供应链金融:SUPPLY_CHAIN_FINANCE;
        // 自定义还款:DEFAULT
        [NameInMap("fund_mode")]
        [Validation(Required=true)]
        public string FundMode { get; set; }

        // 批量放款文件
        [NameInMap("file_info")]
        [Validation(Required=true)]
        public FileInfo FileInfo { get; set; }

        // 页面调用traceid
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 付费角色
        // MERCHANT ：商户
        // FINANCIER： 资方
        [NameInMap("paid_role")]
        [Validation(Required=false)]
        public string PaidRole { get; set; }

        // 付费方社会统一信用代码
        [NameInMap("paid_company_id")]
        [Validation(Required=false)]
        public string PaidCompanyId { get; set; }

        // 放款渠道
        // BANK :银行
        // ALIPAY : 支付宝
        [NameInMap("loan_channel")]
        [Validation(Required=false)]
        public string LoanChannel { get; set; }

    }

}
