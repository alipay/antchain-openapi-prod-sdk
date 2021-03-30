<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class AddHashregisterRequest extends Model
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

    // 文件SHA256 hash
    /**
     * @var string
     */
    public $hash;

    // 文件大小
    /**
     * @var int
     */
    public $length;

    // hash算法
    /**
     * @var string
     */
    public $hashType;

    // 文件类型
    /**
     * @var string
     */
    public $type;

    // 文件名称
    /**
     * @var string
     */
    public $name;

    // 备注
    /**
     * @var string
     */
    public $memo;

    // 证件名称
    /**
     * @var string
     */
    public $certName;

    // 证件号码
    /**
     * @var string
     */
    public $certNo;

    // 证件类型
    /**
     * @var string
     */
    public $certType;

    // 是否自动创建公证保管函
    /**
     * @var bool
     */
    public $createCertificate;

    // 证书类型
    /**
     * @var string
     */
    public $certificateType;

    // 是否创建证据包，默认否
    /**
     * @var bool
     */
    public $createPackage;

    //
    // 公证处Id
    /**
     * @var string
     */
    public $orgId;

    // 代理信息
    /**
     * @var ProxyData
     */
    public $proxyInfo;

    // 电话号码
    /**
     * @var string
     */
    public $phoneNum;

    // 特征文件oss id
    /**
     * @var string
     */
    public $featureFileId;

    // 幂等字段
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'hash'              => 'hash',
        'length'            => 'length',
        'hashType'          => 'hash_type',
        'type'              => 'type',
        'name'              => 'name',
        'memo'              => 'memo',
        'certName'          => 'cert_name',
        'certNo'            => 'cert_no',
        'certType'          => 'cert_type',
        'createCertificate' => 'create_certificate',
        'certificateType'   => 'certificate_type',
        'createPackage'     => 'create_package',
        'orgId'             => 'org_id',
        'proxyInfo'         => 'proxy_info',
        'phoneNum'          => 'phone_num',
        'featureFileId'     => 'feature_file_id',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('hash', $this->hash, true);
        Model::validateRequired('length', $this->length, true);
        Model::validateRequired('hashType', $this->hashType, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateMaxLength('name', $this->name, 128);
        Model::validateMaxLength('memo', $this->memo, 512);
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
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->length) {
            $res['length'] = $this->length;
        }
        if (null !== $this->hashType) {
            $res['hash_type'] = $this->hashType;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->createCertificate) {
            $res['create_certificate'] = $this->createCertificate;
        }
        if (null !== $this->certificateType) {
            $res['certificate_type'] = $this->certificateType;
        }
        if (null !== $this->createPackage) {
            $res['create_package'] = $this->createPackage;
        }
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }
        if (null !== $this->proxyInfo) {
            $res['proxy_info'] = null !== $this->proxyInfo ? $this->proxyInfo->toMap() : null;
        }
        if (null !== $this->phoneNum) {
            $res['phone_num'] = $this->phoneNum;
        }
        if (null !== $this->featureFileId) {
            $res['feature_file_id'] = $this->featureFileId;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddHashregisterRequest
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
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['length'])) {
            $model->length = $map['length'];
        }
        if (isset($map['hash_type'])) {
            $model->hashType = $map['hash_type'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['create_certificate'])) {
            $model->createCertificate = $map['create_certificate'];
        }
        if (isset($map['certificate_type'])) {
            $model->certificateType = $map['certificate_type'];
        }
        if (isset($map['create_package'])) {
            $model->createPackage = $map['create_package'];
        }
        if (isset($map['org_id'])) {
            $model->orgId = $map['org_id'];
        }
        if (isset($map['proxy_info'])) {
            $model->proxyInfo = ProxyData::fromMap($map['proxy_info']);
        }
        if (isset($map['phone_num'])) {
            $model->phoneNum = $map['phone_num'];
        }
        if (isset($map['feature_file_id'])) {
            $model->featureFileId = $map['feature_file_id'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
