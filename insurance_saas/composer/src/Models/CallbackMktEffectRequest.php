<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class CallbackMktEffectRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求id，每一次请求保持唯一；若重复，则更新原数据；
    /**
     * @var string
     */
    public $requestId;

    // 项目ID，待蚂蚁分配
    /**
     * @var string
     */
    public $projectId;

    // 营销模式
    // ADVERTISING_TRAFFIC("广告投流"),
    // LIVE_STREAMING("直播"),
    // INFLUENCER("达人"),
    // AI_HANGUP_SMS("AI挂短"),
    // AI_OFFICIAL_ACCOUNT("AI公众号"),
    // BPO_WECHAT("BPO企微")
    /**
     * @var string
     */
    public $marketingMode;

    // 投保特征短链
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

    // 用户点击投保页唯一标识
    /**
     * @var string
     */
    public $clickId;

    // 事件完成时间（yyyy-MM-dd HH:mm:ss）
    /**
     * @var string
     */
    public $clickTime;

    // 节点类型
    /**
     * @var string
     */
    public $nodeType;

    // 节点详细信息
    /**
     * @var string
     */
    public $nodeInfo;
    protected $_name = [
        'authToken'       => 'auth_token',
        'requestId'       => 'request_id',
        'projectId'       => 'project_id',
        'marketingMode'   => 'marketing_mode',
        'insureShortUrl'  => 'insure_short_url',
        'encryptionType'  => 'encryption_type',
        'encryptedUserId' => 'encrypted_user_id',
        'clickId'         => 'click_id',
        'clickTime'       => 'click_time',
        'nodeType'        => 'node_type',
        'nodeInfo'        => 'node_info',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('marketingMode', $this->marketingMode, true);
        Model::validateRequired('insureShortUrl', $this->insureShortUrl, true);
        Model::validateRequired('encryptionType', $this->encryptionType, true);
        Model::validateRequired('encryptedUserId', $this->encryptedUserId, true);
        Model::validateRequired('clickId', $this->clickId, true);
        Model::validateRequired('clickTime', $this->clickTime, true);
        Model::validateRequired('nodeType', $this->nodeType, true);
        Model::validateRequired('nodeInfo', $this->nodeInfo, true);
        Model::validateMaxLength('requestId', $this->requestId, 128);
        Model::validateMaxLength('projectId', $this->projectId, 64);
        Model::validateMaxLength('marketingMode', $this->marketingMode, 64);
        Model::validateMaxLength('insureShortUrl', $this->insureShortUrl, 256);
        Model::validateMaxLength('encryptionType', $this->encryptionType, 32);
        Model::validateMaxLength('encryptedUserId', $this->encryptedUserId, 64);
        Model::validateMaxLength('clickId', $this->clickId, 128);
        Model::validateMaxLength('clickTime', $this->clickTime, 32);
        Model::validateMaxLength('nodeType', $this->nodeType, 64);
        Model::validateMaxLength('nodeInfo', $this->nodeInfo, 1024);
    }

    public function toMap()
    {
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
        if (null !== $this->clickId) {
            $res['click_id'] = $this->clickId;
        }
        if (null !== $this->clickTime) {
            $res['click_time'] = $this->clickTime;
        }
        if (null !== $this->nodeType) {
            $res['node_type'] = $this->nodeType;
        }
        if (null !== $this->nodeInfo) {
            $res['node_info'] = $this->nodeInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackMktEffectRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['marketing_mode'])) {
            $model->marketingMode = $map['marketing_mode'];
        }
        if (isset($map['insure_short_url'])) {
            $model->insureShortUrl = $map['insure_short_url'];
        }
        if (isset($map['encryption_type'])) {
            $model->encryptionType = $map['encryption_type'];
        }
        if (isset($map['encrypted_user_id'])) {
            $model->encryptedUserId = $map['encrypted_user_id'];
        }
        if (isset($map['click_id'])) {
            $model->clickId = $map['click_id'];
        }
        if (isset($map['click_time'])) {
            $model->clickTime = $map['click_time'];
        }
        if (isset($map['node_type'])) {
            $model->nodeType = $map['node_type'];
        }
        if (isset($map['node_info'])) {
            $model->nodeInfo = $map['node_info'];
        }

        return $model;
    }
}
