// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveBillPaybilltariffRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

        // 计费数量 业务必填
        [NameInMap("billing_number")]
        [Validation(Required=false)]
        public string BillingNumber { get; set; }

        // 计费类型 业务必填
        [NameInMap("billing_type")]
        [Validation(Required=false)]
        public string BillingType { get; set; }

        // 航运订舱号[业务必填]
        [NameInMap("bkg_no")]
        [Validation(Required=false)]
        public string BkgNo { get; set; }

        // 订舱单号[业务必填]
        [NameInMap("booking_no")]
        [Validation(Required=false)]
        public string BookingNo { get; set; }

        // 币种 业务必填
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 收支  INCOME--收入， EXPENSES--支出
        // 业务必填
        [NameInMap("income_or_expenses")]
        [Validation(Required=false)]
        public string IncomeOrExpenses { get; set; }

        // 电子发票网址
        [NameInMap("invoice_url")]
        [Validation(Required=false)]
        public string InvoiceUrl { get; set; }

        // 工作单号 业务必填
        [NameInMap("order_no")]
        [Validation(Required=false)]
        public string OrderNo { get; set; }

        // 资费单据编号
        [NameInMap("pay_tariff_code")]
        [Validation(Required=true)]
        public string PayTariffCode { get; set; }

        // 资费项中文描述 业务必填
        [NameInMap("pay_tariff_desc")]
        [Validation(Required=false)]
        public string PayTariffDesc { get; set; }

        // 资费项目 业务必填
        [NameInMap("pay_tariff_project")]
        [Validation(Required=false)]
        public string PayTariffProject { get; set; }

        // 含税价 业务必填
        [NameInMap("price_including_tax")]
        [Validation(Required=false)]
        public string PriceIncludingTax { get; set; }

        // 结算客户名称
        [NameInMap("settle_client")]
        [Validation(Required=false)]
        public string SettleClient { get; set; }

        // 结算客户企业信用号
        [NameInMap("settle_client_cert_no")]
        [Validation(Required=false)]
        public string SettleClientCertNo { get; set; }

        // 结算客户did
        [NameInMap("settle_client_did")]
        [Validation(Required=false)]
        public string SettleClientDid { get; set; }

        // 税金
        [NameInMap("taxes")]
        [Validation(Required=false)]
        public string Taxes { get; set; }

        // 未税价 业务必填
        [NameInMap("untaxed_price")]
        [Validation(Required=false)]
        public string UntaxedPrice { get; set; }

        // 确认时间
        [NameInMap("confirm_time")]
        [Validation(Required=false)]
        public long? ConfirmTime { get; set; }

    }

}
