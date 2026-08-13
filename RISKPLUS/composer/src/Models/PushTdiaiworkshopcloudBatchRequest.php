<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\Item;

class PushTdiaiworkshopcloudBatchRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'eventCode' => 'event_code',
        'dispModelCode' => 'disp_model_code',
        'businessType' => 'business_type',
        'hashType' => 'hash_type',
        'requestId' => 'request_id',
        'sampleList' => 'sample_list',
        'backDate' => 'back_date',
        'callbackUrl' => 'callback_url',
    ];
    public function validate() {
        Model::validateRequired('eventCode', $this->eventCode, true);
        Model::validateRequired('dispModelCode', $this->dispModelCode, true);
        Model::validateRequired('businessType', $this->businessType, true);
        Model::validateRequired('hashType', $this->hashType, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('sampleList', $this->sampleList, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->eventCode) {
            $res['event_code'] = $this->eventCode;
        }
        if (null !== $this->dispModelCode) {
            $res['disp_model_code'] = $this->dispModelCode;
        }
        if (null !== $this->businessType) {
            $res['business_type'] = $this->businessType;
        }
        if (null !== $this->hashType) {
            $res['hash_type'] = $this->hashType;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->sampleList) {
            $res['sample_list'] = [];
            if(null !== $this->sampleList && is_array($this->sampleList)){
                $n = 0;
                foreach($this->sampleList as $item){
                    $res['sample_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->backDate) {
            $res['back_date'] = $this->backDate;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushTdiaiworkshopcloudBatchRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['event_code'])){
            $model->eventCode = $map['event_code'];
        }
        if(isset($map['disp_model_code'])){
            $model->dispModelCode = $map['disp_model_code'];
        }
        if(isset($map['business_type'])){
            $model->businessType = $map['business_type'];
        }
        if(isset($map['hash_type'])){
            $model->hashType = $map['hash_type'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['sample_list'])){
            if(!empty($map['sample_list'])){
                $model->sampleList = [];
                $n = 0;
                foreach($map['sample_list'] as $item) {
                    $model->sampleList[$n++] = null !== $item ? Item::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['back_date'])){
            $model->backDate = $map['back_date'];
        }
        if(isset($map['callback_url'])){
            $model->callbackUrl = $map['callback_url'];
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

    // 商品码（事件码）
    /**
     * @var string
     */
    public $eventCode;

    // 产品码
    /**
     * @var string
     */
    public $dispModelCode;

    // 业务码
    /**
     * @var string
     */
    public $businessType;

    // 加密方式
    /**
     * @var string
     */
    public $hashType;

    // 请求唯一id，幂等设计
    /**
     * @var string
     */
    public $requestId;

    // 样本结构体
    /**
     * @var Item[]
     */
    public $sampleList;

    // 回溯日期
    /**
     * @var string
     */
    public $backDate;

    // 回调地址
    /**
     * @var string
     */
    public $callbackUrl;

}
