// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QuerySofamqInputtpsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 查询区间起始毫秒时间戳
        [NameInMap("begin_time")]
        [Validation(Required=true)]
        public long? BeginTime { get; set; }

        // 需要查询的Cell名
        [NameInMap("cell")]
        [Validation(Required=false)]
        public string Cell { get; set; }

        // 查询区间终止毫秒时间戳
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

        // 指定的 Topic 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 采样周期，单位分钟，取值可为 1、5、10
        [NameInMap("period")]
        [Validation(Required=false)]
        public long? Period { get; set; }

        // 需查询的 Topic 名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // 查询的类型。取值说明如下：
        // 
        // 0：查询指定时间段内 Topic 的写入量
        // 1：查询指定时间段内 Topic 的 TPS 曲线数据
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

    }

}
