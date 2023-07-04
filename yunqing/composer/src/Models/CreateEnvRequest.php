<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class CreateEnvRequest extends Model
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

    // 环境初始化参数配置
    /**
     * @var string
     */
    public $envConfigInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'envConfigInfo'     => 'env_config_info',
    ];

    public function validate()
    {
        Model::validateRequired('envConfigInfo', $this->envConfigInfo, true);
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
        if (null !== $this->envConfigInfo) {
            $res['env_config_info'] = $this->envConfigInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateEnvRequest
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
        if (isset($map['env_config_info'])) {
            $model->envConfigInfo = $map['env_config_info'];
        }

        return $model;
    }
}
