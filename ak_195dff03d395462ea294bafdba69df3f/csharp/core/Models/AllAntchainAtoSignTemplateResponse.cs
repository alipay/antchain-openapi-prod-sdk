// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class AllAntchainAtoSignTemplateResponse : TeaModel {
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

        // List<Object>格式，详细参考：
        // [
        //         {
        //             "templateCode": "TEST_001",
        //             "tenantId": "BIPCCOQY",
        //             "agreementType": "SERVICE_LEASE",
        //             "fileName": "测试模板之协议签署证明",
        //             "templateId": "f28038577d664015bfc1034c4a125121",
        //             "fieldArgs": "{\"sceneName\":\"测试协议合同签署\",\"title\":\"这是一份证明协议\"}",
        //             "userPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"162.44\",\"posY\":\"425\"}]",
        //             "orgPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"449.99\",\"posY\":\"420.03\"}]"
        //         }
        //     ]
        [NameInMap("template_list")]
        [Validation(Required=false)]
        public string TemplateList { get; set; }

    }

}
