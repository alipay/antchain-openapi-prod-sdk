<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class UpdateBlockchainBotIotsuccessProductMcpRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pluginId' => 'plugin_id',
        'url' => 'url',
        'headers' => 'headers',
        'purpose' => 'purpose',
    ];
    public function validate() {
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
        if (null !== $this->pluginId) {
            $res['plugin_id'] = $this->pluginId;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->headers) {
            $res['headers'] = $this->headers;
        }
        if (null !== $this->purpose) {
            $res['purpose'] = $this->purpose;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateBlockchainBotIotsuccessProductMcpRequest
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
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        if(isset($map['headers'])){
            $model->headers = $map['headers'];
        }
        if(isset($map['purpose'])){
            $model->purpose = $map['purpose'];
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
    public $pluginId;

    /**
     * @var string
     */
    public $url;

    // JSON对象字符串
    /**
     * @var string
     */
    public $headers;

    /**
     * @var string
     */
    public $purpose;

}
