// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryCreditIssuereceivableResponse : TeaModel {
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

        // 已清分金额
        [NameInMap("clear_amt")]
        [Validation(Required=false)]
        public string ClearAmt { get; set; }

        // 代偿金额
        [NameInMap("compensate_amt")]
        [Validation(Required=false)]
        public string CompensateAmt { get; set; }

        // 错误信息
        [NameInMap("err_msg")]
        [Validation(Required=false)]
        public string ErrMsg { get; set; }

        // 完成日期 long类型字符串
        [NameInMap("finish_date")]
        [Validation(Required=false)]
        public string FinishDate { get; set; }

        // 是否代偿,true为代偿，false为不代偿
        [NameInMap("has_compensate")]
        [Validation(Required=false)]
        public bool? HasCompensate { get; set; }

        // 信用凭证id
        [NameInMap("issue_id")]
        [Validation(Required=false)]
        public string IssueId { get; set; }

        // 全局唯一业务号
        [NameInMap("out_biz_no")]
        [Validation(Required=false)]
        public string OutBizNo { get; set; }

        // 外部订单号，也就是凭证发行时传递的支付订单
        [NameInMap("out_order_no")]
        [Validation(Required=false)]
        public string OutOrderNo { get; set; }

        // 产品id--PRODUCT_MYBANK 、PRODUCT_MYBANK_B;
        [NameInMap("product_id")]
        [Validation(Required=false)]
        public string ProductId { get; set; }

        // 清分结果状态--- 0：未清分， 1：清分完成
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 凭证总金额
        [NameInMap("total_amt")]
        [Validation(Required=false)]
        public string TotalAmt { get; set; }

        // 清分类型--主动清分 、 到期清分
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
