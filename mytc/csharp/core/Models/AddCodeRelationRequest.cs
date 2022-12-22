// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    public class AddCodeRelationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务类型，客户自定义标签，做code数据隔离使用
        // 
        [NameInMap("biz_type")]
        [Validation(Required=true, MaxLength=32)]
        public string BizType { get; set; }

        // 溯源码，代表该账户的唯一资源标识
        // 
        [NameInMap("code")]
        [Validation(Required=true, MaxLength=160)]
        public string Code { get; set; }

        // 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
        // 
        [NameInMap("status")]
        [Validation(Required=true, MaxLength=32)]
        public string Status { get; set; }

        // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
        [NameInMap("biz_labels")]
        [Validation(Required=false)]
        public List<string> BizLabels { get; set; }

        // 是否上链，默认true。 为false时，仅做DB数据保存不上链。 若content数据大小超过要求限制，仅会保存content的hash值上链
        [NameInMap("up_chain_flag")]
        [Validation(Required=false)]
        public bool? UpChainFlag { get; set; }

        // 关联内容
        // 
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

    }

}
