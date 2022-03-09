// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class NotifyInsuranceReportresultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 案件同步唯一码，调用方生成的唯一编码； 格式为 yyyyMMdd_身份标识_其他编码，yyyyMMdd请传递当前时间。 系统会根据该流水号做防重、幂等判断逻辑。	
        // 
        [NameInMap("trade_no")]
        [Validation(Required=true, MaxLength=50)]
        public string TradeNo { get; set; }

        // 渠道简称code
        [NameInMap("channel_simple_code")]
        [Validation(Required=true, MaxLength=16)]
        public string ChannelSimpleCode { get; set; }

        // 报案号，关联的报案案件号	
        // 
        [NameInMap("report_no")]
        [Validation(Required=true, MaxLength=100)]
        public string ReportNo { get; set; }

        // 订单号	
        // 
        [NameInMap("rela_order_no")]
        [Validation(Required=true, MaxLength=100)]
        public string RelaOrderNo { get; set; }

        // 理赔金额(元)，实际的理赔金额，最多支持2位小数，超2位小数拒绝请求	
        // 
        [NameInMap("claim_amount")]
        [Validation(Required=true)]
        public string ClaimAmount { get; set; }

        // 支付时间，实际的保司打款时间，格式：yyyy-MM-dd HH:mm:ss	
        // 
        [NameInMap("payment_time")]
        [Validation(Required=true)]
        public string PaymentTime { get; set; }

        // 银行流水，打款的银行流水号	
        // 
        [NameInMap("bank_serial_num")]
        [Validation(Required=true, MaxLength=200)]
        public string BankSerialNum { get; set; }

    }

}
