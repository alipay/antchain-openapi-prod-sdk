// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class QueryPdataUnderwriteResponse : TeaModel {
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

        // 姓名（md5）
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 身份证(md5)
        [NameInMap("card_no")]
        [Validation(Required=false)]
        public string CardNo { get; set; }

        // 成功的请求省份行政区划代码
        [NameInMap("success_recommand_province_list")]
        [Validation(Required=false)]
        public List<string> SuccessRecommandProvinceList { get; set; }

        // 失败的请求省份行政区划代码
        [NameInMap("fail_recommand_province_list")]
        [Validation(Required=false)]
        public List<string> FailRecommandProvinceList { get; set; }

        // 加密后的出参数据
        [NameInMap("encrypt_data")]
        [Validation(Required=false)]
        public string EncryptData { get; set; }

    }

}
