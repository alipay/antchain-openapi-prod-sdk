<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MDPAPI\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryscoreAntdigitalMdpRequest extends Model
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

    // 模型 id，和具体场景相关
    /**
     * @var string
     */
    public $modelId;

    // 用户 id 的类型，比如 mobile 或者 device
    /**
     * @var string
     */
    public $idType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'modelId'           => 'model_id',
        'idType'            => 'id_type',
    ];

    public function validate()
    {
        Model::validateRequired('modelId', $this->modelId, true);
        Model::validateRequired('idType', $this->idType, true);
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
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryscoreAntdigitalMdpRequest
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
        if (isset($map['model_id'])) {
            $model->modelId = $map['model_id'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }

        return $model;
    }
}
