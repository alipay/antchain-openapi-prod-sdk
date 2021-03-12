// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartMydidcommunAgencyChoicetappResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // doc当前版本
        [NameInMap("pre_version")]
        [Validation(Required=false)]
        public long? PreVersion { get; set; }

        // 生成的tapp info
        [NameInMap("service_endpoint")]
        [Validation(Required=false)]
        public string ServiceEndpoint { get; set; }

        // 生成的serviceId
        [NameInMap("service_id")]
        [Validation(Required=false)]
        public string ServiceId { get; set; }

        // service 类型
        [NameInMap("service_type")]
        [Validation(Required=false)]
        public string ServiceType { get; set; }

        // EXIST 该tapp和serviceid已经包含在did doc中；
        // CONFLICT 该serviceid已经存在，但信息与此次不一致；
        // VALID 正常
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

    }

}
