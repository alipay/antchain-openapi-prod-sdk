<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class UpdateUniversalsaasDigitalhumanHumanRequest extends Model
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

    // 租户编码
    /**
     * @var string
     */
    public $tenantCode;

    // 数字人形象id
    /**
     * @var int
     */
    public $modelId;

    // 音色编码
    /**
     * @var string
     */
    public $voiceCode;

    // 数字人角色名
    /**
     * @var string
     */
    public $humanName;

    // 语速
    /**
     * @var int
     */
    public $speed;

    // 音调
    /**
     * @var int
     */
    public $pitch;

    // 音量
    /**
     * @var int
     */
    public $volume;

    // 数字人角色id
    /**
     * @var int
     */
    public $humanId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantCode'        => 'tenant_code',
        'modelId'           => 'model_id',
        'voiceCode'         => 'voice_code',
        'humanName'         => 'human_name',
        'speed'             => 'speed',
        'pitch'             => 'pitch',
        'volume'            => 'volume',
        'humanId'           => 'human_id',
    ];

    public function validate()
    {
        Model::validateRequired('tenantCode', $this->tenantCode, true);
        Model::validateRequired('modelId', $this->modelId, true);
        Model::validateRequired('voiceCode', $this->voiceCode, true);
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
        if (null !== $this->tenantCode) {
            $res['tenant_code'] = $this->tenantCode;
        }
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->voiceCode) {
            $res['voice_code'] = $this->voiceCode;
        }
        if (null !== $this->humanName) {
            $res['human_name'] = $this->humanName;
        }
        if (null !== $this->speed) {
            $res['speed'] = $this->speed;
        }
        if (null !== $this->pitch) {
            $res['pitch'] = $this->pitch;
        }
        if (null !== $this->volume) {
            $res['volume'] = $this->volume;
        }
        if (null !== $this->humanId) {
            $res['human_id'] = $this->humanId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateUniversalsaasDigitalhumanHumanRequest
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
        if (isset($map['tenant_code'])) {
            $model->tenantCode = $map['tenant_code'];
        }
        if (isset($map['model_id'])) {
            $model->modelId = $map['model_id'];
        }
        if (isset($map['voice_code'])) {
            $model->voiceCode = $map['voice_code'];
        }
        if (isset($map['human_name'])) {
            $model->humanName = $map['human_name'];
        }
        if (isset($map['speed'])) {
            $model->speed = $map['speed'];
        }
        if (isset($map['pitch'])) {
            $model->pitch = $map['pitch'];
        }
        if (isset($map['volume'])) {
            $model->volume = $map['volume'];
        }
        if (isset($map['human_id'])) {
            $model->humanId = $map['human_id'];
        }

        return $model;
    }
}
