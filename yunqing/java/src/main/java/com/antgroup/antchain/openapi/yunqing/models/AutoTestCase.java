// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class AutoTestCase extends TeaModel {
    // 测试应用本身的名字
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 测试应用本身的版本
    @NameInMap("app_version")
    @Validation(required = true)
    public String appVersion;

    // case的级别
    @NameInMap("case_level")
    @Validation(required = true)
    public String caseLevel;

    // case的名字
    @NameInMap("case_name")
    @Validation(required = true)
    public String caseName;

    // case的状态
    @NameInMap("case_status")
    @Validation(required = true)
    public String caseStatus;

    // case的类型
    @NameInMap("case_type")
    @Validation(required = true)
    public String caseType;

    // case的类
    @NameInMap("class_name")
    @Validation(required = true)
    public String className;

    // 详情
    @NameInMap("detail")
    public String detail;

    // case运行的时间，单位毫秒
    @NameInMap("duration")
    @Validation(required = true)
    public Long duration;

    // case的id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 测试方法名
    @NameInMap("method_name")
    @Validation(required = true)
    public String methodName;

    public static AutoTestCase build(java.util.Map<String, ?> map) throws Exception {
        AutoTestCase self = new AutoTestCase();
        return TeaModel.build(map, self);
    }

    public AutoTestCase setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AutoTestCase setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public AutoTestCase setCaseLevel(String caseLevel) {
        this.caseLevel = caseLevel;
        return this;
    }
    public String getCaseLevel() {
        return this.caseLevel;
    }

    public AutoTestCase setCaseName(String caseName) {
        this.caseName = caseName;
        return this;
    }
    public String getCaseName() {
        return this.caseName;
    }

    public AutoTestCase setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
        return this;
    }
    public String getCaseStatus() {
        return this.caseStatus;
    }

    public AutoTestCase setCaseType(String caseType) {
        this.caseType = caseType;
        return this;
    }
    public String getCaseType() {
        return this.caseType;
    }

    public AutoTestCase setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public AutoTestCase setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public AutoTestCase setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public AutoTestCase setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AutoTestCase setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

}
