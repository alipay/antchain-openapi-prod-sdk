// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryTrustiotMiniappRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 跳转流水号，全局唯一
    @NameInMap("trace_no")
    @Validation(required = true)
    public String traceNo;

    // 链接渠道：H5 或 MINIAPP，缺省按 MINIAPP
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 客户自定义的 C 端用户唯一标识，H5 必传、MINIAPP 禁传
    @NameInMap("visit_user_id")
    public String visitUserId;

    // 访问类型：0 主体访问（按主体人解析其可访问设备）、1 设备清单访问（显式传入范围）
    @NameInMap("access_type")
    @Validation(required = true)
    public String accessType;

    // 场景码。主体访问必填（按场景解析该主体的可访问设备）；清单访问不使用顶层 scene，以 access_scope 各项内的场景为准
    @NameInMap("scene")
    public String scene;

    // 主体访问的范围口径，与 subject_id 联合解析：0 产权人 / 1 运营人 / 2 科技主体
    @NameInMap("subject_role")
    public String subjectRole;

    // 主体访问的主键标识：主体人 ID 或统一社会信用代码等唯一标识
    @NameInMap("subject_id")
    public String subjectId;

    // 设备清单访问（access_type=1 或缺省）的访问范围项集合。每项声明一个场景及该场景下的访问目标（设备清单），多项并集生效、顺序不影响结果。类型1 必填；主体访问不使用本字段
    @NameInMap("access_scope")
    public java.util.List<AccessScopeItem> accessScope;

    public static QueryTrustiotMiniappRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTrustiotMiniappRequest self = new QueryTrustiotMiniappRequest();
        return TeaModel.build(map, self);
    }

    public QueryTrustiotMiniappRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTrustiotMiniappRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTrustiotMiniappRequest setTraceNo(String traceNo) {
        this.traceNo = traceNo;
        return this;
    }
    public String getTraceNo() {
        return this.traceNo;
    }

    public QueryTrustiotMiniappRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public QueryTrustiotMiniappRequest setVisitUserId(String visitUserId) {
        this.visitUserId = visitUserId;
        return this;
    }
    public String getVisitUserId() {
        return this.visitUserId;
    }

    public QueryTrustiotMiniappRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public QueryTrustiotMiniappRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryTrustiotMiniappRequest setSubjectRole(String subjectRole) {
        this.subjectRole = subjectRole;
        return this;
    }
    public String getSubjectRole() {
        return this.subjectRole;
    }

    public QueryTrustiotMiniappRequest setSubjectId(String subjectId) {
        this.subjectId = subjectId;
        return this;
    }
    public String getSubjectId() {
        return this.subjectId;
    }

    public QueryTrustiotMiniappRequest setAccessScope(java.util.List<AccessScopeItem> accessScope) {
        this.accessScope = accessScope;
        return this;
    }
    public java.util.List<AccessScopeItem> getAccessScope() {
        return this.accessScope;
    }

}
