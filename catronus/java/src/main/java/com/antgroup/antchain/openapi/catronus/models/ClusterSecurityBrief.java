// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class ClusterSecurityBrief extends TeaModel {
    // 集群id
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    // 集群名
    @NameInMap("cluster_name")
    @Validation(required = true)
    public String clusterName;

    // 防护状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 最后一次安全扫描时间
    @NameInMap("last_scan")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String lastScan;

    // 风险数量
    @NameInMap("risk_cnt")
    @Validation(required = true)
    public Long riskCnt;

    // 风险简报
    @NameInMap("brief")
    @Validation(required = true)
    public java.util.List<ClusterSecurityComponentBrief> brief;

    // 扫描id
    @NameInMap("scan_id")
    public String scanId;

    public static ClusterSecurityBrief build(java.util.Map<String, ?> map) throws Exception {
        ClusterSecurityBrief self = new ClusterSecurityBrief();
        return TeaModel.build(map, self);
    }

    public ClusterSecurityBrief setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ClusterSecurityBrief setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ClusterSecurityBrief setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ClusterSecurityBrief setLastScan(String lastScan) {
        this.lastScan = lastScan;
        return this;
    }
    public String getLastScan() {
        return this.lastScan;
    }

    public ClusterSecurityBrief setRiskCnt(Long riskCnt) {
        this.riskCnt = riskCnt;
        return this;
    }
    public Long getRiskCnt() {
        return this.riskCnt;
    }

    public ClusterSecurityBrief setBrief(java.util.List<ClusterSecurityComponentBrief> brief) {
        this.brief = brief;
        return this;
    }
    public java.util.List<ClusterSecurityComponentBrief> getBrief() {
        return this.brief;
    }

    public ClusterSecurityBrief setScanId(String scanId) {
        this.scanId = scanId;
        return this;
    }
    public String getScanId() {
        return this.scanId;
    }

}
