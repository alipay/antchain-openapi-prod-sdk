// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class NotifyDubbridgeInterestResultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求流水号
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 权益流水号
        [NameInMap("interest_no")]
        [Validation(Required=true)]
        public string InterestNo { get; set; }

        // 权益订单状态：NOT_CREATE 订单未创建
        // PAYED： 支付成功
        // APPLY： 已投保
        // REFUND：已注销（退款)
        // CANCEL: 已取消
        // REFUND_FAIL： 退款失败
        [NameInMap("order_status")]
        [Validation(Required=true)]
        public string OrderStatus { get; set; }

        // 用户授权状态：AGREE 同意
        // DISAGREE 不同意
        [NameInMap("user_permit_status")]
        [Validation(Required=true)]
        public string UserPermitStatus { get; set; }

        // 公证状态：当需要公正时才返回公证结果
        // FINISH 已完成
        // UN_FINISH 未完成
        // PROCESSING 进行中
        [NameInMap("notary_status")]
        [Validation(Required=false)]
        public string NotaryStatus { get; set; }

        // 权益价格，单位：元
        [NameInMap("interest_price")]
        [Validation(Required=false)]
        public string InterestPrice { get; set; }

    }

}
