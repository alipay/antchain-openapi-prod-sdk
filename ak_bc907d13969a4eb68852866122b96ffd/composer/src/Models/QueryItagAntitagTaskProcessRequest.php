<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class QueryItagAntitagTaskProcessRequest extends Model
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

    // TntInstId
    /**
     * @var string
     */
    public $tntinstid;

    // taskid
    /**
     * @var string
     */
    public $taskid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tntinstid'         => 'tntinstid',
        'taskid'            => 'taskid',
    ];

    public function validate()
    {
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
        if (null !== $this->tntinstid) {
            $res['tntinstid'] = $this->tntinstid;
        }
        if (null !== $this->taskid) {
            $res['taskid'] = $this->taskid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryItagAntitagTaskProcessRequest
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
        if (isset($map['tntinstid'])) {
            $model->tntinstid = $map['tntinstid'];
        }
        if (isset($map['taskid'])) {
            $model->taskid = $map['taskid'];
        }

        return $model;
    }
}
