<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ImportUnireleaseSolutionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // Line迭代发布Json String
    /**
     * @var string
     */
    public $solution;

    // 机构列表信息；如果不填默认是所有机构统一发布
    /**
     * @var string[]
     */
    public $tenants;

    // 银数AC工单ID
    /**
     * @var string
     */
    public $acId;

    // 环境信息
    /**
     * @var string
     */
    public $env;

    // 是否是紧急发布场景
    /**
     * @var bool
     */
    public $emergent;
    protected $_name = [
        'authToken' => 'auth_token',
        'solution'  => 'solution',
        'tenants'   => 'tenants',
        'acId'      => 'ac_id',
        'env'       => 'env',
        'emergent'  => 'emergent',
    ];

    public function validate()
    {
        Model::validateRequired('solution', $this->solution, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->solution) {
            $res['solution'] = $this->solution;
        }
        if (null !== $this->tenants) {
            $res['tenants'] = $this->tenants;
        }
        if (null !== $this->acId) {
            $res['ac_id'] = $this->acId;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->emergent) {
            $res['emergent'] = $this->emergent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportUnireleaseSolutionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['solution'])) {
            $model->solution = $map['solution'];
        }
        if (isset($map['tenants'])) {
            if (!empty($map['tenants'])) {
                $model->tenants = $map['tenants'];
            }
        }
        if (isset($map['ac_id'])) {
            $model->acId = $map['ac_id'];
        }
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['emergent'])) {
            $model->emergent = $map['emergent'];
        }

        return $model;
    }
}
