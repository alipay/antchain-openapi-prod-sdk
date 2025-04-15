// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BXPT_NEW.Models
{
    public class QueryDrrdataRiafdRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 业务流水号 需唯一， 格式：日期_客户标识_序列号
        [NameInMap("trade_no")]
        [Validation(Required=true)]
        public string TradeNo { get; set; }

        // 请求来源  国泰-GT
        [NameInMap("biz_source")]
        [Validation(Required=true)]
        public string BizSource { get; set; }

        // 逆向物流单号
        [NameInMap("reverse_mail_no")]
        [Validation(Required=true)]
        public string ReverseMailNo { get; set; }

        // 逆向物流快递公司代码
        [NameInMap("reverse_cp_code")]
        [Validation(Required=false)]
        public string ReverseCpCode { get; set; }

        // 逆向物流关联的电商平台
        [NameInMap("reverse_relate_platform")]
        [Validation(Required=false)]
        public string ReverseRelatePlatform { get; set; }

        // 逆向收件人电话后四位
        [NameInMap("reverse_receiver_phone")]
        [Validation(Required=false)]
        public string ReverseReceiverPhone { get; set; }

        // 逆向寄件人电话后四位
        [NameInMap("reverse_sender_phone")]
        [Validation(Required=false)]
        public string ReverseSenderPhone { get; set; }

        // 申请退货时间 格式：yyyy-MM-dd HH:mm:ss
        [NameInMap("apply_return_time")]
        [Validation(Required=false)]
        public string ApplyReturnTime { get; set; }

        // 申请理赔时间 格式：yyyy-MM-dd HH:mm:ss
        [NameInMap("claim_processing_time")]
        [Validation(Required=false)]
        public string ClaimProcessingTime { get; set; }

        // 正向物流单号
        [NameInMap("forward_mail_no")]
        [Validation(Required=false)]
        public string ForwardMailNo { get; set; }

        // 正向物流快递公司代码
        [NameInMap("forward_cp_code")]
        [Validation(Required=false)]
        public string ForwardCpCode { get; set; }

        // 正向物流关联的电商平台
        [NameInMap("forward_relate_platform")]
        [Validation(Required=false)]
        public string ForwardRelatePlatform { get; set; }

        // 正向收件人电话后四位
        [NameInMap("forward_receiver_phone")]
        [Validation(Required=false)]
        public string ForwardReceiverPhone { get; set; }

        // 正向寄件人电话后四位
        [NameInMap("forward_sender_phone")]
        [Validation(Required=false)]
        public string ForwardSenderPhone { get; set; }

    }

}
