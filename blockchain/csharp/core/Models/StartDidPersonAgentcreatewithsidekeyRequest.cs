// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidPersonAgentcreatewithsidekeyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // { "自定义服务相关字段": 自定义字符串, "nation": "CN", "certType": "身份证", "name": "演示用户名", "certNo": "1111"}
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
        [NameInMap("indexs")]
        [Validation(Required=true)]
        public List<string> Indexs { get; set; }

        // 个人名称
        [NameInMap("owner_name")]
        [Validation(Required=false)]
        public string OwnerName { get; set; }

        // 自定义企业唯一id，企业在自有模式下的唯一号bid的has...
        [NameInMap("owner_uid")]
        [Validation(Required=true)]
        public string OwnerUid { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
