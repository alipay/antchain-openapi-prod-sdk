// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryCutpaymentsubTransactionResponse : TeaModel {
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

        // 当前页
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public string PageNum { get; set; }

        // 每页数量
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public string PageSize { get; set; }

        // 总页数
        [NameInMap("page_count")]
        [Validation(Required=false)]
        public string PageCount { get; set; }

        // 银行卡代扣二级租户收支明细
        [NameInMap("transaction_detail_list")]
        [Validation(Required=false)]
        public List<TransactionDetail> TransactionDetailList { get; set; }

    }

}
