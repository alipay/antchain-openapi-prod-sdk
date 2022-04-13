<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QuerySidecarOperationRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 运维单号
    /**
     * @var string
     */
    public $operationId;

    // 是否带运维单执行详情
    /**
     * @var bool
     */
    public $withDetail;
    protected $_name = [
        'authToken'   => 'auth_token',
        'operationId' => 'operation_id',
        'withDetail'  => 'with_detail',
    ];

    public function validate()
    {
        Model::validateRequired('operationId', $this->operationId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->operationId) {
            $res['operation_id'] = $this->operationId;
        }
        if (null !== $this->withDetail) {
            $res['with_detail'] = $this->withDetail;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySidecarOperationRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['operation_id'])) {
            $model->operationId = $map['operation_id'];
        }
        if (isset($map['with_detail'])) {
            $model->withDetail = $map['with_detail'];
        }

        return $model;
    }
}
