// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class UpdateCargowaybillBillRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 货主账单总额（两位小数）
        [NameInMap("bill_amount")]
        [Validation(Required=true)]
        public string BillAmount { get; set; }

        // 账单code（唯一标识）
        [NameInMap("bill_code")]
        [Validation(Required=true)]
        public string BillCode { get; set; }

        // 账单生成时间(毫秒)
        [NameInMap("bill_create_time")]
        [Validation(Required=true)]
        public long? BillCreateTime { get; set; }

        // 账单期限，单位（天），需填写1到360之间的整数
        [NameInMap("bill_deadline")]
        [Validation(Required=true)]
        public string BillDeadline { get; set; }

        // 付款方did
        [NameInMap("bill_payer_did")]
        [Validation(Required=true)]
        public string BillPayerDid { get; set; }

        // 货源单号-货主运费列表
        [NameInMap("cargo_amounts")]
        [Validation(Required=true)]
        public List<CargoAmount> CargoAmounts { get; set; }

        // 币种
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 账单到期日期
        [NameInMap("deadline")]
        [Validation(Required=true)]
        public long? Deadline { get; set; }

        // 货主支付方式-支付金额列表
        [NameInMap("pay_amounts")]
        [Validation(Required=true)]
        public List<PayAmount> PayAmounts { get; set; }

        // 平台did
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

        // 预计货主付款日期
        [NameInMap("pre_consignor_pay_date")]
        [Validation(Required=true)]
        public long? PreConsignorPayDate { get; set; }

        // 运单号-司机运费列表
        [NameInMap("waybill_amounts")]
        [Validation(Required=false)]
        public List<WaybillAmount> WaybillAmounts { get; set; }

        // 运单上传状态，可填写：已完成、未完成
        [NameInMap("waybill_upload_status")]
        [Validation(Required=true)]
        public string WaybillUploadStatus { get; set; }

    }

}
