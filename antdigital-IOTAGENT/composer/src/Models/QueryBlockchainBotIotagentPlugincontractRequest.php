<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockchainBotIotagentPlugincontractRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pluginId' => 'plugin_id',
        'clientId' => 'client_id',
    ];
    public function validate() {
        Model::validateRequired('pluginId', $this->pluginId, true);
        Model::validateRequired('clientId', $this->clientId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->pluginId) {
            $res['plugin_id'] = $this->pluginId;
        }
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBlockchainBotIotagentPlugincontractRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['plugin_id'])){
            $model->pluginId = $map['plugin_id'];
        }
        if(isset($map['client_id'])){
            $model->clientId = $map['client_id'];
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

    // 插件ID，由蚂蚁侧提供
    /**
     * @var string
     */
    public $pluginId;

    // 客户端ID，一般是设备 MAC 地址
    /**
     * @var string
     */
    public $clientId;

}
