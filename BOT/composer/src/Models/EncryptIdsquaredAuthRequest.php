<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class EncryptIdsquaredAuthRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'data' => 'data',
        'productSource' => 'product_source',
        'deviceAuthCode' => 'device_auth_code',
        'deviceExtra' => 'device_extra',
        'apiVersion' => 'api_version',
        'productKey' => 'product_key',
        'deviceChallenge' => 'device_challenge',
        'serverExtra' => 'server_extra',
        'id2' => 'id2',
    ];
    public function validate() {
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('deviceAuthCode', $this->deviceAuthCode, true);
        Model::validateRequired('id2', $this->id2, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->productSource) {
            $res['product_source'] = $this->productSource;
        }
        if (null !== $this->deviceAuthCode) {
            $res['device_auth_code'] = $this->deviceAuthCode;
        }
        if (null !== $this->deviceExtra) {
            $res['device_extra'] = $this->deviceExtra;
        }
        if (null !== $this->apiVersion) {
            $res['api_version'] = $this->apiVersion;
        }
        if (null !== $this->productKey) {
            $res['product_key'] = $this->productKey;
        }
        if (null !== $this->deviceChallenge) {
            $res['device_challenge'] = $this->deviceChallenge;
        }
        if (null !== $this->serverExtra) {
            $res['server_extra'] = $this->serverExtra;
        }
        if (null !== $this->id2) {
            $res['id2'] = $this->id2;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return EncryptIdsquaredAuthRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['data'])){
            $model->data = $map['data'];
        }
        if(isset($map['product_source'])){
            $model->productSource = $map['product_source'];
        }
        if(isset($map['device_auth_code'])){
            $model->deviceAuthCode = $map['device_auth_code'];
        }
        if(isset($map['device_extra'])){
            $model->deviceExtra = $map['device_extra'];
        }
        if(isset($map['api_version'])){
            $model->apiVersion = $map['api_version'];
        }
        if(isset($map['product_key'])){
            $model->productKey = $map['product_key'];
        }
        if(isset($map['device_challenge'])){
            $model->deviceChallenge = $map['device_challenge'];
        }
        if(isset($map['server_extra'])){
            $model->serverExtra = $map['server_extra'];
        }
        if(isset($map['id2'])){
            $model->id2 = $map['id2'];
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

    // 待加密原文
    /**
     * @var string
     */
    public $data;

    // productSource
    /**
     * @var int
     */
    public $productSource;

    // 客户端鉴权码
    /**
     * @var string
     */
    public $deviceAuthCode;

    // deviceExtra
    /**
     * @var string
     */
    public $deviceExtra;

    // apiVersion
    /**
     * @var string
     */
    public $apiVersion;

    // productKey
    /**
     * @var string
     */
    public $productKey;

    // deviceChallenge客户端挑战码
    /**
     * @var string
     */
    public $deviceChallenge;

    // serverExtra
    /**
     * @var string
     */
    public $serverExtra;

    // id2
    /**
     * @var string
     */
    public $id2;

}
