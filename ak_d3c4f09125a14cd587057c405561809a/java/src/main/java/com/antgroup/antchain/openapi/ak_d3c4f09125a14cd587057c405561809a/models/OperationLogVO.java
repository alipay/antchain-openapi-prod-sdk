// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class OperationLogVO extends TeaModel {
    // ID主键
    /**
     * <strong>example:</strong>
     * <p>0628455d41d044ed97783db554149d4b</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 创建时间戳（毫秒）
    /**
     * <strong>example:</strong>
     * <p>1755754919690</p>
     */
    @NameInMap("gmt_created")
    public Long gmtCreated;

    // 更新时间戳（毫秒）
    /**
     * <strong>example:</strong>
     * <p>1755754919690</p>
     */
    @NameInMap("gmt_modified")
    public Long gmtModified;

    // 用户id
    /**
     * <strong>example:</strong>
     * <p>0628455d41d044ed97783db554149d4b</p>
     */
    @NameInMap("user_id")
    public String userId;

    // 用户地址
    /**
     * <strong>example:</strong>
     * <p>0628455d41d044ed97783db554149d4b</p>
     */
    @NameInMap("user_address")
    public String userAddress;

    // 发起操作的URL接口
    /**
     * <strong>example:</strong>
     * <p>/openapi/v1/trade/issuer/project/create</p>
     */
    @NameInMap("request_url")
    public String requestUrl;

    // 发起操作的URL接口描述code值
    /**
     * <strong>example:</strong>
     * <p>OPENAPI_ISSUER_PROJECT_CREATE</p>
     */
    @NameInMap("api_desc")
    public String apiDesc;

    // 发起操作的URL接口中文描述
    /**
     * <strong>example:</strong>
     * <p>openapi创建项目</p>
     */
    @NameInMap("ch_desc")
    public String chDesc;

    // 设备信息
    /**
     * <strong>example:</strong>
     * <p>Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36</p>
     */
    @NameInMap("device_info")
    public String deviceInfo;

    // 设备Hash
    /**
     * <strong>example:</strong>
     * <p>30fdb4cb</p>
     */
    @NameInMap("device_hash")
    public String deviceHash;

    // 操作种类
    /**
     * <strong>example:</strong>
     * <p>QUERY</p>
     */
    @NameInMap("operation_type")
    public String operationType;

    // 请求输入
    /**
     * <strong>example:</strong>
     * <p>{&quot;request&quot;:{&quot;requestFrom&quot;:&quot;inner&quot;,&quot;operatorBy&quot;:null,&quot;projectId&quot;:&quot;17cef416378c4f238ec42cdc142b54c7&quot;,&quot;targetChainName&quot;:null}}</p>
     */
    @NameInMap("request_input")
    public String requestInput;

    // 请求输出
    /**
     * <strong>example:</strong>
     * <p>{&quot;success&quot;:true,&quot;data&quot;:[],&quot;total&quot;:0,&quot;errorMessage&quot;:null,&quot;retry&quot;:false,&quot;traceId&quot;:&quot;T2ce514e6f60a409f9e3926115f9742dd&quot;}</p>
     */
    @NameInMap("request_output")
    public String requestOutput;

    // 操作状态：true/false
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    // 操作来源
    /**
     * <strong>example:</strong>
     * <p>WEB</p>
     */
    @NameInMap("request_from")
    public String requestFrom;

    // 发起IP地址
    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("ip")
    public String ip;

    // 扩展字段
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ext_info")
    public String extInfo;

    // 登录名类型(EMAIL)
    /**
     * <strong>example:</strong>
     * <p>EMAIL</p>
     */
    @NameInMap("login_account_type")
    public String loginAccountType;

    // 登录名
    /**
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("login_account")
    public String loginAccount;

    public static OperationLogVO build(java.util.Map<String, ?> map) throws Exception {
        OperationLogVO self = new OperationLogVO();
        return TeaModel.build(map, self);
    }

    public OperationLogVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OperationLogVO setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    public OperationLogVO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public OperationLogVO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public OperationLogVO setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public OperationLogVO setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
        return this;
    }
    public String getRequestUrl() {
        return this.requestUrl;
    }

    public OperationLogVO setApiDesc(String apiDesc) {
        this.apiDesc = apiDesc;
        return this;
    }
    public String getApiDesc() {
        return this.apiDesc;
    }

    public OperationLogVO setChDesc(String chDesc) {
        this.chDesc = chDesc;
        return this;
    }
    public String getChDesc() {
        return this.chDesc;
    }

    public OperationLogVO setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    public OperationLogVO setDeviceHash(String deviceHash) {
        this.deviceHash = deviceHash;
        return this;
    }
    public String getDeviceHash() {
        return this.deviceHash;
    }

    public OperationLogVO setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public OperationLogVO setRequestInput(String requestInput) {
        this.requestInput = requestInput;
        return this;
    }
    public String getRequestInput() {
        return this.requestInput;
    }

    public OperationLogVO setRequestOutput(String requestOutput) {
        this.requestOutput = requestOutput;
        return this;
    }
    public String getRequestOutput() {
        return this.requestOutput;
    }

    public OperationLogVO setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public OperationLogVO setRequestFrom(String requestFrom) {
        this.requestFrom = requestFrom;
        return this;
    }
    public String getRequestFrom() {
        return this.requestFrom;
    }

    public OperationLogVO setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public OperationLogVO setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public OperationLogVO setLoginAccountType(String loginAccountType) {
        this.loginAccountType = loginAccountType;
        return this;
    }
    public String getLoginAccountType() {
        return this.loginAccountType;
    }

    public OperationLogVO setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
        return this;
    }
    public String getLoginAccount() {
        return this.loginAccount;
    }

}
