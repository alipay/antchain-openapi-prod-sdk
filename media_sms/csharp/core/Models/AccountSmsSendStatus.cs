// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MEDIA_SMS.Models
{
    // 账户查询结构体
    public class AccountSmsSendStatus : TeaModel {
        // ⼿机号
        [NameInMap("phone_no")]
        [Validation(Required=true)]
        public string PhoneNo { get; set; }

        // 批次号
        [NameInMap("batch_task_id")]
        [Validation(Required=true)]
        public string BatchTaskId { get; set; }

        // 发送状态
        // SUCCESS：发送成
        // 功；
        // FAILED：发送失败；
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 发送状态描述
        [NameInMap("detail_msg")]
        [Validation(Required=true)]
        public string DetailMsg { get; set; }

    }

}
