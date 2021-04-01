// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ExecDidServicetypeCreateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 发起该交易的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 创建服务类型
        [NameInMap("operation")]
        [Validation(Required=true)]
        public string Operation { get; set; }

        // 新增服务类型的定义Json 字符串
        // {
        //   "@context": {
        //     "version": 1,
        //     "id": "{ServiceTypeName}", //<- 50 Byte
        //     "type": "ServiceType", //<- 固定值
        //     "serviceInput": "", //<- 入参描述
        //     "serviceOutput": "", //<- 出参描述
        //     "accessMode": "", //<- 访问模式
        //     "description": "" //<- 服务描述
        //   },
        //    "controller": "{Creator`s did}" // <- 创建者did，只有该创建者才能修改服务类型定义
        // }
        [NameInMap("payload")]
        [Validation(Required=true)]
        public string Payload { get; set; }

        // 使用私钥对消息中其他字段进行签名
        [NameInMap("request_signature")]
        [Validation(Required=true)]
        public string RequestSignature { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
