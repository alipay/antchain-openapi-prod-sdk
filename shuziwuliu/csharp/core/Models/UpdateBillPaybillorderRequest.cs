// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class UpdateBillPaybillorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除	
        // 
        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

        // 申请时间 毫秒值 业务必填
        [NameInMap("apply_date")]
        [Validation(Required=false)]
        public long? ApplyDate { get; set; }

        // 银行收款账户
        [NameInMap("bank_receipt_account")]
        [Validation(Required=false)]
        public string BankReceiptAccount { get; set; }

        // 币种 业务必填
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 开户行
        [NameInMap("deposit_bank")]
        [Validation(Required=false)]
        public string DepositBank { get; set; }

        // 账单到期日
        [NameInMap("expire_date")]
        [Validation(Required=false)]
        public long? ExpireDate { get; set; }

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 应付总额 业务必填
        [NameInMap("pay_amount")]
        [Validation(Required=false)]
        public string PayAmount { get; set; }

        // 付款单编号
        [NameInMap("pay_bill_order_code")]
        [Validation(Required=true)]
        public string PayBillOrderCode { get; set; }

        // 应付账单资费项 业务必填
        [NameInMap("pay_bill_tariff_params")]
        [Validation(Required=false)]
        public List<PayBillTariffParam> PayBillTariffParams { get; set; }

        // 付款公司
        [NameInMap("pay_company")]
        [Validation(Required=false)]
        public string PayCompany { get; set; }

        // 付款公司企业信用号
        [NameInMap("pay_company_cert_no")]
        [Validation(Required=false)]
        public string PayCompanyCertNo { get; set; }

        // 付款公司did
        [NameInMap("pay_company_did")]
        [Validation(Required=false)]
        public string PayCompanyDid { get; set; }

        // 付款期限
        [NameInMap("pay_deadline")]
        [Validation(Required=false)]
        public string PayDeadline { get; set; }

        // 收款客户[业务必填]
        [NameInMap("receipt_client")]
        [Validation(Required=false)]
        public string ReceiptClient { get; set; }

        // 收款客户企业信用号[业务必填]
        [NameInMap("receipt_client_cert_no")]
        [Validation(Required=false)]
        public string ReceiptClientCertNo { get; set; }

        // 收款客户did[业务必填]
        [NameInMap("receipt_client_did")]
        [Validation(Required=false)]
        public string ReceiptClientDid { get; set; }

        // 对应应收资费项code
        [NameInMap("receipt_tariff_codes")]
        [Validation(Required=false)]
        public List<string> ReceiptTariffCodes { get; set; }

        // 结算公司
        [NameInMap("settle_company")]
        [Validation(Required=false)]
        public string SettleCompany { get; set; }

        // 结算公司企业信用号
        [NameInMap("settle_company_cert_no")]
        [Validation(Required=false)]
        public string SettleCompanyCertNo { get; set; }

        // 结算公司did [业务必填]
        [NameInMap("settle_company_did")]
        [Validation(Required=false)]
        public string SettleCompanyDid { get; set; }

        // 账单结算周期
        [NameInMap("settle_cycle")]
        [Validation(Required=false)]
        public string SettleCycle { get; set; }

        // 结算状态 ：  SETTLED(已结算) ,  UNSETTLE（未结算）[业务必填]
        [NameInMap("settle_status")]
        [Validation(Required=false)]
        public string SettleStatus { get; set; }

        // 确认时间
        [NameInMap("confirm_time")]
        [Validation(Required=false)]
        public long? ConfirmTime { get; set; }

    }

}
