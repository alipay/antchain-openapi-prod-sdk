// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryContractComplainResponse : TeaModel {
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

        // 投诉单号
        [NameInMap("complain_event_id")]
        [Validation(Required=false)]
        public string ComplainEventId { get; set; }

        // 投诉单状态
        // 商家处理中：MERCHANT_PROCESSING
        // 商家已反馈：MERCHANT_FEEDBACKED
        // 投诉已完结：FINISHED
        // 投诉已撤销：CANCELLED
        // 平台处理中：PLATFORM_PROCESSING
        // 平台处理完结：PLATFORM_FINISH
        // 系统关闭：CLOSED
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 支付宝交易号
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

        // 商家订单号
        [NameInMap("merchant_order_no")]
        [Validation(Required=false)]
        public string MerchantOrderNo { get; set; }

        // 投诉单创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public string GmtCreate { get; set; }

        // 投诉单修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public string GmtModified { get; set; }

        // 投诉单完结时间
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

        // 用户投诉内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 投诉图片
        [NameInMap("images")]
        [Validation(Required=false)]
        public List<string> Images { get; set; }

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
        public List<ReplayDetailInfo> ReplyDetailInfos { get; set; }

    }

}
