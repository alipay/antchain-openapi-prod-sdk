// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_20ab7e4471e24e8fbfaa7df4ba0613c8.Models
{
    public class StartBaasDidPersonAgentcreateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业自定信息
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
        [NameInMap("indexs")]
        [Validation(Required=false)]
        public List<string> Indexs { get; set; }

        // 名称
        [NameInMap("owner_name")]
        [Validation(Required=false)]
        public string OwnerName { get; set; }

        // 唯一号，比如可以是hash(证件类型+企业营业执照号) 计算出来的唯一值等
        [NameInMap("owner_uid")]
        [Validation(Required=true)]
        public string OwnerUid { get; set; }

        // 携带自己定义的服务类型
        [NameInMap("services")]
        [Validation(Required=false)]
        public List<DidDocServicesInfo> Services { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // 生成的did字符串
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

    }

}
