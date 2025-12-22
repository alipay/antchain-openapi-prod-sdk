// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MDP.Models
{
    public class QuerybyappidResponse : TeaModel {
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

        // app_id
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // 手机号或者设备号md5
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 分数列表
        [NameInMap("scores")]
        [Validation(Required=false)]
        public List<AppIdQualityScoresDONew> Scores { get; set; }

        // 筛选分数的规则，通过规则的返回，否则 scores 内容是空的
        [NameInMap("rule")]
        [Validation(Required=false)]
        public string Rule { get; set; }

        // 规则对应的 md5 值，用来区分当前规则的版本
        [NameInMap("rule_md5")]
        [Validation(Required=false)]
        public string RuleMd5 { get; set; }

    }

}
