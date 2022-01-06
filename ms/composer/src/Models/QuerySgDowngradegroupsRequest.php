<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class QuerySgDowngradegroupsRequest extends Model
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

    // 应用名称
    /**
     * @var string
     */
    public $appName;

    // 降级服务
    /**
     * @var string
     */
    public $downgradeService;

    // 租户实例id
    /**
     * @var string
     */
    public $instanceId;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 页大小
    /**
     * @var int
     */
    public $pageSize;

    // 规则名称
    /**
     * @var string
     */
    public $ruleName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'downgradeService'  => 'downgrade_service',
        'instanceId'        => 'instance_id',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'ruleName'          => 'rule_name',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->downgradeService) {
            $res['downgrade_service'] = $this->downgradeService;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->ruleName) {
            $res['rule_name'] = $this->ruleName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySgDowngradegroupsRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['downgrade_service'])) {
            $model->downgradeService = $map['downgrade_service'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['rule_name'])) {
            $model->ruleName = $map['rule_name'];
        }

        return $model;
    }
}
