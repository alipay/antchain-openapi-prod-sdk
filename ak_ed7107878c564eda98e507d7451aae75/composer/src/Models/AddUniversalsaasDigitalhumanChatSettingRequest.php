<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class AddUniversalsaasDigitalhumanChatSettingRequest extends Model
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

    // 交互配置名称
    /**
     * @var string
     */
    public $configName;

    // 角色id
    /**
     * @var int
     */
    public $humanId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantCode'        => 'tenant_code',
        'configName'        => 'config_name',
        'humanId'           => 'human_id',
    ];

    public function validate()
    {
        Model::validateRequired('tenantCode', $this->tenantCode, true);
        Model::validateRequired('configName', $this->configName, true);
        Model::validateRequired('humanId', $this->humanId, true);
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
        if (null !== $this->configName) {
            $res['config_name'] = $this->configName;
        }
        if (null !== $this->humanId) {
            $res['human_id'] = $this->humanId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddUniversalsaasDigitalhumanChatSettingRequest
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
        if (isset($map['config_name'])) {
            $model->configName = $map['config_name'];
        }
        if (isset($map['human_id'])) {
            $model->humanId = $map['human_id'];
        }

        return $model;
    }
}
