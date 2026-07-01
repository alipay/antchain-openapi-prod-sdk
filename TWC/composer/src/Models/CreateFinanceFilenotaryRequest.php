<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateFinanceFilenotaryRequest extends Model
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

    // 反欺诈需要的证件号码
    /**
     * @var string
     */
    public $certNo;

    // 创建日期，时间戳类型，单位毫秒
    /**
     * @var int
     */
    public $createdDate;

    // 存证文件名称
    /**
     * @var string
     */
    public $fileName;

    // 文件存证类型，支持小于 1M 源文件或者文件哈希
    /**
     * @var string
     */
    public $fileNotaryType;

    // 文件大小，单位 Bytes
    /**
     * @var int
     */
    public $fileSize;

    // 文件类型
    /**
     * @var string
     */
    public $fileType;

    // 文件地址
    /**
     * @var string
     */
    public $fileUrl;

    // 哈希算法
    /**
     * @var string
     */
    public $hashAlgorithm;

    // 位置信息
    /**
     * @var Location
     */
    public $location;

    // 反欺诈查询需要的手机号
    /**
     * @var string
     */
    public $mobile;

    // 文件存证内容
    /**
     * @var string
     */
    public $notaryContent;

    // 存证阶段
    /**
     * @var string
     */
    public $phase;

    // 扩展属性，用户可自行维护
    /**
     * @var string
     */
    public $properties;

    // 存证事务ID
    /**
     * @var string
     */
    public $transactionId;

    // 是否使用可信时间戳
    /**
     * @var bool
     */
    public $tsr;

    // 反欺诈查询需要的证件上的姓名
    /**
     * @var string
     */
    public $userName;

    // 本次请求的唯一ID
    /**
     * @var string
     */
    public $thirdMessageId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'certNo'            => 'cert_no',
        'createdDate'       => 'created_date',
        'fileName'          => 'file_name',
        'fileNotaryType'    => 'file_notary_type',
        'fileSize'          => 'file_size',
        'fileType'          => 'file_type',
        'fileUrl'           => 'file_url',
        'hashAlgorithm'     => 'hash_algorithm',
        'location'          => 'location',
        'mobile'            => 'mobile',
        'notaryContent'     => 'notary_content',
        'phase'             => 'phase',
        'properties'        => 'properties',
        'transactionId'     => 'transaction_id',
        'tsr'               => 'tsr',
        'userName'          => 'user_name',
        'thirdMessageId'    => 'third_message_id',
    ];

    public function validate()
    {
        Model::validateRequired('createdDate', $this->createdDate, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('fileNotaryType', $this->fileNotaryType, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('notaryContent', $this->notaryContent, true);
        Model::validateRequired('phase', $this->phase, true);
        Model::validateRequired('transactionId', $this->transactionId, true);
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
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->createdDate) {
            $res['created_date'] = $this->createdDate;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileNotaryType) {
            $res['file_notary_type'] = $this->fileNotaryType;
        }
        if (null !== $this->fileSize) {
            $res['file_size'] = $this->fileSize;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->hashAlgorithm) {
            $res['hash_algorithm'] = $this->hashAlgorithm;
        }
        if (null !== $this->location) {
            $res['location'] = null !== $this->location ? $this->location->toMap() : null;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->notaryContent) {
            $res['notary_content'] = $this->notaryContent;
        }
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->transactionId) {
            $res['transaction_id'] = $this->transactionId;
        }
        if (null !== $this->tsr) {
            $res['tsr'] = $this->tsr;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->thirdMessageId) {
            $res['third_message_id'] = $this->thirdMessageId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateFinanceFilenotaryRequest
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
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['created_date'])) {
            $model->createdDate = $map['created_date'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_notary_type'])) {
            $model->fileNotaryType = $map['file_notary_type'];
        }
        if (isset($map['file_size'])) {
            $model->fileSize = $map['file_size'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['hash_algorithm'])) {
            $model->hashAlgorithm = $map['hash_algorithm'];
        }
        if (isset($map['location'])) {
            $model->location = Location::fromMap($map['location']);
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['notary_content'])) {
            $model->notaryContent = $map['notary_content'];
        }
        if (isset($map['phase'])) {
            $model->phase = $map['phase'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['transaction_id'])) {
            $model->transactionId = $map['transaction_id'];
        }
        if (isset($map['tsr'])) {
            $model->tsr = $map['tsr'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['third_message_id'])) {
            $model->thirdMessageId = $map['third_message_id'];
        }

        return $model;
    }
}
