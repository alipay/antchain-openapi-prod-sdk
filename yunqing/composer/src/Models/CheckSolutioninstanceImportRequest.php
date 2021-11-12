<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class CheckSolutioninstanceImportRequest extends Model
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

    // 环境id
    /**
     * @var string
     */
    public $envId;

    // com.alipay.cloud.apyunqing.boxing.model.box序列化后的结果
    /**
     * @var string
     */
    public $boxData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'envId'             => 'env_id',
        'boxData'           => 'box_data',
    ];

    public function validate()
    {
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('boxData', $this->boxData, true);
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
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->boxData) {
            $res['box_data'] = $this->boxData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckSolutioninstanceImportRequest
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
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['box_data'])) {
            $model->boxData = $map['box_data'];
        }

        return $model;
    }
}
