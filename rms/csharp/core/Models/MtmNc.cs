// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 物理机信息
    public class MtmNc : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // 主机名
        [NameInMap("hostname")]
        [Validation(Required=true)]
        public string Hostname { get; set; }

        // ip
        [NameInMap("ip")]
        [Validation(Required=true)]
        public string Ip { get; set; }

        // sn
        [NameInMap("sn")]
        [Validation(Required=true)]
        public string Sn { get; set; }

        // 分组
        [NameInMap("node_group")]
        [Validation(Required=true)]
        public string NodeGroup { get; set; }

        // cpu_num
        [NameInMap("cpu_num")]
        [Validation(Required=true)]
        public long? CpuNum { get; set; }

        // 内存 M
        [NameInMap("mem_mega")]
        [Validation(Required=true)]
        public long? MemMega { get; set; }

        // 磁盘 M
        [NameInMap("disk_mega")]
        [Validation(Required=true)]
        public long? DiskMega { get; set; }

        // 物理机房
        [NameInMap("idc")]
        [Validation(Required=true)]
        public string Idc { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 机型
        [NameInMap("sm_name")]
        [Validation(Required=true)]
        public string SmName { get; set; }

        // 采集ip
        [NameInMap("collect_ip")]
        [Validation(Required=true)]
        public string CollectIp { get; set; }

        // idc 机房
        [NameInMap("idc_name")]
        [Validation(Required=true)]
        public string IdcName { get; set; }

        // sigma 集群
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

    }

}
