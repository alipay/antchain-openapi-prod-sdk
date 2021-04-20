// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    public class ExecEventReportRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 事件类型，目前支持类型 VISIT：访问事件，TRADE：交易事件，SHARE：分享事件
        [NameInMap("event_type")]
        [Validation(Required=true)]
        public string EventType { get; set; }

        // 事件实例编码，目前支持访问事件，VISIT类别包括MINI_HOME_PAGE：访问首页，CONTRACT_DETAIL_OAGE：访问项目详情页，SHARE_LANDING_PAGE：访问分享页，TRADE类别包括TRADE_SUCCESS：购买成功，REFUND_SUCCESS: 退货成功，SHARE类别包括SHARE_FROM_MERCHANT
        [NameInMap("event_instance_code")]
        [Validation(Required=true)]
        public string EventInstanceCode { get; set; }

        // 购买人或者访问者
        [NameInMap("event_child")]
        [Validation(Required=false)]
        public User EventChild { get; set; }

        // 分享者
        [NameInMap("event_parent")]
        [Validation(Required=false)]
        public User EventParent { get; set; }

        // 唯一业务单号
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 项目唯一编号，访问详情页和回流页、购买事件必填
        [NameInMap("project_id")]
        [Validation(Required=false)]
        public string ProjectId { get; set; }

        // 到账类型，DIRECT：直接到账， TWO_STEP_MANUAL：手动到账，TWO_STEP：定时到账
        [NameInMap("confirm_type")]
        [Validation(Required=false)]
        public string ConfirmType { get; set; }

        // 到账时间。当到账类型为定时到账时，该字段必填。
        [NameInMap("confirm_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ConfirmTime { get; set; }

        // 交易订单数据
        [NameInMap("trade_order")]
        [Validation(Required=false)]
        public TradeOrder TradeOrder { get; set; }

    }

}
