// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class SubmitAuditVideobaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 待检测对象的URL，请确保该URL能通过公网访问到，且URL地址长度不超过2048个字符
        // 说明 ：
        // 1. URL地址中不能包含中文，且一次请求请确保仅传入1条URL
        // 2. 视频文件链接支持以下协议：HTTP和HTTPS。
        // 3. 视频文件支持以下格式：AVI、FLV、MP4、MPG、ASF、WMV、MOV、WMA、RMVB、RM、FLASH、TS。
        // 4. 视频大小限制：默认单个视频大小不超过500 MB。如果您的需求超过500 MB，您可以对视频进行分片处理
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 审核场景类型
        // 目前支持通用版 BASE_VIDEO_SEC
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 客户业务ID 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        [NameInMap("business_id")]
        [Validation(Required=true)]
        public string BusinessId { get; set; }

        // 检测对象对应的数据ID。 由大小写英文字母、数字、下划线（_）、短划线（-）、英文句号（.）组成，不超过128个字符，可以用于唯一标识您的业务数据
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

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
