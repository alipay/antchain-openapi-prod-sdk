// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    public class QueryCodeRelationRequest : TeaModel {
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
        [NameInMap("code")]
        [Validation(Required=true, MaxLength=160)]
        public string Code { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
        [NameInMap("biz_labels")]
        [Validation(Required=false)]
        public List<string> BizLabels { get; set; }

        // 绑定信息记录唯一标识
        [NameInMap("unique_id")]
        [Validation(Required=false, MaxLength=64)]
        public string UniqueId { get; set; }

        // 状态,客户自定义状态，用于过滤查询使用，只能由字符+数字构成，多个可以用"|"分隔
        [NameInMap("status")]
        [Validation(Required=false, MaxLength=256)]
        public string Status { get; set; }

        // 仅能取如下值范围： 1. ASC 按注册时间升序 2. DESC 按注册时间降序 默认降序
        [NameInMap("sort_type")]
        [Validation(Required=false)]
        public string SortType { get; set; }

    }

}
