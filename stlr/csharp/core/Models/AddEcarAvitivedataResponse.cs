// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class AddEcarAvitivedataResponse : TeaModel {
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

        // 排放数据录入明细编码
        [NameInMap("emission_data_entry_item_no")]
        [Validation(Required=false)]
        public string EmissionDataEntryItemNo { get; set; }

        // 企业业务单号
        [NameInMap("enterprise_biz_no")]
        [Validation(Required=false)]
        public string EnterpriseBizNo { get; set; }

    }

}
