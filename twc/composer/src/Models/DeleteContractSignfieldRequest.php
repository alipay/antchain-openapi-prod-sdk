<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class DeleteContractSignfieldRequest extends Model
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

    // 签署流程id
    /**
     * @var string
     */
    public $flowId;

    // 删除签署区id列表
    /**
     * @var string[]
     */
    public $deleteSignfields;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'flowId'            => 'flow_id',
        'deleteSignfields'  => 'delete_signfields',
    ];

    public function validate()
    {
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('deleteSignfields', $this->deleteSignfields, true);
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
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->deleteSignfields) {
            $res['delete_signfields'] = $this->deleteSignfields;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteContractSignfieldRequest
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
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['delete_signfields'])) {
            if (!empty($map['delete_signfields'])) {
                $model->deleteSignfields = $map['delete_signfields'];
            }
        }

        return $model;
    }
}
