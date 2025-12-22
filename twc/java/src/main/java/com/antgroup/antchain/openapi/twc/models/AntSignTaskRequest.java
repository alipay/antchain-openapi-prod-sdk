// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class AntSignTaskRequest extends TeaModel {
    // 签署人信息
    @NameInMap("ant_sign_user_info_request_list")
    @Validation(required = true)
    public java.util.List<AntSignUserInfoRequest> antSignUserInfoRequestList;

    // 待签署文件列表
    @NameInMap("ant_sign_file_request_list")
    @Validation(required = true)
    public java.util.List<AntSignFileRequest> antSignFileRequestList;

    // relatedBusiness	是否关联业务
    /**
     * <strong>example:</strong>
     * <p>true, false 默认：false </p>
     */
    @NameInMap("related_business")
    public Boolean relatedBusiness;

    // 任务描述
    /**
     * <strong>example:</strong>
     * <p>任务描述</p>
     */
    @NameInMap("description")
    public String description;

    // 业务扩展参数
    /**
     * <strong>example:</strong>
     * <p>业务扩展参数</p>
     */
    @NameInMap("extra_param")
    public String extraParam;

    // 子业务流水号（如果只有单任务，可以跟bizNo填相同的值）
    /**
     * <strong>example:</strong>
     * <p>子业务流水号</p>
     */
    @NameInMap("sub_biz_no")
    @Validation(required = true)
    public String subBizNo;

    // 业务配置参数，用于展示或隐藏签署功能 默认不传：false
    /**
     * <strong>example:</strong>
     * <p>默认不传</p>
     */
    @NameInMap("sign_config_param")
    public String signConfigParam;

    public static AntSignTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AntSignTaskRequest self = new AntSignTaskRequest();
        return TeaModel.build(map, self);
    }

    public AntSignTaskRequest setAntSignUserInfoRequestList(java.util.List<AntSignUserInfoRequest> antSignUserInfoRequestList) {
        this.antSignUserInfoRequestList = antSignUserInfoRequestList;
        return this;
    }
    public java.util.List<AntSignUserInfoRequest> getAntSignUserInfoRequestList() {
        return this.antSignUserInfoRequestList;
    }

    public AntSignTaskRequest setAntSignFileRequestList(java.util.List<AntSignFileRequest> antSignFileRequestList) {
        this.antSignFileRequestList = antSignFileRequestList;
        return this;
    }
    public java.util.List<AntSignFileRequest> getAntSignFileRequestList() {
        return this.antSignFileRequestList;
    }

    public AntSignTaskRequest setRelatedBusiness(Boolean relatedBusiness) {
        this.relatedBusiness = relatedBusiness;
        return this;
    }
    public Boolean getRelatedBusiness() {
        return this.relatedBusiness;
    }

    public AntSignTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AntSignTaskRequest setExtraParam(String extraParam) {
        this.extraParam = extraParam;
        return this;
    }
    public String getExtraParam() {
        return this.extraParam;
    }

    public AntSignTaskRequest setSubBizNo(String subBizNo) {
        this.subBizNo = subBizNo;
        return this;
    }
    public String getSubBizNo() {
        return this.subBizNo;
    }

    public AntSignTaskRequest setSignConfigParam(String signConfigParam) {
        this.signConfigParam = signConfigParam;
        return this;
    }
    public String getSignConfigParam() {
        return this.signConfigParam;
    }

}
