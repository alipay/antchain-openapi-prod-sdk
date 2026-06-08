<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class CallbackAasMktLiveeffectRequest extends Model
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

    // 营销模式，AI_HANGUP_SMS("AI挂短")， AI_OFFICIAL_ACCOUNT("AI公众号"), BPO_WECHAT("BPO企微"), AI_BPO("AI_BPO")， LIVE_STREAMING("直播")
    /**
     * @var string
     */
    public $marketingMode;

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

    // 事件完成时间（yyyy-MM-dd HH:mm:ss）
    /**
     * @var string
     */
    public $eventTime;

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

    // 用户转化的落地页 URL，H5 类落地页
    /**
     * @var string
     */
    public $landingPageUrl;

    // N	点击 ID，来自落地页 URL、小程序 path 的埋点
    /**
     * @var string
     */
    public $clickId;

    // 产品 ID-固定参数，与商品详情页的 H5 进行绑定
    // 或者通过埋点数据获取
    /**
     * @var string
     */
    public $productId;

    // 用户 IP
    /**
     * @var string
     */
    public $ip;

    // ua
    /**
     * @var string
     */
    public $ua;

    // 直播间号 - 动参，每日直播时添加至 URL
    /**
     * @var string
     */
    public $liveRoomId;

    // 直播间开播时间 - 动参（yyyy-MM-dd HH:mm:ss）
    /**
     * @var string
     */
    public $liveStartTime;

    // 扩展字段
    /**
     * @var string
     */
    public $extInfo;

    // 直播间开播场次-动参，每日每场直播时添加至 URl（唯一ID 生成规则：直播间 ID 后两位+开播时间的年（后两位）月日时分
    // 举例：若直播间 ID 为 kxz123456，开播时间为 2026-06-18 17：22，此时唯一 ID 为：562606181722
    // ）
    /**
     * @var string
     */
    public $liveSessionId;
    protected $_name = [
        'authToken'       => 'auth_token',
        'requestId'       => 'request_id',
        'projectId'       => 'project_id',
        'marketingMode'   => 'marketing_mode',
        'encryptionType'  => 'encryption_type',
        'encryptedUserId' => 'encrypted_user_id',
        'eventTime'       => 'event_time',
        'nodeType'        => 'node_type',
        'nodeInfo'        => 'node_info',
        'landingPageUrl'  => 'landing_page_url',
        'clickId'         => 'click_id',
        'productId'       => 'product_id',
        'ip'              => 'ip',
        'ua'              => 'ua',
        'liveRoomId'      => 'live_room_id',
        'liveStartTime'   => 'live_start_time',
        'extInfo'         => 'ext_info',
        'liveSessionId'   => 'live_session_id',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('marketingMode', $this->marketingMode, true);
        Model::validateRequired('encryptionType', $this->encryptionType, true);
        Model::validateRequired('encryptedUserId', $this->encryptedUserId, true);
        Model::validateRequired('eventTime', $this->eventTime, true);
        Model::validateRequired('nodeType', $this->nodeType, true);
        Model::validateRequired('nodeInfo', $this->nodeInfo, true);
        Model::validateRequired('landingPageUrl', $this->landingPageUrl, true);
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
        if (null !== $this->encryptionType) {
            $res['encryption_type'] = $this->encryptionType;
        }
        if (null !== $this->encryptedUserId) {
            $res['encrypted_user_id'] = $this->encryptedUserId;
        }
        if (null !== $this->eventTime) {
            $res['event_time'] = $this->eventTime;
        }
        if (null !== $this->nodeType) {
            $res['node_type'] = $this->nodeType;
        }
        if (null !== $this->nodeInfo) {
            $res['node_info'] = $this->nodeInfo;
        }
        if (null !== $this->landingPageUrl) {
            $res['landing_page_url'] = $this->landingPageUrl;
        }
        if (null !== $this->clickId) {
            $res['click_id'] = $this->clickId;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->ua) {
            $res['ua'] = $this->ua;
        }
        if (null !== $this->liveRoomId) {
            $res['live_room_id'] = $this->liveRoomId;
        }
        if (null !== $this->liveStartTime) {
            $res['live_start_time'] = $this->liveStartTime;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->liveSessionId) {
            $res['live_session_id'] = $this->liveSessionId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackAasMktLiveeffectRequest
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
        if (isset($map['encryption_type'])) {
            $model->encryptionType = $map['encryption_type'];
        }
        if (isset($map['encrypted_user_id'])) {
            $model->encryptedUserId = $map['encrypted_user_id'];
        }
        if (isset($map['event_time'])) {
            $model->eventTime = $map['event_time'];
        }
        if (isset($map['node_type'])) {
            $model->nodeType = $map['node_type'];
        }
        if (isset($map['node_info'])) {
            $model->nodeInfo = $map['node_info'];
        }
        if (isset($map['landing_page_url'])) {
            $model->landingPageUrl = $map['landing_page_url'];
        }
        if (isset($map['click_id'])) {
            $model->clickId = $map['click_id'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['ua'])) {
            $model->ua = $map['ua'];
        }
        if (isset($map['live_room_id'])) {
            $model->liveRoomId = $map['live_room_id'];
        }
        if (isset($map['live_start_time'])) {
            $model->liveStartTime = $map['live_start_time'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['live_session_id'])) {
            $model->liveSessionId = $map['live_session_id'];
        }

        return $model;
    }
}
