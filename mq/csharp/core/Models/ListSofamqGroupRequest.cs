// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class ListSofamqGroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 查询指定 Group ID 时设置，否则查询所有 Group ID
        [NameInMap("group_id")]
        [Validation(Required=false)]
        public string GroupId { get; set; }

        // 需获取 Group ID 所对应的实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页显示数量
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 查询的 Group ID 适用的协议。TCP 协议和 HTTP 协议的 Group ID 不可以共用，需要分别创建。取值说明如下：
        // 
        // tcp：默认值，表示该 Group ID 仅适用于 TCP 协议的消息收发。
        // http：表示该 Group ID 仅适用于 HTTP 协议的消息收发。
        [NameInMap("group_type")]
        [Validation(Required=false)]
        public string GroupType { get; set; }

    }

}
