// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    public class UpdateCodeRelationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务类型，客户自定义标签，做code数据隔离使用
        [NameInMap("biz_type")]
        [Validation(Required=true, MaxLength=32)]
        public string BizType { get; set; }

        // 溯源码，代表该账户的唯一资源标识
        // 
        [NameInMap("code")]
        [Validation(Required=true, MaxLength=160)]
        public string Code { get; set; }

        // 绑定信息记录唯一标识
        [NameInMap("unique_id")]
        [Validation(Required=true, MaxLength=64)]
        public string UniqueId { get; set; }

        // 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
        [NameInMap("status")]
        [Validation(Required=false, MaxLength=32)]
        public string Status { get; set; }

        // 是否上链，默认true。 为false时，仅做DB数据保存不上链。 若content数据大小超过要求限制，仅会保存content的hash值上链
        [NameInMap("up_chain_flag")]
        [Validation(Required=false)]
        public bool? UpChainFlag { get; set; }

        // 关联信息内容。若已上链，则不可更新该信息。
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

    }

}
