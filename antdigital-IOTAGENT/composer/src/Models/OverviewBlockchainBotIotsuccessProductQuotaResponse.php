<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class OverviewBlockchainBotIotsuccessProductQuotaResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'authorizationMode' => 'authorization_mode',
        'scope' => 'scope',
        'sharedPool' => 'shared_pool',
        'resourceType' => 'resource_type',
        'total' => 'total',
        'used' => 'used',
        'remaining' => 'remaining',
        'unit' => 'unit',
        'asOf' => 'as_of',
    ];
    public function validate() {
        Model::validateRequired('authorizationMode', $this->authorizationMode, true);
        Model::validateRequired('scope', $this->scope, true);
        Model::validateRequired('sharedPool', $this->sharedPool, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('total', $this->total, true);
        Model::validateRequired('used', $this->used, true);
        Model::validateRequired('remaining', $this->remaining, true);
        Model::validateRequired('unit', $this->unit, true);
        Model::validateRequired('asOf', $this->asOf, true);
    }
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
        if (null !== $this->authorizationMode) {
            $res['authorization_mode'] = $this->authorizationMode;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->sharedPool) {
            $res['shared_pool'] = $this->sharedPool;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->used) {
            $res['used'] = $this->used;
        }
        if (null !== $this->remaining) {
            $res['remaining'] = $this->remaining;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->asOf) {
            $res['as_of'] = $this->asOf;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OverviewBlockchainBotIotsuccessProductQuotaResponse
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
        if(isset($map['authorization_mode'])){
            $model->authorizationMode = $map['authorization_mode'];
        }
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['shared_pool'])){
            $model->sharedPool = $map['shared_pool'];
        }
        if(isset($map['resource_type'])){
            $model->resourceType = $map['resource_type'];
        }
        if(isset($map['total'])){
            $model->total = $map['total'];
        }
        if(isset($map['used'])){
            $model->used = $map['used'];
        }
        if(isset($map['remaining'])){
            $model->remaining = $map['remaining'];
        }
        if(isset($map['unit'])){
            $model->unit = $map['unit'];
        }
        if(isset($map['as_of'])){
            $model->asOf = $map['as_of'];
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

    // 枚举:LICENSE,INSTANCE
    /**
     * @var string
     */
    public $authorizationMode;

    // 枚举:LICENSES,INSTANCE_POOL
    /**
     * @var string
     */
    public $scope;

    // 多产品关联同一实例池时为true，池消费不等于单产品独占消费
    /**
     * @var bool
     */
    public $sharedPool;

    // 枚举:AGENT_REQUEST
    /**
     * @var string
     */
    public $resourceType;

    /**
     * @var int
     */
    public $total;

    /**
     * @var int
     */
    public $used;

    // total-used，保留负值
    /**
     * @var int
     */
    public $remaining;

    // 额度点，不是token或音频秒数；枚举:QUOTA_POINT
    /**
     * @var string
     */
    public $unit;

    /**
     * @var string
     */
    public $asOf;

}
