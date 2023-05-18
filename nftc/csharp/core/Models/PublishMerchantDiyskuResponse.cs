// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class PublishMerchantDiyskuResponse : TeaModel {
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

        // 生成的nftid结果
        [NameInMap("nft_id")]
        [Validation(Required=false)]
        public string NftId { get; set; }

        // 获得时间
        [NameInMap("receive_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ReceiveTime { get; set; }

        // 发放状态
        // AUDIT_SUBMIT("审核中"),
        // AUDIT_SUCCESS("审核通过"),
        // AUDIT_FAIL("审核未通过"),
        // TRANSFER_UNKNOWN("发放结果未知"),
        // TRANSFER_SUCCESS("发放成功"),
        // TRANSFER_FAILED("发放失败"),
        // SHIELD("屏蔽"),
        // RECYCLE("回收"),
        [NameInMap("send_status")]
        [Validation(Required=false)]
        public string SendStatus { get; set; }

    }

}
