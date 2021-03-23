<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class DeleteStatusflowTemplateRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 联盟ID
    /**
     * @var string
     */
    public $unionId;

    // 状态流模版名称
    /**
     * @var string
     */
    public $flowName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'unionId'           => 'union_id',
        'flowName'          => 'flow_name',
    ];

    public function validate()
    {
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateRequired('flowName', $this->flowName, true);
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
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->flowName) {
            $res['flow_name'] = $this->flowName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteStatusflowTemplateRequest
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
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['flow_name'])) {
            $model->flowName = $map['flow_name'];
        }

        return $model;
    }
}
