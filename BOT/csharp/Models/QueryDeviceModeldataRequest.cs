// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryDeviceModeldataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备did
        [NameInMap("device_did")]
        [Validation(Required=true)]
        public string DeviceDid { get; set; }

        // 签名
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

        // 数据类型
        // HOT_STORAGE：时序数据
        // ORIGINAL_PROPERTY：原始属性
        // ORIGINAL_EVENT：原始事件
        // ORIGINAL_SERVICE：原始服务
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

        // 返回结果中数据记录的排序方式，取值：
        // ● true：正序。
        // ● false：倒序。
        [NameInMap("asc")]
        [Validation(Required=true)]
        public bool? Asc { get; set; }

        // 要查询的数据记录的开始时间，必须小于结束时间EndTime。
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public long? StartTime { get; set; }

        // 要查询的数据记录的结束时间，必须大于起始时间StartTime。
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

        // 标识符，不同的datatype意思不同
        // HOT_STORAGE：已存储时序数据中的字段标识符。
        // ORIGINAL_PROPERTY：属性标识符
        // ORIGINAL_EVENT：事件标识符
        // ORIGINAL_SERVICE：服务标识符
        [NameInMap("identifier")]
        [Validation(Required=true)]
        public string Identifier { get; set; }

        // 单个字段标识符可返回的数据记录数量，最大值为100。
        // 任意一个字段返回的数据记录数量均不超过该值。
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 要查询数据所属自定义Topic。从user类目开始，输入自定义Topic的后续所有类目。
        // dataType为HOT_STORAGE时需要有值
        [NameInMap("user_topic")]
        [Validation(Required=false)]
        public string UserTopic { get; set; }

        // 下一页标识。如果存在下一页，服务会返回此Token，下次请求带上即可。
        [NameInMap("next_page_token")]
        [Validation(Required=false)]
        public string NextPageToken { get; set; }

    }

}
