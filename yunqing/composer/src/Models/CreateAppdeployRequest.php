<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class CreateAppdeployRequest extends Model
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

    // 应用码
    /**
     * @var string[]
     */
    public $apps;

    // 将要发布的单元id
    /**
     * @var string[]
     */
    public $cellIds;

    // 产品码
    /**
     * @var string
     */
    public $prodCode;

    // 解决方案id
    /**
     * @var string
     */
    public $solutionId;

    // 是否强制重发
    /**
     * @var bool
     */
    public $force;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'apps'              => 'apps',
        'cellIds'           => 'cell_ids',
        'prodCode'          => 'prod_code',
        'solutionId'        => 'solution_id',
        'force'             => 'force',
    ];

    public function validate()
    {
        Model::validateRequired('apps', $this->apps, true);
        Model::validateRequired('cellIds', $this->cellIds, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('solutionId', $this->solutionId, true);
        Model::validateRequired('force', $this->force, true);
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
        if (null !== $this->apps) {
            $res['apps'] = $this->apps;
        }
        if (null !== $this->cellIds) {
            $res['cell_ids'] = $this->cellIds;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->solutionId) {
            $res['solution_id'] = $this->solutionId;
        }
        if (null !== $this->force) {
            $res['force'] = $this->force;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAppdeployRequest
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
        if (isset($map['apps'])) {
            if (!empty($map['apps'])) {
                $model->apps = $map['apps'];
            }
        }
        if (isset($map['cell_ids'])) {
            if (!empty($map['cell_ids'])) {
                $model->cellIds = $map['cell_ids'];
            }
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['solution_id'])) {
            $model->solutionId = $map['solution_id'];
        }
        if (isset($map['force'])) {
            $model->force = $map['force'];
        }

        return $model;
    }
}
