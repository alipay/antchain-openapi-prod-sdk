// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryMydidcommunAgencyServicetypeinfoResponse : TeaModel {
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

        // 对应算法的入口函数名
        [NameInMap("method")]
        [Validation(Required=false)]
        public string Method { get; set; }

        // 服务对应的具体的Tapp或者算法名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 表示服务的实际处理类型，目前是Data_Tapp
        // 
        [NameInMap("service_model")]
        [Validation(Required=false)]
        public string ServiceModel { get; set; }

        // 对应name的算法当前版本
        [NameInMap("version")]
        [Validation(Required=false)]
        public long? Version { get; set; }

        // serviceType所对应版本的publickey
        [NameInMap("public_key")]
        [Validation(Required=false)]
        public string PublicKey { get; set; }

    }

}
