<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ImportSgResourceRequest extends Model
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

    // guardian使用的参数
    /**
     * @var string
     */
    public $appName;

    // 文件内容，json串
    /**
     * @var string
     */
    public $fileContent;

    // 文件名
    /**
     * @var string
     */
    public $fileName;

    // 实例id
    /**
     * @var string
     */
    public $instanceId;

    // 表明是DRM还是guardian
    /**
     * @var string
     */
    public $type;

    // 上传类型。 data 表示上传带有推送值，空表示只传元数据
    /**
     * @var string
     */
    public $uploadType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'fileContent'       => 'file_content',
        'fileName'          => 'file_name',
        'instanceId'        => 'instance_id',
        'type'              => 'type',
        'uploadType'        => 'upload_type',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->fileContent) {
            $res['file_content'] = $this->fileContent;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->uploadType) {
            $res['upload_type'] = $this->uploadType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportSgResourceRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['file_content'])) {
            $model->fileContent = $map['file_content'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['upload_type'])) {
            $model->uploadType = $map['upload_type'];
        }

        return $model;
    }
}
