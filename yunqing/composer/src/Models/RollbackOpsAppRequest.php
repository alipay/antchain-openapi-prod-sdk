<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class RollbackOpsAppRequest extends Model
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

    // 发布单id
    /**
     * @var string
     */
    public $opsPlanId;

    // 产品码
    /**
     * @var string
     */
    public $prodCode;

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // 需要回滚的快照版本
    /**
     * @var string
     */
    public $prodSnapshotVersion;

    // 部署单元ID
    /**
     * @var string
     */
    public $unitInstanceId;

    // 操作人Id
    /**
     * @var string
     */
    public $submitterId;

    //
    // 操作人名称（花名或者真名）
    /**
     * @var string
     */
    public $submitterName;

    // 分组策略，默认使用SYSTEM_RECOMMENDATION
    /**
     * @var string
     */
    public $groupStrategy;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'opsPlanId'           => 'ops_plan_id',
        'prodCode'            => 'prod_code',
        'appName'             => 'app_name',
        'prodSnapshotVersion' => 'prod_snapshot_version',
        'unitInstanceId'      => 'unit_instance_id',
        'submitterId'         => 'submitter_id',
        'submitterName'       => 'submitter_name',
        'groupStrategy'       => 'group_strategy',
    ];

    public function validate()
    {
        Model::validateRequired('opsPlanId', $this->opsPlanId, true);
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('appName', $this->appName, true);
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
        if (null !== $this->opsPlanId) {
            $res['ops_plan_id'] = $this->opsPlanId;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->prodSnapshotVersion) {
            $res['prod_snapshot_version'] = $this->prodSnapshotVersion;
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
        if (null !== $this->groupStrategy) {
            $res['group_strategy'] = $this->groupStrategy;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RollbackOpsAppRequest
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
        if (isset($map['ops_plan_id'])) {
            $model->opsPlanId = $map['ops_plan_id'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['prod_snapshot_version'])) {
            $model->prodSnapshotVersion = $map['prod_snapshot_version'];
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
        if (isset($map['group_strategy'])) {
            $model->groupStrategy = $map['group_strategy'];
        }

        return $model;
    }
}
