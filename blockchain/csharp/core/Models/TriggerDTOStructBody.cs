// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云数据导出服务TriggerDTO结构体
    public class TriggerDTOStructBody : TeaModel {
        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 源
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 错误信息
        [NameInMap("error_message")]
        [Validation(Required=false)]
        public string ErrorMessage { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // option（map结构，由于金融云无map接口所以通过string类型传输json格式）
        [NameInMap("option")]
        [Validation(Required=false)]
        public string Option { get; set; }

        // checkpoint类
        [NameInMap("checkpoint")]
        [Validation(Required=false)]
        public CheckPointStructBody Checkpoint { get; set; }

    }

}
