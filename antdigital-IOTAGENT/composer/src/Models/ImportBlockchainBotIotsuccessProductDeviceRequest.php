<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class ImportBlockchainBotIotsuccessProductDeviceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productKey' => 'product_key',
        'uidList' => 'uid_list',
        'templateId' => 'template_id',
    ];
    public function validate() {
        Model::validateRequired('productKey', $this->productKey, true);
        Model::validateRequired('uidList', $this->uidList, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->productKey) {
            $res['product_key'] = $this->productKey;
        }
        if (null !== $this->uidList) {
            $res['uid_list'] = $this->uidList;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ImportBlockchainBotIotsuccessProductDeviceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['product_key'])){
            $model->productKey = $map['product_key'];
        }
        if(isset($map['uid_list'])){
            if(!empty($map['uid_list'])){
                $model->uidList = $map['uid_list'];
            }
        }
        if(isset($map['template_id'])){
            $model->templateId = $map['template_id'];
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

    // 当前租户业务产品标识
    /**
     * @var string
     */
    public $productKey;

    // 设备MAC列表；沿已有校验、去重与数量限制
    /**
     * @var string[]
     */
    public $uidList;

    // 可选产品模板标识，适配为已有templateAgentId
    /**
     * @var string
     */
    public $templateId;

}
