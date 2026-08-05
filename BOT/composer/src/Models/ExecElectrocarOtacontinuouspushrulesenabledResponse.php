<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\ContinuousOtaRuleResponse;

class ExecElectrocarOtacontinuouspushrulesenabledResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
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
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
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
     * @return ExecElectrocarOtacontinuouspushrulesenabledResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
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
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 策略所属产品可信标识
    /**
     * @var string
     */
    public $trustProductKey;

    // 产品策略主键，以字符串返回，避免前端整数精度丢失
    /**
     * @var string
     */
    public $policyId;

    // 产品下规则集合版本，以字符串返回；任一规则变更时递增并用于运行快照失效。
    /**
     * @var string
     */
    public $rulesVersion;

    // 产品全局白名单版本，以字符串返回，白名单变更时递增。
    /**
     * @var string
     */
    public $whitelistVersion;

    // 当前有效白名单成员数量，以字符串返回。
    /**
     * @var string
     */
    public $whitelistCount;

    // 当前产品配置是否允许整体删除；服务端执行删除时仍会重新校验。
    /**
     * @var bool
     */
    public $deletable;

    // 当前产品配置不可删除的稳定原因编码集合。
    /**
     * @var string[]
     */
    public $deleteBlockedReasons;

    // 产品当前生效的连续推送规则集合
    /**
     * @var ContinuousOtaRuleResponse[]
     */
    public $rules;

}
