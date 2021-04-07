// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateResourceComputerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 实例所属的部署单元
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

        // 数据盘的云盘种类。取值范围：
        // 
        // cloud_efficiency：高效云盘
        // cloud_ssd：SSD云盘
        // ephemeral_ssd：本地SSD盘
        // cloud_essd：ESSD云盘
        // cloud：普通云盘
        // I/O优化实例的默认值为cloud_efficiency，非I/O优化实例的默认值为cloud。
        [NameInMap("data_disk_category")]
        [Validation(Required=false)]
        public string DataDiskCategory { get; set; }

        // 数据盘的容量大小，n的取值范围为1~16，内存单位为GiB。取值范围：
        // 
        // cloud_efficiency：20~32768
        // cloud_ssd：20~32768
        // cloud_essd：20~32768
        // ephemeral_ssd：5~800
        // cloud：5~2000
        // 该参数的取值必须大于等于参数SnapshotId指定的快照的大小。
        [NameInMap("data_disk_size")]
        [Validation(Required=false)]
        public long? DataDiskSize { get; set; }

        // 实例的描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 云服务器的主机名。
        // 
        // 点号（.）和短横线（-）不能作为首尾字符，更不能连续使用。
        // Windows实例：字符长度为2~15，不支持点号（.），不能全是数字。允许大小写英文字母、数字和短横线（-）。
        // 其他类型实例（Linux等）：字符长度为2~64，支持多个点号（.），点之间为一段，每段允许大小写英文字母、数字和短横线（-）。
        [NameInMap("host_name")]
        [Validation(Required=true)]
        public string HostName { get; set; }

        // 镜像文件ID，启动实例时选择的镜像资源。
        [NameInMap("image_id")]
        [Validation(Required=true)]
        public string ImageId { get; set; }

        // 实例的资源规格。
        [NameInMap("instance_type")]
        [Validation(Required=true)]
        public string InstanceType { get; set; }

        // 实例的密码。长度为8至30个字符，必须同时包含大小写英文字母、数字和特殊符号中的三类字符。
        [NameInMap("password")]
        [Validation(Required=true)]
        public string Password { get; set; }

        // 实例所属的地域ID。
        [NameInMap("region_id")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

        // 系统盘的云盘种类。取值范围：
        // 
        // cloud_efficiency：高效云盘
        // cloud_ssd：SSD云盘
        // cloud：普通云盘
        [NameInMap("system_disk_category")]
        [Validation(Required=true)]
        public string SystemDiskCategory { get; set; }

        // 系统盘大小，单位为GiB。取值范围：20~500
        // 
        // 该参数的取值必须大于或者等于max{20, ImageSize}。
        [NameInMap("system_disk_size")]
        [Validation(Required=true)]
        public long? SystemDiskSize { get; set; }

    }

}
