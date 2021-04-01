// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplyChainCertAntRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ant_chain_id
    @NameInMap("ant_chain_id")
    @Validation(required = true)
    public String antChainId;

    // common_name
    @NameInMap("common_name")
    @Validation(required = true)
    public String commonName;

    // consortium_id
    @NameInMap("consortium_id")
    @Validation(required = true)
    public String consortiumId;

    // country_name
    @NameInMap("country_name")
    @Validation(required = true)
    public String countryName;

    // locality_name
    @NameInMap("locality_name")
    @Validation(required = true)
    public String localityName;

    // organization_name
    @NameInMap("organization_name")
    @Validation(required = true)
    public String organizationName;

    // organization_unit_name
    @NameInMap("organization_unit_name")
    @Validation(required = true)
    public String organizationUnitName;

    // password
    @NameInMap("password")
    @Validation(required = true)
    public String password;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    // state_or_province_name
    @NameInMap("state_or_province_name")
    @Validation(required = true)
    public String stateOrProvinceName;

    public static ApplyChainCertAntRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyChainCertAntRequest self = new ApplyChainCertAntRequest();
        return TeaModel.build(map, self);
    }

    public ApplyChainCertAntRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyChainCertAntRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyChainCertAntRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ApplyChainCertAntRequest setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public ApplyChainCertAntRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public ApplyChainCertAntRequest setCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }
    public String getCountryName() {
        return this.countryName;
    }

    public ApplyChainCertAntRequest setLocalityName(String localityName) {
        this.localityName = localityName;
        return this;
    }
    public String getLocalityName() {
        return this.localityName;
    }

    public ApplyChainCertAntRequest setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }
    public String getOrganizationName() {
        return this.organizationName;
    }

    public ApplyChainCertAntRequest setOrganizationUnitName(String organizationUnitName) {
        this.organizationUnitName = organizationUnitName;
        return this;
    }
    public String getOrganizationUnitName() {
        return this.organizationUnitName;
    }

    public ApplyChainCertAntRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ApplyChainCertAntRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ApplyChainCertAntRequest setStateOrProvinceName(String stateOrProvinceName) {
        this.stateOrProvinceName = stateOrProvinceName;
        return this;
    }
    public String getStateOrProvinceName() {
        return this.stateOrProvinceName;
    }

}
