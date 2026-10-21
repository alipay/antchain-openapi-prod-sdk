<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class CallbackMktEffectsimpleRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'requestId' => 'request_id',
        'projectId' => 'project_id',
        'marketingMode' => 'marketing_mode',
        'insureShortUrl' => 'insure_short_url',
        'encryptionType' => 'encryption_type',
        'encryptedUserId' => 'encrypted_user_id',
        'landingVisitId' => 'landing_visit_id',
        'nodeType' => 'node_type',
        'nodeStatus' => 'node_status',
        'eventTime' => 'event_time',
        'extInfo' => 'ext_info',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('encryptionType', $this->encryptionType, true);
        Model::validateRequired('encryptedUserId', $this->encryptedUserId, true);
        Model::validateRequired('landingVisitId', $this->landingVisitId, true);
        Model::validateRequired('nodeType', $this->nodeType, true);
        Model::validateRequired('nodeStatus', $this->nodeStatus, true);
        Model::validateRequired('eventTime', $this->eventTime, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->marketingMode) {
            $res['marketing_mode'] = $this->marketingMode;
        }
        if (null !== $this->insureShortUrl) {
            $res['insure_short_url'] = $this->insureShortUrl;
        }
        if (null !== $this->encryptionType) {
            $res['encryption_type'] = $this->encryptionType;
        }
        if (null !== $this->encryptedUserId) {
            $res['encrypted_user_id'] = $this->encryptedUserId;
        }
        if (null !== $this->landingVisitId) {
            $res['landing_visit_id'] = $this->landingVisitId;
        }
        if (null !== $this->nodeType) {
            $res['node_type'] = $this->nodeType;
        }
        if (null !== $this->nodeStatus) {
            $res['node_status'] = $this->nodeStatus;
        }
        if (null !== $this->eventTime) {
            $res['event_time'] = $this->eventTime;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CallbackMktEffectsimpleRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['project_id'])){
            $model->projectId = $map['project_id'];
        }
        if(isset($map['marketing_mode'])){
            $model->marketingMode = $map['marketing_mode'];
        }
        if(isset($map['insure_short_url'])){
            $model->insureShortUrl = $map['insure_short_url'];
        }
        if(isset($map['encryption_type'])){
            $model->encryptionType = $map['encryption_type'];
        }
        if(isset($map['encrypted_user_id'])){
            $model->encryptedUserId = $map['encrypted_user_id'];
        }
        if(isset($map['landing_visit_id'])){
            $model->landingVisitId = $map['landing_visit_id'];
        }
        if(isset($map['node_type'])){
            $model->nodeType = $map['node_type'];
        }
        if(isset($map['node_status'])){
            $model->nodeStatus = $map['node_status'];
        }
        if(isset($map['event_time'])){
            $model->eventTime = $map['event_time'];
        }
        if(isset($map['ext_info'])){
            $model->extInfo = $map['ext_info'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求id，每一次请求保持唯一；若重复，则更新原数据
    /**
     * @var string
     */
    public $requestId;

    // 项目ID，待蚂蚁分配
    /**
     * @var string
     */
    public $projectId;

    // 营销模式，枚举：LIVE_STREAMING-直播投流、ADVERTISING-广告投流、AI_WECHAT-AI企微、BPO_SHORT_HANG-BPO挂短、BPO_OFFICIAL_ACCOUNT-BPO公众号、SMS-短信
    /**
     * @var string
     */
    public $marketingMode;

    // 投保特征短链，挂短模式必填
    /**
     * @var string
     */
    public $insureShortUrl;

    // 加密类型：MD5，32位[小]
    /**
     * @var string
     */
    public $encryptionType;

    // 加密用户标识
    /**
     * @var string
     */
    public $encryptedUserId;

    // 用以识别当前用户点击投保页面的唯一标识
    /**
     * @var string
     */
    public $landingVisitId;

    // 事件类型（节点类：LIVE_STREAMING_START/LIVE_STREAMING_END/FORM_SUBMIT/POLICY_ISSUE/PREMIUM_PAYMENT/UNDERWRITING；标签类：LABEL_SMS_SEND/LABEL_ADD/LABEL_RENEWAL_M2/LABEL_RENEWAL_M3/LABEL_INTENTION）
    /**
     * @var string
     */
    public $nodeType;

    // 事件状态，节点类：0-未完成 1-已完成；标签类：支持1-X格式（X为标签值）
    /**
     * @var string
     */
    public $nodeStatus;

    // 事件完成时间（yyyy-MM-dd HH:mm:ss）
    /**
     * @var string
     */
    public $eventTime;

    // 扩展json字段，最大2048字符，用于传递isfrommy数据源、年化保费等扩展信息
    /**
     * @var string
     */
    public $extInfo;

}
