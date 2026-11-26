<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class CreateBlockchainBotIotsuccessProductResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'productKey' => 'product_key',
        'instanceId' => 'instance_id',
        'productSecret' => 'product_secret',
        'defaultTemplateId' => 'default_template_id',
    ];
    public function validate() {
        Model::validateRequired('productKey', $this->productKey, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('productSecret', $this->productSecret, true);
        Model::validateRequired('defaultTemplateId', $this->defaultTemplateId, true);
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
        if (null !== $this->productKey) {
            $res['product_key'] = $this->productKey;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->productSecret) {
            $res['product_secret'] = $this->productSecret;
        }
        if (null !== $this->defaultTemplateId) {
            $res['default_template_id'] = $this->defaultTemplateId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateBlockchainBotIotsuccessProductResponse
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
        if(isset($map['product_key'])){
            $model->productKey = $map['product_key'];
        }
        if(isset($map['instance_id'])){
            $model->instanceId = $map['instance_id'];
        }
        if(isset($map['product_secret'])){
            $model->productSecret = $map['product_secret'];
        }
        if(isset($map['default_template_id'])){
            $model->defaultTemplateId = $map['default_template_id'];
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

    /**
     * @var string
     */
    public $productKey;

    // 产品业务云实例，非网关product_instance_id；设备导入无需传入
    /**
     * @var string
     */
    public $instanceId;

    // 产品绑定的Agent接入凭证，非网关SK或IoTBasic原生Secret；仅首次，禁止日志记录
    /**
     * @var string
     */
    public $productSecret;

    /**
     * @var string
     */
    public $defaultTemplateId;

}
