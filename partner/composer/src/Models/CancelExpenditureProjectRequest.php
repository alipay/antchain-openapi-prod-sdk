<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class CancelExpenditureProjectRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户来源-用于租户间功能和数据的隔离
    /**
     * @var string
     */
    public $source;

    // 项目id
    /**
     * @var int
     */
    public $projectId;
    protected $_name = [
        'authToken' => 'auth_token',
        'source'    => 'source',
        'projectId' => 'project_id',
    ];

    public function validate()
    {
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('projectId', $this->projectId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelExpenditureProjectRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }

        return $model;
    }
}
