// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class LoadBalancerImportVO extends TeaModel {
    // iaas_id
    @NameInMap("iaas_id")
    public String iaasId;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // network_type
    @NameInMap("network_type")
    public String networkType;

    // inner_ip_address
    @NameInMap("inner_ip_address")
    public java.util.List<String> innerIpAddress;

    // public_ip_address
    @NameInMap("public_ip_address")
    public java.util.List<String> publicIpAddress;

    // utc_create
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // import_info
    @NameInMap("import_info")
    @Validation(required = true)
    public ImportVO importInfo;

    public static LoadBalancerImportVO build(java.util.Map<String, ?> map) throws Exception {
        LoadBalancerImportVO self = new LoadBalancerImportVO();
        return TeaModel.build(map, self);
    }

    public LoadBalancerImportVO setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public LoadBalancerImportVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LoadBalancerImportVO setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public LoadBalancerImportVO setInnerIpAddress(java.util.List<String> innerIpAddress) {
        this.innerIpAddress = innerIpAddress;
        return this;
    }
    public java.util.List<String> getInnerIpAddress() {
        return this.innerIpAddress;
    }

    public LoadBalancerImportVO setPublicIpAddress(java.util.List<String> publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }
    public java.util.List<String> getPublicIpAddress() {
        return this.publicIpAddress;
    }

    public LoadBalancerImportVO setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public LoadBalancerImportVO setImportInfo(ImportVO importInfo) {
        this.importInfo = importInfo;
        return this;
    }
    public ImportVO getImportInfo() {
        return this.importInfo;
    }

}
