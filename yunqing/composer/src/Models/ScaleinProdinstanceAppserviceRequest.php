<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ScaleinProdinstanceAppserviceRequest extends Model
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

    // 应用服务实例唯一标识。
    /**
     * @var string
     */
    public $appServiceId;

    // 执行运维操作的目标容器列表。
    /**
     * @var string[]
     */
    public $containerIds;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appServiceId'      => 'app_service_id',
        'containerIds'      => 'container_ids',
    ];

    public function validate()
    {
        Model::validateRequired('appServiceId', $this->appServiceId, true);
        Model::validateRequired('containerIds', $this->containerIds, true);
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
        if (null !== $this->appServiceId) {
            $res['app_service_id'] = $this->appServiceId;
        }
        if (null !== $this->containerIds) {
            $res['container_ids'] = $this->containerIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScaleinProdinstanceAppserviceRequest
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
        if (isset($map['app_service_id'])) {
            $model->appServiceId = $map['app_service_id'];
        }
        if (isset($map['container_ids'])) {
            if (!empty($map['container_ids'])) {
                $model->containerIds = $map['container_ids'];
            }
        }

        return $model;
    }
}
