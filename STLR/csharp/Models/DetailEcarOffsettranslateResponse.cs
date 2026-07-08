// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class DetailEcarOffsettranslateResponse : TeaModel {
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

        // 业务方的业务单号
        [NameInMap("translation_item_no")]
        [Validation(Required=false)]
        public string TranslationItemNo { get; set; }

        // 发生时间
        [NameInMap("occurrence_time")]
        [Validation(Required=false)]
        public string OccurrenceTime { get; set; }

        // 业务发生量：转移量
        [NameInMap("amount")]
        [Validation(Required=false)]
        public string Amount { get; set; }

        // 碳补偿项目编码
        [NameInMap("project_no")]
        [Validation(Required=false)]
        public string ProjectNo { get; set; }

        // 碳普惠项目名称
        [NameInMap("project_name")]
        [Validation(Required=false)]
        public string ProjectName { get; set; }

        // 转出碳账户DID
        [NameInMap("drawing_account_did")]
        [Validation(Required=false)]
        public string DrawingAccountDid { get; set; }

        // 转入碳账户DID
        [NameInMap("receipt_account_did")]
        [Validation(Required=false)]
        public string ReceiptAccountDid { get; set; }

    }

}
