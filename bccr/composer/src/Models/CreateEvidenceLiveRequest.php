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

    // 取证类型（通用直播取证：DEFAULT）
    /**
     * @var string
     */
    public $type;

    // 取证网址信息
    /**
     * @var EvidenceWebUrlInfo
     */
    public $webUrl;

    // 幂等字段
    /**
     * @var string
     */
    public $clientToken;

    // 主播 ID
    /**
     * @var string
     */
    public $profileId;

    // 预定时间：分钟，建议传值范围5-20分钟
    /**
     * @var int
     */
    public $expectedDuration;

    // 主播名称
    /**
     * @var string
     */
    public $anchorName;

    // 1：视频点播，2：视频直播，3：背景音乐
    /**
     * @var string
     */
    public $obtainType;

    // 1：PC、2：移动设备
    /**
     * @var string
     */
    public $obtainDeviceType;

    // 2：momo，4：比心，5：小红书
    /**
     * @var string
     */
    public $obtainPlatform;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'evidenceUserId'    => 'evidence_user_id',
        'notaryOffice'      => 'notary_office',
        'type'              => 'type',
        'webUrl'            => 'web_url',
        'clientToken'       => 'client_token',
        'profileId'         => 'profile_id',
        'expectedDuration'  => 'expected_duration',
        'anchorName'        => 'anchor_name',
        'obtainType'        => 'obtain_type',
        'obtainDeviceType'  => 'obtain_device_type',
        'obtainPlatform'    => 'obtain_platform',
    ];

    public function validate()
    {
        Model::validateRequired('evidenceUserId', $this->evidenceUserId, true);
        Model::validateRequired('notaryOffice', $this->notaryOffice, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('webUrl', $this->webUrl, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
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
        if (null !== $this->evidenceUserId) {
            $res['evidence_user_id'] = $this->evidenceUserId;
        }
        if (null !== $this->notaryOffice) {
            $res['notary_office'] = $this->notaryOffice;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->webUrl) {
            $res['web_url'] = null !== $this->webUrl ? $this->webUrl->toMap() : null;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->profileId) {
            $res['profile_id'] = $this->profileId;
        }
        if (null !== $this->expectedDuration) {
            $res['expected_duration'] = $this->expectedDuration;
        }
        if (null !== $this->anchorName) {
            $res['anchor_name'] = $this->anchorName;
        }
        if (null !== $this->obtainType) {
            $res['obtain_type'] = $this->obtainType;
        }
        if (null !== $this->obtainDeviceType) {
            $res['obtain_device_type'] = $this->obtainDeviceType;
        }
        if (null !== $this->obtainPlatform) {
            $res['obtain_platform'] = $this->obtainPlatform;
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
        if (isset($map['evidence_user_id'])) {
            $model->evidenceUserId = $map['evidence_user_id'];
        }
        if (isset($map['notary_office'])) {
            $model->notaryOffice = $map['notary_office'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['web_url'])) {
            $model->webUrl = EvidenceWebUrlInfo::fromMap($map['web_url']);
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['profile_id'])) {
            $model->profileId = $map['profile_id'];
        }
        if (isset($map['expected_duration'])) {
            $model->expectedDuration = $map['expected_duration'];
        }
        if (isset($map['anchor_name'])) {
            $model->anchorName = $map['anchor_name'];
        }
        if (isset($map['obtain_type'])) {
            $model->obtainType = $map['obtain_type'];
        }
        if (isset($map['obtain_device_type'])) {
            $model->obtainDeviceType = $map['obtain_device_type'];
        }
        if (isset($map['obtain_platform'])) {
            $model->obtainPlatform = $map['obtain_platform'];
        }

        return $model;
    }
}
