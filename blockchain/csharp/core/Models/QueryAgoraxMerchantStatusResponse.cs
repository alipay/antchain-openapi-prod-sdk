// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryAgoraxMerchantStatusResponse : TeaModel {
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

        // 申请总体状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 二级商户id
        [NameInMap("smid")]
        [Validation(Required=false)]
        public string Smid { get; set; }

        // 失败原因说明
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

        // 进件生成的卡编号
        [NameInMap("card_alias_no")]
        [Validation(Required=false)]
        public string CardAliasNo { get; set; }

        // 扩展字段
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
