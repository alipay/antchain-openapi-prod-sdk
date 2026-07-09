<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SetEnergyprojectLightmodeRequest extends Model
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

    // 节能项目编码
    /**
     * @var string
     */
    public $energyProjectCode;

    // 照明项目编码
    /**
     * @var string
     */
    public $lightProjectCode;

    // 运行模式。workday：工作日模式；holiday：节假日模式
    /**
     * @var string
     */
    public $runMode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'energyProjectCode' => 'energy_project_code',
        'lightProjectCode'  => 'light_project_code',
        'runMode'           => 'run_mode',
    ];

    public function validate()
    {
        Model::validateRequired('energyProjectCode', $this->energyProjectCode, true);
        Model::validateRequired('runMode', $this->runMode, true);
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
        if (null !== $this->energyProjectCode) {
            $res['energy_project_code'] = $this->energyProjectCode;
        }
        if (null !== $this->lightProjectCode) {
            $res['light_project_code'] = $this->lightProjectCode;
        }
        if (null !== $this->runMode) {
            $res['run_mode'] = $this->runMode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetEnergyprojectLightmodeRequest
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
        if (isset($map['energy_project_code'])) {
            $model->energyProjectCode = $map['energy_project_code'];
        }
        if (isset($map['light_project_code'])) {
            $model->lightProjectCode = $map['light_project_code'];
        }
        if (isset($map['run_mode'])) {
            $model->runMode = $map['run_mode'];
        }

        return $model;
    }
}
