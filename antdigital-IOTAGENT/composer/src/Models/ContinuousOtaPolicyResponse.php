<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IOTAGENT\Models\ContinuousOtaRuleResponse;

class ContinuousOtaPolicyResponse extends Model {
    protected $_name = [
        'tenantId' => 'tenant_id',
        'trustProductKey' => 'trust_product_key',
        'policyId' => 'policy_id',
        'rulesVersion' => 'rules_version',
        'whitelistVersion' => 'whitelist_version',
        'whitelistCount' => 'whitelist_count',
        'deletable' => 'deletable',
        'deleteBlockedReasons' => 'delete_blocked_reasons',
        'rules' => 'rules',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->trustProductKey) {
            $res['trust_product_key'] = $this->trustProductKey;
        }
        if (null !== $this->policyId) {
            $res['policy_id'] = $this->policyId;
        }
        if (null !== $this->rulesVersion) {
            $res['rules_version'] = $this->rulesVersion;
        }
        if (null !== $this->whitelistVersion) {
            $res['whitelist_version'] = $this->whitelistVersion;
        }
        if (null !== $this->whitelistCount) {
            $res['whitelist_count'] = $this->whitelistCount;
        }
        if (null !== $this->deletable) {
            $res['deletable'] = $this->deletable;
        }
        if (null !== $this->deleteBlockedReasons) {
            $res['delete_blocked_reasons'] = $this->deleteBlockedReasons;
        }
        if (null !== $this->rules) {
            $res['rules'] = [];
            if(null !== $this->rules && is_array($this->rules)){
                $n = 0;
                foreach($this->rules as $item){
                    $res['rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ContinuousOtaPolicyResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['trust_product_key'])){
            $model->trustProductKey = $map['trust_product_key'];
        }
        if(isset($map['policy_id'])){
            $model->policyId = $map['policy_id'];
        }
        if(isset($map['rules_version'])){
            $model->rulesVersion = $map['rules_version'];
        }
        if(isset($map['whitelist_version'])){
            $model->whitelistVersion = $map['whitelist_version'];
        }
        if(isset($map['whitelist_count'])){
            $model->whitelistCount = $map['whitelist_count'];
        }
        if(isset($map['deletable'])){
            $model->deletable = $map['deletable'];
        }
        if(isset($map['delete_blocked_reasons'])){
            if(!empty($map['delete_blocked_reasons'])){
                $model->deleteBlockedReasons = $map['delete_blocked_reasons'];
            }
        }
        if(isset($map['rules'])){
            if(!empty($map['rules'])){
                $model->rules = [];
                $n = 0;
                foreach($map['rules'] as $item) {
                    $model->rules[$n++] = null !== $item ? ContinuousOtaRuleResponse::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 策略所属租户 ID
    /**
     * @example 策略所属租户 ID
     * @var string
     */
    public $tenantId;

    // 策略所属产品可信标识
    /**
     * @example 策略所属产品可信标识
     * @var string
     */
    public $trustProductKey;

    // 产品策略主键
    /**
     * @example 产品策略主键
     * @var string
     */
    public $policyId;

    // 产品下规则集合版本
    /**
     * @example 产品下规则集合版本
     * @var string
     */
    public $rulesVersion;

    // 产品全局白名单版本
    /**
     * @example 产品全局白名单版本
     * @var string
     */
    public $whitelistVersion;

    // 当前有效白名单成员数量
    /**
     * @example 当前有效白名单成员数量
     * @var string
     */
    public $whitelistCount;

    // 当前产品配置是否允许整体删除
    /**
     * @example true
     * @var bool
     */
    public $deletable;

    // 当前产品配置不可删除的稳定原因编码集合
    /**
     * @example undefined
     * @var string[]
     */
    public $deleteBlockedReasons;

    // 产品当前生效的连续推送规则集合
    /**
     * @example undefined
     * @var ContinuousOtaRuleResponse[]
     */
    public $rules;

}
