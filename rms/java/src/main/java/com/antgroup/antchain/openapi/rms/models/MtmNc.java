// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class MtmNc extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // 主机名
    @NameInMap("hostname")
    @Validation(required = true)
    public String hostname;

    // ip
    @NameInMap("ip")
    @Validation(required = true)
    public String ip;

    // sn
    @NameInMap("sn")
    @Validation(required = true)
    public String sn;

    // 分组
    @NameInMap("node_group")
    @Validation(required = true)
    public String nodeGroup;

    // cpu_num
    @NameInMap("cpu_num")
    @Validation(required = true)
    public Long cpuNum;

    // 内存 M
    @NameInMap("mem_mega")
    @Validation(required = true)
    public Long memMega;

    // 磁盘 M
    @NameInMap("disk_mega")
    @Validation(required = true)
    public Long diskMega;

    // 物理机房
    @NameInMap("idc")
    @Validation(required = true)
    public String idc;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 机型
    @NameInMap("sm_name")
    @Validation(required = true)
    public String smName;

    // 采集ip
    @NameInMap("collect_ip")
    @Validation(required = true)
    public String collectIp;

    // idc 机房
    @NameInMap("idc_name")
    @Validation(required = true)
    public String idcName;

    // sigma 集群
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    public static MtmNc build(java.util.Map<String, ?> map) throws Exception {
        MtmNc self = new MtmNc();
        return TeaModel.build(map, self);
    }

    public MtmNc setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MtmNc setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public MtmNc setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public MtmNc setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public MtmNc setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public MtmNc setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public MtmNc setNodeGroup(String nodeGroup) {
        this.nodeGroup = nodeGroup;
        return this;
    }
    public String getNodeGroup() {
        return this.nodeGroup;
    }

    public MtmNc setCpuNum(Long cpuNum) {
        this.cpuNum = cpuNum;
        return this;
    }
    public Long getCpuNum() {
        return this.cpuNum;
    }

    public MtmNc setMemMega(Long memMega) {
        this.memMega = memMega;
        return this;
    }
    public Long getMemMega() {
        return this.memMega;
    }

    public MtmNc setDiskMega(Long diskMega) {
        this.diskMega = diskMega;
        return this;
    }
    public Long getDiskMega() {
        return this.diskMega;
    }

    public MtmNc setIdc(String idc) {
        this.idc = idc;
        return this;
    }
    public String getIdc() {
        return this.idc;
    }

    public MtmNc setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public MtmNc setSmName(String smName) {
        this.smName = smName;
        return this;
    }
    public String getSmName() {
        return this.smName;
    }

    public MtmNc setCollectIp(String collectIp) {
        this.collectIp = collectIp;
        return this;
    }
    public String getCollectIp() {
        return this.collectIp;
    }

    public MtmNc setIdcName(String idcName) {
        this.idcName = idcName;
        return this;
    }
    public String getIdcName() {
        return this.idcName;
    }

    public MtmNc setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

}
