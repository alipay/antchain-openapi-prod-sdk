// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class GrayscaleConfigVO extends TeaModel {
    // gmt_create
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // router_type
    @NameInMap("router_type")
    public String routerType;

    // service
    @NameInMap("service")
    public String service;

    // matchable_service
    @NameInMap("matchable_service")
    public String matchableService;

    // instance_id
    @NameInMap("instance_id")
    public String instanceId;

    // router_id
    @NameInMap("router_id")
    public String routerId;

    // app_name
    @NameInMap("app_name")
    public String appName;

    // valid
    @NameInMap("valid")
    public String valid;

    // gray_rule_config_list
    @NameInMap("gray_rule_config_list")
    public java.util.List<GrayRuleConfigVO> grayRuleConfigList;

    public static GrayscaleConfigVO build(java.util.Map<String, ?> map) throws Exception {
        GrayscaleConfigVO self = new GrayscaleConfigVO();
        return TeaModel.build(map, self);
    }

    public GrayscaleConfigVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GrayscaleConfigVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GrayscaleConfigVO setRouterType(String routerType) {
        this.routerType = routerType;
        return this;
    }
    public String getRouterType() {
        return this.routerType;
    }

    public GrayscaleConfigVO setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public GrayscaleConfigVO setMatchableService(String matchableService) {
        this.matchableService = matchableService;
        return this;
    }
    public String getMatchableService() {
        return this.matchableService;
    }

    public GrayscaleConfigVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GrayscaleConfigVO setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public GrayscaleConfigVO setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GrayscaleConfigVO setValid(String valid) {
        this.valid = valid;
        return this;
    }
    public String getValid() {
        return this.valid;
    }

    public GrayscaleConfigVO setGrayRuleConfigList(java.util.List<GrayRuleConfigVO> grayRuleConfigList) {
        this.grayRuleConfigList = grayRuleConfigList;
        return this;
    }
    public java.util.List<GrayRuleConfigVO> getGrayRuleConfigList() {
        return this.grayRuleConfigList;
    }

}
