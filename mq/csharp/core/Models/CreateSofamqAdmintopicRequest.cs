// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateSofamqAdmintopicRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 集群名
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // 需创建的 Topic 所对应的实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 消息类型。取值说明如下：0：普通消息；1：分区顺序消息；2：全局顺序消息；4：事务消息；5：定时/延时消息。
        [NameInMap("message_type")]
        [Validation(Required=true)]
        public long? MessageType { get; set; }

        // Topic 的备注信息
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 生效范围，为三板斧使用
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // 需创建的 Topic 的名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // Topic 权限，6为可读可写，4为可读
        [NameInMap("perm")]
        [Validation(Required=false)]
        public string Perm { get; set; }

        // Topic 所属的应用名称，要求 app name 在 appinfo 上可查
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

        // 标识该 topic 的消息是否具有优先级
        [NameInMap("priority")]
        [Validation(Required=false)]
        public bool? Priority { get; set; }

    }

}
