// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MEDIA_SMS.Models
{
    public class CreateShorturlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 卡片模板id
        [NameInMap("smart_template_id")]
        [Validation(Required=true)]
        public string SmartTemplateId { get; set; }

        // 申请好的签名，最多 10 个签名
        [NameInMap("sms_signs")]
        [Validation(Required=true)]
        public List<string> SmsSigns { get; set; }

        // 个性化短链建议10次
        [NameInMap("show_times")]
        [Validation(Required=true)]
        public long? ShowTimes { get; set; }

        // BULK 群发
        // PERSONAL个性化
        [NameInMap("aim_code_type")]
        [Validation(Required=true)]
        public string AimCodeType { get; set; }

        // 个性化短链：时间最小 1天，最大 7 天，不填则默认 7 天；
        [NameInMap("expire_time")]
        [Validation(Required=true)]
        public long? ExpireTime { get; set; }

        // 短链所属生成批次，最长 50 位。
        // 也是请求唯一id，每次请求不能重复，重复将返回该批次id上一次请求结果
        [NameInMap("cust_batch_id")]
        [Validation(Required=true)]
        public string CustBatchId { get; set; }

        // 接收智能短信测试短信手机号及动态参数对象列表，最大为 100 个
        // 注：oppo 模板一次最多只能申请 10 个（模板审核厂商中包含oppo厂商就视为oppo模板）
        [NameInMap("param_list")]
        [Validation(Required=true)]
        public List<SmartTemplateDyncParam> ParamList { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

    }

}
