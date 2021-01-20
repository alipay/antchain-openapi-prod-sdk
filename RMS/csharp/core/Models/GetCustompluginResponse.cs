// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class GetCustompluginResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 自定义监控名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 是否有报警
        [NameInMap("alarmed")]
        [Validation(Required=false)]
        public bool? Alarmed { get; set; }

        // 监控类型id
        [NameInMap("plugin_id")]
        [Validation(Required=false)]
        public long? PluginId { get; set; }

        // 监控类型
        [NameInMap("plugin_type")]
        [Validation(Required=false)]
        public string PluginType { get; set; }

        // 创建者
        [NameInMap("creator")]
        [Validation(Required=false)]
        public string Creator { get; set; }

        // 最后修改者
        [NameInMap("modifier")]
        [Validation(Required=false)]
        public string Modifier { get; set; }

        // 创建时间戳
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public long? GmtCreate { get; set; }

        // 最后修改时间 - 时间戳
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public long? GmtModified { get; set; }

        // 告警套餐列表
        [NameInMap("alarm_pkgs")]
        [Validation(Required=false)]
        public List<AlarmPkgDO> AlarmPkgs { get; set; }

    }

}
