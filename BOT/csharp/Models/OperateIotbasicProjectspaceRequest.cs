// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class OperateIotbasicProjectspaceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 项目空间id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 项目名称
        [NameInMap("project_name")]
        [Validation(Required=false)]
        public string ProjectName { get; set; }

        // 项目编码（device_base表字段biz_scene）
        [NameInMap("project_code")]
        [Validation(Required=false)]
        public string ProjectCode { get; set; }

        // 项目描述
        [NameInMap("project_desc")]
        [Validation(Required=false)]
        public string ProjectDesc { get; set; }

        // 项目负责人（PD）
        [NameInMap("project_leader")]
        [Validation(Required=false)]
        public string ProjectLeader { get; set; }

        // 上链ID（数据上到哪个业务链）
        [NameInMap("upchain_id")]
        [Validation(Required=false)]
        public string UpchainId { get; set; }

        // 上链方式（通过IOT可信平台，banRest）
        [NameInMap("upchain_type")]
        [Validation(Required=false)]
        public string UpchainType { get; set; }

        // 上链参数（账号，秘钥），json字符串格式
        [NameInMap("upchain_params")]
        [Validation(Required=false)]
        public string UpchainParams { get; set; }

        // 是否上链
        [NameInMap("is_upchain")]
        [Validation(Required=false)]
        public bool? IsUpchain { get; set; }

        // 操作类型
        [NameInMap("action")]
        [Validation(Required=true)]
        public string Action { get; set; }

        // 操作人id
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

        // 参数签名校验
        [NameInMap("param_sign")]
        [Validation(Required=true)]
        public string ParamSign { get; set; }

    }

}
