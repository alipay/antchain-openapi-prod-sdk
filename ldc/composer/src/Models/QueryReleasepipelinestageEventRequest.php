<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryReleasepipelinestageEventRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 发布单发布分组的id，对应ReleasePipeline中的stage
    /**
     * @var string
     */
    public $stageId;
    protected $_name = [
        'authToken' => 'auth_token',
        'stageId'   => 'stage_id',
    ];

    public function validate()
    {
        Model::validateRequired('stageId', $this->stageId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->stageId) {
            $res['stage_id'] = $this->stageId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryReleasepipelinestageEventRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['stage_id'])) {
            $model->stageId = $map['stage_id'];
        }

        return $model;
    }
}
