<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class DeleteAntchainPdcpDatasetRequest extends Model
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

    // 待删除的数据集 id，必填
    /**
     * @var string
     */
    public $datasetId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'datasetId'         => 'dataset_id',
    ];

    public function validate()
    {
        Model::validateRequired('datasetId', $this->datasetId, true);
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
        if (null !== $this->datasetId) {
            $res['dataset_id'] = $this->datasetId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteAntchainPdcpDatasetRequest
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
        if (isset($map['dataset_id'])) {
            $model->datasetId = $map['dataset_id'];
        }

        return $model;
    }
}
