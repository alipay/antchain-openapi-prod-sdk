// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class CreateBlockchainBotIotsuccessProductResponse : TeaModel {
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

        [NameInMap("product_key")]
        [Validation(Required=true)]
        public string ProductKey { get; set; }

        // 产品业务云实例，非网关product_instance_id；设备导入无需传入
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 产品绑定的Agent接入凭证，非网关SK或IoTBasic原生Secret；仅首次，禁止日志记录
        [NameInMap("product_secret")]
        [Validation(Required=true)]
        public string ProductSecret { get; set; }

        [NameInMap("default_template_id")]
        [Validation(Required=true)]
        public string DefaultTemplateId { get; set; }

    }

}
