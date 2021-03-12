// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplyChainPublicCertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // bizid
    @NameInMap("bizid")
    public String bizid;

    // common_name
    @NameInMap("common_name")
    public String commonName;

    // country_name
    @NameInMap("country_name")
    public String countryName;

    // locality_name
    @NameInMap("locality_name")
    public String localityName;

    // organization_name
    @NameInMap("organization_name")
    public String organizationName;

    // organization_unit_name
    @NameInMap("organization_unit_name")
    public String organizationUnitName;

    // password
    @NameInMap("password")
    public String password;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    // state_or_province_name
    @NameInMap("state_or_province_name")
    public String stateOrProvinceName;

    public static ApplyChainPublicCertRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyChainPublicCertRequest self = new ApplyChainPublicCertRequest();
        return TeaModel.build(map, self);
    }

    public ApplyChainPublicCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyChainPublicCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyChainPublicCertRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ApplyChainPublicCertRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public ApplyChainPublicCertRequest setCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }
    public String getCountryName() {
        return this.countryName;
    }

    public ApplyChainPublicCertRequest setLocalityName(String localityName) {
        this.localityName = localityName;
        return this;
    }
    public String getLocalityName() {
        return this.localityName;
    }

    public ApplyChainPublicCertRequest setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }
    public String getOrganizationName() {
        return this.organizationName;
    }

    public ApplyChainPublicCertRequest setOrganizationUnitName(String organizationUnitName) {
        this.organizationUnitName = organizationUnitName;
        return this;
    }
    public String getOrganizationUnitName() {
        return this.organizationUnitName;
    }

    public ApplyChainPublicCertRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ApplyChainPublicCertRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ApplyChainPublicCertRequest setStateOrProvinceName(String stateOrProvinceName) {
        this.stateOrProvinceName = stateOrProvinceName;
        return this;
    }
    public String getStateOrProvinceName() {
        return this.stateOrProvinceName;
    }

}
