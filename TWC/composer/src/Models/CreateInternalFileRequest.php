<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateInternalFileRequest extends Model
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

    // 存证事务id
    /**
     * @var string
     */
    public $transactionId;

    // 描述本条存证在存证事务中的阶段，用户可自行维护
    /**
     * @var string
     */
    public $phase;

    // 存证文件内容，对文件内容做base64编码后得到。例如FILE_RAW模式下，文件内容为“test”，那么base64编码后的结果则为“dGVzdA==”。如果是FILE_HASh模式，则该字段直接为文件hash。
    /**
     * @var string
     */
    public $notaryFile;

    // 存证文件名称
    /**
     * @var string
     */
    public $notaryName;

    // 文件存证模式，目前仅支持 FILE_RAW(文件原文内容) 和 FILE_HASH(文件hash)，建议填写，不填默认是FILE_RAW
    /**
     * @var string
     */
    public $fileNotaryType;

    // 哈希算法，当 fileNotaryType 为 FILE_HASH 时填写，目前仅支持 SHA256
    /**
     * @var string
     */
    public $hashAlgorithm;

    // 是否使用可信时间戳，默认为false
    /**
     * @var bool
     */
    public $tsr;

    // 存证地点信息(如手机硬件ID，Wi-Fi地址，GPS位置，IP地址)
    /**
     * @var Location
     */
    public $location;

    // 扩展属性
    /**
     * @var string
     */
    public $properties;

    // 代理客户存证时，实际用户的租户ID
    /**
     * @var string
     */
    public $realTenant;

    // 授权码
    /**
     * @var string
     */
    public $authCode;

    // 授权码对应产品码
    /**
     * @var string
     */
    public $product;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'transactionId'     => 'transaction_id',
        'phase'             => 'phase',
        'notaryFile'        => 'notary_file',
        'notaryName'        => 'notary_name',
        'fileNotaryType'    => 'file_notary_type',
        'hashAlgorithm'     => 'hash_algorithm',
        'tsr'               => 'tsr',
        'location'          => 'location',
        'properties'        => 'properties',
        'realTenant'        => 'real_tenant',
        'authCode'          => 'auth_code',
        'product'           => 'product',
    ];

    public function validate()
    {
        Model::validateRequired('transactionId', $this->transactionId, true);
        Model::validateRequired('phase', $this->phase, true);
        Model::validateRequired('notaryFile', $this->notaryFile, true);
        Model::validateRequired('notaryName', $this->notaryName, true);
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
        if (null !== $this->transactionId) {
            $res['transaction_id'] = $this->transactionId;
        }
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }
        if (null !== $this->notaryFile) {
            $res['notary_file'] = $this->notaryFile;
        }
        if (null !== $this->notaryName) {
            $res['notary_name'] = $this->notaryName;
        }
        if (null !== $this->fileNotaryType) {
            $res['file_notary_type'] = $this->fileNotaryType;
        }
        if (null !== $this->hashAlgorithm) {
            $res['hash_algorithm'] = $this->hashAlgorithm;
        }
        if (null !== $this->tsr) {
            $res['tsr'] = $this->tsr;
        }
        if (null !== $this->location) {
            $res['location'] = null !== $this->location ? $this->location->toMap() : null;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->realTenant) {
            $res['real_tenant'] = $this->realTenant;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }
        if (null !== $this->product) {
            $res['product'] = $this->product;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateInternalFileRequest
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
        if (isset($map['transaction_id'])) {
            $model->transactionId = $map['transaction_id'];
        }
        if (isset($map['phase'])) {
            $model->phase = $map['phase'];
        }
        if (isset($map['notary_file'])) {
            $model->notaryFile = $map['notary_file'];
        }
        if (isset($map['notary_name'])) {
            $model->notaryName = $map['notary_name'];
        }
        if (isset($map['file_notary_type'])) {
            $model->fileNotaryType = $map['file_notary_type'];
        }
        if (isset($map['hash_algorithm'])) {
            $model->hashAlgorithm = $map['hash_algorithm'];
        }
        if (isset($map['tsr'])) {
            $model->tsr = $map['tsr'];
        }
        if (isset($map['location'])) {
            $model->location = Location::fromMap($map['location']);
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['real_tenant'])) {
            $model->realTenant = $map['real_tenant'];
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }
        if (isset($map['product'])) {
            $model->product = $map['product'];
        }

        return $model;
    }
}
