// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateSofamqGroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 创建的消息端 Group ID
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 需创建的 Group ID 所对应的实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // Group ID 描述信息
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 指定创建的 Group ID 适用的协议。TCP 协议和 HTTP 协议的 Group ID 不可以共用，需要分别创建。取值说明如下：
        // 
        // tcp：默认值，表示创建的 Group ID 仅适用于 TCP 协议的消息收发。
        // http：表示创建的 Group ID 仅适用于 HTTP 协议的消息收发。
        [NameInMap("group_type")]
        [Validation(Required=false)]
        public string GroupType { get; set; }

        // Group 所属的应用名称，要求 app name 在 zappinfo 上可查
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

    }

}
