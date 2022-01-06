<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ExportSgAuthrulegroupsRequest extends Model
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

    // 鉴权规则id集合，多个用逗号隔开，当is_export_all为false时此参数必填
    /**
     * @var string
     */
    public $authRuleIds;

    // 租户实例id
    /**
     * @var string
     */
    public $instanceId;

    // 是否导出所有规则
    /**
     * @var bool
     */
    public $isExportAll;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authRuleIds'       => 'auth_rule_ids',
        'instanceId'        => 'instance_id',
        'isExportAll'       => 'is_export_all',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('isExportAll', $this->isExportAll, true);
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
        if (null !== $this->authRuleIds) {
            $res['auth_rule_ids'] = $this->authRuleIds;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->isExportAll) {
            $res['is_export_all'] = $this->isExportAll;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExportSgAuthrulegroupsRequest
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
        if (isset($map['auth_rule_ids'])) {
            $model->authRuleIds = $map['auth_rule_ids'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['is_export_all'])) {
            $model->isExportAll = $map['is_export_all'];
        }

        return $model;
    }
}
