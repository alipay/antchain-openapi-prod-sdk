<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ScaleProdinstanceAppserviceRequest extends Model
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

    // 集群容器目标数量。如果target_num>当前集群num，则扩容target_num-num个容器；如果target_num<当前集群num，则随机缩容target_num-num个容器。
    /**
     * @var int
     */
    public $targetNum;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appServiceId'      => 'app_service_id',
        'targetNum'         => 'target_num',
    ];

    public function validate()
    {
        Model::validateRequired('appServiceId', $this->appServiceId, true);
        Model::validateRequired('targetNum', $this->targetNum, true);
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
        if (null !== $this->targetNum) {
            $res['target_num'] = $this->targetNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScaleProdinstanceAppserviceRequest
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
        if (isset($map['target_num'])) {
            $model->targetNum = $map['target_num'];
        }

        return $model;
    }
}
