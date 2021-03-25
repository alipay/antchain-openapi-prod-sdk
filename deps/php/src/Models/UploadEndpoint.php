<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UploadEndpoint extends Model {
    protected $_name = [
        'accessKeyId' => 'access_key_id',
        'bucket' => 'bucket',
        'encodedPolicy' => 'encoded_policy',
        'expiration' => 'expiration',
        'filePath' => 'file_path',
        'host' => 'host',
        'regionId' => 'region_id',
        'signature' => 'signature',
        'storageType' => 'storage_type',
        'url' => 'url',
    ];
    public function validate() {
        Model::validatePattern('expiration', $this->expiration, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->accessKeyId) {
            $res['access_key_id'] = $this->accessKeyId;
        }
        if (null !== $this->bucket) {
            $res['bucket'] = $this->bucket;
        }
        if (null !== $this->encodedPolicy) {
            $res['encoded_policy'] = $this->encodedPolicy;
        }
        if (null !== $this->expiration) {
            $res['expiration'] = $this->expiration;
        }
        if (null !== $this->filePath) {
            $res['file_path'] = $this->filePath;
        }
        if (null !== $this->host) {
            $res['host'] = $this->host;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->storageType) {
            $res['storage_type'] = $this->storageType;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadEndpoint
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['access_key_id'])){
            $model->accessKeyId = $map['access_key_id'];
        }
        if(isset($map['bucket'])){
            $model->bucket = $map['bucket'];
        }
        if(isset($map['encoded_policy'])){
            $model->encodedPolicy = $map['encoded_policy'];
        }
        if(isset($map['expiration'])){
            $model->expiration = $map['expiration'];
        }
        if(isset($map['file_path'])){
            $model->filePath = $map['file_path'];
        }
        if(isset($map['host'])){
            $model->host = $map['host'];
        }
        if(isset($map['region_id'])){
            $model->regionId = $map['region_id'];
        }
        if(isset($map['signature'])){
            $model->signature = $map['signature'];
        }
        if(isset($map['storage_type'])){
            $model->storageType = $map['storage_type'];
        }
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        return $model;
    }
    // 对象存储的access_key_id
    /**
     * @example 
     * @var string
     */
    public $accessKeyId;

    // 上传的目标bucket名称
    /**
     * @example 
     * @var string
     */
    public $bucket;

    // 加密策略，仅storage_type为SYSTEM_OSS时有效
    /**
     * @example 
     * @var string
     */
    public $encodedPolicy;

    // 文件失效的日期时间
    /**
     * @example 
     * @var string
     */
    public $expiration;

    // 对象存储的上传目标文件路径
    /**
     * @example 
     * @var string
     */
    public $filePath;

    // 上传的目标主机名，仅storage_type为SYSTEM_OSS时有效
    /**
     * @example 
     * @var string
     */
    public $host;

    // 地域ID
    /**
     * @example 
     * @var string
     */
    public $regionId;

    // 签名，仅storage_type为SYSTEM_OSS时有效
    /**
     * @example 
     * @var string
     */
    public $signature;

    // 存储类型，取值如下： SYSTEM_AFS表示AFS存储，SYSTEM_OSS表示OSS存储
    /**
     * @example 
     * @var string
     */
    public $storageType;

    // 上传的目标URL
    /**
     * @example 
     * @var string
     */
    public $url;

}
