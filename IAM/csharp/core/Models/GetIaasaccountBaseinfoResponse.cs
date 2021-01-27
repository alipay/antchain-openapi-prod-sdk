// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class GetIaasaccountBaseinfoResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

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
