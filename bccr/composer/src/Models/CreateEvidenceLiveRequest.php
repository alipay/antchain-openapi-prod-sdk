<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class CreateEvidenceLiveRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 幂等字段
    /**
     * @var string
     */
    public $clientToken;

    // 取证用户id
    /**
     * @var string
     */
    public $evidenceUserId;

    // 取证公证处
    /**
     * @var string
     */
    public $notaryOffice;

    // 取证平台：2：陌陌4：比心，5：小红书，6：lespark
    /**
     * @var int
     */
    public $obtainPlatform;

    // 1：PC、2：移动设备
    /**
     * @var string
     */
    public $obtainDeviceType;

    // 直播取证标题（自定义）
    /**
     * @var string
     */
    public $title;

    // 预定时间：分钟，建议传值范围5-20分钟
    /**
     * @var int
     */
    public $expectedDuration;

    // json字符串，取证平台动态参数，其参数取决于type，具体参数见
    // 附录
    /**
     * @var string
     */
    public $platformDynamicParams;

    // 取证类型（通用直播取证：DEFAULT）（过期，后续版本逐步删除）
    /**
     * @var string
     */
    public $type;

    // 取证网址信息（过期，后续版本逐步删除）
    /**
     * @var EvidenceWebUrlInfo
     */
    public $webUrl;

    // 主播 ID（过期，后续版本逐步删除）
    /**
     * @var string
     */
    public $profileId;

    // 1：视频点播，2：视频直播，3：背景音乐（过期，后续版本逐步删除）
    /**
     * @var string
     */
    public $obtainType;

    // 主播名称（过期，后续版本逐步删除）
    /**
     * @var string
     */
    public $anchorName;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'clientToken'           => 'client_token',
        'evidenceUserId'        => 'evidence_user_id',
        'notaryOffice'          => 'notary_office',
        'obtainPlatform'        => 'obtain_platform',
        'obtainDeviceType'      => 'obtain_device_type',
        'title'                 => 'title',
        'expectedDuration'      => 'expected_duration',
        'platformDynamicParams' => 'platform_dynamic_params',
        'type'                  => 'type',
        'webUrl'                => 'web_url',
        'profileId'             => 'profile_id',
        'obtainType'            => 'obtain_type',
        'anchorName'            => 'anchor_name',
    ];

    public function validate()
    {
        Model::validateRequired('clientToken', $this->clientToken, true);
        Model::validateRequired('evidenceUserId', $this->evidenceUserId, true);
        Model::validateRequired('notaryOffice', $this->notaryOffice, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->evidenceUserId) {
            $res['evidence_user_id'] = $this->evidenceUserId;
        }
        if (null !== $this->notaryOffice) {
            $res['notary_office'] = $this->notaryOffice;
        }
        if (null !== $this->obtainPlatform) {
            $res['obtain_platform'] = $this->obtainPlatform;
        }
        if (null !== $this->obtainDeviceType) {
            $res['obtain_device_type'] = $this->obtainDeviceType;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->expectedDuration) {
            $res['expected_duration'] = $this->expectedDuration;
        }
        if (null !== $this->platformDynamicParams) {
            $res['platform_dynamic_params'] = $this->platformDynamicParams;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->webUrl) {
            $res['web_url'] = null !== $this->webUrl ? $this->webUrl->toMap() : null;
        }
        if (null !== $this->profileId) {
            $res['profile_id'] = $this->profileId;
        }
        if (null !== $this->obtainType) {
            $res['obtain_type'] = $this->obtainType;
        }
        if (null !== $this->anchorName) {
            $res['anchor_name'] = $this->anchorName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateEvidenceLiveRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['evidence_user_id'])) {
            $model->evidenceUserId = $map['evidence_user_id'];
        }
        if (isset($map['notary_office'])) {
            $model->notaryOffice = $map['notary_office'];
        }
        if (isset($map['obtain_platform'])) {
            $model->obtainPlatform = $map['obtain_platform'];
        }
        if (isset($map['obtain_device_type'])) {
            $model->obtainDeviceType = $map['obtain_device_type'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['expected_duration'])) {
            $model->expectedDuration = $map['expected_duration'];
        }
        if (isset($map['platform_dynamic_params'])) {
            $model->platformDynamicParams = $map['platform_dynamic_params'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['web_url'])) {
            $model->webUrl = EvidenceWebUrlInfo::fromMap($map['web_url']);
        }
        if (isset($map['profile_id'])) {
            $model->profileId = $map['profile_id'];
        }
        if (isset($map['obtain_type'])) {
            $model->obtainType = $map['obtain_type'];
        }
        if (isset($map['anchor_name'])) {
            $model->anchorName = $map['anchor_name'];
        }

        return $model;
    }
}
