<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class UploadQmpOfflinehostplanRequest extends Model
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

    // 文件上传后的fileId
    /**
     * @description 待上传文件
     *
     * @var Stream
     */
    public $fileObject;

    /**
     * @description 待上传文件名
     *
     * @var string
     */
    public $fileObjectName;

    /**
     * @var string
     */
    public $fileId;

    // MOBILE/MOBILE_MD5/OAID/IDFA/IMEI选择其中一种
    /**
     * @var string
     */
    public $fileTemplate;

    // plancode，托管计划编码
    /**
     * @var string
     */
    public $planCode;

    // OFFLINE_DECISION/OFFLINE_DECISION_ACTION,默认OFFLINE_DECISION_ACTION
    /**
     * @var string
     */
    public $relationType;

    // properties的header,其他的为ext_info,
    /**
     * @var string
     */
    public $properties;

    // 默认为false
    /**
     * @var bool
     */
    public $needToRefactor;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileId'            => 'file_id',
        'fileTemplate'      => 'file_template',
        'planCode'          => 'plan_code',
        'relationType'      => 'relation_type',
        'properties'        => 'properties',
        'needToRefactor'    => 'need_to_refactor',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('fileTemplate', $this->fileTemplate, true);
        Model::validateRequired('planCode', $this->planCode, true);
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
        if (null !== $this->fileObject) {
            $res['fileObject'] = $this->fileObject;
        }
        if (null !== $this->fileObjectName) {
            $res['fileObjectName'] = $this->fileObjectName;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->fileTemplate) {
            $res['file_template'] = $this->fileTemplate;
        }
        if (null !== $this->planCode) {
            $res['plan_code'] = $this->planCode;
        }
        if (null !== $this->relationType) {
            $res['relation_type'] = $this->relationType;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->needToRefactor) {
            $res['need_to_refactor'] = $this->needToRefactor;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadQmpOfflinehostplanRequest
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
        if (isset($map['fileObject'])) {
            $model->fileObject = $map['fileObject'];
        }
        if (isset($map['fileObjectName'])) {
            $model->fileObjectName = $map['fileObjectName'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['file_template'])) {
            $model->fileTemplate = $map['file_template'];
        }
        if (isset($map['plan_code'])) {
            $model->planCode = $map['plan_code'];
        }
        if (isset($map['relation_type'])) {
            $model->relationType = $map['relation_type'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['need_to_refactor'])) {
            $model->needToRefactor = $map['need_to_refactor'];
        }

        return $model;
    }
}
