<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\ContractNotaryFinishInfo;
use AntChain\TWC\Models\ContractNotaryInitInfo;
use AntChain\TWC\Models\ContractNotarySignInfo;

class ApplyTwcNotaryContractReportRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'finishInfo' => 'finish_info',
        'flowId' => 'flow_id',
        'initInfo' => 'init_info',
        'signInfo' => 'sign_info',
        'transactionId' => 'transaction_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->finishInfo) {
            $res['finish_info'] = null !== $this->finishInfo ? $this->finishInfo->toMap() : null;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->initInfo) {
            $res['init_info'] = null !== $this->initInfo ? $this->initInfo->toMap() : null;
        }
        if (null !== $this->signInfo) {
            $res['sign_info'] = [];
            if(null !== $this->signInfo && is_array($this->signInfo)){
                $n = 0;
                foreach($this->signInfo as $item){
                    $res['sign_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->transactionId) {
            $res['transaction_id'] = $this->transactionId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyTwcNotaryContractReportRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['finish_info'])){
            $model->finishInfo = ContractNotaryFinishInfo::fromMap($map['finish_info']);
        }
        if(isset($map['flow_id'])){
            $model->flowId = $map['flow_id'];
        }
        if(isset($map['init_info'])){
            $model->initInfo = ContractNotaryInitInfo::fromMap($map['init_info']);
        }
        if(isset($map['sign_info'])){
            if(!empty($map['sign_info'])){
                $model->signInfo = [];
                $n = 0;
                foreach($map['sign_info'] as $item) {
                    $model->signInfo[$n++] = null !== $item ? ContractNotarySignInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['transaction_id'])){
            $model->transactionId = $map['transaction_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 签署结束阶段存证核验信息
    /**
     * @var ContractNotaryFinishInfo
     */
    public $finishInfo;

    // 签署流程ID
    /**
     * @var string
     */
    public $flowId;

    // 签署发起阶段存证核验信息
    /**
     * @var ContractNotaryInitInfo
     */
    public $initInfo;

    // 签署过程阶段存证核验信息
    /**
     * @var ContractNotarySignInfo[]
     */
    public $signInfo;

    // 存证事务ID
    /**
     * @var string
     */
    public $transactionId;

}
