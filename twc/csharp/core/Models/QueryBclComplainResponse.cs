// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryBclComplainResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 租赁订单id
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 投诉订单号
        [NameInMap("complain_event_id")]
        [Validation(Required=false)]
        public string ComplainEventId { get; set; }

        // 投诉单状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 支付宝交易号
        [NameInMap("third_trade_no")]
        [Validation(Required=false)]
        public string ThirdTradeNo { get; set; }

        // 发起交易流水号
        [NameInMap("trade_call_no")]
        [Validation(Required=false)]
        public string TradeCallNo { get; set; }

        // 投诉单创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public string GmtCreate { get; set; }

        // 投诉单修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public string GmtModified { get; set; }

        // 投诉单修改时间
        [NameInMap("gmt_finished")]
        [Validation(Required=false)]
        public string GmtFinished { get; set; }

        // 用户投诉诉求
        [NameInMap("leaf_category_name")]
        [Validation(Required=false)]
        public string LeafCategoryName { get; set; }

        // 用户投诉原因
        [NameInMap("complain_reason")]
        [Validation(Required=false)]
        public string ComplainReason { get; set; }

        // 投诉人电话号码
        [NameInMap("phone_no")]
        [Validation(Required=false)]
        public string PhoneNo { get; set; }

        // 交易金额，单位元
        [NameInMap("trade_amount")]
        [Validation(Required=false)]
        public string TradeAmount { get; set; }

        // 用户与商家之间的协商记录
        [NameInMap("reply_detail_infos")]
        [Validation(Required=false)]
        public ReplayDetailInfo ReplyDetailInfos { get; set; }

    }

}
