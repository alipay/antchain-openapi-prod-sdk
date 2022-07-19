// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class DeploySolutionContractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 链操作者信息
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 合约名称
    @NameInMap("contract_name")
    @Validation(required = true)
    public String contractName;

    // 提交记录ID
    @NameInMap("commit_id")
    @Validation(required = true)
    public String commitId;

    // 当前分支
    @NameInMap("branch")
    @Validation(required = true)
    public String branch;

    // 合约仓库路径
    @NameInMap("git_repo")
    @Validation(required = true)
    public String gitRepo;

    public static DeploySolutionContractRequest build(java.util.Map<String, ?> map) throws Exception {
        DeploySolutionContractRequest self = new DeploySolutionContractRequest();
        return TeaModel.build(map, self);
    }

    public DeploySolutionContractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeploySolutionContractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeploySolutionContractRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public DeploySolutionContractRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DeploySolutionContractRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public DeploySolutionContractRequest setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public DeploySolutionContractRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public DeploySolutionContractRequest setGitRepo(String gitRepo) {
        this.gitRepo = gitRepo;
        return this;
    }
    public String getGitRepo() {
        return this.gitRepo;
    }

}
