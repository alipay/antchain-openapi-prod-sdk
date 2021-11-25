// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryDidPersonFacevrfResponse : TeaModel {
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

        // 认证是否通过。
        [NameInMap("passed")]
        [Validation(Required=false)]
        public string Passed { get; set; }

        // 认证材料哈希是否匹配。 如果有传入材料哈希参数，匹配则返回值为 T；不匹配则返回值为 F。如果无材料哈希参数传入，则返回空。
        [NameInMap("material_matched")]
        [Validation(Required=false)]
        public string MaterialMatched { get; set; }

        // 身份信息，目前只有在ocr的场景下才有返回。
        // certName/certNo：本次认证通过的姓名和身份证；ocrInfo：本次OCR识别的结果，包含如下信息："address": 地址"nationality": 名族"num":身份证号码"sex":性别"name": 名称"birth": 生日"issue": 签发机关"endDate":到期日"startDate":发证日期；注意:认证通过的信息和OCR识别的信息可能不一致
        [NameInMap("identity_info")]
        [Validation(Required=false)]
        public string IdentityInfo { get; set; }

        // 长度不超过128字符的分布式数字身份DID
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

    }

}
