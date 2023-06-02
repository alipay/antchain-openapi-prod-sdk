// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class GetIaasaccountBaseinfoResponse : TeaModel {
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

        // 账号名称
        [NameInMap("account")]
        [Validation(Required=false)]
        public string Account { get; set; }

        // 账号ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // iaas账号类型
        // ALIYUN_BID: 阿里云BID类型
        // ALIYUN_BID_MIG: 原本是阿里云BID类型，迁移后可两侧登录
        // ALIYUN_MPK: 阿里云MPK类型
        // ALIYUN_LOCALIZATION: 阿里云一方化类型
        [NameInMap("source_type")]
        [Validation(Required=false)]
        public string SourceType { get; set; }

    }

}
