// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // SofamqMessageGetByMsgId和SofamqMessageGetByKey接口返回Data信息
    public class MessageGetDTO : TeaModel {
        // 消息体
        [NameInMap("body")]
        [Validation(Required=true)]
        public string Body { get; set; }

        // 消息体 CRC 校验值
        [NameInMap("body_crc")]
        [Validation(Required=true)]
        public long? BodyCrc { get; set; }

        // 生成该消息的客户端实例
        [NameInMap("born_host")]
        [Validation(Required=true)]
        public string BornHost { get; set; }

        //  生成时间戳
        [NameInMap("born_timestamp")]
        [Validation(Required=true)]
        public long? BornTimestamp { get; set; }

        //  实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 消息 ID，即 Message ID
        [NameInMap("msg_id")]
        [Validation(Required=true)]
        public string MsgId { get; set; }

        // 消息属性列表
        [NameInMap("property_list")]
        [Validation(Required=true)]
        public List<MessagePropertyDTO> PropertyList { get; set; }

        //  消息重试消费的次数
        [NameInMap("reconsume_times")]
        [Validation(Required=true)]
        public long? ReconsumeTimes { get; set; }

        // 存储该消息的服务器实例
        [NameInMap("store_host")]
        [Validation(Required=true)]
        public string StoreHost { get; set; }

        // 消息大小
        [NameInMap("store_size")]
        [Validation(Required=true)]
        public long? StoreSize { get; set; }

        // 被服务端存储的时间戳
        [NameInMap("store_timestamp")]
        [Validation(Required=true)]
        public long? StoreTimestamp { get; set; }

        //  消息的 Topic
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // 消息的SchemaID
        [NameInMap("schema_id")]
        [Validation(Required=true)]
        public string SchemaId { get; set; }

    }

}
