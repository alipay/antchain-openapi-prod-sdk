<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class CreateAppsRecoveryRequest extends Model
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

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // 000001
    /**
     * @var string
     */
    public $instanceId;

    // 发起方信息
    /**
     * @var RecoveryDTO
     */
    public $recovery;

    // 数据源信息
    /**
     * @var RecoveryDsDTO[]
     */
    public $recoveryDsArray;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'instanceId'        => 'instance_id',
        'recovery'          => 'recovery',
        'recoveryDsArray'   => 'recovery_ds_array',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('recovery', $this->recovery, true);
        Model::validateRequired('recoveryDsArray', $this->recoveryDsArray, true);
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->recovery) {
            $res['recovery'] = null !== $this->recovery ? $this->recovery->toMap() : null;
        }
        if (null !== $this->recoveryDsArray) {
            $res['recovery_ds_array'] = [];
            if (null !== $this->recoveryDsArray && \is_array($this->recoveryDsArray)) {
                $n = 0;
                foreach ($this->recoveryDsArray as $item) {
                    $res['recovery_ds_array'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAppsRecoveryRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['recovery'])) {
            $model->recovery = RecoveryDTO::fromMap($map['recovery']);
        }
        if (isset($map['recovery_ds_array'])) {
            if (!empty($map['recovery_ds_array'])) {
                $model->recoveryDsArray = [];
                $n                      = 0;
                foreach ($map['recovery_ds_array'] as $item) {
                    $model->recoveryDsArray[$n++] = null !== $item ? RecoveryDsDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
