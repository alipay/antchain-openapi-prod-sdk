// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class BatchcreateLogisticFinanceAccountResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 失败列表
        [NameInMap("fail_list")]
        [Validation(Required=false)]
        public List<LogisticFinUser> FailList { get; set; }

        // 映射失败数
        [NameInMap("fail_num")]
        [Validation(Required=false)]
        public long? FailNum { get; set; }

        // 成功列表
        [NameInMap("success_list")]
        [Validation(Required=false)]
        public List<string> SuccessList { get; set; }

        // 映射成功数
        [NameInMap("success_num")]
        [Validation(Required=false)]
        public long? SuccessNum { get; set; }

    }

}
