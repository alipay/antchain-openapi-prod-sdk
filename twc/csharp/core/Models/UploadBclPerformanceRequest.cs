// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class UploadBclPerformanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单编号ID,长度不超过32位
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=32)]
        public string OrderId { get; set; }

        // 租期编号，如：1表示第一期;
        // 目前还款支持最大期数为120期；
        [NameInMap("period")]
        [Validation(Required=true)]
        public long? Period { get; set; }

        // 租金归还金额，单位精确到分。如：56309表示563.09元
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 租金归还时间(格式为"2019-07-31 12:00:00")
        [NameInMap("time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Time { get; set; }

        // 归还方式，取值范围如下：
        // ACTIVE_REPAYMENT：主动还款，
        // MY_BANK_PROXY_WITHHOLDING：网商委托代扣,
        // PRE_AUTHORIZATION_WITHHOLDING: 预授权代扣
        [NameInMap("way")]
        [Validation(Required=true, MaxLength=32)]
        public string Way { get; set; }

        // 还款凭证类型，取值范围如下：
        // PLATFORM_COLLECTION：平台代收（客户主动还款），
        // MY_BANK：网商银行
        [NameInMap("voucher_type")]
        [Validation(Required=true, MaxLength=32)]
        public string VoucherType { get; set; }

        // 还款凭证编号,
        // 如支付宝还款时，为支付宝流水编号
        [NameInMap("voucher_serial")]
        [Validation(Required=true, MaxLength=64)]
        public string VoucherSerial { get; set; }

        // 手续费，单位分。如：128则表示手续费为12.8元；
        // 说明：如通过预授权、代扣的方式归还，该值必填
        [NameInMap("premium")]
        [Validation(Required=false)]
        public long? Premium { get; set; }

    }

}
