// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class CheckApiResult extends TeaModel {
    // 导入的所有的API集合
    @NameInMap("all_api_list")
    public java.util.List<ApiTransferVO> allApiList;

    // API或者配置中有重复的集合
    @NameInMap("failed_api_list")
    public java.util.List<ApiTransferVO> failedApiList;

    // 	
    // API包括配置无重复的集合
    @NameInMap("success_api_list")
    public java.util.List<ApiTransferVO> successApiList;

    // 失败api配置详情
    @NameInMap("check_result")
    public String checkResult;

    public static CheckApiResult build(java.util.Map<String, ?> map) throws Exception {
        CheckApiResult self = new CheckApiResult();
        return TeaModel.build(map, self);
    }

    public CheckApiResult setAllApiList(java.util.List<ApiTransferVO> allApiList) {
        this.allApiList = allApiList;
        return this;
    }
    public java.util.List<ApiTransferVO> getAllApiList() {
        return this.allApiList;
    }

    public CheckApiResult setFailedApiList(java.util.List<ApiTransferVO> failedApiList) {
        this.failedApiList = failedApiList;
        return this;
    }
    public java.util.List<ApiTransferVO> getFailedApiList() {
        return this.failedApiList;
    }

    public CheckApiResult setSuccessApiList(java.util.List<ApiTransferVO> successApiList) {
        this.successApiList = successApiList;
        return this;
    }
    public java.util.List<ApiTransferVO> getSuccessApiList() {
        return this.successApiList;
    }

    public CheckApiResult setCheckResult(String checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public String getCheckResult() {
        return this.checkResult;
    }

}
