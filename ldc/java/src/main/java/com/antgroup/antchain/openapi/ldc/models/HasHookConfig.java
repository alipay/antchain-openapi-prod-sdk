// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class HasHookConfig extends TeaModel {
    // 前置脚本类型，巡检或预案
    @NameInMap("pre_type")
    public String preType;

    // 前置巡检或预案id
    @NameInMap("pre_ref_id")
    public String preRefId;

    // 前置巡检或预案名称
    @NameInMap("pre_name")
    public String preName;

    // 前置巡检或预案参数
    @NameInMap("pre_param")
    public String preParam;

    // 后置脚本类型，巡检或预案
    @NameInMap("post_type")
    public String postType;

    // 后置巡检或预案id
    @NameInMap("post_ref_id")
    public String postRefId;

    // 后置巡检或预案参数
    @NameInMap("post_param")
    public String postParam;

    // 后置巡检或预案名称
    @NameInMap("post_name")
    public String postName;

    public static HasHookConfig build(java.util.Map<String, ?> map) throws Exception {
        HasHookConfig self = new HasHookConfig();
        return TeaModel.build(map, self);
    }

    public HasHookConfig setPreType(String preType) {
        this.preType = preType;
        return this;
    }
    public String getPreType() {
        return this.preType;
    }

    public HasHookConfig setPreRefId(String preRefId) {
        this.preRefId = preRefId;
        return this;
    }
    public String getPreRefId() {
        return this.preRefId;
    }

    public HasHookConfig setPreName(String preName) {
        this.preName = preName;
        return this;
    }
    public String getPreName() {
        return this.preName;
    }

    public HasHookConfig setPreParam(String preParam) {
        this.preParam = preParam;
        return this;
    }
    public String getPreParam() {
        return this.preParam;
    }

    public HasHookConfig setPostType(String postType) {
        this.postType = postType;
        return this;
    }
    public String getPostType() {
        return this.postType;
    }

    public HasHookConfig setPostRefId(String postRefId) {
        this.postRefId = postRefId;
        return this;
    }
    public String getPostRefId() {
        return this.postRefId;
    }

    public HasHookConfig setPostParam(String postParam) {
        this.postParam = postParam;
        return this;
    }
    public String getPostParam() {
        return this.postParam;
    }

    public HasHookConfig setPostName(String postName) {
        this.postName = postName;
        return this;
    }
    public String getPostName() {
        return this.postName;
    }

}
