// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainMiniAppUserPrivilege extends TeaModel {
    // ant_chain_id
    /**
     * <strong>example:</strong>
     * <p>ant_chain_id</p>
     */
    @NameInMap("ant_chain_id")
    public String antChainId;

    // q_r_code_type
    /**
     * <strong>example:</strong>
     * <p>q_r_code_type</p>
     */
    @NameInMap("q_r_code_type")
    public String qRCodeType;

    // authorization_type
    /**
     * <strong>example:</strong>
     * <p>authorization_type</p>
     */
    @NameInMap("authorization_type")
    public String authorizationType;

    // pagination
    /**
     * <strong>example:</strong>
     * <p>pagination</p>
     */
    @NameInMap("pagination")
    public ALiYunPagination pagination;

    // ALiYunChainMiniAppAuthorizedUser
    /**
     * <strong>example:</strong>
     * <p>ALiYunChainMiniAppAuthorizedUser</p>
     */
    @NameInMap("authorized_user_list")
    public java.util.List<ALiYunChainMiniAppAuthorizedUser> authorizedUserList;

    public static ALiYunChainMiniAppUserPrivilege build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainMiniAppUserPrivilege self = new ALiYunChainMiniAppUserPrivilege();
        return TeaModel.build(map, self);
    }

    public ALiYunChainMiniAppUserPrivilege setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ALiYunChainMiniAppUserPrivilege setQRCodeType(String qRCodeType) {
        this.qRCodeType = qRCodeType;
        return this;
    }
    public String getQRCodeType() {
        return this.qRCodeType;
    }

    public ALiYunChainMiniAppUserPrivilege setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public String getAuthorizationType() {
        return this.authorizationType;
    }

    public ALiYunChainMiniAppUserPrivilege setPagination(ALiYunPagination pagination) {
        this.pagination = pagination;
        return this;
    }
    public ALiYunPagination getPagination() {
        return this.pagination;
    }

    public ALiYunChainMiniAppUserPrivilege setAuthorizedUserList(java.util.List<ALiYunChainMiniAppAuthorizedUser> authorizedUserList) {
        this.authorizedUserList = authorizedUserList;
        return this;
    }
    public java.util.List<ALiYunChainMiniAppAuthorizedUser> getAuthorizedUserList() {
        return this.authorizedUserList;
    }

}
