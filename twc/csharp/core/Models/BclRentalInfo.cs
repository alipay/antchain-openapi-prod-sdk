// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 履约详情
    public class BclRentalInfo : TeaModel {
        // 期数
        [NameInMap("period")]
        [Validation(Required=true)]
        public long? Period { get; set; }

        // 金额 单位分
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 租金归还时间
        [NameInMap("time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Time { get; set; }

        // 是	归还方式
        // 1.租赁代扣: PROXY_WITHHOLDING
        // 2.主动还款：ACTIVE_REPAYMENT  
        // 3.网商委托代扣：MY_BANK_DIRECT_PAYMENT
        // 4.预授权代扣：PRE_AUTHORIZATION_WITHHOLDING
        [NameInMap("way")]
        [Validation(Required=true)]
        public string Way { get; set; }

        // 还款渠道
        // 1.支付宝：ALIPAY
        // 2.平台代收（客户主动还款）：PLATFORM_COLLECTION 
        // 3.网商银行：MY_BANK
        // 4.其他：OTHER 
        [NameInMap("voucher_type")]
        [Validation(Required=true)]
        public string VoucherType { get; set; }

        // 还款凭证编号
        [NameInMap("voucher_serial")]
        [Validation(Required=true)]
        public string VoucherSerial { get; set; }

        // 手续费 如通过预授权、代扣的方式规划，必填
        [NameInMap("premium")]
        [Validation(Required=true)]
        public long? Premium { get; set; }

    }

}
