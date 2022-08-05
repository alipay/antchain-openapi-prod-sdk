// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDIGITAL.Models
{
    // 查询所有数字权证项目接口结构体
    public class DigitalProjectList : TeaModel {
        // 项目id
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 项目名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 项目描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 项目状态
        [NameInMap("project_status")]
        [Validation(Required=true)]
        public string ProjectStatus { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public string CreateTime { get; set; }

        // 合约symbol
        [NameInMap("symbol")]
        [Validation(Required=true)]
        public string Symbol { get; set; }

        // 发行数量
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

    }

}
