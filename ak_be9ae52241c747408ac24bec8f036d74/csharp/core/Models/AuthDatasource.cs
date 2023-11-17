// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    // 已授权至项目内的数据源配置信息
    public class AuthDatasource : TeaModel {
        // 授权数据源ID
        [NameInMap("auth_datasource_id")]
        [Validation(Required=true)]
        public string AuthDatasourceId { get; set; }

        // 创建数据源授权时间(毫秒)
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 更新数据源授权时间(毫秒)
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // 数据源名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 对应本地数据源的配置参数
        [NameInMap("config")]
        [Validation(Required=true)]
        public string Config { get; set; }

        //  数据源来源
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 项目内可见范围类型，ALL_TENANT全部机构可见，SPECIFIC_TENANT部分机构可见。调用授权数据集 和 数据源请求时 若不填该参数，则默认ALL_TENANT
        [NameInMap("visible_type")]
        [Validation(Required=true)]
        public string VisibleType { get; set; }

    }

}
