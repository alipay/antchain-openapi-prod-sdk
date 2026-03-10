// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeRepaywithholdLxResponse : TeaModel {
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

        // 代扣状态，
        // 1、代扣成功
        // 2、代扣失败
        // 3. 代扣处理中
        // 4. 未收到代扣请求（交易侧可以重复发起代扣）
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 代扣描述，失败时，需给出的错误描述
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

        // 资金方扣款交易流水号，受理流水号(资金方)
        [NameInMap("order_num")]
        [Validation(Required=false)]
        public string OrderNum { get; set; }

        // 支付通道交易流水号
        [NameInMap("trans_num")]
        [Validation(Required=false)]
        public string TransNum { get; set; }

        // 代扣明细
        [NameInMap("withhold_detail")]
        [Validation(Required=false)]
        public List<WithholdDetailItem> WithholdDetail { get; set; }

    }

}
