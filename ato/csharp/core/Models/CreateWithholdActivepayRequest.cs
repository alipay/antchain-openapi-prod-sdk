// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CreateWithholdActivepayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id 长度不可超过50
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 第几期,当支付类型为PERFORMANCE或为空必填
        [NameInMap("period_num")]
        [Validation(Required=false)]
        public long? PeriodNum { get; set; }

        // 支付类型
        [NameInMap("pay_type")]
        [Validation(Required=false, MaxLength=64)]
        public string PayType { get; set; }

        // 支付渠道，非必填。可选值：JSAPI-JSAPI支付，APP-APP支付。默认值：JSAPI
        [NameInMap("pay_channel")]
        [Validation(Required=false, MaxLength=64)]
        public string PayChannel { get; set; }

        // 支付金额，单位为分
        // 当支付类型非PERFORMANCE或为空必填
        [NameInMap("pay_amount")]
        [Validation(Required=false)]
        public long? PayAmount { get; set; }

        // 经营分账标识Y/N
        // 当pay_type=BUYOUT、PENALTY、MULTI_PAY必填。
        [NameInMap("operation_divide_flag")]
        [Validation(Required=false, MaxLength=1)]
        public string OperationDivideFlag { get; set; }

        // 当operation_divide_flag=Y 必填
        // 经营分账收入列表，最多10条，分账比例与正常限制一致。
        [NameInMap("operation_divide_trans_in_list")]
        [Validation(Required=false)]
        public List<OperationDivideTransInModel> OperationDivideTransInList { get; set; }

        // 单期支付明细列表
        // 当pay_type=MULTI_PAY必填。
        [NameInMap("multi_pay_detail")]
        [Validation(Required=false)]
        public List<SingleTermDetail> MultiPayDetail { get; set; }

        // 支付申请号，用于区分在一笔订单同一支付类型的多笔支付请求。
        // 当支付类型非MULTI_PAY或为空时必填
        [NameInMap("pay_apply_no")]
        [Validation(Required=false)]
        public long? PayApplyNo { get; set; }

    }

}
