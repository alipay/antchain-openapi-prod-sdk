<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DeleteElectrocarOtacontinuouspushrulesRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId' => 'tenant_id',
        'trustProductKey' => 'trust_product_key',
        'ruleId' => 'rule_id',
        'expectedLockVersion' => 'expected_lock_version',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('trustProductKey', $this->trustProductKey, true);
        Model::validateRequired('ruleId', $this->ruleId, true);
        Model::validateRequired('expectedLockVersion', $this->expectedLockVersion, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->trustProductKey) {
            $res['trust_product_key'] = $this->trustProductKey;
        }
        if (null !== $this->ruleId) {
            $res['rule_id'] = $this->ruleId;
        }
        if (null !== $this->expectedLockVersion) {
            $res['expected_lock_version'] = $this->expectedLockVersion;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeleteElectrocarOtacontinuouspushrulesRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['trust_product_key'])){
            $model->trustProductKey = $map['trust_product_key'];
        }
        if(isset($map['rule_id'])){
            $model->ruleId = $map['rule_id'];
        }
        if(isset($map['expected_lock_version'])){
            $model->expectedLockVersion = $map['expected_lock_version'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 规则所属产品可信标识
    /**
     * @var string
     */
    public $trustProductKey;

    // 待删除规则 ID
    /**
     * @var int
     */
    public $ruleId;

    // 规则当前乐观锁版本
    /**
     * @var int
     */
    public $expectedLockVersion;

}
