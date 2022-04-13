<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ExecUnireleasePipelinesRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 解决方案ID
    /**
     * @var string
     */
    public $solutionId;

    // 租户/机构名称列表，不填默认当前机构所有租户
    /**
     * @var string[]
     */
    public $tenants;
    protected $_name = [
        'authToken'  => 'auth_token',
        'solutionId' => 'solution_id',
        'tenants'    => 'tenants',
    ];

    public function validate()
    {
        Model::validateRequired('solutionId', $this->solutionId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->solutionId) {
            $res['solution_id'] = $this->solutionId;
        }
        if (null !== $this->tenants) {
            $res['tenants'] = $this->tenants;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecUnireleasePipelinesRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['solution_id'])) {
            $model->solutionId = $map['solution_id'];
        }
        if (isset($map['tenants'])) {
            if (!empty($map['tenants'])) {
                $model->tenants = $map['tenants'];
            }
        }

        return $model;
    }
}
