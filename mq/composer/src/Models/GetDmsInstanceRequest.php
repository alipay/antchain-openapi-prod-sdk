<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class GetDmsInstanceRequest extends Model
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

    // ddd
    /**
     * @var string
     */
    public $currTenant;

    // ss
    /**
     * @var string
     */
    public $currWorkspace;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'currTenant'        => 'curr_tenant',
        'currWorkspace'     => 'curr_workspace',
    ];

    public function validate()
    {
        Model::validateRequired('currTenant', $this->currTenant, true);
        Model::validateRequired('currWorkspace', $this->currWorkspace, true);
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
        if (null !== $this->currTenant) {
            $res['curr_tenant'] = $this->currTenant;
        }
        if (null !== $this->currWorkspace) {
            $res['curr_workspace'] = $this->currWorkspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDmsInstanceRequest
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
        if (isset($map['curr_tenant'])) {
            $model->currTenant = $map['curr_tenant'];
        }
        if (isset($map['curr_workspace'])) {
            $model->currWorkspace = $map['curr_workspace'];
        }

        return $model;
    }
}
