<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class BindBlockchainBotIotsuccessProductPluginRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productKey' => 'product_key',
        'pluginIds' => 'plugin_ids',
    ];
    public function validate() {
        Model::validateRequired('productKey', $this->productKey, true);
        Model::validateRequired('pluginIds', $this->pluginIds, true);
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
        if (null !== $this->pluginIds) {
            $res['plugin_ids'] = $this->pluginIds;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BindBlockchainBotIotsuccessProductPluginRequest
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
        if(isset($map['plugin_ids'])){
            if(!empty($map['plugin_ids'])){
                $model->pluginIds = $map['plugin_ids'];
            }
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
     * @var string[]
     */
    public $pluginIds;

}
