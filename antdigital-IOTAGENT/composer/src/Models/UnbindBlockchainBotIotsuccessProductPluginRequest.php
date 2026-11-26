<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class UnbindBlockchainBotIotsuccessProductPluginRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productKey' => 'product_key',
        'pluginId' => 'plugin_id',
        'confirm' => 'confirm',
    ];
    public function validate() {
        Model::validateRequired('productKey', $this->productKey, true);
        Model::validateRequired('pluginId', $this->pluginId, true);
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
        if (null !== $this->pluginId) {
            $res['plugin_id'] = $this->pluginId;
        }
        if (null !== $this->confirm) {
            $res['confirm'] = $this->confirm;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UnbindBlockchainBotIotsuccessProductPluginRequest
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
        if(isset($map['plugin_id'])){
            $model->pluginId = $map['plugin_id'];
        }
        if(isset($map['confirm'])){
            $model->confirm = $map['confirm'];
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

    /**
     * @var string
     */
    public $productKey;

    /**
     * @var string
     */
    public $pluginId;

    // 类型正确后由业务守卫判断；缺失或false返回CONFIRM_REQUIRED，只有true执行解绑
    /**
     * @var bool
     */
    public $confirm;

}
