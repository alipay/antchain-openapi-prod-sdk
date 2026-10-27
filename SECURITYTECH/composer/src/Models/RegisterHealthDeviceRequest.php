<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class RegisterHealthDeviceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'channelId' => 'channel_id',
        'tuid' => 'tuid',
        'sn' => 'sn',
        'clearHistory' => 'clear_history',
        'extraInfo' => 'extra_info',
    ];
    public function validate() {
        Model::validateRequired('channelId', $this->channelId, true);
        Model::validateRequired('clearHistory', $this->clearHistory, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->channelId) {
            $res['channel_id'] = $this->channelId;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->sn) {
            $res['sn'] = $this->sn;
        }
        if (null !== $this->clearHistory) {
            $res['clear_history'] = $this->clearHistory;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RegisterHealthDeviceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['channel_id'])){
            $model->channelId = $map['channel_id'];
        }
        if(isset($map['tuid'])){
            $model->tuid = $map['tuid'];
        }
        if(isset($map['sn'])){
            $model->sn = $map['sn'];
        }
        if(isset($map['clear_history'])){
            $model->clearHistory = $map['clear_history'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
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

    // 品牌方渠道标识
    /**
     * @var string
     */
    public $channelId;

    // 设备唯一id  与sn不可同时为空
    /**
     * @var string
     */
    public $tuid;

    // 设备sn号 与tuid不可同时为空
    /**
     * @var string
     */
    public $sn;

    // 是否清除设备历史数据 true-清除/false-保留
    /**
     * @var bool
     */
    public $clearHistory;

    // 预留可扩展字段
    /**
     * @var string
     */
    public $extraInfo;

}
