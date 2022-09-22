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
    @NameInMap("pre_params")
    public java.util.List<TemplateParam> preParams;

    // 前置是否需要确认
    @NameInMap("pre_need_confirm")
    public Boolean preNeedConfirm;

    // 后置脚本类型，巡检或预案
    @NameInMap("post_type")
    public String postType;

    // 后置巡检或预案id
    @NameInMap("post_ref_id")
    public String postRefId;

    // 后置巡检或预案名称
    @NameInMap("post_name")
    public String postName;

    // 后置巡检或预案参数
    @NameInMap("post_params")
    public java.util.List<TemplateParam> postParams;

    // 后置是否需要确认
    @NameInMap("post_need_confirm")
    public Boolean postNeedConfirm;

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

    public HasHookConfig setPreParams(java.util.List<TemplateParam> preParams) {
        this.preParams = preParams;
        return this;
    }
    public java.util.List<TemplateParam> getPreParams() {
        return this.preParams;
    }

    public HasHookConfig setPreNeedConfirm(Boolean preNeedConfirm) {
        this.preNeedConfirm = preNeedConfirm;
        return this;
    }
    public Boolean getPreNeedConfirm() {
        return this.preNeedConfirm;
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

    public HasHookConfig setPostName(String postName) {
        this.postName = postName;
        return this;
    }
    public String getPostName() {
        return this.postName;
    }

    public HasHookConfig setPostParams(java.util.List<TemplateParam> postParams) {
        this.postParams = postParams;
        return this;
    }
    public java.util.List<TemplateParam> getPostParams() {
        return this.postParams;
    }

    public HasHookConfig setPostNeedConfirm(Boolean postNeedConfirm) {
        this.postNeedConfirm = postNeedConfirm;
        return this;
    }
    public Boolean getPostNeedConfirm() {
        return this.postNeedConfirm;
    }

}
