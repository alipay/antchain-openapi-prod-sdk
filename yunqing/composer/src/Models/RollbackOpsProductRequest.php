<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class RollbackOpsProductRequest extends Model
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

    // 需要回滚的解决方案ID
    /**
     * @var string
     */
    public $solutionId;

    // 产品码
    /**
     * @var string
     */
    public $prodCode;

    // 需要回滚的快照版本
    /**
     * @var string
     */
    public $prodSnapshotVersion;

    // 分组策略
    /**
     * @var string
     */
    public $groupStrategy;

    // 部署单元ID
    /**
     * @var string
     */
    public $unitInstanceId;

    // 操作人ID
    /**
     * @var string
     */
    public $submitterId;

    // 操作人名称（花名或者真名）
    /**
     * @var string
     */
    public $submitterName;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'solutionId'          => 'solution_id',
        'prodCode'            => 'prod_code',
        'prodSnapshotVersion' => 'prod_snapshot_version',
        'groupStrategy'       => 'group_strategy',
        'unitInstanceId'      => 'unit_instance_id',
        'submitterId'         => 'submitter_id',
        'submitterName'       => 'submitter_name',
    ];

    public function validate()
    {
        Model::validateRequired('solutionId', $this->solutionId, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('prodSnapshotVersion', $this->prodSnapshotVersion, true);
        Model::validateRequired('unitInstanceId', $this->unitInstanceId, true);
        Model::validateRequired('submitterId', $this->submitterId, true);
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
        if (null !== $this->solutionId) {
            $res['solution_id'] = $this->solutionId;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->prodSnapshotVersion) {
            $res['prod_snapshot_version'] = $this->prodSnapshotVersion;
        }
        if (null !== $this->groupStrategy) {
            $res['group_strategy'] = $this->groupStrategy;
        }
        if (null !== $this->unitInstanceId) {
            $res['unit_instance_id'] = $this->unitInstanceId;
        }
        if (null !== $this->submitterId) {
            $res['submitter_id'] = $this->submitterId;
        }
        if (null !== $this->submitterName) {
            $res['submitter_name'] = $this->submitterName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RollbackOpsProductRequest
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
        if (isset($map['solution_id'])) {
            $model->solutionId = $map['solution_id'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['prod_snapshot_version'])) {
            $model->prodSnapshotVersion = $map['prod_snapshot_version'];
        }
        if (isset($map['group_strategy'])) {
            $model->groupStrategy = $map['group_strategy'];
        }
        if (isset($map['unit_instance_id'])) {
            $model->unitInstanceId = $map['unit_instance_id'];
        }
        if (isset($map['submitter_id'])) {
            $model->submitterId = $map['submitter_id'];
        }
        if (isset($map['submitter_name'])) {
            $model->submitterName = $map['submitter_name'];
        }

        return $model;
    }
}
