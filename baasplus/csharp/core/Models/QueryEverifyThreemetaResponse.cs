// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryEverifyThreemetaResponse : TeaModel {
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

        // 0:核验成功
        // 1:企业信息有误
        // 2:企业非正常营业
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 经营状态
        [NameInMap("enterprise_status")]
        [Validation(Required=false)]
        public string EnterpriseStatus { get; set; }

        // 营业期限
        [NameInMap("open_time")]
        [Validation(Required=false)]
        public string OpenTime { get; set; }

        // 认证是否通过
        [NameInMap("passed")]
        [Validation(Required=false)]
        public bool? Passed { get; set; }

        // resultCode=0，核验一致
        // resultCode=1，核验不一致（人企核验不一致）
        // resultCode=2，库无（人在库中不存在，无法校验）
        // resultCode=3，企业二要素核验不通过
        // resultCode=4，查无企业，无法校验（此场景属于三要素核验）
        [NameInMap("return_code")]
        [Validation(Required=false)]
        public string ReturnCode { get; set; }

        // 核验不通过异常编码
        [NameInMap("reason_code")]
        [Validation(Required=false)]
        public string ReasonCode { get; set; }

    }

}
