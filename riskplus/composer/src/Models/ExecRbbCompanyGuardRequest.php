<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ExecRbbCompanyGuardRequest extends Model
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

    // 企业名称或统一社会信用代码
    /**
     * @var string
     */
    public $keyword;

    // 规则ID，在风险大脑系统中配置
    /**
     * @var int
     */
    public $ruleId;

    // 额外参数，与规则有关
    /**
     * @var string
     */
    public $params;

    // 虚拟云租户code
    /**
     * @var string
     */
    public $virtualCloudTenantCode;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'keyword'                => 'keyword',
        'ruleId'                 => 'rule_id',
        'params'                 => 'params',
        'virtualCloudTenantCode' => 'virtual_cloud_tenant_code',
    ];

    public function validate()
    {
        Model::validateRequired('keyword', $this->keyword, true);
        Model::validateRequired('ruleId', $this->ruleId, true);
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
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }
        if (null !== $this->ruleId) {
            $res['rule_id'] = $this->ruleId;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }
        if (null !== $this->virtualCloudTenantCode) {
            $res['virtual_cloud_tenant_code'] = $this->virtualCloudTenantCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecRbbCompanyGuardRequest
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
        if (isset($map['keyword'])) {
            $model->keyword = $map['keyword'];
        }
        if (isset($map['rule_id'])) {
            $model->ruleId = $map['rule_id'];
        }
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }
        if (isset($map['virtual_cloud_tenant_code'])) {
            $model->virtualCloudTenantCode = $map['virtual_cloud_tenant_code'];
        }

        return $model;
    }
}
