// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MEDIA_SMS.Models
{
    // 短链解析结果
    public class ShortUrlParseResult : TeaModel {
        // 创建短链时传入的客户号，可以用该字段关联短链的发送目标
        [NameInMap("cust_flag")]
        [Validation(Required=true)]
        public string CustFlag { get; set; }

        // 卡片模板id
        [NameInMap("smart_template_id")]
        [Validation(Required=true)]
        public string SmartTemplateId { get; set; }

        // 短链地址
        [NameInMap("aim_url")]
        [Validation(Required=true)]
        public string AimUrl { get; set; }

        // 短链地址尾码
        [NameInMap("aim_code")]
        [Validation(Required=true)]
        public string AimCode { get; set; }

        // BULK 群发,PERSONAL个性化
        [NameInMap("aim_code_type")]
        [Validation(Required=true)]
        public string AimCodeType { get; set; }

        // 解析状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 解析状态描述
        [NameInMap("describe")]
        [Validation(Required=false)]
        public string Describe { get; set; }

    }

}
