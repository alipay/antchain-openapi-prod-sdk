// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 数据源详细信息
    public class DataSourceInfo : TeaModel {
        // 数据源ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 数据源名称
        [NameInMap("name")]
        [Validation(Required=true, MaxLength=20)]
        public string Name { get; set; }

        // 数据提供方
        [NameInMap("provider")]
        [Validation(Required=true, MaxLength=30)]
        public string Provider { get; set; }

        // 枚举值：ENTERPRISE、INDIVIDUAL
        [NameInMap("data_owner_type")]
        [Validation(Required=true)]
        public string DataOwnerType { get; set; }

        // 数据源接口信息
        [NameInMap("data_source_interface_info")]
        [Validation(Required=true)]
        public DataSourceInterface DataSourceInterfaceInfo { get; set; }

    }

}
