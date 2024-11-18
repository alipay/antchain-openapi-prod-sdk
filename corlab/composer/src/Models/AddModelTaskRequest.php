<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CORLAB\Models;

use AlibabaCloud\Tea\Model;

class AddModelTaskRequest extends Model
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

    // 客户号
    /**
     * @var string
     */
    public $customerId;

    // 回执单号
    /**
     * @var string
     */
    public $receiptNo;

    // 模型名称
    /**
     * @var string
     */
    public $modelName;

    // 模型文件的路径
    /**
     * @var string
     */
    public $modelFileOssPath;

    // 验证文件的oss路径
    /**
     * @var string
     */
    public $validateFileOssPath;

    // 模型输出参数名称
    /**
     * @var string
     */
    public $modelOutputLableName;

    // 验证文件的输出列名
    /**
     * @var string
     */
    public $csvOutputLableName;

    // 验签字段
    /**
     * @var string
     */
    public $signInfo;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'customerId'           => 'customer_id',
        'receiptNo'            => 'receipt_no',
        'modelName'            => 'model_name',
        'modelFileOssPath'     => 'model_file_oss_path',
        'validateFileOssPath'  => 'validate_file_oss_path',
        'modelOutputLableName' => 'model_output_lable_name',
        'csvOutputLableName'   => 'csv_output_lable_name',
        'signInfo'             => 'sign_info',
    ];

    public function validate()
    {
        Model::validateRequired('customerId', $this->customerId, true);
        Model::validateRequired('receiptNo', $this->receiptNo, true);
        Model::validateRequired('modelName', $this->modelName, true);
        Model::validateRequired('modelFileOssPath', $this->modelFileOssPath, true);
        Model::validateRequired('validateFileOssPath', $this->validateFileOssPath, true);
        Model::validateRequired('modelOutputLableName', $this->modelOutputLableName, true);
        Model::validateRequired('csvOutputLableName', $this->csvOutputLableName, true);
        Model::validateRequired('signInfo', $this->signInfo, true);
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
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->receiptNo) {
            $res['receipt_no'] = $this->receiptNo;
        }
        if (null !== $this->modelName) {
            $res['model_name'] = $this->modelName;
        }
        if (null !== $this->modelFileOssPath) {
            $res['model_file_oss_path'] = $this->modelFileOssPath;
        }
        if (null !== $this->validateFileOssPath) {
            $res['validate_file_oss_path'] = $this->validateFileOssPath;
        }
        if (null !== $this->modelOutputLableName) {
            $res['model_output_lable_name'] = $this->modelOutputLableName;
        }
        if (null !== $this->csvOutputLableName) {
            $res['csv_output_lable_name'] = $this->csvOutputLableName;
        }
        if (null !== $this->signInfo) {
            $res['sign_info'] = $this->signInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddModelTaskRequest
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
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['receipt_no'])) {
            $model->receiptNo = $map['receipt_no'];
        }
        if (isset($map['model_name'])) {
            $model->modelName = $map['model_name'];
        }
        if (isset($map['model_file_oss_path'])) {
            $model->modelFileOssPath = $map['model_file_oss_path'];
        }
        if (isset($map['validate_file_oss_path'])) {
            $model->validateFileOssPath = $map['validate_file_oss_path'];
        }
        if (isset($map['model_output_lable_name'])) {
            $model->modelOutputLableName = $map['model_output_lable_name'];
        }
        if (isset($map['csv_output_lable_name'])) {
            $model->csvOutputLableName = $map['csv_output_lable_name'];
        }
        if (isset($map['sign_info'])) {
            $model->signInfo = $map['sign_info'];
        }

        return $model;
    }
}
