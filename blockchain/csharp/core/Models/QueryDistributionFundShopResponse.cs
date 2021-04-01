// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryDistributionFundShopResponse : TeaModel {
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

        // 审批中额度
        [NameInMap("approve_quota")]
        [Validation(Required=false)]
        public string ApproveQuota { get; set; }

        // 可提现额度
        [NameInMap("balance")]
        [Validation(Required=false)]
        public string Balance { get; set; }

        // 已到账额度
        [NameInMap("finish_quota")]
        [Validation(Required=false)]
        public string FinishQuota { get; set; }

        // 商户id
        [NameInMap("shop_id")]
        [Validation(Required=false)]
        public string ShopId { get; set; }

    }

}
