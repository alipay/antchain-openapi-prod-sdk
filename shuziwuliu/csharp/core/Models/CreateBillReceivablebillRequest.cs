// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CreateBillReceivablebillRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 账单总金额，单位（元），周期内应向发货方收取的运费总金额，不超过2位小数的数字
        [NameInMap("bill_amount")]
        [Validation(Required=true)]
        public string BillAmount { get; set; }

        // 账单生成时间，13位毫秒级时间戳
        [NameInMap("bill_create_time")]
        [Validation(Required=true)]
        public long? BillCreateTime { get; set; }

        // 账单期限，单位（天），合同约定的结算周期
        [NameInMap("bill_deadline")]
        [Validation(Required=true)]
        public long? BillDeadline { get; set; }

        // 账单id，客户生成的账单唯一编号
        [NameInMap("bill_id")]
        [Validation(Required=true)]
        public string BillId { get; set; }

        // 收款方did，账单的收款方数字身份
        [NameInMap("bill_payee_did")]
        [Validation(Required=true)]
        public string BillPayeeDid { get; set; }

        // 付款方did，账单的付款方数字身份
        [NameInMap("bill_payer_did")]
        [Validation(Required=true)]
        public string BillPayerDid { get; set; }

        // 账单起始日期，13位毫秒级时间戳
        [NameInMap("bill_start_time")]
        [Validation(Required=true)]
        public long? BillStartTime { get; set; }

        // 关联合同编号，账单关联的合同编号，如为合同物流请填写
        // 
        [NameInMap("contract_code")]
        [Validation(Required=false)]
        public string ContractCode { get; set; }

        // 账单到期日期，13位毫秒级时间戳
        [NameInMap("deadline")]
        [Validation(Required=true)]
        public long? Deadline { get; set; }

        // 账单关联运单号数组，元素个数不能超过1000个
        [NameInMap("waybill_ids")]
        [Validation(Required=true)]
        public List<string> WaybillIds { get; set; }

    }

}
