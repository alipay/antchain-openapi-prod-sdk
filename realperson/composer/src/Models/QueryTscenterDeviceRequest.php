<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryTscenterDeviceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 设备token
    /**
     * @var string
     */
    public $apdidToken;

    // appname
    /**
     * @var string
     */
    public $appName;

    // app key client
    /**
     * @var string
     */
    public $appKeyClient;

    // app key server
    /**
     * @var string
     */
    public $appKeyServer;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'apdidToken'        => 'apdid_token',
        'appName'           => 'app_name',
        'appKeyClient'      => 'app_key_client',
        'appKeyServer'      => 'app_key_server',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->apdidToken) {
            $res['apdid_token'] = $this->apdidToken;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->appKeyClient) {
            $res['app_key_client'] = $this->appKeyClient;
        }
        if (null !== $this->appKeyServer) {
            $res['app_key_server'] = $this->appKeyServer;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTscenterDeviceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['apdid_token'])) {
            $model->apdidToken = $map['apdid_token'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['app_key_client'])) {
            $model->appKeyClient = $map['app_key_client'];
        }
        if (isset($map['app_key_server'])) {
            $model->appKeyServer = $map['app_key_server'];
        }

        return $model;
    }
}
