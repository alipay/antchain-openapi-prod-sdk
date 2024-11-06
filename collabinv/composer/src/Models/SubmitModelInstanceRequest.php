<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class SubmitModelInstanceRequest extends Model
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

    // 租户编码
    /**
     * @var string
     */
    public $tenantCode;

    // 模型文件路径
    /**
     * @var string
     */
    public $modelFilePath;

    // 特征集路径
    /**
     * @var string
     */
    public $featuresFilePath;

    // 示例文件路径
    /**
     * @var string
     */
    public $demoFilePath;

    // 模型编码，同一租户下唯一，后续回溯生产调用标记
    /**
     * @var string
     */
    public $modelCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantCode'        => 'tenant_code',
        'modelFilePath'     => 'model_file_path',
        'featuresFilePath'  => 'features_file_path',
        'demoFilePath'      => 'demo_file_path',
        'modelCode'         => 'model_code',
    ];

    public function validate()
    {
        Model::validateRequired('tenantCode', $this->tenantCode, true);
        Model::validateRequired('modelFilePath', $this->modelFilePath, true);
        Model::validateRequired('featuresFilePath', $this->featuresFilePath, true);
        Model::validateRequired('modelCode', $this->modelCode, true);
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
        if (null !== $this->tenantCode) {
            $res['tenant_code'] = $this->tenantCode;
        }
        if (null !== $this->modelFilePath) {
            $res['model_file_path'] = $this->modelFilePath;
        }
        if (null !== $this->featuresFilePath) {
            $res['features_file_path'] = $this->featuresFilePath;
        }
        if (null !== $this->demoFilePath) {
            $res['demo_file_path'] = $this->demoFilePath;
        }
        if (null !== $this->modelCode) {
            $res['model_code'] = $this->modelCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitModelInstanceRequest
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
        if (isset($map['tenant_code'])) {
            $model->tenantCode = $map['tenant_code'];
        }
        if (isset($map['model_file_path'])) {
            $model->modelFilePath = $map['model_file_path'];
        }
        if (isset($map['features_file_path'])) {
            $model->featuresFilePath = $map['features_file_path'];
        }
        if (isset($map['demo_file_path'])) {
            $model->demoFilePath = $map['demo_file_path'];
        }
        if (isset($map['model_code'])) {
            $model->modelCode = $map['model_code'];
        }

        return $model;
    }
}
