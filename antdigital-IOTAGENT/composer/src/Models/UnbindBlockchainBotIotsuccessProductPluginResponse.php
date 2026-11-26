<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class UnbindBlockchainBotIotsuccessProductPluginResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'effectiveFor' => 'effective_for',
        'pluginId' => 'plugin_id',
        'productKey' => 'product_key',
        'unbound' => 'unbound',
    ];
    public function validate() {
        Model::validateRequired('effectiveFor', $this->effectiveFor, true);
        Model::validateRequired('pluginId', $this->pluginId, true);
        Model::validateRequired('productKey', $this->productKey, true);
        Model::validateRequired('unbound', $this->unbound, true);
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
        if (null !== $this->effectiveFor) {
            $res['effective_for'] = $this->effectiveFor;
        }
        if (null !== $this->pluginId) {
            $res['plugin_id'] = $this->pluginId;
        }
        if (null !== $this->productKey) {
            $res['product_key'] = $this->productKey;
        }
        if (null !== $this->unbound) {
            $res['unbound'] = $this->unbound;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UnbindBlockchainBotIotsuccessProductPluginResponse
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
        if(isset($map['effective_for'])){
            $model->effectiveFor = $map['effective_for'];
        }
        if(isset($map['plugin_id'])){
            $model->pluginId = $map['plugin_id'];
        }
        if(isset($map['product_key'])){
            $model->productKey = $map['product_key'];
        }
        if(isset($map['unbound'])){
            $model->unbound = $map['unbound'];
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

    // 枚举:NEXT_INTERACTION
    /**
     * @var string
     */
    public $effectiveFor;

    /**
     * @var string
     */
    public $pluginId;

    /**
     * @var string
     */
    public $productKey;

    /**
     * @var bool
     */
    public $unbound;

}
