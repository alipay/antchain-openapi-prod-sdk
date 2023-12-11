// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class SubmitAilegalFeedbackRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // twc.notary.ailegal.question.init(提出问题)接口返回的问题id,长度不超过32位
        [NameInMap("question_id")]
        [Validation(Required=true)]
        public string QuestionId { get; set; }

        // 用户态度，参见枚举类AttitudeEnum
        [NameInMap("attitude")]
        [Validation(Required=true)]
        public string Attitude { get; set; }

        // 用户反馈标签集合，与用户态度相对应，参见枚举类TagEnum定义
        [NameInMap("tags")]
        [Validation(Required=true)]
        public List<string> Tags { get; set; }

    }

}
