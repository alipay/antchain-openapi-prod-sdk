// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class SubmitGuardTextRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 待人工审核的文本内容，最长不超过10000个字符（包含中文、英文和标点符号）
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 审核场景码，固定输入BASE_TEXT_AUDIT，其他值无效
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 标识上游应用来源，字符串长度不能超过 128
        [NameInMap("app_code")]
        [Validation(Required=false)]
        public string AppCode { get; set; }

        // 客户业务ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        [NameInMap("business_id")]
        [Validation(Required=false)]
        public string BusinessId { get; set; }

        // 结果通知地址，不指定时需要调用方主动查询结果
        [NameInMap("callback")]
        [Validation(Required=false)]
        public string Callback { get; set; }

        // 传callback时必须指定，tenant + seed + auditResult做SHA256生成checksum，保证结果未被篡改（即数科官网控制台-账户信息中的「用户code」）
        [NameInMap("seed")]
        [Validation(Required=false)]
        public string Seed { get; set; }

    }

}
